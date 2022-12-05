package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.business.BusinessData;
import com.api.lapwing.dao.business.Provider;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public final class TraceabilityBatch implements RevisionData {
    private BatchAviaryTraceability batchAviaryTraceability;
    private BatchAgroindustryTraceability batchAgroindustryTraceability;
    private BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability;
    private BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability;
    private BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability;

    @JsonCreator
    public TraceabilityBatch(
            @JsonProperty("BatchAviaryTraceability") BatchAviaryTraceability batchAviaryTraceability,
            @JsonProperty("BatchPrimaryConveyorTraceability") BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability,
            @JsonProperty("BatchAgroindustryTraceability") BatchAgroindustryTraceability batchAgroindustryTraceability,
            @JsonProperty("BatchSecondaryConveyorTraceability") BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability,
            @JsonProperty("BatchTertiaryConveyorTraceability") BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability
    ) {
        this.batchAviaryTraceability = batchAviaryTraceability;
        this.batchAgroindustryTraceability = batchAgroindustryTraceability;
        this.batchPrimaryConveyorTraceability = batchPrimaryConveyorTraceability;
        this.batchSecondaryConveyorTraceability = batchSecondaryConveyorTraceability;
        this.batchTertiaryConveyorTraceability = batchTertiaryConveyorTraceability;
    }

    @JsonProperty("BatchAviaryTraceability")
    public BatchAviaryTraceability getBatchAviaryTraceability() {
        return batchAviaryTraceability;
    }

    public void setBatchAviaryTraceability(BatchAviaryTraceability batchAviaryTraceability) {
        this.batchAviaryTraceability = batchAviaryTraceability;
    }

    @JsonProperty("BatchPrimaryConveyorTraceability")
    public BatchPrimaryConveyorTraceability getBatchPrimaryConveyorTraceability() {
        return batchPrimaryConveyorTraceability;
    }

    public void setBatchPrimaryConveyorTraceability(BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability) {
        this.batchPrimaryConveyorTraceability = batchPrimaryConveyorTraceability;
    }

    @JsonProperty("BatchAgroindustryTraceability")
    public BatchAgroindustryTraceability getBatchAgroindustryTraceability() {
        return batchAgroindustryTraceability;
    }

    public void setBatchAgroindustryTraceability(BatchAgroindustryTraceability batchAgroindustryTraceability) {
        this.batchAgroindustryTraceability = batchAgroindustryTraceability;
    }

    @JsonProperty("BatchSecondaryConveyorTraceability")
    public BatchSecondaryConveyorTraceability getBatchSecondaryConveyorTraceability() {
        return batchSecondaryConveyorTraceability;
    }

    public void setBatchSecondaryConveyorTraceability(BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability) {
        this.batchSecondaryConveyorTraceability = batchSecondaryConveyorTraceability;
    }

    @JsonProperty("BatchTertiaryConveyorTraceability")
    public BatchTertiaryConveyorTraceability getBatchTertiaryConveyorTraceability() {
        return batchTertiaryConveyorTraceability;
    }

    public void setBatchTertiaryConveyorTraceability(BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability) {
        this.batchTertiaryConveyorTraceability = batchTertiaryConveyorTraceability;
    }

    @Override
    public String toString() {
        return "TraceabilityBatch{" +
                "batchAviaryTraceability=" + batchAviaryTraceability +
                ", batchAgroindustryTraceability=" + batchAgroindustryTraceability +
                ", batchPrimaryConveyorTraceability=" + batchPrimaryConveyorTraceability +
                ", batchSecondaryConveyorTraceability=" + batchSecondaryConveyorTraceability +
                ", batchTertiaryConveyorTraceability=" + batchTertiaryConveyorTraceability +
                '}';
    }
}
