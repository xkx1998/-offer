public class Main_1 {

    /**
     * 1、二维数组查找
     * @param target
     * @param array
     * @return
     */
    public static boolean Find(int target, int [][] array) {
        if(array.length == 0) return false;
        if(array.length == 1) return false;
       for(int i = 0;i < array.length;i++)
       {
           for(int j = 0; j <array.length;j++) {
               if(array[i][j] == target) return true;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int [][] array={{}};
        System.out.println(Find(4,array));
    }
}
