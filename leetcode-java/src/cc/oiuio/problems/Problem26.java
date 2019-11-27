package cc.oiuio.problems;

public class Problem26 {

    public static int removeDuplicates(int[] nums) {


        int preIndex = 0;

        for (int sufIndex = 1; sufIndex < nums.length; sufIndex++) {
            if (nums[preIndex]!=nums[sufIndex]){
                nums[++preIndex]=nums[sufIndex];
            }
        }

        return preIndex+1;
    }

    public static void main(String[] args) {

        int[] testArrayA = {1,1,2};
        int[] testArrayB = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(testArrayA));
        System.out.println(removeDuplicates(testArrayB));

    }
}

