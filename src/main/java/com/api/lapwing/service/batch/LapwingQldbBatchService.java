package com.api.lapwing.service.batch;

import com.amazon.ion.IonValue;
import com.api.lapwing.constants.ConstantsQldb;
import com.api.lapwing.dao.batch.BatchAgroindustry;
import com.api.lapwing.dao.batch.BatchAviary;
import com.api.lapwing.dao.batch.PrimaryBatchConveyor;
import com.api.lapwing.dao.batch.SecondaryBatchConveyor;
import com.api.lapwing.dao.batch.TertiaryBatchConveyor;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingQldbBatchService {
    public void insertBatchAviary(final BatchAviary batchAviary) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(batchAviary);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO BatchAviary VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertBatchAgroindustry(final BatchAgroindustry batchAgroindustry) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(batchAgroindustry);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO BatchAgroindustry VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertPrimaryBatchConveyor(final PrimaryBatchConveyor primaryBatchConveyor) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(primaryBatchConveyor);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO PrimaryBatchConveyor VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertSecondaryBatchConveyor(final SecondaryBatchConveyor secondaryBatchConveyor) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(secondaryBatchConveyor);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO SecondaryBatchConveyor VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertTertiaryBatchConveyor(final TertiaryBatchConveyor tertiaryBatchConveyor) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(tertiaryBatchConveyor);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO TertiaryBatchConveyor VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void updateBatchAviary(final BatchAviary batchAviary) {
        try {
            final IonValue ionDocumentsId = ConstantsQldb.MAPPER.writeValueAsIonValue(batchAviary.getBatchId());
            final IonValue ionDocumentsAgeAverange = ConstantsQldb.MAPPER.writeValueAsIonValue(batchAviary.getAgeAverage());
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("UPDATE BatchAviary AS a SET a.AgeAverage = ? WHERE a.BatchId = ?", ionDocumentsAgeAverange, ionDocumentsId);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }
}
