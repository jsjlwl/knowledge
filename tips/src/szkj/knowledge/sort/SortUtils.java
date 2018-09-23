package szkj.knowledge.sort;

/**
 * @ClassName SortUtils
 * @Description 排序公用操作
 * @Author liwenlong
 * @Email jsjlwl@qq.com
 * @Date 2018-09-24 2:14
 * @Version 1.0
 */
public class SortUtils {
    /**
     * 打印数组信息
     * @param nums
     */
    public static void print(String msg, int[] nums) {
        System.out.print(msg);
        if(nums!=null && nums.length>0) {
            for(int i : nums) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void print(String msg, int[] nums, int start, int end) {
        System.out.print(msg);
        if(nums!=null && nums.length>0 && start<=end && nums.length>start && nums.length>end) {
            for(int i=start; i<end; i++) {
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
    }

    /**
     * 倒序输出
     * @param msg
     * @param nums
     * @param start
     * @param end
     */
    public static void printInvert(String msg, int[] nums, int start, int end) {
        System.out.print(msg);
        if(nums!=null && nums.length>0 && start<=end && nums.length>start && nums.length>end) {
            for(int i=end; i>start; i--) {
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
    }
}
