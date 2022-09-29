import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap do dai cua mang");
        int  n = scanner.nextInt();
        int i;
        int [] arr = new int[n];
        do {
            System.out.println("**************MENU****************");
            System.out.println("1. Nhập giá trị các phần tử mảng");
            System.out.println("2. Hiển thị giá trị các phần tử mảng");
            System.out.println("3. In giá trị các phần tử là số nguyên tố trong mảng");
            System.out.println("4. In giá trị max, min các phần tử trong mảng");
            System.out.println("5. Sắp xếp mảng giảm dần");
            System.out.println("6. Thoát");
            System.out.println("Hay nhap mot so tu 0-6");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    for ( i=0; i<n;i++) {
                        System.out.println("Nhap  phần tử thu " + (i +1) + ": ");
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Cac phan tu cua mang la");
                    for ( i = 0; i < arr.length ; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.print("\n");
                    break;


                case 3:
                    System.out.println("cac so nguyen to trong mang la: ");
                    for ( i = 0; i < arr.length; i++) {
                        if (arr[i] >= 2) {
                            boolean check = false;
                            for (int j = 2; j < arr[i]; j++) {
                                if (arr[i] % j == 0) {
                                    check = true;
                                }
                            }
                            if (!check) {
                                System.out.printf("%d\t", arr[i]);
                            }

                        }
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    int max = arr[0];
                    int min = arr[0];
                    for (i=0;i<arr.length;i++){
                        if (max>arr[i]){
                            max = arr[i];
                        }
                    }
                    for (i=0;i<arr.length;i++){
                        if (min <arr[i]){
                            min = arr[i];
                        }
                    }
                    System.out.println("gia tri nho nhat cua mang la: " + min);
                    System.out.println("gia tri lon nhat cua mang la: " + max);
                    break;
                case 5:
                    int x;
                    for (i=0;i<arr.length-1;i++){
                        for (int k = 0; k<arr.length;k++){
                            if (arr[i]<arr[k]){
                                x=arr[i];
                                arr[i]=arr[k];
                                arr[k]=x;
                            }
                        }
                    }
                    System.out.println("mang da duoc sap xep tu cao den thap");
                    for (int l = 0; l<arr.length;l++){
                        System.out.print(arr[l] + "\t");
                    }
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.err.println("Hay nhap mot so tu 0-6");
            }
        }while (true);
    }
}