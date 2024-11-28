package com.practicejava;

public class SortingAlgo {

    public static void bubbleSort(int arr[]){
         for(int i=0; i<arr.length-1; i++){
             // checking the sorted array and removing it from the array
             for(int j=0; j<arr.length-i-1; j++){
                 if(arr[j] > arr[j+1]){
                     //swap
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                 }
             }
         }
    }

    public static void selectionSort(int arr[]){
         for(int i=0; i<arr.length-1; i++){
             int smallest = i;
             for(int j=i+1; j<arr.length; j++){
                 if(arr[smallest] > arr[j]){
                     smallest = j;
                 }
             }
             int temp = arr[smallest];
             arr[smallest] = arr[i];
             arr[i] = temp;
         }
    }

    public static void insertionSort(int arr[]){
         for(int i=1; i<arr.length; i++){ // unsorted
             int current = arr[i];
             int j = i-1; // sorted
             while (j >= 0 && current < arr[j]) {
                 arr[j+1] = arr[j];
                 j--;
             }
             arr[j+1] = current;
         }
    }

    private static void conquer(int arr[], int start, int mid, int end) {
        int newMergedArr[] = new int[end - start +1];

        int index1 = start; // 1st array
        int index2 = mid+1; // 2nd array

        int k = 0;
        while(index1 <= mid && index2 <= end){
            if(arr[index1] <= arr[index2]){
                newMergedArr[k++] = arr[index1++];
            }
            else{
                newMergedArr[k++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            newMergedArr[k++] = arr[index1++];
        }

        while (index2 <= end) {
            newMergedArr[k++] = arr[index2++];
        }

        for(int i = 0, j = start; i < newMergedArr.length; i++, j++){
            arr[j] = newMergedArr[i];
        }
    }
    public static void divide(int arr[], int start, int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j = start; j < end; j++) {
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[end] = temp;
        return i;
    }
    public static void quickSort(int arr[], int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }




    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,8,3,6,0,7,4,2};
        int n = arr.length;

        //bubble sort
        //bubbleSort(arr);

        //selection sort
        //selectionSort(arr);

        //insertion sort
        //insertionSort(arr);

        // merge sort
        //divide(arr, 0, n-1);

        // quick sort
        quickSort(arr, 0, n-1);

        printArray(arr);
    }
}