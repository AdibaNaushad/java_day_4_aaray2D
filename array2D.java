import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
//        int[][] arr = new int[3][4];
//        int[][] brr ={{1,2,3,},{2,3,4,5}};
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]+"  ");
//
//            }
//
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter row ");
        int r = sc.nextInt();
        System.out.println(" Enter column ");
        int c = sc.nextInt();


        int[][] arr = new int[r][c];
        System.out.println(" Enter array ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        }

    }

}
