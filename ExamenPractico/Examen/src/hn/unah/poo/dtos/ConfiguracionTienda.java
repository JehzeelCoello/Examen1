package hn.unah.poo.dtos;

import hn.unah.poo.enums.Monedas;

public class ConfiguracionTienda {
    private String nombretienda;
    private String direccion;
    private Monedas moneda;





    public ConfiguracionTienda(String nombretienda, String direccion, Monedas moneda) {
        this.nombretienda = nombretienda;
        this.direccion = direccion;
        this.moneda = moneda;
        System.out.println("se a instanciado correctamente ");
    }



    
    

    




    
}
