/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Bote {
    private final int ccPorCacito = 10;
    private final int grPorCacito = 5;
    private int pesoBoteGramos;
    private double precioBote;
    
    public Bote(int pesoBoteGramos, double precioBote){
        this.pesoBoteGramos = pesoBoteGramos;
        this.precioBote = precioBote;
    }
    
    public double precioCazo(){
        return (grPorCacito * precioBote) / pesoBoteGramos;
    }

    public int getCcPorCacito() {
        return ccPorCacito;
    }

    public int getPesoBoteGramos() {
        return pesoBoteGramos;
    }

    public void setPesoBoteGramos(int pesoBoteGramos) {
        this.pesoBoteGramos = pesoBoteGramos;
    }

    public double getPrecioBote() {
        return precioBote;
    }

    public void setPrecioBote(double precioBote) {
        this.precioBote = precioBote;
    }
    
    public double getGrPorCacito() {
        return grPorCacito;
    }
}

