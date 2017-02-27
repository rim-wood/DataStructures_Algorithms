package com.willmin.algorithms.sort;

/**
 * Created by WLM on 2017/2/23.
 * 选择排序
 * 时间复杂度:O(N^2)
 * 解释: 虽然时间复杂度和冒泡排序一样，但当数据大时，因为数据交换的次数要少，理论上选择排序更快
 *      对比的次数：N(N-1)/2,数组长度为10的时候，对比次数为45次，但交换次数在10以下，当数组
 *      长度为100时，对比次数为4950次，交换次数也不过在100以内，所以理论上比冒泡快
 * 特征:
 * 1.时间复杂度跟冒泡排序一样，但是数据交换次数减少一半
 * 2.遍历选择最小(最大)的元素，与第一个元素进行交换
 * 3.排除第一个元素余下的元素执行第二步操作
 */
public class SelectSort {
    public static void main(String[] args){
        int[] array = {4,3,6,2,1,5,8,9,7,10};
        for(int out = 0; out < array.length; out++){
            //默认第一个元素是最小的
            int min = out;
            //遍历选择最小元素的下标
            for(int in = out; in < array.length; in++){
                if(array[in]<array[min]){
                    min = in;
                }
            }
            //跟第一个元素交换位置
            int tmp = array[out];
            array[out] = array[min];
            array[min] = tmp;
        }

        //打印信息
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
