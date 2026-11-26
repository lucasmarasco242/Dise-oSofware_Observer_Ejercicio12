public class MonitorRed {
    private ObservadorRed[] observadores = new ObservadorRed[10];
    private int cantidad = 0;
    private String estado = "Desconectado";

    public synchronized void suscribir(ObservadorRed observador) {
        if (observador == null || cantidad >= observadores.length) {
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                return;
            }
        }
        observadores[cantidad] = observador;
        cantidad++;
    }

    public synchronized void desuscribir(ObservadorRed observador) {
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                for (int j = i; j < cantidad - 1; j++) {
                    observadores[j] = observadores[j + 1];
                }
                observadores[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
    }

    public void setEstado(String nuevoEstado) {
        if (nuevoEstado == null || nuevoEstado.isEmpty()) {
            return;
        }
        this.estado = nuevoEstado;
        notificar();
    }

    private void notificar() {
        ObservadorRed[] copia;
        int total;
        synchronized (this) {
            copia = new ObservadorRed[cantidad];
            for (int i = 0; i < cantidad; i++) {
                copia[i] = observadores[i];
            }
            total = cantidad;
        }
        for (int i = 0; i < total; i++) {
            copia[i].alCambiarEstado(estado);
        }
    }
}