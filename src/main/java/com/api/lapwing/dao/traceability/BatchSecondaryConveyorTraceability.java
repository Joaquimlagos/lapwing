package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.batch.SecondaryBatchConveyor;
import com.api.lapwing.dao.business.Agroindustry;
import com.api.lapwing.dao.business.Conveyor;
import com.api.lapwing.dao.business.Distributor;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class BatchSecondaryConveyorTraceability implements RevisionData {
    private SecondaryBatchConveyor secondaryBatchConveyor;
    private Distributor distributor;
    private Agroindustry agroindustry;
    private Conveyor conveyor;

    @JsonCreator
    public BatchSecondaryConveyorTraceability(
            @JsonProperty("SecondaryBatchConveyor") SecondaryBatchConveyor secondaryBatchConveyor,
            @JsonProperty("Distributor") Distributor distributor,
            @JsonProperty("Agroindustry") Agroindustry agroindustry,
            @JsonProperty("Conveyor") Conveyor conveyor
    ) {
        this.secondaryBatchConveyor = secondaryBatchConveyor;
        this.distributor = distributor;
        this.agroindustry = agroindustry;
        this.conveyor = conveyor;
    }

    @JsonProperty("SecondaryBatchConveyor")
    public SecondaryBatchConveyor getSecondaryBatchConveyor() {
        return secondaryBatchConveyor;
    }

    @JsonProperty("Distributor")
    public Distributor getDistributor() {
        return distributor;
    }

    @JsonProperty("Agroindustry")
    public Agroindustry getAgroindustry() {
        return agroindustry;
    }

    @JsonProperty("Conveyor")
    public Conveyor getConveyor() {
        return conveyor;
    }

    public void setSecondaryBatchConveyor(SecondaryBatchConveyor secondaryBatchConveyor) {
        this.secondaryBatchConveyor = secondaryBatchConveyor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public void setAgroindustry(Agroindustry agroindustry) {
        this.agroindustry = agroindustry;
    }

    public void setConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public String toString() {
        return "BatchSecondaryConveyorTraceability{" +
                "secondaryBatchConveyor=" + secondaryBatchConveyor +
                ", distributor=" + distributor +
                ", agroindustry=" + agroindustry +
                ", conveyor=" + conveyor +
                '}';
    }
}


