package hn.unah.poo.dtos;

public class ProductoAlimenticio extends Productos{
    private int fechaexpiracion;



    public ProductoAlimenticio(String nombre, int precio, int stok,int fechaexpiracion) {
        super(nombre, precio, stok);
        this.fechaexpiracion=fechaexpiracion;
    }



    public int getFechaexpiracion() {
        return fechaexpiracion;
    }



    public void setFechaexpiracion(int fechaexpiracion) {
        this.fechaexpiracion = fechaexpiracion;
    }



    


    
    
}
