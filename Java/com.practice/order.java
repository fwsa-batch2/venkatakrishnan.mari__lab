public class order {
    public static void main(String[] args) {
        int[] arr = {5,8,1,4,6,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temps = 0;
                if (arr[i]>arr[j]) {
                    temps = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temps;
                    System.out.println(temps);
                }
            }
        }
    }
}
