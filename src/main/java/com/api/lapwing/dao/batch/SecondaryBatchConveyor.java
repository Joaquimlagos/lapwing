package com.api.lapwing.dao.batch;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class SecondaryBatchConveyor implements RevisionData {
    private final String distributorCnpj;
    private final String batchId;
    private final String agroindustryCnpj;
    private final String conveyorCnpj;
    private final String entryDate;
    private final String departureDate;

    @JsonCreator
    public SecondaryBatchConveyor(@JsonProperty("DistributorCnpj") final String distributorCnpj,
                                  @JsonProperty("BatchId") final String batchId,
                                  @JsonProperty("AgroindustryCnpj") final String agroindustryCnpj,
                                  @JsonProperty("ConveyorCnpj") final String conveyorCnpj,
                                  @JsonProperty("EntryDate") final String entryDate,
                                  @JsonProperty("DepartureDate") final String departureDate) {
        this.distributorCnpj = distributorCnpj;
        this.batchId = batchId;
        this.agroindustryCnpj = agroindustryCnpj;
        this.conveyorCnpj = conveyorCnpj;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
    }

    @JsonProperty("DistributorCnpj")
    public String getDistributorCnpj() {
        return distributorCnpj;
    }

    @JsonProperty("BatchId")
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty("ConveyorCnpj")
    public String getConveyorCnpj() {
        return conveyorCnpj;
    }

    @JsonProperty("AgroindustryCnpj")
    public String getAgroindustryCnpj() {
        return agroindustryCnpj;
    }

    @JsonProperty("EntryDate")
    public String getEntryDate() {
        return entryDate;
    }

    @JsonProperty("DepartureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @Override
    public String toString() {
        return "SecondaryConveyor{" +
                "distributorCnpj='" + distributorCnpj + '\'' +
                ", batchId='" + batchId + '\'' +
                ", agroindustryCnpj='" + agroindustryCnpj + '\'' +
                ", conveyorCnpj='" + conveyorCnpj + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}
