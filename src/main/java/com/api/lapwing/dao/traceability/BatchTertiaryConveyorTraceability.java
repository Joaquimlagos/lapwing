package com.api.lapwing.dao.traceability;

import com.api.lapwing.dao.RevisionData;
import com.api.lapwing.dao.batch.TertiaryBatchConveyor;
import com.api.lapwing.dao.business.Client;
import com.api.lapwing.dao.business.Conveyor;
import com.api.lapwing.dao.business.Distributor;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
public final class BatchTertiaryConveyorTraceability implements RevisionData {

    private TertiaryBatchConveyor tertiaryBatchConveyor;
    private Distributor distributor;
    private Client client;
    private Conveyor conveyor;

    @JsonCreator
    public BatchTertiaryConveyorTraceability(
            @JsonProperty("TertiaryBatchConveyor") TertiaryBatchConveyor tertiaryBatchConveyor,
            @JsonProperty("Distributor") Distributor distributor,
            @JsonProperty("Client") Client client,
            @JsonProperty("Conveyor") Conveyor conveyor
    ) {
        this.tertiaryBatchConveyor = tertiaryBatchConveyor;
        this.distributor = distributor;
        this.client = client;
        this.conveyor = conveyor;
    }

    @JsonProperty("TertiaryBatchConveyor")
    public TertiaryBatchConveyor getTertiaryBatchConveyor() {
        return tertiaryBatchConveyor;
    }

    @JsonProperty("Distributor")
    public Distributor getDistributor() {
        return distributor;
    }

    @JsonProperty("Client")
    public Client getClient() {
        return client;
    }

    @JsonProperty("Conveyor")
    public Conveyor getConveyor() {
        return conveyor;
    }

    public void setTertiaryBatchConveyor(TertiaryBatchConveyor tertiaryBatchConveyor) {
        this.tertiaryBatchConveyor = tertiaryBatchConveyor;
    }

    public void setDistributor(Distributor distributor) {
        this.distributor = distributor;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setConveyor(Conveyor conveyor) {
        this.conveyor = conveyor;
    }

    @Override
    public String toString() {
        return "BatchTertiaryConveyorTraceability{" +
                "tertiaryBatchConveyor=" + tertiaryBatchConveyor +
                ", distributor=" + distributor +
                ", client=" + client +
                ", conveyor=" + conveyor +
                '}';
    }
}


