package com.api.lapwing.dao.traceability;

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
import com.api.lapwing.dao.business.BusinessData;
import com.api.lapwing.dao.business.Provider;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
public final class TraceabilityBatch implements RevisionData {
    private BatchAviaryTraceability batchAviaryTraceability;
    private BatchAgroindustryTraceability batchAgroindustryTraceability;
    private BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability;
    private BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability;
    private BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability;


    @JsonCreator
    public TraceabilityBatch(
            @JsonProperty("BatchAviaryTraceability") BatchAviaryTraceability batchAviaryTraceability,
            @JsonProperty("BatchPrimaryConveyorTraceability") BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability,
            @JsonProperty("BatchAgroindustryTraceability") BatchAgroindustryTraceability batchAgroindustryTraceability,
            @JsonProperty("BatchSecondaryConveyorTraceability") BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability,
            @JsonProperty("BatchTertiaryConveyorTraceability") BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability
    ) {
        this.batchAviaryTraceability = batchAviaryTraceability;
        this.batchAgroindustryTraceability = batchAgroindustryTraceability;
        this.batchPrimaryConveyorTraceability = batchPrimaryConveyorTraceability;
        this.batchSecondaryConveyorTraceability = batchSecondaryConveyorTraceability;
        this.batchTertiaryConveyorTraceability = batchTertiaryConveyorTraceability;
    }

    @JsonProperty("BatchAviaryTraceability")
    public BatchAviaryTraceability getBatchAviaryTraceability() {
        return batchAviaryTraceability;
    }

    public void setBatchAviaryTraceability(BatchAviaryTraceability batchAviaryTraceability) {
        this.batchAviaryTraceability = batchAviaryTraceability;
    }

    @JsonProperty("BatchPrimaryConveyorTraceability")
    public BatchPrimaryConveyorTraceability getBatchPrimaryConveyorTraceability() {
        return batchPrimaryConveyorTraceability;
    }

    public void setBatchPrimaryConveyorTraceability(BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability) {
        this.batchPrimaryConveyorTraceability = batchPrimaryConveyorTraceability;
    }

    @JsonProperty("BatchAgroindustryTraceability")
    public BatchAgroindustryTraceability getBatchAgroindustryTraceability() {
        return batchAgroindustryTraceability;
    }

    public void setBatchAgroindustryTraceability(BatchAgroindustryTraceability batchAgroindustryTraceability) {
        this.batchAgroindustryTraceability = batchAgroindustryTraceability;
    }

    @JsonProperty("BatchSecondaryConveyorTraceability")
    public BatchSecondaryConveyorTraceability getBatchSecondaryConveyorTraceability() {
        return batchSecondaryConveyorTraceability;
    }

    public void setBatchSecondaryConveyorTraceability(BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability) {
        this.batchSecondaryConveyorTraceability = batchSecondaryConveyorTraceability;
    }

    @JsonProperty("BatchTertiaryConveyorTraceability")
    public BatchTertiaryConveyorTraceability getBatchTertiaryConveyorTraceability() {
        return batchTertiaryConveyorTraceability;
    }

    public void setBatchTertiaryConveyorTraceability(BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability) {
        this.batchTertiaryConveyorTraceability = batchTertiaryConveyorTraceability;
    }

    @Override
    public String toString() {
        return "TraceabilityBatch{" +
                "batchAviaryTraceability=" + batchAviaryTraceability +
                ", batchAgroindustryTraceability=" + batchAgroindustryTraceability +
                ", batchPrimaryConveyorTraceability=" + batchPrimaryConveyorTraceability +
                ", batchSecondaryConveyorTraceability=" + batchSecondaryConveyorTraceability +
                ", batchTertiaryConveyorTraceability=" + batchTertiaryConveyorTraceability +
                '}';
    }
}
