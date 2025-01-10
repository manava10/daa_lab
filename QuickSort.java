class QuickSort{
    static void quickSort(int[] arr, int low ,int high){
        if(low<high){
            int pivotIndex = partitions(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    static int partitions(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1; //This is pivot element ;
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,0,7};
        int high = arr.length-1;
        int low = 0;
        quickSort(arr,low,high);
        System.out.println("The sorted array are as follows");
        for(int nums:arr){
            System.out.print(nums+" ");
        }
        System.out.println();
    }
}