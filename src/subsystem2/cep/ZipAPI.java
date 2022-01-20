package subsystem2.cep;

public class ZipAPI {
    private static ZipAPI instance = new ZipAPI();

    private ZipAPI(){
        super();
    }

    public static ZipAPI getInstance() {
        if (instance == null){
            instance = new ZipAPI();
        }
        return instance;
    }

    public String findCity(String zip) {
        return "Salvador";
    }

    public String findState(String state) {
        return "BA";
    }

}