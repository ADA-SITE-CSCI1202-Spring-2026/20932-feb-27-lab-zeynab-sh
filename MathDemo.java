public class MathDemo{

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int i = 0; i < args.length; i++) {
            total = total + args[i];
        }
        return total;
    }

    public static float mean(int[] args) {
        int total = sum(args);
        return (float) total / args.length;
    }

    public static int factorial(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = num * i;
        }
        return num;
    }

    public static void main(String[] args){
        System.out.println(MathDemo.min(3, 7));
        System.out.println(MathDemo.max(3, 7));

        int[] nums = {1,2,3,4,5};

        System.out.println(MathDemo.sum(nums));
        System.out.println(MathDemo.mean(nums));

        System.out.println(MathDemo.factorial(5));

    }
}