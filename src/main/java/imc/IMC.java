package imc;

public class IMC {
    /*
     * Retorna um texto informando a classificação da pessoa em relação ao imc
     * dado um peso e uma altura
     */
    public static String calculaIMC(double altura, double peso) {
        String retorno = null;
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            retorno = "Magreza";

        } else if (imc >= 18.5 && imc <= 24.9) {
            retorno = "Normal";

        } else if (imc >= 25 && imc <= 29.9) {
            retorno = "Sobrepeso";

        } else if (imc >= 30 && imc <= 39.9) {
            retorno = "Obesidade";

        } else if (imc >= 40) {
            retorno = "Obesidade Grave";
        }

        return retorno;
    }
}
