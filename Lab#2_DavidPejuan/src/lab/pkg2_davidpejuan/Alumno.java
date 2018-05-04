/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidpejuan;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pejua
 */
public class Alumno {

    private String name;
    private String ncuenta;
    private String fdn;
    private int edad;
    private String CDR;
    private String nacio;
    private String ID;
    private String user;
    private String pass;
    private ArrayList<notas> nota = new ArrayList();

    public Alumno() {
    }

    public Alumno(String name, String ncuenta, String fdn, int edad, String CDR, String nacio, String ID, String user, String pass) {
        this.name = name;
        this.ncuenta = ncuenta;
        this.fdn = fdn;
        this.edad = edad;
        this.CDR = CDR;
        this.nacio = nacio;
        this.ID = ID;
        this.user = user;
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getFdn() {
        return fdn;
    }

    public void setFdn(String fdn) {
        this.fdn = fdn;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCDR() {
        return CDR;
    }

    public void setCDR(String CDR) {
        this.CDR = CDR;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<notas> getNota() {
        return nota;
    }

    public void setNota(ArrayList<notas> nota) {
        this.nota = nota;
    }

}
