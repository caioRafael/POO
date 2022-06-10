public class Calculadora {
    public int obterIntValido(String number) throws NumberFormatException{
        return Integer.parseInt(number);
    }

    public Integer sum(Integer num1, Integer num2){
        return num1 + num2;
    }
}
