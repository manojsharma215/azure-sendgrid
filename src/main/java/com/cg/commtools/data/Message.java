package com.cg.commtools.data;

import java.util.Date;
import java.util.List;

public class Message{
    private String notificationType;
    private String projectKey;
    private String id;
    private int version;
    private int sequenceNumber;
    private Resource resource;
    private int resourceVersion;
    private ResourceUserProvidedIdentifiers resourceUserProvidedIdentifiers;
    private String type;
    private Order order;
    private Date createdAt;
    private Date lastModifiedAt;

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public void setProjectKey(String projectKey) {
        this.projectKey = projectKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public int getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public ResourceUserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return resourceUserProvidedIdentifiers;
    }

    public void setResourceUserProvidedIdentifiers(ResourceUserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

}

class ResourceUserProvidedIdentifiers{
}

class Customer{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class LastModifiedBy{
   private String clientId;

    public boolean isIsPlatformClient() {
        return isPlatformClient;
    }

    public void setIsPlatformClient(boolean platformClient) {
        this.isPlatformClient = platformClient;
    }

    private boolean isPlatformClient;

   private Customer customer;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Customer2{
   private String typeId;
   private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CreatedBy{
    private String clientId;

    public boolean isIsPlatformClient() {
        return isPlatformClient;
    }

    public void setIsPlatformClient(boolean platformClient) {
        this.isPlatformClient = platformClient;
    }

    private boolean isPlatformClient;
    private Customer2 customer;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer2 customer) {
        this.customer = customer;
    }
}

class TotalPrice{
    private String type;
    private  String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TotalNet{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TotalGross{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class Amount{
    private  String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TaxPortion{
    private double rate;
    private Amount amount;
    private String name;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TaxedPrice{
    private TotalNet totalNet;
    private TotalGross totalGross;
    private List<TaxPortion> taxPortions;

    public TotalNet getTotalNet() {
        return totalNet;
    }

    public void setTotalNet(TotalNet totalNet) {
        this.totalNet = totalNet;
    }

    public TotalGross getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(TotalGross totalGross) {
        this.totalGross = totalGross;
    }

    public List<TaxPortion> getTaxPortions() {
        return taxPortions;
    }

    public void setTaxPortions(List<TaxPortion> taxPortions) {
        this.taxPortions = taxPortions;
    }
}

class Price{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class Price2{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class FreeAbove{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class ShippingRate{
    private Price2 price;
    private FreeAbove freeAbove;
    private List<Object> tiers;

    public Price2 getPrice() {
        return price;
    }

    public void setPrice(Price2 price) {
        this.price = price;
    }

    public FreeAbove getFreeAbove() {
        return freeAbove;
    }

    public void setFreeAbove(FreeAbove freeAbove) {
        this.freeAbove = freeAbove;
    }

    public List<Object> getTiers() {
        return tiers;
    }

    public void setTiers(List<Object> tiers) {
        this.tiers = tiers;
    }
}

class TaxRate{
    private String name;
    private double amount;
    private boolean includedInPrice;
    private String country;
    private String id;
    private List<Object> subRates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isIncludedInPrice() {
        return includedInPrice;
    }

    public void setIncludedInPrice(boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getSubRates() {
        return subRates;
    }

    public void setSubRates(List<Object> subRates) {
        this.subRates = subRates;
    }
}

class TaxCategory{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class ShippingMethod{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class TotalNet2{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TotalGross2{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TaxedPrice2{
    private TotalNet2 totalNet;
    private TotalGross2 totalGross;

    public TotalNet2 getTotalNet() {
        return totalNet;
    }

    public void setTotalNet(TotalNet2 totalNet) {
        this.totalNet = totalNet;
    }

    public TotalGross2 getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(TotalGross2 totalGross) {
        this.totalGross = totalGross;
    }
}

class ShippingInfo{
    private String shippingMethodName;
    private Price price;
    private ShippingRate shippingRate;
    private TaxRate taxRate;
    private TaxCategory taxCategory;
    private List<Object> deliveries;
    private ShippingMethod shippingMethod;
    private TaxedPrice2 taxedPrice;
    private String shippingMethodState;

    public String getShippingMethodName() {
        return shippingMethodName;
    }

    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public ShippingRate getShippingRate() {
        return shippingRate;
    }

    public void setShippingRate(ShippingRate shippingRate) {
        this.shippingRate = shippingRate;
    }

    public TaxRate getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public List<Object> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(List<Object> deliveries) {
        this.deliveries = deliveries;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public TaxedPrice2 getTaxedPrice() {
        return taxedPrice;
    }

    public void setTaxedPrice(TaxedPrice2 taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public String getShippingMethodState() {
        return shippingMethodState;
    }

    public void setShippingMethodState(String shippingMethodState) {
        this.shippingMethodState = shippingMethodState;
    }
}

class Name{
    private String de;
    private String en;

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }
}

class ProductType{
    private String typeId;
    private String id;
    private int version;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

class Value{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class CustomerGroup{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Channel{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Price3{
    private Value value;
    private String id;
    private CustomerGroup customerGroup;
    private String country;
    private Channel channel;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CustomerGroup getCustomerGroup() {
        return customerGroup;
    }

    public void setCustomerGroup(CustomerGroup customerGroup) {
        this.customerGroup = customerGroup;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}

class Dimensions{
    private int w;
    private int h;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}

class Image{
    private String url;
    private Dimensions dimensions;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}

class Attribute{
    private String name;
    private Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

class Variant{
    private int id;
    private String sku;
    private List<Price3> prices;
    private List<Image> images;
    private List<Attribute> attributes;
    private List<Object> assets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Price3> getPrices() {
        return prices;
    }

    public void setPrices(List<Price3> prices) {
        this.prices = prices;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Object> getAssets() {
        return assets;
    }

    public void setAssets(List<Object> assets) {
        this.assets = assets;
    }
}

class Value2{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class Price4{
    private Value2 value;
    private String id;
    private String country;

    public Value2 getValue() {
        return value;
    }

    public void setValue(Value2 value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class TaxRate2{
   private String name;
   private double amount;
   private boolean includedInPrice;
   private String country;
   private String id;
   private List<Object> subRates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isIncludedInPrice() {
        return includedInPrice;
    }

    public void setIncludedInPrice(boolean includedInPrice) {
        this.includedInPrice = includedInPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getSubRates() {
        return subRates;
    }

    public void setSubRates(List<Object> subRates) {
        this.subRates = subRates;
    }
}

class State2{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class State{
    private int quantity;
    private State2 state;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public State2 getState() {
        return state;
    }

    public void setState(State2 state) {
        this.state = state;
    }
}

class TotalPrice2{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TotalNet3{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TotalGross3{
    private String type;
    private String currencyCode;
    private int centAmount;
    private int fractionDigits;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public int getCentAmount() {
        return centAmount;
    }

    public void setCentAmount(int centAmount) {
        this.centAmount = centAmount;
    }

    public int getFractionDigits() {
        return fractionDigits;
    }

    public void setFractionDigits(int fractionDigits) {
        this.fractionDigits = fractionDigits;
    }
}

class TaxedPrice3{
    private TotalNet3 totalNet;
    private TotalGross3 totalGross;

    public TotalNet3 getTotalNet() {
        return totalNet;
    }

    public void setTotalNet(TotalNet3 totalNet) {
        this.totalNet = totalNet;
    }

    public TotalGross3 getTotalGross() {
        return totalGross;
    }

    public void setTotalGross(TotalGross3 totalGross) {
        this.totalGross = totalGross;
    }
}

class LineItem{
    private String id;
    private String productId;
    private Name name;
    private ProductType productType;
    private Variant variant;
    private Price4 price;
    private int quantity;
    private List<Object> discountedPricePerQuantity;
    private TaxRate2 taxRate;
    private Date addedAt;
    private Date lastModifiedAt;
    private List<State> state;
    private String priceMode;
    private TotalPrice2 totalPrice;
    private TaxedPrice3 taxedPrice;
    private String lineItemMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Variant getVariant() {
        return variant;
    }

    public void setVariant(Variant variant) {
        this.variant = variant;
    }

    public Price4 getPrice() {
        return price;
    }

    public void setPrice(Price4 price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<Object> getDiscountedPricePerQuantity() {
        return discountedPricePerQuantity;
    }

    public void setDiscountedPricePerQuantity(List<Object> discountedPricePerQuantity) {
        this.discountedPricePerQuantity = discountedPricePerQuantity;
    }

    public TaxRate2 getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(TaxRate2 taxRate) {
        this.taxRate = taxRate;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public List<State> getState() {
        return state;
    }

    public void setState(List<State> state) {
        this.state = state;
    }

    public String getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(String priceMode) {
        this.priceMode = priceMode;
    }

    public TotalPrice2 getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice2 totalPrice) {
        this.totalPrice = totalPrice;
    }

    public TaxedPrice3 getTaxedPrice() {
        return taxedPrice;
    }

    public void setTaxedPrice(TaxedPrice3 taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public String getLineItemMode() {
        return lineItemMode;
    }

    public void setLineItemMode(String lineItemMode) {
        this.lineItemMode = lineItemMode;
    }
}

class Cart{
    private String typeId;
    private String id;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class BillingAddress{
    private String firstName;
    private String lastName;
    private String streetName;
    private String additionalStreetInfo;
    private String postalCode;
    private String city;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAdditionalStreetInfo() {
        return additionalStreetInfo;
    }

    public void setAdditionalStreetInfo(String additionalStreetInfo) {
        this.additionalStreetInfo = additionalStreetInfo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String country;
    private String phone;
    private String email;
}




