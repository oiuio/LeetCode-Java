import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public static void rotate(int[] nums, int k) {

        //当前指针
        int currentIndex = 0;
        int currentValue = 0;
        //目标指针
        int targetIndex = 0;
        int targetValue = 0;
        int count = 0;
        for (int start = 0; count < nums.length ; start++) {
            currentIndex = start;
            currentValue = nums[currentIndex];
            do {
                //计算目标指针
                targetIndex = (currentIndex + k) % nums.length;
                //保存目标指针的值
                targetValue = nums[targetIndex];
                //把当前值存入到目标位置
                nums[targetIndex] = currentValue;
                //把目标的值设置成当前的值
                currentValue = targetValue;
                //把的目标指针改为当前指针
                currentIndex = targetIndex;
                count++;
            } while (targetIndex!=start);
        }
    }

    public static void main(String[] args) {

        System.out.println("1");


        int[] testArray ={1,2};
        int k = 2;

        rotate(testArray,k);


        System.out.println(Arrays.toString(testArray));

        // 1,2,3,4,5,6
        //[3,2,1,4,1,6]
        //[5,6,1,2,3,4]
    }

}
// @lc code=end

