import java.util.ArrayList;

public class baitapArrayList {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 7, 4, 9, 7, 2, 19, 23, 57};
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            arrs.add(a[i]);
        }

//        ArrayList<Integer> arrs2 = new ArrayList<>();
//        arrs2.add(4);
//        arrs2.add(3);
//        arrs2.add(5);
//        arrs.retainAll(arrs2);
//        System.out.println(arrs);
//        arrs.add(10);
//        arrs.add(28);
//        arrs.add(99);


//     sap xep arraylist tang dan

        // Cách 1
//        int temp;
//
//        for(int i=0;i<arrs.size();i++){
//            for(int j=i+1;j<arrs.size();j++){
//                if(arrs.get(i)>arrs.get(j)){
//                    temp =arrs.get(i);
//                    arrs.set(i,arrs.get(j));
//                    arrs.set(j,temp);
//                }
//            }
//        }
//        System.out.println(arrs);
        //Cách 2

//        arrs.sort((o1, o2) -> o1 - o2);
//        System.out.println(arrs);


        // e. Tìm số nguyên tố trong arrs

//        for(int i=0;i<arrs.size();i++){
//            boolean check = true;
//            if(arrs.get(i)<2){
//                System.out.println("ko phai so nguyen to");
//            }if(arrs.get(i)==2){
//                System.out.println("so nguyen to");
//            }else{
//                for(int j=2;j<=Math.sqrt(arrs.get(i));j++){
//                    if(arrs.get(i)%j==0){
//                        check = false;
//                        break;
//                    }
//                }
//            }
//            if(check){
//                System.out.println(arrs.get(i) + " la so nguyen to");
//            }else{
//                System.out.println(arrs.get(i) + "ko phai so nguyen to");
//            }
//        }


        //Tính tổng các số trong arrs

        //        int k ;
//        for(int i=0;i<arrs.size();i++){
//           if(arrs.get>)
//            }
//        }
//        System.out.println("tong cua arrs la : "+ sum);


        //Tìm các số chẵn, chia hết cho 3 trong arrs
//        int sum =0;
//        for(int i=0;i<arrs.size();i++){
//            sum+=arrs.get(i);
//            if(arrs.get(i)%2==0 && arrs.get(i)%3==0){
//                System.out.println("cac so chan chia het cho 3 la: "+ arrs.get(i));
//            }
//        }
//        System.out.println("tong cua arrs la : "+ sum);


        //Tìm số có 2 chữ số, tổng các chữ số bằng 12 trong arrs.
        int k;
        int z;
        for (int i = 0; i < arrs.size(); i++) {

            if (arrs.get(i) >= 10) {
                k = arrs.get(i) % 10;
                z = (int) arrs.get(i) / 10;
                if (k + z == 12) {

                    System.out.println(arrs.get(i));
                }

            }

        }


        //Xóa các phần tử 3,5,9 trong arrs đó
        System.out.println(arrs);

        for (int i = 0; i < arrs.size(); ) {

            if (arrs.get(i) == 3 || arrs.get(i) == 5 || arrs.get(i) == 9) {
                arrs.remove(i);
                i = 0;
            } else {
                i++;
            }
        }
        System.out.println("cac phan tu con lai trong mang la : " + arrs);

    }
}
