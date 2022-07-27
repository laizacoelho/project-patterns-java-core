package one.digitalinnovation.gof.facade.subsistema2.cpf;

import one.digitalinnovation.gof.singleton.SingletonEager;

public class ZipcodeApi {
    private static ZipcodeApi zipcodeApi= new ZipcodeApi();
    private ZipcodeApi() {
        super();
    }

    public static ZipcodeApi  getZipCode() {
        return zipcodeApi;
    }

    public String retrieveCity(String zipcode) {
        return "Santos";
    }

    public String retrieveState(String state) {
        return "São Paulo";
    }

}
