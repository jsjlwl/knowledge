package com.szkj.test.knowledge.sort;

import com.szkj.knowledge.sort.SortFactory;
import org.junit.Test;

/**
 * @ClassName SortFactoryTest
 * @Description 排序测试
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:14
 * @Version 1.0
 */
public class SortFactoryTest {

    private static int[] nums = new int[]{20,10,5,6,30,78,6};
    @Test
    public void bubbleSort() throws Exception {
        SortFactory.getBubbleSort().sort(nums,true);
    }

    @Test
    public void cocktailSort() throws Exception {
        SortFactory.getCocktailSort().sort(nums,true);
    }

    @Test
    public void selectionSort() throws Exception {
        SortFactory.getSelectionSort().sort(nums,true);
    }


}
