import hn.unah.poo.dtos.ConfiguracionTienda;
import hn.unah.poo.dtos.ProductoAlimenticio;
import hn.unah.poo.dtos.ProductoElectronico;
import hn.unah.poo.dtos.Productos;
import hn.unah.poo.enums.Monedas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");

        ConfiguracionTienda tienda = new ConfiguracionTienda("amazon", "usa", Monedas.Dolar);
        ProductoAlimenticio ProductoAlimenticio1 = new ProductoAlimenticio("carnemolida", 2000, 20, 10);
        ProductoAlimenticio ProductoAlimenticio2 = new ProductoAlimenticio("carneseca", 2060, 10, 9);
         ProductoElectronico productoElectronico1 = new ProductoElectronico("tv", 2000, 20, 20);
         ProductoElectronico productoElectronico2 = new ProductoElectronico("radio", 2067, 60, 10);
    

    }
}
