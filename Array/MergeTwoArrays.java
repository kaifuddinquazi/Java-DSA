package Array;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {10,20,40,50,80,110};
        int[] b = {30,60,70,90,100,120,140};

        int n = a.length;
        int m = b.length;

        int[] c = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }

        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
