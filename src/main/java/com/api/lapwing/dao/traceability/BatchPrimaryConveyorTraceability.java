package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.batch.PrimaryBatchConveyor;
import com.api.lapwing.dao.business.Agroindustry;
import com.api.lapwing.dao.business.Aviary;
import com.api.lapwing.dao.business.Conveyor;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
public final class BatchPrimaryConveyorTraceability implements RevisionData {

    private PrimaryBatchConveyor primaryBatchConveyor;
    private Aviary aviary;
    private Agroindustry agroindustry;
    private Conveyor conveyor;

    @JsonCreator
    public BatchPrimaryConveyorTraceability(
            @JsonProperty("PrimaryBatchConveyor") PrimaryBatchConveyor primaryBatchConveyor,
            @JsonProperty("Aviary") Aviary aviary,
            @JsonProperty("Agroindustry") Agroindustry agroindustry,
            @JsonProperty("Conveyor") Conveyor conveyor
    ) {
        this.primaryBatchConveyor = primaryBatchConveyor;
        this.aviary = aviary;
        this.agroindustry = agroindustry;
        this.conveyor = conveyor;
    }

    @JsonProperty("PrimaryBatchConveyor")
    public PrimaryBatchConveyor getPrimaryBatchConveyor() {
        return primaryBatchConveyor;
    }

    @JsonProperty("Aviary")
    public Aviary getAviary() {
        return aviary;
    }

    @JsonProperty("Agroindustry")
    public Agroindustry getAgroindustry() {
        return agroindustry;
    }

    @JsonProperty("Conveyor")
    public Conveyor getConveyor() {
        return conveyor;
    }

    public void setPrimaryBatchConveyor(PrimaryBatchConveyor primaryBatchConveyor) {
        this.primaryBatchConveyor = primaryBatchConveyor;
    }

    public void setAviary(Aviary aviary) {
        this.aviary = aviary;
    }

    public void setAgroindustry(Agroindustry agroindustry) {
        this.agroindustry = agroindustry;
    }

    public void setConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public String toString() {
        return "BatchPrimaryConveyorTraceability{" +
                "primaryBatchConveyor=" + primaryBatchConveyor +
                ", aviary=" + aviary +
                ", agroindustry=" + agroindustry +
                ", conveyor=" + conveyor +
                '}';
    }
}


