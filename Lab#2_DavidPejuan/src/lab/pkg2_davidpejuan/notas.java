/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidpejuan;

/**
 *
 * @author pejua
 */
public class notas {

    private String clase;
    private String nombre;
    private int nota;

    public notas() {
    }

    public notas(String clase, String nombre, int nota) {
        this.clase = clase;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
