import java.time.LocalDate;

public class Cajero {

    int precioTiempo;
    int tiempoActual;
    boolean hayCambio;

    private int contabilizarTiempoEstadia(Ticket ticket){
        return tiempoActual - ticket.getTiempoDeEstadia();
    }

    private int calcularImporte(Ticket ticket){
        int tiempoDeEstacionamiento = this.contabilizarTiempoEstadia(ticket);
        return tiempoDeEstacionamiento * precioTiempo;
    }

    private void efectuarPago(Ticket ticket, int dineroRecibido){
        if(elPagoEsExitoso(this.calcularImporte(ticket),dineroRecibido)){
            ticket.pagarTicket();
             int cambio = calcularCambio(this.calcularImporte(ticket),dineroRecibido);
        }
        //Habria que crear una clase de interfaz de usuario, para comunicarle e interactuar con lo referido al dinero

    }

    private int calcularCambio(int monto, int dineroRecibido){
            return dineroRecibido - monto;
    }

    private boolean elPagoEsExitoso(int monto , int dineroRecibido){
        if(hayCambio){
            return dineroRecibido >= monto;
        }else {
            return dineroRecibido == monto;
        }
    }


}
