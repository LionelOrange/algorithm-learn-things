package com.cc.algorithmlearnthings;

/**
 * 二分查找
 *
 * @author chencheng
 * @date 2019/3/28
 */
public class Algorithm1 {

    /**
     * 数组样本为升序
     *
     * @param array 升序
     * @param a     需要寻找的数据
     * @return 第几个
     */
    public static int biSearch(int[] array, int a) {
        int lo = 0;
        int hi = array.length - 1;
        int mid;
        while (lo >= hi) {
            mid = (lo + hi) / 2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] < a) {
                //向右边查找
                lo = mid + 1;
            } else {
                //向左边查找
                hi = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 7, 8, 9, 10};
        System.out.println(biSearch(array1, 1));
    }
}
