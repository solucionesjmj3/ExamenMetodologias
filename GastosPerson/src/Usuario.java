

public class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private Gasto gasto1;
    private Gasto gasto2;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }



    public void agregarGasto1(Gasto gasto) {
        this.gasto1 = gasto;
    }

    public void agregarGasto2(Gasto gasto) {
        this.gasto2 = gasto;
    }

    public void mostrarGastos() {
        if (gasto1 != null) {
            System.out.println(gasto1);
        }
        if (gasto2 != null) {
            System.out.println(gasto2);
        }
    }


    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}














