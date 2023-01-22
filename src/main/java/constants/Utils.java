package constants;

public enum Utils {
    BASE_URL("https://ssd-api.jpl.nasa.gov/fireball.api");
    private final String value;

    Utils(String valor){
       this.value = valor;
    }
    public String getValue(){
        return this.value;
    }
}
