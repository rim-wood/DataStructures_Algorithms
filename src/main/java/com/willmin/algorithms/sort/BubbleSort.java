package com.willmin.algorithms.sort;

/**
 * Created by WLM on 2017/2/23.
 * 冒泡排序
 * 时间复杂度: O(N^2)
 * 特征：
 *  1.两两比对
 *  2.假如第一个元素比第二个元素大（或小），第一个元素移动至第二个元素右边，依次比对至第一个元素插入合适位置
 *  3.拿第二个元素从第一个元素开始对比，直至第二个元素插入合适位置
 *  4.依次拿元素进行循环对比，直至比对到最后一个元素
 *
 *  @author willmin
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4,3,6,2,1,5,8,9,7,10};
        for(int out = 0;out<array.length-1;out++){
            for(int in = 0;in<out;in++){
                //交换元素
                if(array[in]>array[in+1]){
                    int tmp = array[in];
                    array[in] = array[in+1];
                    array[in+1] = tmp;
                }
            }
        }
        //打印信息
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
