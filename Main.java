import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;

    while ((line = in.readLine()) != null) {
      Scanner scanner = new Scanner(line);
      double p = scanner.nextDouble();
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
      double d = scanner.nextDouble();
      int n = scanner.nextInt();

      double maxPrice = Double.NEGATIVE_INFINITY;
      double minRightPrice = Double.POSITIVE_INFINITY;
      double maxDecline = 0.0;

      for (int k = 1; k <= n; k++) {
        double priceK = p * (Math.sin(a * k + b) + Math.cos(c * k + d) + 2);

         if (priceK > maxPrice) {
             maxPrice = priceK;

         }

        double decline = maxPrice - priceK;

        if (decline > maxDecline) {
          maxDecline = decline;

        }

        if (priceK < minRightPrice) {
          minRightPrice = priceK;
        }
      }


      System.out.printf("%.6f%n" , maxDecline);
    }
  }
}
