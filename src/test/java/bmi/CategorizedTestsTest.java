package bmi;

import categories.Positives;
import categories.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/*
 * Test Class with all methods with a category
 * that will permit to run in a categorized Suite
 */

public class CategorizedTestsTest {

    @Test
    @Category(Smoke.class)
    public void validateUnderweightBMI() {
        assertThat(BMI.calculateBMI(1.77,50), equalTo("Underweight"));
    }

    @Test
    @Category(Smoke.class)
    public void validateLowestLimitNormalWeightBMI() {
        assertThat(BMI.calculateBMI(1.77,58), equalTo("Normal weight"));
    }

    @Test
    @Category(Positives.class)
    public void validateRandomNormalWeightBMI() {
        assertThat(BMI.calculateBMI(1.77,65), equalTo("Normal weight"));
    }

    @Test
    @Category(Smoke.class)
    public void validateHighestLimitNormalWeightBMI() {
        assertThat(BMI.calculateBMI(1.77,78), equalTo("Normal weight"));
    }

    @Test
    @Category(Smoke.class)
    public void validateLowestLimitOverweightBMI() {
        assertThat(BMI.calculateBMI(1.77,78.35), equalTo("Overweight"));
    }

    @Test
    @Category(Positives.class)
    public void validateRandomOverweightBMI() {
        assertThat(BMI.calculateBMI(1.77,82), equalTo("Overweight"));
    }

    @Test
    @Category(Smoke.class)
    public void validateHighestLimitOverweightBMI() {
        assertThat(BMI.calculateBMI(1.77,93.50), equalTo("Overweight"));
    }

    @Test
    @Category(Smoke.class)
    public void validateLowestLimitObesityBMI() {
        assertThat(BMI.calculateBMI(1.77,94), equalTo("Obesity"));
    }

    @Test
    @Category(Positives.class)
    public void validateRandomObesityBMI() {
        assertThat(BMI.calculateBMI(1.77,100), equalTo("Obesity"));
    }

    @Test
    @Category(Smoke.class)
    public void validateHighestLimitObesityBMI() {
        assertThat(BMI.calculateBMI(1.77,125), equalTo("Obesity"));
    }

    @Test
    @Category(Smoke.class)
    public void validateSeverelyObesityBMI() {
        assertThat(BMI.calculateBMI(1.77,130), equalTo("Severely obesity"));
    }

}
