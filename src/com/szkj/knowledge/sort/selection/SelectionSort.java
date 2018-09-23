package com.szkj.knowledge.sort.selection;

import com.szkj.knowledge.sort.ISort;
import com.szkj.knowledge.sort.SortUtils;

/**
 * @ClassName SelectionSort
 * @Description 选择排序
 * 类别：比较排序
 * 最差时间复杂度：O(n²)
 * 最优时间复杂度：O(n²)
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 * 算法逻辑：
 *  每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:46
 * @Version 1.0
 */
public class SelectionSort implements ISort {
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
        if(printProcess) {
            SortUtils.print("选择排序前[size:"+nums.length+"]：", nums);
        }
        int minIndex = 0;//最小值的位置
        for(int i=0;i<nums.length;i++) {
            if(printProcess) {
                System.out.println("选择第"+(i+1)+"次排序[i:"+(i+1)+"]：");
                SortUtils.print(" 排序前：",nums);
            }
            minIndex=i;
            for(int j=i+1; j<nums.length; j++) {
                if(nums[j]<nums[minIndex]) {
                    minIndex = j;
                }
            }
            String swapNums ="";
            if(minIndex!=i) {
                swapNums+=" "+nums[i]+"<-->"+nums[minIndex];
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
            if(printProcess) {
                SortUtils.print(" 排序后：",nums);
                System.out.println(" 交换："+(swapNums.length()>0?"发生交换"+swapNums:"未发生交换"));
            }
        }
        if(printProcess) {
            SortUtils.print("选择排序后[size:"+nums.length+"]：", nums);
        }
        return nums;
    }
}
