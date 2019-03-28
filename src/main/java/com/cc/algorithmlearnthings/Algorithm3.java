package com.cc.algorithmlearnthings;

/**
 * 插入排序
 * @author chencheng
 * @date 2019/3/29
 */
public class Algorithm3 {

    /**
     *
     * @param array 数组
     */
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            //插入的数
            int indexVal = array[i];
            //被插入的位置
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && indexVal < array[index]) {
                //将array[index]向后移动
                array[index + 1] = array[index];
                //让index向前易懂
                index--;
            }
            //把插入的数放入合适的位置
            array[index + 1] = indexVal;
        }
    }

    public static void main(String[] args){
        int[] array={3,2,5,7,1,0};
        sort(array);
        for (int i:array){
            System.out.println(i);
        }
    }
}
