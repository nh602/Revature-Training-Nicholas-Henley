public class Test {

    static void modify(int x) {
        x = 100;
    }

    static void modifyArray(int[] arr) {
        arr[0] = 100;
        // doesn't work :
        // arr = new int[]{0, 0, 0};
    }

    public static void main(String[] args) {

        int a = 10;
        int[] numbers = {10, 20, 30};

        modify(a);
        modifyArray(numbers);

        System.out.println(a);
        System.out.println(numbers[0]);
    }
}
