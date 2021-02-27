package bmi;

public class BMI {
    /*
    * Returns a text telling the result of the calculation
    * based on a size and a weight of a person
    */
    public static String calculateBMI(double height, double weight) {
        String result = null;
        double imc = weight / (height * height);

        if (imc < 18.5) {
            result = "Underweight";

        } else if (imc >= 18.5 && imc <= 24.9) {
            result = "Normal weight";

        } else if (imc >= 25 && imc <= 29.9) {
            result = "Overweight";

        } else if (imc >= 30 && imc <= 39.9) {
            result = "Obesity";

        } else if (imc >= 40) {
            result = "Severely obesity";
        }

        return result;
    }
}
