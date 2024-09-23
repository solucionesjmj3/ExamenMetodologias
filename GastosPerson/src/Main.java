import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Crear categorías
        Categoria alimentacion = new Categoria("Alimentación", "Gastos en comida y bebida");
        Categoria transporte = new Categoria("Transporte", "Gastos en transporte público y privado");

        // Crear un usuario
        Usuario usuario = new Usuario("Juan Pérez", "juan.perez@example.com", "12345");

        // Crear gastos
        Gasto gasto1 = new Gasto(50000, new Date(), alimentacion);
        Gasto gasto2 = new Gasto(20000, new Date(), transporte);

        // Agregar gastos al usuario
        usuario.agregarGasto1(gasto1);
        usuario.agregarGasto2(gasto2);

        // Mostrar los gastos del usuario
        usuario.mostrarGastos();

    }
}
