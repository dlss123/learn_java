package chapter05;

public class Array03 {
    public static void main(String[] args) {
        //TODO 数组
        int[] nums = {1, 4, 5, 3, 2};
        for(int j =0;j< nums.length;j++) {
            for (int i = 0; i < nums.length - 1-j; i++) {
                int num1 = nums[i];
                int num2 = nums[i + 1];
                if (num1 > num2) {
                    nums[i] = num2;
                    nums[i + 1] = num1;
                }

            }
        }
        for (int num : nums) {
            System.out.println(num);

        }



    }
}

