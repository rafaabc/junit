package imc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Suite de teste para rodar uma vez todos os métodos de teste
 *  da classe passada por parâmetro
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculoIMCTest.class,
        CalculoIMC_CSVTest.class
})
public class SuiteDeTesteTest {
}
