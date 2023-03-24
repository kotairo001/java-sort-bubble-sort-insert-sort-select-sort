import java.util.ArrayList;
import java.util.List;

public class Sort {
    static void insertSort(int [] array){
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j>=0&&array[i]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }

    static void bubbleSort(int []array){
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }

    static void selectSort(int []array){
        for (int i = 0; i < array.length-1; i++) {
            int currentMinValue = array[i];
            int currentMinIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if(currentMinValue>array[j]){
                    currentMinValue=array[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                array[currentMinIndex] = array[i];
                array[i]=currentMinValue;
            }
        }
    }
}
