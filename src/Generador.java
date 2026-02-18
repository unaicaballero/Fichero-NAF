import java.util.ArrayList;
import java.util.List;

public class Generador {

    public List<String> generar(int n) {
        List<String> lineas = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String linea = "";

            for (int j = 1; j <= i; j++) {
                linea = linea + j;

                if (j < i) {
                    linea = linea + " ";
                }
            }

            lineas.add(linea);
        }

        return lineas;
    }
}