package com.cc.algorithmlearnthings;

/**
 * 冒泡排序
 * @author chencheng
 * @date 2019/3/28
 */
public class Algorithm2 {

    /**
     * 升序冒泡
     * @param array 数据样本
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                     int temp;
                     temp=array[j-1];
                     array[j-1]=array[j];
                     array[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array={3,2,5,7,1,0};
        bubbleSort(array);
        for (int i:array){
            System.out.println(i);
        }
    }
}
