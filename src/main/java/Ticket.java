import java.time.LocalDate;

public class Ticket {

    private int tiempoDeEstadia;
    private boolean estaPago = false;

    public int getTiempoDeEstadia() {
        return tiempoDeEstadia;
    }

    public boolean isEstaPago() {
        return estaPago;
    }

    public void pagarTicket(){
        estaPago = true;
    }
}
