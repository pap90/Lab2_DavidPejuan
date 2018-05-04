/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_davidpejuan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pejua
 */
public class Lab2_DavidPejuan {

    public static Scanner sc = new Scanner(System.in);
    public static int cont = 1;
    public static ArrayList<Alumno> A = new ArrayList();
    public static ArrayList<Examen> E = new ArrayList();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        while (opc != 4) {
            System.out.println("1) Administrar \n 2)Crear cuenta \n 3)Log in. \n 4)Salir \n Ingrese su opcion:");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Admin();
                    break;
                case 2:
                    crearusuario();
                    break;
                case 3:
                    login();
                    break;
                default:
            }
        }
    }

    public static void Admin() {
        int op = 0;
        while (op != 4) {
            System.out.println("1)Elaborar un examen. \n 2)revisar examen. 3)Visualizar nota de todos sus alumnos.");
            switch (op) {
                case 1:
                    crearex();
                    break;
                case 2:
                    revisar();
                    break;
                case 3:
                    try {
                        for (int i = 0; i < A.size(); i++) {
                            Alumno tempo = (Alumno) A.get(i);
                            System.out.println("El alumno: " + tempo.getName() + " \n tiene de nota/s: " + tempo.getNota());
                        }
                    } catch (Exception e) {
                        System.out.println("No hay alumnos registrados.");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public static void crearusuario() {
        Alumno aux;

        aux = new Alumno();
        System.out.println("Ingrese su nombre: ");
        String n = sc.next();
        aux.setName(n);
        aux.setNcuenta(Integer.toString(cont));
        cont++;
        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/YYYY");
        String f = sc.next();
        aux.setFdn(f);
        System.out.println("Ingrese su edad: ");
        int e = sc.nextInt();
        aux.setEdad(e);
        System.out.println("Ingrese ciudad de residencia: ");
        String r = sc.next();
        aux.setCDR(r);
        System.out.println("Ingrese Nacionalidad: ");
        String nac= sc.next();
        aux.setNacio(nac);
        System.out.println("Ingrese su numero de identidad: ");
        String ID = sc.next();
        System.out.println("Ingrese un nombre de usuario: ");
        String user = sc.next();
        aux.setUser(user);
        System.out.println("Ingrese su contraseña: ");
        String p = sc.next();
        aux.setPass(p);
        A.add(aux);
    }

    public static void crearex() {
        Examen aux;
        aux = new Examen();
        System.out.println("Ingrese la clase del examen: ");
        String c = sc.next();
        aux.setNclase(c);
        char respe = 's';
        while (respe == 's' || respe == 'S') {
            System.out.println("Ingrese pregunta");
            String preg = sc.next();
            aux.getPreg().add(preg);
            System.out.println("Ingrese respuesta de la pregunta anterior: ");
            String resp = sc.next();
            aux.getResp().add(resp);
            System.out.println("Desea agregar otra pregunta?[s/n]: ");
            respe = sc.next().charAt(0);
        }
        E.add(aux);
        for (int i = 0; i < A.size(); i++) {
            A.get(i).setEx(E);
        }
    }

    public static void login() {
        System.out.println("Ingrese Usuario: ");
        String user = sc.next();
        System.out.println("Ingrese contraseña: ");
        String contra = sc.next();
        Alumno actual = null;
        for (Alumno u : A) {
            if (user.equals(u.getUser()) && user.equals(u.getPass())) {
                actual = u;
                break;
            }
        }
        if (actual != null) {
            logged(actual);

        }
    }
    public static void logged(Alumno u){
        int op=0;
        while (op!=5) {
            System.out.println("1) visualizar los datos del estudiante \n 2)modificar Datos \n 3)ver las notas \n 4)Realizar examen. \n Ingrese su opcion: ");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("nombre: "+u.getName()+"\n fecha de nacimiento: "+u.getFdn()+"\n edad: "+u.getEdad()+"\n ciudad de residencia: "+u.getCDR()+"\n Nacionalidad: "+u.getNacio()
                    +"\n numero de identidad: "+u.getID()+"\n nombre de usuario: "+u.getUser()+"\n contraseña: "+u.getPass());
                    break;
                case 2:
                    System.out.println("Seleccione que desea cambiar: \n"
                            + "1) nombre \n"
                            + "2) fecha de nacimiento \n"
                            + "3) edad \n"
                            + "4) ciudad de residencia \n"
                            + "5)Nacionalidad \n"
                            + "6) numero de identidad \n"
                            + "7) nombre de usuario \n"
                            + "8) contraseña \n"
                            + "Ingrese su opcion.");
                    int f=sc.nextInt();
                    switch (f) {
                        case 1:
                            System.out.println("Ingrese nuevo nombre: ");
                            String nnom=sc.next();
                            u.setName(nnom);
                            break;
                        case 2:
                            System.out.println("Ingrese nueva fecha de nacimiento DD/MM/YYYY");
                            String nfdn=sc.next();
                            u.setNacio(nfdn);
                            break;
                        case 3:
                            System.out.println("Ingrese nueva edad: ");
                            int nedad=sc.nextInt();
                            u.setEdad(nedad);
                            break;
                        case 4:
                            System.out.println("Ingrese nueva ciudad de residencia: ");
                            String ncdr=sc.next();
                            u.setCDR(ncdr);
                            break;
                        case 5:
                            System.out.println("Ingrese nacionalidad: ");
                            String nnc=sc.next();
                            u.setNacio(nnc);
                            break;
                        case 6:
                            System.out.println("Ingrese nuveo numero de identidad: ");
                            String nndi=sc.next();
                            u.setID(nndi);
                            break;
                        case 7:
                            System.out.println("Ingrese nuevo nombre de usuario: ");
                            String nndu=sc.next();
                            u.setUser(nndu);
                            break;
                        case 8:
                            System.out.println("Ingrese nueva contraseña: ");
                            String nc=sc.next();
                            u.setPass(nc);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    System.out.println("Sus notas son: ");
                    System.out.println(u.getNota());
                    break;
                case 4:
                    ArrayList<String> s=new ArrayList();
                    int cont=0;
                    System.out.println("Seleccione un examen a realizar: ");
                    for (int i = 0; i < E.size(); i++) {
                        System.out.println(cont+")"+E.get(i));
                    }
                    int sel=sc.nextInt();
                    System.out.println(E.get(sel).getPreg());
                    System.out.println("Ingrese sus respuestas en orden y en una sola linea con espacios. ");
                    String resps=sc.next();
                    s.add(resps);
                    u.setResps(s);
                    
                    break;
                default:
            }
        }
    }
    public static void revisar(){
        System.out.println("Ingrese el alumno que desea revisar: ");
        int cont=1;
        for (int i = 0; i < E.size(); i++) {
            System.out.println(cont+")"+E.get(i));
        }
        int sel=sc.nextInt();
        System.out.println("Sus respuestas fueron: ");
        System.out.println(A.get(sel).getResps());
        System.out.println("Ingrese nota: ");
        int not=sc.nextInt();
        A.get(sel).setNota(A.get(sel).getNota()+not);
    }
}
