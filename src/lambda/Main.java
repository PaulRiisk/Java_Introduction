package lambda;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // parameter -> expression
        // (n) -> return
        // () -> return

        LocalDateTime dateTime = LocalDateTime.now();
        Supplier<LocalDateTime> dateSupplier = () -> LocalDateTime.now();

        System.out.println(dateTime);
        System.out.println(dateSupplier.get());

        System.out.println("Waiting for 3 Seconds!");
        // Slep for 3 Seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n" + dateTime);
        System.out.println("\nSupplier is 3 Seconds later: ");
        System.out.println(dateSupplier.get());

    }
}
