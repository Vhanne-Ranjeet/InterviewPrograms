public class SeggMinusPluse {
    public static void main(String args[]) {
        int arr[] = { 0,-1, 8, 9, -7, 2, -6 };
        int left = 0;
        int right = arr.length - 1;
        while (left<right) {
            if (arr[left] < 0) {
                left++;
            }
            if (arr[right] > 0) {
                right--;
            }
            if (arr[left] >= 0 && arr[right] <= 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;
            }
        }
        for (int j=0;j<arr.length;j++) {
            System.out.println(arr[j]);
        }
    }
}
