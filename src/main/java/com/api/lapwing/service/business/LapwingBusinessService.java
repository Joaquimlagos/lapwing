package com.api.lapwing.service.business;

import com.api.lapwing.dao.business.*;
import com.api.lapwing.dao.ledger.ConnectToLedger;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.qldb.QldbDriver;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingBusinessService {
    @Autowired
    private final LapwingQldbBusinessService lapwingQldbBusinessService;

    public QldbDriver getDriver() {
        return ConnectToLedger.createQldbDriver(1);
    }

    public void insertNewAviary(Aviary aviary) {
        getDriver();
        lapwingQldbBusinessService.insertAviary(aviary);
    }

    public void insertNewConveyor(Conveyor conveyor) {
        System.out.println(conveyor);
        getDriver();
        lapwingQldbBusinessService.insertConveyor(conveyor);
    }

    public void insertNewAgroindustry(Agroindustry agroindustry) {
        getDriver();
        lapwingQldbBusinessService.insertAgroindustry(agroindustry);
    }

    public void insertNewDistributor(Distributor distributor) {
        getDriver();
        lapwingQldbBusinessService.insertDistributor(distributor);
    }

    public void insertNewProvider(Provider provider) {
        getDriver();
        lapwingQldbBusinessService.insertProvider(provider);
    }

    public void insertNewClient(Client client) {
        getDriver();
        lapwingQldbBusinessService.insertClient(client);
    }

    public void updateEmailAviary(Aviary aviary) {
        getDriver();
        lapwingQldbBusinessService.updateAviary(aviary);
    }

    public Aviary findAviaryId(String cnpj) {
        getDriver();
        return lapwingQldbBusinessService.select(cnpj);
    }

}

