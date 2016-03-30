package golovach;

import java.util.Arrays;

/**
 * Created by anna on 28.03.16.
 */
public class SelectSortFixed {

  public static void main(String[] args) {

    int[] arr = {55,222,10,2,5,0,1,555,89,67,0,0};
    System.out.println(Arrays.toString(arr));

    SelectSortFixed sort = new SelectSortFixed();
    sort.selectSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Sortirovka vuborkami

  private void selectSort(int[] arr){
    for(int barrier = 0; barrier < arr.length; barrier++){
      int min = chooseMinimum(arr, barrier);
      int minIndex = findIndex(arr, min, barrier);
      int tmp = arr[barrier];
      arr[barrier] = min;
      arr[minIndex] = tmp;
    }
  }

  private int chooseMinimum(int[] arr, int barrier){
    int index = barrier;
    int min = arr[barrier];
    while(index < arr.length-1){
      if (min > arr[index + 1]){
        min = arr[index + 1];
      }
      index++;
    }
    return  min ;
  }

  private int findIndex(int[] arr, int min, int barrier){
    int minIndex = 0;
    for(int i = barrier; i < arr.length; i++){
      if (arr[i] == min){
        minIndex = i;
        break;
      }
    }
    return minIndex;
  }
}



