package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.batch.BatchAviary;
import com.api.lapwing.dao.business.Aviary;
import com.api.lapwing.dao.business.Provider;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
public final class BatchAviaryTraceability implements RevisionData {

    private BatchAviary batchAviary;

    private Aviary aviary;

    @JsonCreator
    public BatchAviaryTraceability(
            @JsonProperty("BatchAviary") BatchAviary batchAviary,
            @JsonProperty("Aviary") Aviary aviary
    ) {
        this.batchAviary = batchAviary;
        this.aviary = aviary;
    }

    @JsonProperty("BatchAviary")
    public BatchAviary getBatchAviary() {
        return batchAviary;
    }

    @JsonProperty("Aviary")
    public Aviary getAviary() {
        return aviary;
    }

    public void setBatchAviary(BatchAviary batchAviary) {
        this.batchAviary = batchAviary;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }

    @Override
    public String toString() {
        return "BatchAviaryTraceability{" +
                "batchAviary=" + batchAviary +
                ", aviary=" + aviary +
                '}';
    }
}

