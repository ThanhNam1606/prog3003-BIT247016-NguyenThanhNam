import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> new int[]{1, 2, 5, 3, 100})

                .thenApply(arr -> Arrays.stream(arr)
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .boxed()
                        .collect(Collectors.toList())
                )

                .thenApply(list -> "Kết quả là: " + list)

                .thenAccept(System.out::println);

        future.join();
    }
}
