/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t1_poo;

import java.util.Scanner;

/**
 *
 * @author leoch
 */
public class T1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String rpta="s";
        AlumnoCollector controla = new  AlumnoCollector();
        System.out.println("*****RESGISTRO DE Alumnos*****");


        while (rpta.equals("s"))
        {
            
            try 
            {
             Alumno p = new  Alumno();
            System.out.println("INGRESE NOMBRE DE PERSONA: ");
            String nom = sc.nextLine();
            p.setNombre(nom);

            System.out.println("INRGESE Tipo de documento: ");
            String TipoDoc=sc.nextLine();
            p.setTipo_documento(TipoDoc);
            
            
            String NroDoc = "";

            while (true)
            {
                System.out.println("INGRESE NUMERO DE DOCUMENTO: ");
                NroDoc = sc.nextLine();

                if (TipoDoc.equalsIgnoreCase("DNI"))
                {
                    if (NroDoc.length() == 8)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("ERROR: EL DNI DEBE TENER 8 DIGITOS");
                    }
                }
                else
                {
                    if (NroDoc.length() == 11)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("ERROR: EL DOCUMENTO DEBE TENER 11 DIGITOS");
                    }
                }
            }
            p.setNumero_documento(NroDoc);
            
            System.out.println("INGRESE NIVEL SOCIOECONOMICO: ");
            String Nivel_soci =sc.nextLine();
            p.setNivel_socie(Nivel_soci);
            
            System.out.println("INGRESE TIPO DE BECA: ");
            String Nivel_BECA =sc.nextLine();
            p.setTipo_beca(Nivel_BECA);

            
            controla.agregar_Alumno(p);
              
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("La persona NO fue registrada");
            }
            System.out.println("DESEA AÑADIR MÁS TRABAJADORES?");
            rpta=sc.nextLine();
        }
        controla.lista_Alumno();
    }
    
}
