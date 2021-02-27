package imc;

import categorias.Positivos;
import categorias.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/*
 * Classe de teste com todos os métodos e valores da classe original CalculoIMC
 * mas com categorias que propiciarão rodar uma suite específica
 */

public class TesteCategorizadoTest {

    @Test
    @Category(Smoke.class)
    public void validarIMCMagreza() {
        assertThat(IMC.calculaIMC(1.77,50), equalTo("Magreza"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCNormalComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,58), equalTo("Normal"));
    }

    @Test
    @Category(Positivos.class)
    public void validarIMCNormalAleatorio() {
        assertThat(IMC.calculaIMC(1.77,65), equalTo("Normal"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCNormalComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,78), equalTo("Normal"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCSobrepesoComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,78.35), equalTo("Sobrepeso"));
    }

    @Test
    @Category(Positivos.class)
    public void validarIMCSobrepesoAleatorio() {
        assertThat(IMC.calculaIMC(1.77,82), equalTo("Sobrepeso"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCSobrepesoComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,93.50), equalTo("Sobrepeso"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCObesidadeComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,94), equalTo("Obesidade"));
    }

    @Test
    @Category(Positivos.class)
    public void validarIMCObesidadeAleatorio() {
        assertThat(IMC.calculaIMC(1.77,100), equalTo("Obesidade"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCObesidadeComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,125), equalTo("Obesidade"));
    }

    @Test
    @Category(Smoke.class)
    public void validarIMCObesidadeGrave() {
        assertThat(IMC.calculaIMC(1.77,130), equalTo("Obesidade Grave"));
    }

}
