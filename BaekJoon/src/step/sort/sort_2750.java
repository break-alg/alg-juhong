package step.sort;

import com.sun.tools.javac.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sort_2750 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sort_2750 main = new sort_2750();
//        arr = main.bubbleSort(n, arr);
        arr = main.insertionSort(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] bubbleSort(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int n, int[] arr) {
        int j;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

}
