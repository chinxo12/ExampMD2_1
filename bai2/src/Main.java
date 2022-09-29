import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 0 , col=0,i,j;
        System.out.println("Nhập vào số hàng: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        col = scanner.nextInt();
        int [][] arr = new  int[row][col];
        do {
            System.out.println("*********************MENU*********************");
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử của mảng theo ma trận");
            System.out.println("3. In giá trị các phần tử nằm trên chéo chính, chéo phụ và tính tổng");
            System.out.println("4. Sắp xếp mảng tăng dần theo cột ");
            System.out.println("5. Thoát");
            System.out.println("Hãy nhập các giá trị từ 1-5 để chạy chương trình");
            int num = scanner.nextInt();
            switch (num){
                case 1:

                    System.out.println("Nhập vào các giá trị của mảng: ");
                    for (i=0;i<row;i++){
                        for (j=0;j<col;j++){
                            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                            arr[i][j]= scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Các giá trị của mảng hiện tại: ");
                    for (i=0;i<row;i++){
                        for (j=0;j<col;j++){
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    if (col==row){
                        int sumChinh = 0;
                        int sumPhu = 0;
                        System.out.println("Giá trị các phần tử nằm trên đường chéo chính là:   ");
                        for (i=0;i<row;i++){
                            for (j=0;j<col;j++){
                                if (i==j){
                                    System.out.printf("%d\t", arr[i][j]);
                                    sumChinh+=arr[i][j];
                                }
                            }
                        }
                        System.out.print("\n");
                        System.out.println("Có tổng là: " + sumChinh);
                        System.out.println("Giá trị các phần tử trên đường chéo phụ: ");
                        for (i=0;i<row;i++){
                            for (j=0;j<col;j++){
                                if (i+j==col-1){
                                    System.out.printf("%d\t", arr[i][j]);
                                    sumPhu+=arr[i][j];
                                }
                            }

                        }
                        System.out.print("\n");
                        System.out.println("Có tổng là: " + sumChinh);

                    }else {
                        System.err.println("Đây không phải là ma trận vuông");
                    }
                    break;
                case 4:
                    int x;
                    for (j=0;j<col;j++){
                        for (int k=0;k<row-1;k++){
                            for (int l =0;l<row;l++){
                                if (arr[k][j]>arr[l][j]){
                                    x = arr[k][j];
                                    arr[k][j] = arr[l][j];
                                    arr[l][j]=x;
                                }
                            }
                        }
                    }
                    System.out.println("Gia tri của mảng sau khi sắp xếp theo cột là: ");
                    for (i=0;i<row;i++){
                        for (j=0;j<col;j++){
                            System.out.printf("%d\t", arr[i][j]);
                        }
                        System.out.print("\n");
                    }


                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Hãy nhập các giá trị từ 1-5 để chạy chương trình");
            }
        }while (true);
    }
}