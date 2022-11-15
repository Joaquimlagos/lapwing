package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.batch.BatchAgroindustry;
import com.api.lapwing.dao.business.Agroindustry;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
public final class BatchAgroindustryTraceability implements RevisionData {

    private ArrayList<BatchAgroindustry> batchAgroindustry;

    private Agroindustry agroindustry;

    @JsonCreator
    public BatchAgroindustryTraceability(
            @JsonProperty("BatchAgroindustry") ArrayList<BatchAgroindustry>  batchAgroindustry,
            @JsonProperty("Agroindustry") Agroindustry agroindustry
    ) {
        this.batchAgroindustry = batchAgroindustry;
        this.agroindustry = agroindustry;
    }

    @JsonProperty("BatchAgroindustry")
    public ArrayList<BatchAgroindustry>  getBatchAgroindustry() {
        return batchAgroindustry;
    }

    @JsonProperty("Agroindustry")
    public Agroindustry getAgroindustry() {
        return agroindustry;
    }

    public void setBatchAgroindustry(ArrayList<BatchAgroindustry>  batchAgroindustry) {
        this.batchAgroindustry = batchAgroindustry;
    }

    public void setAgroindustry(Agroindustry agroindustry) {
        this.agroindustry = agroindustry;
    }

    @Override
    public String toString() {
        return "BatchAgroindustryTraceability{" +
                "batchAgroindustry=" + batchAgroindustry +
                ", agroindustry=" + agroindustry +
                '}';
    }
}

