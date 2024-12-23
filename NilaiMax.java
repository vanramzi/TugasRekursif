public class NilaiMax {
    public static int cariMax(int[] arr, int n) {
        if 
        (n == 1){
            return arr [0];
        }
        int x = cariMax(arr, n - 1);

        return Math.max(arr[n -1], x);
        
    }
    public static void main(String[] args) {
        int[] arr = {72,31,43,57,36,22,35};
        int n = arr.length;

        int max = cariMax(arr, n);
        System.out.println("Nilai maksimum dalam array adalah: " + max);
    }
}
