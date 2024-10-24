package hn.unah.poo.dtos;

public class ProductoElectronico extends Productos{
    private  int mesdegarantia;

    public ProductoElectronico(String nombre, int precio, int stok,int mesdegarantia) {
        super(nombre, precio, stok);
        this.mesdegarantia=mesdegarantia;
    }

    public int getMesdegarantia() {
        return mesdegarantia;
    }

    public void setMesdegarantia(int mesdegarantia) {
        this.mesdegarantia = mesdegarantia;
    }



    
    
}
