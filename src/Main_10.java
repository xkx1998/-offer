public class Main_10 {
    public int RectCover(int target) {
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return RectCover(target - 2) + RectCover(target - 1);
    }
}
