package com.willmin.algorithms.sort;

/**
 * Created by WLM on 2017/2/23.
 * 插入排序
 * 时间复杂度:O(N^2)
 * 解释:
 *  插入排序是简单排序里的最高效的排序方法，一般情况下，比冒泡快一倍左右，一般也出现在复杂排序的后面阶段，
 *  比如快速排序。
 * 特征:
 *  1.局部有序
 *  2.选取标记的节点，从右往左遍历，首先和节点右边第一个元素比对，比他小则节点右边元素右移
 *  3，依次比对，直至标记元素找到合适位置，然后插入
 */
public class InsertionSort {
    public static void main(String[] args){
        int[] array = {4,5,7,6,1,3,8,9,2,10};

        for(int out = 1; out < array.length; out++){
            //选取标记节点
            int flag = array[out];
            int in = out;
            //当节点元素比右边元素小
            while (in > 0 && array[in-1] >= flag){
                //右边元素往右移
                array[in] = array[in-1];
                //下标左移
                --in;
            }
            //找到合适位置插入
            array[in] = flag;
        }

        //打印信息
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
