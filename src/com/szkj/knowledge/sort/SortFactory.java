package com.szkj.knowledge.sort;

import com.szkj.knowledge.sort.exchange.BubbleSort;
import com.szkj.knowledge.sort.exchange.CocktailSort;
import com.szkj.knowledge.sort.exchange.QuickSort;
import com.szkj.knowledge.sort.insertion.StraightInsertionSort;
import com.szkj.knowledge.sort.selection.SelectionSort;

/**
 * @ClassName SortFactory
 * @Description 排序工厂
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-23 19:40
 * @Version 1.0
 */
public class SortFactory {


    public static ISort getBubbleSort() {
        return new BubbleSort();
    }

    public static ISort getCocktailSort() {
        return new CocktailSort();
    }

    public static ISort getQuickSort() {
        return new QuickSort();
    }

    public static ISort getStraightInsertionSort() {
        return new StraightInsertionSort();
    }

    public static ISort getSelectionSort() {
        return new SelectionSort();
    }

    /**
     * 排序
     * 类别：
     * 最差时间复杂度：
     * 最优时间复杂度：
     * 平均时间复杂度：
     * 空间复杂度：
     * 稳定性：
     * 算法逻辑：
     *
     * @param nums 排序前集合
     * @param printProcess 是否打印排序过程信息
     * @return 排序后集合
     */
    public static int[] sort(int[] nums, boolean printProcess) {
        if(nums==null || nums.length==0){
            return nums;
        }
        if(printProcess) {
            SortUtils.print("排序前[size:"+nums.length+"]：", nums);
        }

        if(printProcess) {
            SortUtils.print("排序后[size:"+nums.length+"]：", nums);
        }
        return nums;
    }
}
