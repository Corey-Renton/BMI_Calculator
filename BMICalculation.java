package com.company;


public class BMICalculation {

    public static double BMI_Metric (double Weight, double Height){

        double HeightSquared = Math.pow(Height, 2); //Height to the power of 2. .pow is Power
        double BMI = (Weight / (HeightSquared) * 10000); //BMI Formula
        double BMI_Rounded2dp = Math.round(BMI * 100.0) / 100.0; //Rounding to 2 decimal places

        return BMI_Rounded2dp;
    }

    public static double BMI_Imperial (double Weight, double Height){

        double HeightSquared = Math.pow(Height, 2); //Height to the power of 2. .pow is Power
        double BMI = ((703 * Weight) / (HeightSquared)); //BMI Formula
        double BMI_Rounded2dp = Math.round(BMI * 100.0) / 100.0; //Rounding to 2 decimal places

        return BMI_Rounded2dp;
    }

}
