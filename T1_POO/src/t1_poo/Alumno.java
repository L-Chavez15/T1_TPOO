/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1_poo;

/**
 *
 * @author leoch
 */
public class Alumno 
{
    private String nombre;
    private String tipo_documento;
    private String numero_documento;
    private String Nivel_socie;
    private String tipo_beca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public Boolean setNumero_documento(String numero_documento) 
    {
        if(numero_documento.length()==8)
        {
            this.numero_documento=numero_documento;
            return true;
        }
        if(numero_documento.length()==11)
        {
            this.numero_documento=numero_documento;
            return true;
        }
        else
        {
            System.out.println("ERROR, INGRESE UNA CANTIDAD VALIDA");
            return false;
        }
    }

    public String getNivel_socie() {
        return Nivel_socie;
    }

    public void setNivel_socie(String Nivel_socie) {
        this.Nivel_socie = Nivel_socie;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }

    public void setTipo_beca(String tipo_beca) {
        this.tipo_beca = tipo_beca;
    }

    
    
    
    
    
    
   public void VerDato()
   {
       System.out.println("NOMBRE: "+this.nombre+ " Tipo de documento: "+this.tipo_documento+" Nivel socioeconomico: "+this.Nivel_socie+" Tipo de BECA: "+this.tipo_beca);
   }
}
