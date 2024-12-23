public class FindArray {
    public static boolean search(int[] arr, int n, int target) {
        if (n == 0){
            return false;
        }
        if (arr[n -1] == target) {
            return false;
        }
        return search(arr,n -1, target);
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 23, 29, 13};
        int target = 10;
        boolean found = search(arr, arr.length, target);
        if(found == true) {
            System.out.print("Elemen '"+target+"' ada di dalam array.");
        }else{
            System.out.print("Elemen tidak ada di dalam array.");
        }
    }
}
