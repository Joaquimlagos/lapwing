package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Conveyor implements RevisionData {
    private final BusinessData businessData;

    @JsonCreator
    public Conveyor(
            @JsonProperty("BusinessData") final BusinessData businessData) {
        this.businessData = businessData;
    }

    @JsonProperty("BusinessData")
    public BusinessData getBusinessData() {
        return businessData;
    }

    @Override
    public String toString() {
        return "Conveyor{" +
                "businessData=" + businessData +
                '}';
    }
}

