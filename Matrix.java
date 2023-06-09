import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrix's rows number: ");
        int m = sc.nextInt();
        System.out.print("Matrix's columens number: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("----- Matrix -----");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("What number do you want to search for? ");
        int x = sc.nextInt();
		System.out.println();

		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position [" + i + "][" + j + "]");

					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}


        sc.close();
    }
}
