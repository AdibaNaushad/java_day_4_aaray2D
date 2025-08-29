import java.util.Scanner;

public class equalSumParti {
    static int findArraySum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];

        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int surffixSum = totalSum - prefSum;
            if (surffixSum == prefSum) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter" + n + "Element");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("equal partition "+equalSumPartition(arr));


    }
}

