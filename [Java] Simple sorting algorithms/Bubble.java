class Bubble{

    public static void main(String[] args) {

        final int arr_size = 10;
        
        int[] arr = new int[arr_size];
        for (int i=0; i<=arr_size -1; i++) arr[arr.length - 1 - i] = i;

        System.out.println("arr :");
        for(int i=0; i<arr_size; i++) System.out.print(arr[i] + " ");
        System.out.println("\n");

        for (int outer=1; outer<arr.length; outer++){ // reduce interations
            for (int i=0; i<arr.length-outer; i++){
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println("sorted :");
        for(int i=0; i<arr_size; i++) System.out.print(arr[i] + " ");
        System.out.println("\n");

    }


    

}