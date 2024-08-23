public class Run {
    public static void main(String[] args) {
        EdadException exPersonalizada = new EdadException(); // Se crea una excepción personalizada.
        try {
            exPersonalizada.validarEdad(17); // Valida la edad (esto lanzará una excepción).
        } catch (EdadException ex) {
            // Este bloque catch manejará la excepción personalizada.
            System.out.println("Se ejecutó la excepción personalizada, mensaje de la excepción: " + ex.getMessage());
        } catch (Exception ex) {
            // Este bloque catch manejará cualquier otra excepción general.
            System.out.println("Excepción por defecto");
        }
    }
}