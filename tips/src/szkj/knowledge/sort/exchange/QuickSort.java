package szkj.knowledge.sort.exchange;

import szkj.knowledge.sort.ISort;
import szkj.knowledge.sort.SortUtils;

/**
 * @ClassName QuickSort
 * @Description 快速排序，冒泡排序的一种
 * 类别：交换排序
 * 最差时间复杂度：O(n²)
 * 最优时间复杂度：O(logn)
 * 平均时间复杂度：O(nlogn)
 * 空间复杂度：O(nlogn)
 * 稳定性：不稳定
 * 算法逻辑：
 *  1、通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小；
 *  2、再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:26
 * @Version 1.0
 */
public class QuickSort implements ISort {
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
            SortUtils.print("排序前[size:"+nums.length+"]：", nums);
        }

        if(printProcess) {
            SortUtils.print("排序后[size:"+nums.length+"]：", nums);
        }
        return nums;
    }
}
