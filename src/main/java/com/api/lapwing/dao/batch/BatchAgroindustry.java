package com.api.lapwing.dao.batch;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class BatchAgroindustry implements RevisionData {
    private final String batchId;
    private final String agroindustryCnpj;
    private final String sectorId;
    private final String technicalManager;
    private final String batchRecordDate;

    @JsonCreator
    public BatchAgroindustry(
            @JsonProperty("BatchId") final String batchId,
            @JsonProperty("AgroindustryCnpj") String agroindustryCnpj,
            @JsonProperty("SectorId") String sectorId,
            @JsonProperty("TechnicalManager") final String technicalManager,
            @JsonProperty("BatchRecordDate") final String batchRecordDate) {

        this.batchId = batchId;
        this.agroindustryCnpj = agroindustryCnpj;
        this.sectorId = sectorId;
        this.technicalManager = technicalManager;
        this.batchRecordDate = batchRecordDate;
    }

    @JsonProperty("BatchId")
    public String getBatchId() {
        return batchId;
    }

    @JsonProperty("TechnicalManager")
    public String getTechnicalManager() {
        return technicalManager;
    }

    @JsonProperty("BatchRecordDate")
    public String getBatchRecordDate() {
        return batchRecordDate;
    }

    @JsonProperty("AgroindustryCnpj")
    public String getAgroindustryCnpj() {
        return agroindustryCnpj;
    }

    @JsonProperty("SectorId")
    public String getSectorId() {
        return sectorId;
    }

    @Override
    public String toString() {
        return "BatchAgroindustry{" +
                "batchId='" + batchId + '\'' +
                ", agroindustryCnpj='" + agroindustryCnpj + '\'' +
                ", sectorId='" + sectorId + '\'' +
                ", technicalManager='" + technicalManager + '\'' +
                ", batchRecordDate=" + batchRecordDate +
                '}';
    }
}