public class Main_9 {
    public int JumpFloorII(int target) {
        if (target == 0 || target == 1) return 1;
        else {
            return 2 * JumpFloorII(target - 1);
        }
    }
}
