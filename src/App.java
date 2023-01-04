import java.util.Scanner;;
public class App {
    public static void main(String[] args) throws Exception {
        int size = 5;
        int sum = 0;
        int[] arr = new int[size];
        System.out.print("Enter 5 elemnts = ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        System.out.println("sum of elements = " + sum);

    }
}
