/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidpejuan;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pejua
 */
public class Lab2_DavidPejuan {
    public static Scanner sc=new Scanner(System.in);
    public static int cont=1;
    public static Date d;
    public static ArrayList <Alumno> A=new ArrayList();
    public static ArrayList <Examen> E=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc=0;
        while (opc!=4) {
            System.out.println("1) Administrar \n 2)Crear cuenta \n 3)Log in. \n 4)Salir \n Ingrese su opcion:");
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    crearusuario();
                    break;
                default:
            }
        }
    }
    public static void crearusuario(){
        Alumno aux;
        
        aux=new Alumno();
        System.out.println("Ingrese su nombre: ");
        String n=sc.next();
        aux.setName(n);
        aux.setNcuenta(Integer.toString(cont));
        cont++;
        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/YYYY");
        String f=sc.next();
        aux.setFdn(f);
        System.out.println("Ingrese su edad: ");
        int e=sc.nextInt();
        aux.setEdad(e);
        System.out.println("Ingrese ciudad de residencia: ");
        String r=sc.next();
        aux.setCDR(r);
        System.out.println("Ingrese Nacionalidad: ");
        String nac=sc.next();
        aux.setNacio(nac);
        System.out.println("Ingrese su numero de identidad: ");
        String ID=sc.next();
        System.out.println("Ingrese un nombre de usuario: ");
        String user=sc.next();
        aux.setUser(user);
        System.out.println("Ingrese su contraseña: ");
        String p=sc.next();
        aux.setPass(p);
        A.add(aux);
    }
    public static void crearex(){
        Examen aux;
        aux=new Examen();
        System.out.println("Ingrese la clase del examen: ");
        String c=sc.next();
        aux.setNclase(c);
        char respe='s';
        while (respe=='s'||respe=='S') {
            System.out.println("Ingrese pregunta");
            String preg=sc.next();
            aux.getPreg().add(preg);
            System.out.println("Ingrese respuesta de la pregunta anterior: ");
            String resp=sc.next();
            aux.getResp().add(resp);
            System.out.println("Desea agregar otra pregunta?[s/n]: ");
            respe=sc.next().charAt(0);
        }
        E.add(aux);
    }
}
