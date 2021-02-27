package imc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/*
 * Classe de teste com todos os métodos e valores hard-coded
 */

public class CalculoIMCTest {

    @Test
    public void validarIMCMagreza() {
        assertThat(IMC.calculaIMC(1.77,50), equalTo("Magreza"));
    }

    @Test
    public void validarIMCNormalComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,58), equalTo("Normal"));
    }

    @Test
    public void validarIMCNormalAleatorio() {
        assertThat(IMC.calculaIMC(1.77,65), equalTo("Normal"));
    }

    @Test
    public void validarIMCNormalComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,78), equalTo("Normal"));
    }

    @Test
    public void validarIMCSobrepesoComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,78.35), equalTo("Sobrepeso"));
    }

    @Test
    public void validarIMCSobrepesoAleatorio() {
        assertThat(IMC.calculaIMC(1.77,82), equalTo("Sobrepeso"));
    }

    @Test
    public void validarIMCSobrepesoComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,93.50), equalTo("Sobrepeso"));
    }

    @Test
    public void validarIMCObesidadeComMenorLimite() {
        assertThat(IMC.calculaIMC(1.77,94), equalTo("Obesidade"));
    }

    @Test
    public void validarIMCObesidadeAleatorio() {
        assertThat(IMC.calculaIMC(1.77,100), equalTo("Obesidade"));
    }

    @Test
    public void validarIMCObesidadeComMaiorLimite() {
        assertThat(IMC.calculaIMC(1.77,125), equalTo("Obesidade"));
    }

    @Test
    public void validarIMCObesidadeGrave() {
        assertThat(IMC.calculaIMC(1.77,130), equalTo("Obesidade Grave"));
    }
}
