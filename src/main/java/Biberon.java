/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Biberon{
    private double volumen;
    private Bote bote;
    
    public Biberon (double volumen, Bote bote){
        this.volumen = volumen;
        this.bote = bote;
    }
    
    public int calcularNumeroCacitosBiberon(){
       int total =(int) (getVolumen() / (bote.getCcPorCacito() 
               * bote.getGrPorCacito()));
        return total;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    
    
}
