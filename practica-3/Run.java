
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Run {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        while ((line = br.readLine()) != null && !line.trim().isEmpty()) {
            StringTokenizer st = new StringTokenizer(line, ",");
            
            int clave = Integer.parseInt(st.nextToken());
            int numMin = Integer.parseInt(st.nextToken());
            
            double costoPorMinuto = 0;
            switch (clave) {
                case 12:
                    costoPorMinuto = 2.0;
                    break;
                case 15:
                    costoPorMinuto = 2.2;
                    break;
                case 18:
                    costoPorMinuto = 4.5;
                    break;
                case 19:
                    costoPorMinuto = 3.5;
                    break;
                case 23:
                    costoPorMinuto = 6.0;
                    break;
                case 25:
                    costoPorMinuto = 6.0;
                    break;
                case 29:
                    costoPorMinuto = 5.0;
                    break;
                default:
                    System.out.println("Clave no válida");
                    continue;
            }
            double costoTotal = numMin * costoPorMinuto;
            if (costoTotal == Math.floor(costoTotal)) {
                System.out.printf("%.0f%n", costoTotal); 
            } else {
                System.out.printf("%.1f%n", costoTotal); 
            }
        }
    }
}
