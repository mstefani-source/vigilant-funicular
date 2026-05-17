import java.util.stream.Stream;

public class q1 {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
