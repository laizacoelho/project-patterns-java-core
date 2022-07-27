package one.digitalinnovation.gof.facade.subsistema1.crm;

public class CrmService {
    private CrmService(){
        super();
    }
    public static void saveClient(String name, String zipcode, String city, String state) {
        System.out.println("Client saved in the CRM's system.");
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(city);
        System.out.println(state);


    }
}
