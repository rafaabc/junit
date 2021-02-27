package imc;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.*;

/*
 * Classe de teste com a estratégia de Data-Driven
 * pela leitura do arquivo massa_de_dados.csv
 */

@RunWith(JUnitParamsRunner.class)
public class CalculoIMC_CSVTest {

    @Test
    @FileParameters(value = "src/test/resources/massa_de_dados.csv", mapper = CsvWithHeaderMapper.class)
    public void validarResultadoIMC(double altura, double peso, String resultado) {
       assertThat(IMC.calculaIMC(altura, peso), equalTo(resultado));
    }
}
