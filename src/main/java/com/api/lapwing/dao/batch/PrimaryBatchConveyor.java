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
