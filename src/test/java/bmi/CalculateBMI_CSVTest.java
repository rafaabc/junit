package bmi;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.*;

/*
 * Test Class using data-driven approach
 */

@RunWith(JUnitParamsRunner.class)
public class CalculateBMI_CSVTest {

    @Test
    @FileParameters(value = "src/test/resources/data.csv", mapper = CsvWithHeaderMapper.class)
    public void validateBMIResult(double height, double weight, String result) {
       assertThat(BMI.calculateBMI(height, weight), equalTo(result));
    }
}
