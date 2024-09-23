
import java.util.Date;

public class Gasto {
        private double monto;
        private Date fecha;
        private Categoria categoria;

        public Gasto(double monto, Date fecha, Categoria categoria) {
            this.monto = monto;
            this.fecha = fecha;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return "Gasto de " + monto + " en " + categoria + " el " + fecha;
        }

        // Getters y Setters
        public double getMonto() {
            return monto;
        }

        public void setMonto(double monto) {
            this.monto = monto;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public Categoria getCategoria() {
            return categoria;
        }

        public void setCategoria(Categoria categoria) {
            this.categoria = categoria;
        }

    }



