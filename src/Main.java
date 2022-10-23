import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n");
        int n = sc.nextInt();

        // Bài tập 1
/*       int sum = 0;
        for(int i = 0; i<=n ; i++){
            if(i%2==0){
                sum+=i;
            };
        }
        System.out.println(sum);
*/


        //  Bài tập 2

/*       for(int i = 1; i<=20 ; i++){
            System.out.println(n + "x" + i +"="+ (n*i));
        }
*/


        // bài tập 3

        System.out.println("từ 0 - " + n + " có các số nguyên tố là :");
        for (int i = 0; i <= n; i++) {
            boolean check = true;
            if (i < 2) {
                check = false;

            } else if (i == 2) {
                check = true;

            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}