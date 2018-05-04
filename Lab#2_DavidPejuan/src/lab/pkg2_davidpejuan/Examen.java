/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidpejuan;

import java.util.ArrayList;

/**
 *
 * @author pejua
 */
public class Examen {
    private String nclase;
    private ArrayList <String> preg=new ArrayList();
    private ArrayList <String> resp=new ArrayList();

    public Examen() {
    }

    public Examen(String nclase) {
        this.nclase = nclase;
    }
    
    public String getNclase() {
        return nclase;
    }

    public void setNclase(String nclase) {
        this.nclase = nclase;
    }

    public ArrayList<String> getPreg() {
        return preg;
    }

    public void setPreg(ArrayList<String> preg) {
        this.preg = preg;
    }

    public ArrayList<String> getResp() {
        return resp;
    }

    public void setResp(ArrayList<String> resp) {
        this.resp = resp;
    }
    
    
}
