public class Main {
    public static void main(String[] args) {
        MonitorRed monitor = new MonitorRed();

        ObservadorRed icono = new IconoBarraHerramientas();
        ObservadorRed mensaje = new MensajeBarraEstado();

        monitor.suscribir(icono);
        monitor.suscribir(mensaje);

        monitor.setEstado("Conectado");
        monitor.setEstado("Intermitente");
        monitor.setEstado("Desconectado");
    }
}