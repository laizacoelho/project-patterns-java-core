package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.facade.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.facade.subsistema2.cpf.ZipcodeApi;

//Prover uma interface que reduza a complexidade nas integrações com subsistemas
public class Facade {
    public void moveClient(String name, String zipcode) {
        String city = ZipcodeApi.getZipCode().retrieveCity(zipcode);
        String state = ZipcodeApi.getZipCode().retrieveState(zipcode);
        CrmService.saveClient(name, zipcode, city, state);

    }
}
