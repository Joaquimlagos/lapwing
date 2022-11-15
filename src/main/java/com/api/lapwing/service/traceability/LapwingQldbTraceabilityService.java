package com.api.lapwing.service.traceability;

import com.api.lapwing.constants.ConstantsQldb;
import com.api.lapwing.dao.batch.*;
import com.api.lapwing.dao.business.*;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.qldb.Result;
import software.amazon.qldb.TransactionExecutor;

import java.io.IOException;
import java.util.ArrayList;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingQldbTraceabilityService {


    public BatchAviary selectBatchAviary(final String batchId) {
        final BatchAviary[] batchAviary = new BatchAviary[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            batchAviary[0] = findBatchAviary(txn, batchId);

        });

        return batchAviary[0];
    }

    public ArrayList<BatchAgroindustry> selectBatchAgroindustry(final String batchId) {
        final ArrayList<BatchAgroindustry>[] batchAgroindustry = new ArrayList[]{new ArrayList<BatchAgroindustry>()};

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            batchAgroindustry[0] = findBatchAgroindustry(txn, batchId);

        });

        return batchAgroindustry[0];
    }

    public PrimaryBatchConveyor selectPrimaryBatchConveyor(final String batchId) {
        final PrimaryBatchConveyor[] primaryBatchConveyor = new PrimaryBatchConveyor[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            primaryBatchConveyor[0] = findPrimaryBatchConveyor(txn, batchId);

        });

        return primaryBatchConveyor[0];
    }

    public SecondaryBatchConveyor selectSecondaryBatchConveyor(final String batchId) {
        final SecondaryBatchConveyor[] secondaryBatchConveyors = new SecondaryBatchConveyor[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            secondaryBatchConveyors[0] = findSecondaryBatchConveyor(txn, batchId);

        });

        return secondaryBatchConveyors[0];
    }

    public TertiaryBatchConveyor selectTertiaryBatchConveyor(final String batchId) {
        final TertiaryBatchConveyor[] tertiaryBatchConveyors = new TertiaryBatchConveyor[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            tertiaryBatchConveyors[0] = findTertiaryBatchConveyor(txn, batchId);

        });

        return tertiaryBatchConveyors[0];
    }


    public Aviary selectAviary(final String cnpj) {
        final Aviary[] aviary = new Aviary[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            aviary[0] = findAviary(txn, cnpj);

        });

        return aviary[0];
    }

    public Agroindustry selectAgroindustry(final String cnpj) {
        final Agroindustry[] agroindustry = new Agroindustry[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            agroindustry[0] = findAgroindustry(txn, cnpj);

        });

        return agroindustry[0];
    }

    public Conveyor selectConveyor(final String cnpj) {
        final Conveyor[] conveyor = new Conveyor[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            conveyor[0] = findConveyor(txn, cnpj);

        });

        return conveyor[0];
    }

    public Distributor selectDistributor(final String cnpj) {
        final Distributor[] distributor = new Distributor[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            distributor[0] = findDistributor(txn, cnpj);

        });

        return distributor[0];
    }

    public Client selectClient(final String cnpj) {
        final Client[] client = new Client[1];

        ConnectToLedger.getDriver().execute(txn -> {
            System.out.println("Finding a document");
            client[0] = findClient(txn, cnpj);

        });

        return client[0];
    }


    private Aviary findAviary(final TransactionExecutor txn, final String cnpj) {
        try {
            final String query = "SELECT * FROM Aviary WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Aviary.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private Agroindustry findAgroindustry(final TransactionExecutor txn, final String cnpj) {
        try {
            final String query = "SELECT * FROM Agroindustry WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Agroindustry.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private Conveyor findConveyor(final TransactionExecutor txn, final String cnpj) {
        try {
            final String query = "SELECT * FROM Conveyor WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Conveyor.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private Distributor findDistributor(final TransactionExecutor txn, final String cnpj) {
        try {
            final String query = "SELECT * FROM Distributor WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Distributor.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private Client findClient(final TransactionExecutor txn, final String cnpj) {
        try {
            final String query = "SELECT * FROM Client WHERE BusinessData.Cnpj = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(cnpj));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), Client.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private BatchAviary findBatchAviary(final TransactionExecutor txn, final String batchId) {
        try {
            final String query = "SELECT * FROM BatchAviary WHERE BatchId = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(batchId));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), BatchAviary.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private ArrayList<BatchAgroindustry> findBatchAgroindustry(final TransactionExecutor txn, final String batchId) {
        try {
            ArrayList<BatchAgroindustry> batchAgroindustries = new ArrayList<>();

            final String query = "SELECT * FROM BatchAgroindustry WHERE BatchId = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(batchId));

            result.forEach(ionValue -> {
                try {
                    batchAgroindustries.add(ConstantsQldb.MAPPER.readValue(ionValue, BatchAgroindustry.class));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            return batchAgroindustries;
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private PrimaryBatchConveyor findPrimaryBatchConveyor(final TransactionExecutor txn, final String batchId) {
        try {
            final String query = "SELECT * FROM PrimaryBatchConveyor WHERE BatchId = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(batchId));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), PrimaryBatchConveyor.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private SecondaryBatchConveyor findSecondaryBatchConveyor(final TransactionExecutor txn, final String batchId) {
        try {
            final String query = "SELECT * FROM SecondaryBatchConveyor WHERE BatchId = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(batchId));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), SecondaryBatchConveyor.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    private TertiaryBatchConveyor findTertiaryBatchConveyor(final TransactionExecutor txn, final String batchId) {
        try {
            final String query = "SELECT * FROM TertiaryBatchConveyor WHERE BatchId = ?";
            Result result = txn.execute(query, ConstantsQldb.MAPPER.writeValueAsIonValue(batchId));

            return ConstantsQldb.MAPPER.readValue(result.iterator().next(), TertiaryBatchConveyor.class);

        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

}
