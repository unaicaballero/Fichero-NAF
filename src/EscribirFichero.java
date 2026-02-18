import java.io.*;
import java.util.List;

public class EscribirFichero {

    public void escribir(String ruta, List<String> lineas) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero");
        }
    }
}
 