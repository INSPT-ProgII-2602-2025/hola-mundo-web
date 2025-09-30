package holamundo.model;


// Esta clase es un POJO (Plain Old Java Object) que representa un Terminator con sus atributos básicos.
public class Terminator {
    private int id;
    private String model;
    private String description;

    public Terminator(int id, String model, String description) {
        this.id = id;
        this.model = model;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}