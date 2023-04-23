package Array;

import javax.xml.ws.RequestWrapper;


public class SampleApplication {

    static void merge(int[] a1, int[] a2, int[] a3) {
        int n1 = a1.length;
        int n2 = a2.length;
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a1[i] > a2[j]) {
                a3[k] = a2[j];
                j++;
            } else if (a1[i] < a2[j]) {
                a3[k] = a1[i];
                i++;
            }
            k++;
        }
        while (i < n1) {
            a3[k] = a1[i];
            i++;
            k++;
        }
        while (j < n2) {
            a3[k] = a2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {2, 3, 5};
        int[] a2 = {7, 11, 13};
        int[] a3 = {17, 19, 23};

    }
}



