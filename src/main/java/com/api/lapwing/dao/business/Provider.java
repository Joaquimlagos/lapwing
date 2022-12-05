package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Provider implements RevisionData {
    private final String product;
    private final BusinessData businessData;

    @JsonCreator
    public Provider(
            @JsonProperty("Product") final String product,
            @JsonProperty("BusinessData") final BusinessData businessData) {
        this.product = product;
        this.businessData = businessData;
    }

    @JsonProperty("Product")
    public String getProduct() {
        return product;
    }

    @JsonProperty("BusinessData")
    public BusinessData getBusinessData() {
        return businessData;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "product='" + product + '\'' +
                ", businessData=" + businessData +
                '}';
    }
}
