public class Tarea {

    public String titulo;
    public String responsable;


    double horasEstimadas;
    boolean completada;


    public void mostrarInformacion() {
        System.out.println("--- DETALLES DE LA TAREA ---");
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas Estimadas: " + horasEstimadas);
        System.out.println("Completada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("La tarea '" + titulo + "' ha sido completada.");
    }


    void mostrarResponsable() {
        System.out.println("Responsable de '" + titulo + "': " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de '" + titulo + "': " + (completada ? "Completada" : "Pendiente"));
    }
}