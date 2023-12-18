import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input1 = "a good  example";
        String input2 = "tree    two    one";
        System.out.println(revertClassic(input1));
        System.out.println(revertStream(input2));

    }

    public static String revertClassic(String input) {
        StringBuilder sb = new StringBuilder();
        String[] array = input.split(" ");
        for (int i = array.length-1; i >= 0; i--) {
            if (!array[i].isEmpty()) {
                sb.append(array[i]).append(" ");
            }
        }
        return sb.substring(0, sb.length()-1);
    }

    public static String revertStream(String input) {
        String[] array = input.split(" ");
        Collections.reverse(Arrays.asList(array));
        return Arrays.stream(array)
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(" "));
    }
}