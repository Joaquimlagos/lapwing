package com.api.lapwing.dao.batch;


/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
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