package com.api.lapwing.dao.batch;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class PrimaryBatchConveyor implements RevisionData {
    private final String aviaryCnpj;
    private final String batchId;
    private final String agroindustryCnpj;
    private final String conveyorCnpj;
    private final String entryDate;
    private final String departureDate;

    @JsonCreator
    public PrimaryBatchConveyor(@JsonProperty("AviaryCnpj") final String aviaryCnpj,
                                @JsonProperty("BatchId") final String batchId,
                                @JsonProperty("ConveyorCnpj") final String conveyorCnpj,
                                @JsonProperty("AgroindustryCnpj") final String agroindustryCnpj,
                                @JsonProperty("EntryDate") final String entryDate,
                                @JsonProperty("DepartureDate") final String departureDate) {
        this.aviaryCnpj = aviaryCnpj;
        this.batchId = batchId;
        this.agroindustryCnpj = agroindustryCnpj;
        this.conveyorCnpj = conveyorCnpj;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
    }

    @JsonProperty("BatchId")
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty("AviaryCnpj")
    public String getAviaryCnpj() {
        return aviaryCnpj;
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
        return "PrimaryBatchConveyor{" +
                "aviaryCnpj='" + aviaryCnpj + '\'' +
                ", batchId='" + batchId + '\'' +
                ", agroindustryCnpj='" + agroindustryCnpj + '\'' +
                ", conveyorCnpj='" + conveyorCnpj + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                '}';
    }
}
