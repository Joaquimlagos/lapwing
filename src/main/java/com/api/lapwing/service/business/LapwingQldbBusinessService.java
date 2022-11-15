package com.api.lapwing.service.business;

import com.amazon.ion.IonValue;
import com.api.lapwing.constants.ConstantsQldb;
import com.api.lapwing.dao.business.*;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.qldb.Result;
import software.amazon.qldb.TransactionExecutor;

import java.io.IOException;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingQldbBusinessService {

    public void insertAviary(final Aviary aviary) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(aviary);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO Aviary VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertConveyor(final Conveyor conveyor) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(conveyor);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");
                System.out.println(conveyor);

                txn.execute("INSERT INTO Conveyor VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }


    public void insertAgroindustry(final Agroindustry agroindustry) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(agroindustry);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO Agroindustry VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertDistributor(final Distributor distributor) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(distributor);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO Distributor VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertClient(final Client client) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(client);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO Client VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void insertProvider(final Provider provider) {
        try {
            final IonValue ionDocuments = ConstantsQldb.MAPPER.writeValueAsIonValue(provider);
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("INSERT INTO Provider VALUE ?", ionDocuments);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public Aviary select(final String cnpj) {
        final Aviary[] result = new Aviary[1];
        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Inserting a document");
            result[0] = findAviaryId(txn, cnpj);
        });
        return result[0];
    }

    private Aviary findAviaryId(final TransactionExecutor txn, final String cnpj) {
        try {
            //final String query = "SELECT AviaryId,ChickenHousingId,BusinessData,FeedSupplierId FROM Aviary WHERE BusinessData.Cnpj = ?";
            final String query = "SELECT * FROM Aviary WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Aviary.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void updateAviary(final Aviary aviary) {
        try {
            final IonValue ionDocumentsEmail = ConstantsQldb.MAPPER.writeValueAsIonValue(aviary.getBusinessData().getEmail());
            final IonValue ionDocumentsCnpj = ConstantsQldb.MAPPER.writeValueAsIonValue(aviary.getBusinessData().getCnpj());
            ConnectToLedger.getDriver().execute(txn -> {
                System.out.println("Inserting a document");

                txn.execute("UPDATE Aviary AS a SET a.BusinessData.Email = ? WHERE a.BusinessData.Cnpj = ?", ionDocumentsEmail, ionDocumentsCnpj);
            });
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }
}
