package com.api.lapwing.controller.batch;

import com.api.lapwing.dao.batch.*;
import com.api.lapwing.service.batch.LapwingBatchService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lapwing")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingBatchController {

    private final LapwingBatchService lapwingBatchService;


    @PostMapping("/batch_aviary")
    @ResponseStatus(HttpStatus.OK)
    public void batchAviaryRegistration(@RequestBody @Valid BatchAviary batchAviary) {
        lapwingBatchService.insertNewBatchAviary(batchAviary);
    }

    @PostMapping("/batch_agroindustry")
    @ResponseStatus(HttpStatus.OK)
    public void batchAgroindustryRegistration(@RequestBody @Valid BatchAgroindustry batchAgroindustry) {
        lapwingBatchService.insertNewBatchAgroindustry(batchAgroindustry);
    }

    @PostMapping("/batch_primary_conveyor")
    @ResponseStatus(HttpStatus.OK)
    public void batchPrimaryConveyorRegistration(@RequestBody @Valid PrimaryBatchConveyor primaryBatchConveyor) {
        lapwingBatchService.insertNewPrimaryBatchConveyor(primaryBatchConveyor);
    }

    @PostMapping("/batch_secondary_conveyor")
    @ResponseStatus(HttpStatus.OK)
    public void batchSecondaryConveyorRegistration(@RequestBody @Valid SecondaryBatchConveyor secondaryBatchConveyor) {
        lapwingBatchService.insertNewSecondaryBatchConveyor(secondaryBatchConveyor);
    }

    @PostMapping("/batch_tertiary_conveyor")
    @ResponseStatus(HttpStatus.OK)
    public void batchTertiaryConveyorRegistration(@RequestBody @Valid TertiaryBatchConveyor tertiaryBatchConveyor) {
        lapwingBatchService.insertNewTertiaryBatchConveyor(tertiaryBatchConveyor);
    }

    @PostMapping("/update_batch_aviary")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmailAviary(@RequestBody @Valid BatchAviary batchAviary) {
        lapwingBatchService.updateAgeAverage(batchAviary);
    }

}
