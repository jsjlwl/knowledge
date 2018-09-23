package com.szkj.knowledge.sort.exchange;

import com.szkj.knowledge.sort.ISort;
import com.szkj.knowledge.sort.SortUtils;

/**
 * @ClassName CocktailSort
 * @Description 鸡尾酒排序（定向冒泡排序，也称为：鸡尾酒搅拌排序、搅拌排序、双冒泡排序、涟漪排序, 来回排序、快乐小时排序）
 * 与冒泡排序的不同处在于排序时是以双向在序列中进行排序
 * 类别：交换排序
 * 最差时间复杂度：O(n²)
 * 最优时间复杂度：O(n) 如果序列在一开始已经大部分排序过的话，会接近O(n)
 * 平均时间复杂度：O(n²)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 * 算法逻辑：
 *  1、先找到最小的数字，把他放到第一位，然后找到最大的数字放到最后一位；
 *  2、再找到第二小的数字放到第二位，再找到第二大的数字放到倒数第二位；
 *  3、以此类推，直到完成排序。
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:26
 * @Version 1.0
 */
public class CocktailSort implements ISort {
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
        int left = 0;
        int right = nums.length-1;
        int temp = 0;
        int index = 1;
        if(printProcess) {
            SortUtils.print("鸡尾酒排序前[size:"+nums.length+"]：", nums);
        }
        while (left<right) {
            if(printProcess) {
                System.out.println("鸡尾酒第"+index+"次排序[left:"+left+",right:"+right+"]：");
                SortUtils.print(" 排序前：",nums);
                System.out.println("      前半部分:");
                SortUtils.print("        排序前:",nums,left,right);
            }
            String swapNums = "";
            for(int i=left; i<right; i++) {// 前半轮,将最大元素放到后面
                if(nums[i] > nums[i+1]) {
                    swapNums+=" "+nums[i]+"<-->"+nums[i+1];
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
            if(printProcess) {
                SortUtils.print("        排序后:",nums,left,right);
                System.out.println("        交换："+(swapNums.length()>0?"发生交换"+swapNums:"未发生交换"));
            }
            right--;
            if(printProcess) {
                System.out.println("      后半部分:");
                SortUtils.print("        排序前:",nums,left,right);
            }
            swapNums = "";
            for(int i = right; i>left; i--) {// 后半轮,将最小元素放到前面
                if(nums[i-1]>nums[i]) {
                    swapNums+=" "+nums[i-1]+"<-->"+nums[i];
                    temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                }
            }
            if(printProcess) {
                SortUtils.print("        排序后:",nums,left,right);
                System.out.println("        交换："+(swapNums.length()>0?"发生交换"+swapNums:"未发生交换"));
            }
            left++;
            index++;
        }
        if(printProcess) {
            SortUtils.print("鸡尾酒排序后[size:"+nums.length+"]：", nums);
        }
        return nums;
    }
}
