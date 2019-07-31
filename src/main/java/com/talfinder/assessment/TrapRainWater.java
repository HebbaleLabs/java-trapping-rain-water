package com.talfinder.assessment;

import java.util.Arrays;

public class TrapRainWater {

    public static int trap(int[] heights) {
        /*
         * NOTE:
         * 1. Write your solution within this method
         * 2. Do not make changes to the Class Name, Method Name or Method Signature
         * 3. Use the Run-Java command to run main method
         * 4. Use the BuildAndRunTests command to evaluate your solution
         */
        return 1;
    }
    public static void main(String[] args) {
        int[] inputs = new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int desiredOutput = 6;
        int result = trap(inputs);
        System.out.println("Input values : " + Arrays.toString(inputs));
        System.out.println("Desired Output: " + desiredOutput);
        System.out.println("Trapped Rain Water: " + result);
    }
}
