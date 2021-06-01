import java.util.Scanner;

public class HourGlass {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for (int arr_i = 0; arr_i < 6; arr_i++) {
	            for (int arr_j = 0; arr_j < 6; arr_j++) {
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }

	        int sum = 0;
	        int tmp_sum = 0;
	        for (int arr_i = 0; arr_i < 4; arr_i++) {
	            for (int arr_j = 0; arr_j < 4; arr_j++) {
	                if (arr[arr_i][arr_j] > 0) {
	                    sum = sum + (arr[arr_i][arr_j]) + (arr[arr_i][arr_j + 1]) + (arr[arr_i][arr_j + 2]);
	                    sum = sum + (arr[arr_i + 1][arr_j + 1]);
	                    sum = sum + (arr[arr_i + 2][arr_j]) + (arr[arr_i + 2][arr_j + 1]) + (arr[arr_i + 2][arr_j + 2]);
	                    if (tmp_sum < sum) {
	                        tmp_sum = sum;
	                    }
	                    sum = 0;
	                }
	            }
	        }
	        System.out.println(tmp_sum);
	    }
	}

