package App4;

public class Automovil {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadllenado() {
        return capacidadllenado;
    }

    public void setCapacidadllenado(String capacidadllenado) {
        this.capacidadllenado = capacidadllenado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    private Integer id;
    private String modelo;
    private String capacidadllenado;
    private String marca;
    private String ano;

    public Automovil(Integer id, String marca, String modelo, String ano, String capacidadllenado) {
        this.id = id;
        this.modelo = modelo;
        this.capacidadllenado = capacidadllenado;
        this.marca = marca;
        this.ano = ano;
    }
}
