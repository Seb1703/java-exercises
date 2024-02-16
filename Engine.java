public enum Engine {
    DIESEL("Diesel"),
    PETROL("Petrol"),
    GAS("Gas"),
    ELECTRO("Electro");

    private String description;

    Engine(String description){
        this.description = description;
    }

    public String description(){
        return description;
    }
}

