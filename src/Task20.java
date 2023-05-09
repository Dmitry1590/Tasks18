public class Task20 {
    static int test(int testival, int target, int begin, int end) {
        while (begin <= testival && testival <= end)
            if (testival > target)
                return +1;
            else if (testival < target)
                return -1;
            else return 0;
        System.out.println("Значение переменной testival не входит в диапазон: от " + begin + " до " + end + " Введите данные еще раз");
        return 911;
    }
      public static void main (String[] args){
            System.out.println(test(10, 5,0,20));
            System.out.println(test(5, 10,0,20));
            System.out.println(test(21, 10,0,20));
        }
}