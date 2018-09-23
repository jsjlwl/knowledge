package com.szkj.knowledge.sort.exchange;

import com.szkj.knowledge.sort.ISort;
import com.szkj.knowledge.sort.SortUtils;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序
 * 类型：交换排序
 * 最差时间复杂度：O(n²)
 * 最优时间复杂度：O(n) 如果能在内部循环第一次运行时,使用一个标志来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 * 算法逻辑：
 *  1、比较相邻的元素。如果第一个比第二个大，就交换他们两个；
 *  2、对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数；
 *  3、针对所有的元素重复以上的步骤，除了最后一个；
 *  4、持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:46
 * @Version 1.0
 */
public class BubbleSort implements ISort {

    /**
     * @param nums 排序前集合
     * @param printProcess 是否打印排序过程信息
     * @return 排序后集合
     */
    @Override
    public int[] sort(int[] nums, boolean printProcess) {
        if(nums==null || nums.length==0){
            return nums;
        }
        int temp = 0;
        int size = nums.length;
        if(printProcess) {
            SortUtils.print("冒泡排序前[size:"+nums.length+"]：", nums);
        }
        for(int i=0; i<size-1; i++) {
            boolean swap = false;//增加排序中是否存在交换标志
            if(printProcess) {
                System.out.println("冒泡第"+(i+1)+"次排序[range:"+(size-i)+"]：");
                SortUtils.print(" 排序前：",nums);
            }
            String swapNums = "";
            for(int j=0; j<size-1-i; j++) {
                if(nums[j]>nums[j+1]) {
                    swapNums+=" "+nums[j]+"<-->"+nums[j+1];
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                    swap = true;
                }
            }
            if(printProcess) {
                SortUtils.print(" 排序前：",nums);
                System.out.println(" 交换："+(swap?"发生交换"+swapNums:"未发生交换"));
            }
            if(!swap) {//没有交换，证明已经排序完毕，后续无须进行冒泡排序。
                break;
            }
        }
        if(printProcess) {
            SortUtils.print("冒泡排序后[size:"+nums.length+"]：",nums);
        }
        return nums;
    }
}
