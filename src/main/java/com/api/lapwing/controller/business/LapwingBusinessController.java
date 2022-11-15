package com.api.lapwing.controller.business;

import com.api.lapwing.dao.business.*;
import com.api.lapwing.service.business.LapwingBusinessService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lapwing")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LapwingBusinessController {

    private final LapwingBusinessService lapwingBusinessService;

    @PostMapping("/aviary")
    @ResponseStatus(HttpStatus.OK)
    public void aviaryRegistration(@RequestBody @Valid Aviary aviary) {
        lapwingBusinessService.insertNewAviary(aviary);
    }

    @PostMapping("/agroindustry")
    @ResponseStatus(HttpStatus.OK)
    public void agroindustryRegistration(@RequestBody @Valid Agroindustry agroindustry) {
        lapwingBusinessService.insertNewAgroindustry(agroindustry);
    }

    @PostMapping("/conveyor")
    @ResponseStatus(HttpStatus.OK)
    public void conveyorRegistration(@RequestBody @Valid Conveyor conveyor) {
        lapwingBusinessService.insertNewConveyor(conveyor);
    }

    @PostMapping("/client")
    @ResponseStatus(HttpStatus.OK)
    public void clientRegistration(@RequestBody @Valid Client client) {
        lapwingBusinessService.insertNewClient(client);
    }

    @PostMapping("/distributor")
    @ResponseStatus(HttpStatus.OK)
    public void clientDistributor(@RequestBody @Valid Distributor distributor) {
        lapwingBusinessService.insertNewDistributor(distributor);
    }

    @PostMapping("/provider")
    @ResponseStatus(HttpStatus.OK)
    public void clientProvider(@RequestBody @Valid Provider provider) {
        lapwingBusinessService.insertNewProvider(provider);
    }

    @GetMapping("/{cnpj}")
    public Aviary findById(@PathVariable String cnpj) {
        return lapwingBusinessService.findAviaryId(cnpj);
    }

    @PostMapping("/update_aviary")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmailAviary(@RequestBody @Valid Aviary aviary) {
        lapwingBusinessService.updateEmailAviary(aviary);
    }

}
