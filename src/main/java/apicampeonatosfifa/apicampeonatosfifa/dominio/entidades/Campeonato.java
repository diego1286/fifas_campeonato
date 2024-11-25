package apicampeonatosfifa.apicampeonatosfifa.dominio.entidades;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "campeonato")
public class Campeonato {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_campeonato")
    @GenericGenerator(name = "secuencia_campeonato", strategy = "increment")
    private int id;
    @Column(name = "campeonato", unique = true)
    private String nombre;
    @Column(name = "año")
    private int año;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Seleccion seleccion;

    public Campeonato() {
    }

    public Campeonato(int id, String nombre, int año, Seleccion seleccion) {
        this.id = id;
        this.nombre = nombre;
        this.año = año;
        this.seleccion = seleccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Seleccion getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Seleccion seleccion) {
        this.seleccion = seleccion;
    }

}