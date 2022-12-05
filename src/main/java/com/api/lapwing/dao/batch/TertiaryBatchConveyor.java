package com.api.lapwing.dao.batch;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class TertiaryBatchConveyor implements RevisionData {
    private final String distributorCnpj;
    private final String batchId;
    private final String clientCnpj;
    private final String conveyorCnpj;
    private final String entryDate;
    private final String departureDate;

    @JsonCreator
    public TertiaryBatchConveyor(@JsonProperty("DistributorCnpj") final String distributorCnpj,
                                 @JsonProperty("BatchId") final String batchId,
                                 @JsonProperty("ClientCnpj") final String clientCnpj,
                                 @JsonProperty("ConveyorCnpj") final String conveyorCnpj,
                                 @JsonProperty("EntryDate") final String entryDate,
                                 @JsonProperty("DepartureDate") final String departureDate) {
        this.distributorCnpj = distributorCnpj;
        this.batchId = batchId;
        this.clientCnpj = clientCnpj;
        this.conveyorCnpj = conveyorCnpj;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
    }

    @JsonProperty("BatchId")
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty("DistributorCnpj")
    public String getDistributorCnpj() {
        return distributorCnpj;
    }

    @JsonProperty("ClientCnpj")
    public String getClientCnpj() {
        return clientCnpj;
    }

    @JsonProperty("EntryDate")
    public String getEntryDate() {
        return entryDate;
    }

    @JsonProperty("ConveyorCnpj")
    public String getConveyorCnpj() {
        return conveyorCnpj;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @Override
    public String toString() {
        return "TertiaryConveyor{" +
                "distributorCnpj='" + distributorCnpj + '\'' +
                ", BatchId='" + batchId + '\'' +
                ", clientCnpj='" + clientCnpj + '\'' +
                ", conveyorCnpj='" + conveyorCnpj + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}

