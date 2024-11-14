package setters;

/**
 * Clase principal para ejecutar el programa
 * @author Tomas
 */
public class Tpguetterandsetters {

    public static void main(String[] args) {
       
        // Crear un objeto Producto con valores iniciales
        Producto producto1 = new Producto("Autos", 100, 10);

        // Muestre los valores iniciales de los atributos utilizando los getters
        System.out.println("-- Precio y Cantidad inicial --");
        System.out.println("Producto: " + producto1.getNombre());
        System.out.println("Precio: $" + producto1.getPrecio());
        System.out.println("Cantidad: " + producto1.getCantidad() + " unidades");

        // Modifique los valores utilizando los setters y muestre los nuevos valores
        System.out.println("-- Precio y Cantidad nueva --");
        producto1.setPrecio(90);
        producto1.setCantidad(9);
        System.out.println("Nuevo Precio: $" + producto1.getPrecio());
        System.out.println("Nueva Cantidad: " + producto1.getCantidad() + " unidades");

        // Intente establecer un precio y una cantidad negativos y observe el resultado
        System.out.println("-- Precio y Cantidad negativa --");
        producto1.setPrecio(-10);  // No deberia actualizar porque el precio es negativo
        producto1.setCantidad(-10);  // No deberia actualizar porque la cantidad es negativa
        System.out.println("Ultimo Precio: $" + producto1.getPrecio());
        System.out.println("Ultima Cantidad: " + producto1.getCantidad() + " unidades");
    }
}