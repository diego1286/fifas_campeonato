package apicampeonatosfifa.apicampeonatosfifa.dominio.entidades;


import javax.persistence.*;

@Entity
@Table(name = "fase")
public class Fase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "fase", unique = true, nullable = false)
    private String fase;

    public Fase() {
    }

    public Fase(int id, String fase) {
        this.id = id;
        this.fase = fase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
}
