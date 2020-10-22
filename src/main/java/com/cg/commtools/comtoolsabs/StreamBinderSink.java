package com.cg.commtools.comtoolsabs;

import com.cg.commtools.data.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.spring.integration.core.AzureHeaders;
import com.microsoft.azure.spring.integration.core.api.Checkpointer;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Header;

import java.io.IOException;

@EnableBinding(Sink.class)
public class StreamBinderSink {
    @Value("${spring.cloud.azure.send.grid.api.key}")
    private String sendGridApiKey;
    @Value("${spring.cloud.azure.send.grid.sender}")
    private String sendGridApiFromMail;

    @StreamListener(Sink.INPUT)
    public void handleMessage(String message, @Header(AzureHeaders.CHECKPOINTER) Checkpointer checkpointer) {
        System.out.println(String.format("New message received: '%s'", message));
        checkpointer.success().handle((r, ex) -> {
            if (ex == null) {
                try {
                    ObjectMapper om = new ObjectMapper();
                    Message orderData = om.readValue(message, Message.class);
                    Email from = new Email(sendGridApiFromMail);
                    if("OrderCreated".equals(orderData.getType())){
                        String subject = "Thank you for your order - " + orderData.getResource().getId();
                        Email to = new Email(orderData.getOrder().getShippingAddress().getEmail());
                        Content content = new Content("text/html", "<p>Hi " + orderData.getOrder().getShippingAddress().getFirstName() +"</p><p>Thanks for your order. We will be sending regular notifications about the order updates.</p><p>Regards,<br>eComm Team</br></p>");
                        Mail mail = new Mail(from, subject, to, content);
                        SendGrid sg = new SendGrid(sendGridApiKey);
                        Request request = new Request();
                        try {
                            request.setMethod(Method.POST);
                            request.setEndpoint("mail/send");
                            request.setBody(mail.build());
                            sg.api(request);
                        } catch (IOException e) {
                           e.printStackTrace();
                        }
                    }
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
            return null;
        });
    }

    public void setSendGridApiKey(String sendGridApiKey) {
        this.sendGridApiKey = sendGridApiKey;
    }

    public void setSendGridApiFromMail(String sendGridApiFromMail) {
        this.sendGridApiFromMail = sendGridApiFromMail;
    }
}
