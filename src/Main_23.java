public class Main_23 {


    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null) return false;

        return fun(sequence, 0, sequence.length - 1);
    }

    public boolean fun(int[] sequence, int start, int end) {
        if (start > end) {
            return false;
        }
        int root = sequence[end];

        int i;
        for (i = start; i < end; i++) {
            if (sequence[i] > root) {
                break;
            }
        }

        int j;
        for (j = i; j < end; j++) {
            if (sequence[i] < root) return false;
        }

        boolean left = true;
        if (i > start) {
            left = fun(sequence, start, i - 1);
        }

        boolean right = true;
        if (i < end) {
            right = fun(sequence, i, end - 1);
        }

        return right && left;
    }
}
