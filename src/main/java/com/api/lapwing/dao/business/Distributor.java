package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Distributor implements RevisionData {
    private final BusinessData businessData;

    @JsonCreator
    public Distributor(
            @JsonProperty("BusinessData") final BusinessData businessData) {

        this.businessData = businessData;
    }

    @JsonProperty("BusinessData")
    public BusinessData getBusinessData() {
        return businessData;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "businessData=" + businessData +
                '}';
    }
}


