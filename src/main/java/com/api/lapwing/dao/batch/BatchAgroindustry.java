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