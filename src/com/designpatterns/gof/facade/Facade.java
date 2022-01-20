package com.designpatterns.gof.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.ZipAPI;

public class Facade {
    public void migrateClient(String name, String zip) {
        String city = ZipAPI.getInstance().findCity(zip);
        String state = ZipAPI.getInstance().findState(zip);

        CrmService.persistClient(name, zip, city, state);
    }
}
