package com.cg.commtools.data;

import java.util.Date;
import java.util.List;

public class Order{
    private String type;
    private String id;
    private int version;
    private int lastMessageSequenceNumber;
    private Date createdAt;
    private Date lastModifiedAt;
    private LastModifiedBy lastModifiedBy;
    private CreatedBy createdBy;
    private String customerId;
    private TotalPrice totalPrice;
    private TaxedPrice taxedPrice;
    private String country;
    private String orderState;
    private List<Object> syncInfo;
    private List<Object> returnInfo;
    private ShippingInfo shippingInfo;
    private String taxMode;
    private String inventoryMode;
    private String taxRoundingMode;
    private String taxCalculationMode;
    private String origin;
    private List<LineItem> lineItems;
    private List<Object> customLineItems;
    private boolean transactionFee;
    private List<Object> discountCodes;
    private Cart cart;
    private ShippingAddress shippingAddress;
    private BillingAddress billingAddress;
    private List<Object> itemShippingAddresses;
    private List<Object> refusedGifts;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getLastMessageSequenceNumber() {
        return lastMessageSequenceNumber;
    }

    public void setLastMessageSequenceNumber(int lastMessageSequenceNumber) {
        this.lastMessageSequenceNumber = lastMessageSequenceNumber;
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

    public LastModifiedBy getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    public TaxedPrice getTaxedPrice() {
        return taxedPrice;
    }

    public void setTaxedPrice(TaxedPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public List<Object> getSyncInfo() {
        return syncInfo;
    }

    public void setSyncInfo(List<Object> syncInfo) {
        this.syncInfo = syncInfo;
    }

    public List<Object> getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(List<Object> returnInfo) {
        this.returnInfo = returnInfo;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public String getTaxMode() {
        return taxMode;
    }

    public void setTaxMode(String taxMode) {
        this.taxMode = taxMode;
    }

    public String getInventoryMode() {
        return inventoryMode;
    }

    public void setInventoryMode(String inventoryMode) {
        this.inventoryMode = inventoryMode;
    }

    public String getTaxRoundingMode() {
        return taxRoundingMode;
    }

    public void setTaxRoundingMode(String taxRoundingMode) {
        this.taxRoundingMode = taxRoundingMode;
    }

    public String getTaxCalculationMode() {
        return taxCalculationMode;
    }

    public void setTaxCalculationMode(String taxCalculationMode) {
        this.taxCalculationMode = taxCalculationMode;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public List<Object> getCustomLineItems() {
        return customLineItems;
    }

    public void setCustomLineItems(List<Object> customLineItems) {
        this.customLineItems = customLineItems;
    }

    public boolean isTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(boolean transactionFee) {
        this.transactionFee = transactionFee;
    }

    public List<Object> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<Object> getItemShippingAddresses() {
        return itemShippingAddresses;
    }

    public void setItemShippingAddresses(List<Object> itemShippingAddresses) {
        this.itemShippingAddresses = itemShippingAddresses;
    }

    public List<Object> getRefusedGifts() {
        return refusedGifts;
    }

    public void setRefusedGifts(List<Object> refusedGifts) {
        this.refusedGifts = refusedGifts;
    }
}
