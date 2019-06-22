import java.math.BigDecimal;

public class Main_13 {
    public static void reOrderArray(int[] array) {
        if (array.length == 1 || array.length == 0) return;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] % 2 == 0) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;

                        i = j;
                    } else break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reOrderArray(array);
        for (int a:array) {
            System.out.println(a);
        }

    }
}
