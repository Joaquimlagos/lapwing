package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public final class Aviary implements RevisionData {
    private final ArrayList<Provider> provider;
    private final BusinessData businessData;

    @JsonCreator
    public Aviary(
            @JsonProperty("Providers") final ArrayList<Provider> provider,
            @JsonProperty("BusinessData") final BusinessData businessData) {
        this.provider = provider;
        this.businessData = businessData;
    }

    @JsonProperty("Providers")
    public ArrayList<Provider> getProvider() {
        return provider;
    }

    @JsonProperty("BusinessData")
    public BusinessData getBusinessData() {
        return businessData;
    }

    @Override
    public String toString() {
        return "Aviary{" +
                "provider=" + provider +
                ", businessData=" + businessData +
                '}';
    }
}
