import java.util.Scanner;

public class ramdom {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();
        int maTran[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maTran[i][j] = (int) Math.floor(Math.random() * 100);

            }
        }
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(maTran[i][j] + "\t");
            }
        }
        int Max = maTran[0][0];
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (maTran[i][j] > Max) {
                    Max = maTran[i][j];
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang la: " + Max);

    }
}
