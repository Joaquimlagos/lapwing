package com.api.lapwing.dao.batch;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class BatchAviary implements RevisionData {
    private String batchId;
    private final String aviaryCnpj;
    private final Integer ageAverage;
    private final String weightCount;
    private final Integer amountChicken;
    private final String batchRecordDate;

    @JsonCreator
    public BatchAviary(@JsonProperty("BatchId") final String batchId,
                       @JsonProperty("AviaryCnpj") final String aviaryCnpj,
                       @JsonProperty("BatchRecordDate") String batchRecordDate,
                       @JsonProperty("AgeAverage") final Integer ageAverage,
                       @JsonProperty("AmountChicken") final Integer amountChicken,
                       @JsonProperty("WeightCount") final String weightCount
    ) {

        this.batchId = batchId;
        this.aviaryCnpj = aviaryCnpj;
        this.batchRecordDate = batchRecordDate;
        this.amountChicken = amountChicken;
        this.ageAverage = ageAverage;
        this.weightCount = weightCount;
    }

    @JsonProperty("BatchId")
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    @JsonProperty("AviaryCnpj")
    public String getAviaryCnpj() {
        return aviaryCnpj;
    }

    @JsonProperty("AgeAverage")
    public Integer getAgeAverage() {
        return ageAverage;
    }

    @JsonProperty("AmountChicken")
    public Integer getAmountChicken() {
        return amountChicken;
    }

    @JsonProperty("BatchRecordDate")
    public String getBatchRecordDate() {
        return batchRecordDate;
    }

    @JsonProperty("WeightCount")
    public String getWeightCount() {
        return weightCount;
    }

    @Override
    public String toString() {
        return "BatchAviary{" +
                "batchId='" + batchId + '\'' +
                ", aviaryCnpj='" + aviaryCnpj + '\'' +
                ", ageAverage=" + ageAverage +
                ", weightCount='" + weightCount + '\'' +
                ", amountChicken=" + amountChicken +
                ", batchRecordDate='" + batchRecordDate + '\'' +
                '}';
    }
}