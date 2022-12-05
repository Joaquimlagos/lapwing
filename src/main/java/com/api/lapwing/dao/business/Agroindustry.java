package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Agroindustry implements RevisionData {
    private final BusinessData businessData;

    @JsonCreator
    public Agroindustry(
            @JsonProperty("BusinessData") final BusinessData businessData) {
        this.businessData = businessData;
    }

    @JsonProperty("BusinessData")
    public BusinessData getBusinessData() {
        return businessData;
    }

    @Override
    public String toString() {
        return "Agroindustry{" +
                "businessData=" + businessData +
                '}';
    }
}

