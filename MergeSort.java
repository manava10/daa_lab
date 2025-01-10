class MergeSort{
    static void mergeSort(int[] arr){
        int mid = arr.length/2;
        if(mid<2){
            return;
        }
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        for(int i=0;i<mid;i++){
            left[i] = arr[i];  
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);
    }
    static void merge(int[] arr, int[] left, int[] right){
        int i,j,k;
        i=0;
        j=0;
        k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
    public static void main(String[] args){
        int[] arr = {1,5,2,4,9,2,5};
        mergeSort(arr);
        System.out.println("The sorted array are as follows");
        for(int nums:arr){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
}

//This is Fully Functional Code of Merge Sort...