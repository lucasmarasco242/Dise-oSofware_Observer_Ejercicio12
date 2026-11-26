public class MensajeBarraEstado implements ObservadorRed {
    public void alCambiarEstado(String estado) {
        System.out.println("[BARRA DE ESTADO] Conexión de red: " + estado);
    }
}