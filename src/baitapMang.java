import java.util.Scanner;

public class baitapMang {
    public static void main(String[] args) {

        //khai bao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("nhap gia tri cua mang arr [" + i + "]");
            arr[i] = sc.nextInt();
        }
        sc.close();

        //1. Tính trung bình cộng các số lẻ ở vị trí chẵn
       /* int count = 0;
        int sum = 0;
        for (i = 0; i < arr.length; i=i+2) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        int tbc = sum / count;

        System.out.println("trung binh cong la :" + tbc);*/


        //2. Tìm số lớn nhất trong mảng vừa nhập
        /*
         int min=arr[0];
         int max=arr[0];
        for(i=1; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }if(arr[0]>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("số lơn nhat trong mảng là :" + max);
        System.out.println("số nho nhat trong mảng là :" + min);
*/


        //3. Tìm vị trí các số nhỏ nhất trong mảng

     /* i = 0;
        boolean check = true;
        while (check && i < arr.length) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    i = j;
                    break;
                } else {
                    System.out.println("vị trí nhỏ nhất của mảng là vị trí arr[ " + i + "]");
                    check = false;
                    break;
                }
            }
        }*/
        // 4. Đếm các số chính phương có trong mảng

        /*int count=0;
        for(i=0; i<arr.length;i++){
            double sq = Math.sqrt(arr[i]);
            if(sq-Math.floor(sq)==0){
                count++;
            }

        }
        System.out.println("số lượng các số chính phương có trong mảng là: " + count);*/



      /*  5. Hiển thị các số nguyên tố có trong mảng lên màn hình

        System.out.print("các số nguyên tố có trong mảng là : ");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < 2) {
            } else if (arr[i] == 2) {
                System.out.println(arr[i]+ ",");
            } else {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                    if (arr[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.print(arr[i] + ",");
                }
            }
        }*/


        // 6. Thay thế các phần tử âm có trong mảng bằng giá trị 0

       /* System.out.println("các phần tử của mảng sau khi được thay thế: ");
        for (i = 0; i < arr.length; i++){

            if(arr[i]<0){
                arr[i]=0;
                System.out.println(arr[i]);
            }else {
                System.out.println(arr[i]);
            }
        }*/
        //7. Sắp xếp mảng đã nhập theo thứ tự tăng dần
        int temp;
        for (i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + ",");
        }
    }
}
