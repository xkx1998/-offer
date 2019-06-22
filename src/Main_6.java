import java.util.Arrays;

public class Main_6 {

    public int minNumberInRotateArray(int [] array) {
        Arrays.sort(array);
        return array[0];
    }
}
