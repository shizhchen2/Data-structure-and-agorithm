package agorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,2,9,4,1,0,5,7};

    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
