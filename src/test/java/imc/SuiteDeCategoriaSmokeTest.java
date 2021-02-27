package imc;

import categorias.Smoke;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Suite de teste para rodar uma vez todos os métodos de teste
 *  categorizados por Smoke - principais testes com análise de valor limite
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Smoke.class)
@Suite.SuiteClasses({
        TesteCategorizadoTest.class
})
public class SuiteDeCategoriaSmokeTest {
}
