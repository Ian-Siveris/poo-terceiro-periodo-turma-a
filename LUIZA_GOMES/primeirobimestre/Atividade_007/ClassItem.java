package Atividade_007;

public class ClassItem { // Atribuitos id, nome, tipo, valor.
    // - Método gerarDescricao, printa o id do item, nome, tipo e valor.

    private String id;
    private String name;
    private String type;
    private double value;


    public ClassItem(String id, String name, String type, double value) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public void gerarDescricao() {
        System.out.println("id: " + id + "\ndescrição: " + name + "\ntipo do item: " + type + "\nvalor: " + value);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
