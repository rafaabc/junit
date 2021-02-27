package imc;

import categorias.Positivos;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
 * Suite de teste para rodar uma vez todos os métodos de teste
 *  categorizados por Positivos - um representante de cada partição de equivalência
 */

@RunWith(Categories.class)
@Categories.IncludeCategory(Positivos.class)
@Suite.SuiteClasses({
        TesteCategorizadoTest.class
})
public class SuiteDeCategoriaPositivosTest {
}
