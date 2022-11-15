package com.api.lapwing.service.batch;

import com.api.lapwing.dao.batch.*;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.qldb.QldbDriver;

import java.util.UUID;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingBatchService {
    @Autowired
    private final LapwingQldbBatchService lapwingQldbBatchService;

    public QldbDriver getDriver() {
        return ConnectToLedger.createQldbDriver(1);
    }

    public void insertNewBatchAviary(BatchAviary batchAviary) {
        String uniqueID = UUID.randomUUID().toString();
        batchAviary.setBatchId(uniqueID);

        getDriver();
        lapwingQldbBatchService.insertBatchAviary(batchAviary);
    }

    public void insertNewBatchAgroindustry(BatchAgroindustry batchAgroindustry) {
        getDriver();
        lapwingQldbBatchService.insertBatchAgroindustry(batchAgroindustry);
    }

    public void insertNewPrimaryBatchConveyor(PrimaryBatchConveyor primaryBatchConveyor) {
        getDriver();
        lapwingQldbBatchService.insertPrimaryBatchConveyor(primaryBatchConveyor);
    }

    public void insertNewSecondaryBatchConveyor(SecondaryBatchConveyor secondaryBatchConveyor) {
        getDriver();
        lapwingQldbBatchService.insertSecondaryBatchConveyor(secondaryBatchConveyor);
    }

    public void insertNewTertiaryBatchConveyor(TertiaryBatchConveyor tertiaryBatchConveyor) {
        getDriver();
        lapwingQldbBatchService.insertTertiaryBatchConveyor(tertiaryBatchConveyor);
    }

    public void updateAgeAverage(BatchAviary batchAviary) {
        getDriver();
        lapwingQldbBatchService.updateBatchAviary(batchAviary);
    }

}

