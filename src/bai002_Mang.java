import java.util.Scanner;

public class bai002_Mang {
    public static void main(String[] args) {
        System.out.println("nhập độ dài mảng");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập giá trị arr " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("gia tri nho nhat " + min);
        System.out.println("gia tri lon nhat " + max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2) {
                System.out.println(arr[i] + " khong phai so nguyen to");
            } else if (arr[i] == 2) {
                System.out.println(arr[i] + " so nguyen to");
            } else {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(arr[i] + " la so nguyen to");
                } else {
                    System.out.println(arr[i] + " khong phai so nguyen to");
                }
            }
        }
        int a;
        a = arr[0];
        arr[0] = arr[1];
        arr[1] = a;
        System.out.println(arr[0] + " " + arr[1]);
    }
}
