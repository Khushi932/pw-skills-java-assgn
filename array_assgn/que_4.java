public class que_4 {
    public static int main(String[] args) {
        int arr[]={2, -3, 5, 8, 1, 0, -4};
            for(int i=0;i<arr.length;i++){
                return Math.min(arr[i],Math.min(arr[i],arr[i+1]));
            }
    }
}
