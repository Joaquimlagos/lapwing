package com.api.lapwing.controller.traceability;

import com.api.lapwing.dao.business.*;
import com.api.lapwing.dao.traceability.*;
import com.api.lapwing.service.business.LapwingBusinessService;
import com.api.lapwing.service.traceability.LapwingTraceabilityService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lapwing")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingTraceabilityController {

    private final LapwingTraceabilityService lapwingTraceabilityService;

    @GetMapping("/batch_traceability/{batchId}")
    public TraceabilityBatch traceabilityBatch(@PathVariable String batchId) {
        return lapwingTraceabilityService.traceabilityBatch(batchId);
    }

    @GetMapping("/batch_agroindustry/{batchId}")
    public BatchAgroindustryTraceability batchAgroindustry(@PathVariable String batchId) {
        return lapwingTraceabilityService.findBatchAgroindustryTraceability(batchId);
    }

    @GetMapping("/batch_primary/{batchId}")
    public BatchPrimaryConveyorTraceability batchPrimary(@PathVariable String batchId) {
        return lapwingTraceabilityService.findBatchPrimaryConveyorTraceability(batchId);
    }

    @GetMapping("/batch_secondary/{batchId}")
    public BatchSecondaryConveyorTraceability batchSecondary(@PathVariable String batchId) {
        return lapwingTraceabilityService.findBatchSecondaryConveyorTraceability(batchId);
    }

    @GetMapping("/batch_tertiary/{batchId}")
    public BatchTertiaryConveyorTraceability batchTertiary(@PathVariable String batchId) {
        return lapwingTraceabilityService.findBatchTertiaryConveyorTraceability(batchId);
    }

}
