package com.api.lapwing.service.traceability;

import com.api.lapwing.dao.batch.*;
import com.api.lapwing.dao.business.*;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import com.api.lapwing.dao.traceability.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.qldb.QldbDriver;

import java.util.ArrayList;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingTraceabilityService {
    @Autowired
    private final LapwingQldbTraceabilityService lapwingQldbTraceabilityService;

    public QldbDriver getDriver() {
        return ConnectToLedger.createQldbDriver(1);
    }

    public TraceabilityBatch traceabilityBatch(String batchId) {
        BatchAviaryTraceability batchAviaryTraceability = findBatchAviaryTraceability(batchId);
        BatchAgroindustryTraceability batchAgroindustryTraceability = findBatchAgroindustryTraceability(batchId);
        BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability = findBatchPrimaryConveyorTraceability(batchId);
        BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability = findBatchSecondaryConveyorTraceability(batchId);
        BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability = findBatchTertiaryConveyorTraceability(batchId);

        TraceabilityBatch traceabilityBatch = new TraceabilityBatch(batchAviaryTraceability,batchPrimaryConveyorTraceability, batchAgroindustryTraceability , batchSecondaryConveyorTraceability, batchTertiaryConveyorTraceability);

        return traceabilityBatch;
    }

    public BatchAviaryTraceability findBatchAviaryTraceability(String batchId) {
        getDriver();

        BatchAviary batchAviary = lapwingQldbTraceabilityService.selectBatchAviary(batchId);

        Aviary aviary = lapwingQldbTraceabilityService.selectAviary(batchAviary.getAviaryCnpj());

        BatchAviaryTraceability batchAviaryTraceability = new BatchAviaryTraceability(batchAviary, aviary);

        return batchAviaryTraceability;
    }

    public BatchAgroindustryTraceability findBatchAgroindustryTraceability(String batchId) {
        getDriver();

        ArrayList<BatchAgroindustry> batchAgroindustry = lapwingQldbTraceabilityService.selectBatchAgroindustry(batchId);

        Agroindustry agroindustry = lapwingQldbTraceabilityService.selectAgroindustry(batchAgroindustry.get(0).getAgroindustryCnpj());

        BatchAgroindustryTraceability batchAgroindustryTraceability = new BatchAgroindustryTraceability(batchAgroindustry, agroindustry);

        return batchAgroindustryTraceability;
    }

    public BatchPrimaryConveyorTraceability findBatchPrimaryConveyorTraceability(String batchId) {
        getDriver();

        PrimaryBatchConveyor primaryBatchConveyor = lapwingQldbTraceabilityService.selectPrimaryBatchConveyor(batchId);

        Conveyor conveyor = lapwingQldbTraceabilityService.selectConveyor(primaryBatchConveyor.getConveyorCnpj());

        Agroindustry agroindustry = lapwingQldbTraceabilityService.selectAgroindustry(primaryBatchConveyor.getAgroindustryCnpj());

        Aviary aviary = lapwingQldbTraceabilityService.selectAviary(primaryBatchConveyor.getAviaryCnpj());

        BatchPrimaryConveyorTraceability batchPrimaryConveyorTraceability = new BatchPrimaryConveyorTraceability(primaryBatchConveyor, aviary, agroindustry, conveyor);

        return batchPrimaryConveyorTraceability;
    }

    public BatchSecondaryConveyorTraceability findBatchSecondaryConveyorTraceability(String batchId) {
        getDriver();

        SecondaryBatchConveyor secondaryBatchConveyor = lapwingQldbTraceabilityService.selectSecondaryBatchConveyor(batchId);

        Conveyor conveyor = lapwingQldbTraceabilityService.selectConveyor(secondaryBatchConveyor.getConveyorCnpj());

        Agroindustry agroindustry = lapwingQldbTraceabilityService.selectAgroindustry(secondaryBatchConveyor.getAgroindustryCnpj());

        Distributor distributor = lapwingQldbTraceabilityService.selectDistributor(secondaryBatchConveyor.getDistributorCnpj());

        BatchSecondaryConveyorTraceability batchSecondaryConveyorTraceability = new BatchSecondaryConveyorTraceability(secondaryBatchConveyor, distributor, agroindustry, conveyor);

        return batchSecondaryConveyorTraceability;
    }

    public BatchTertiaryConveyorTraceability findBatchTertiaryConveyorTraceability(String batchId) {
        getDriver();

        TertiaryBatchConveyor tertiaryBatchConveyor = lapwingQldbTraceabilityService.selectTertiaryBatchConveyor(batchId);

        Conveyor conveyor = lapwingQldbTraceabilityService.selectConveyor(tertiaryBatchConveyor.getConveyorCnpj());

        Client client = lapwingQldbTraceabilityService.selectClient(tertiaryBatchConveyor.getClientCnpj());

        Distributor distributor = lapwingQldbTraceabilityService.selectDistributor(tertiaryBatchConveyor.getDistributorCnpj());

        BatchTertiaryConveyorTraceability batchTertiaryConveyorTraceability = new BatchTertiaryConveyorTraceability(tertiaryBatchConveyor, distributor, client, conveyor);

        return batchTertiaryConveyorTraceability;
    }

}

