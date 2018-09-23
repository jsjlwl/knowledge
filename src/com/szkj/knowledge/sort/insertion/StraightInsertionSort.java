package com.szkj.knowledge.sort.insertion;

import com.szkj.knowledge.sort.ISort;
import com.szkj.knowledge.sort.SortUtils;

/**
 * @ClassName StraightInsertionSort
 * @Description 直接插入排序
 * 类别：插入排序
 * 最差时间复杂度：O(n²)
 * 最优时间复杂度：O(n²)
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 * 算法逻辑：
 *  每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:29
 * @Version 1.0
 */
public class StraightInsertionSort implements ISort {
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
            SortUtils.print("直接插入排序前[size:"+nums.length+"]：", nums);
        }

        if(printProcess) {
            SortUtils.print("直接插入排序后[size:"+nums.length+"]：", nums);
        }
        return nums;
    }
}
