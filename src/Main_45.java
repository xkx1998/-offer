import java.util.Arrays;

public class Main_45 {
    public boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length ==0) return false;
        Arrays.sort(numbers);
        int zore_num = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 0) {
                zore_num++;
            }
        }

        int need_z_num = 0;
        for (int i = numbers.length - 1; i >= zore_num + 1; i--) {
            if(numbers[i] - numbers[i - 1] == 0) return false;
            need_z_num += numbers[i] - numbers[i - 1] - 1;
        }

        if (need_z_num > zore_num)
            return false;
        return true;
    }
}
