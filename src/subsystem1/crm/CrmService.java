package subsystem1.crm;

public class CrmService {
    private CrmService() {
        super();
    }

    public static void persistClient(String name, String zip, String city, String state) {
        System.out.println("Client saved to CRM system");
        System.out.println(name);
        System.out.println(zip);
        System.out.println(city);
        System.out.println(state);
    }
}
