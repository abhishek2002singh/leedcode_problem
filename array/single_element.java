import java.util.*;

public class single_element {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = src.nextInt();
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result ^= array[i];
        }
        System.out.println(result);
    }
}