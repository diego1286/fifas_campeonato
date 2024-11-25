package apicampeonatosfifa.apicampeonatosfifa.dominio.entidades;

import java.io.Serializable;

public class GrupoPaisId implements Serializable {

    private static final long serialVersionUID = 1L;

    private int grupo;
    private int pais;
    public GrupoPaisId(int grupo, int pais) {
        this.grupo = grupo;
        this.pais = pais;
    }
    public int getGrupo() {
        return grupo;
    }
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    public int getPais() {
        return pais;
    }
    public void setPais(int pais) {
        this.pais = pais;
    }
    
}
