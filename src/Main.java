public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Ana López";
        tarea1.horasEstimadas = 8.5;
        tarea1.completada = false;

        Tarea tarea2 = new Tarea();
        tarea2.titulo = "Crear API REST";
        tarea2.responsable = "Jose Madrid";
        tarea2.horasEstimadas = 12.0;
        tarea2.completada = false;

        Tarea tarea3 = new Tarea();
        tarea3.titulo = "Elaborar pruebas unitarias";
        tarea3.responsable = "María Gómez";
        tarea3.horasEstimadas = 5.0;
        tarea3.completada = false;

        tarea1.completar();

        System.out.println();
        tarea1.mostrarInformacion();
        System.out.println();
        tarea2.mostrarInformacion();
        System.out.println();
        tarea3.mostrarInformacion();
    }
}