public class Calculadora {
    public <T extends Number> double soma(T numero1, T numero2){
        return numero1.doubleValue() + numero2.doubleValue();
    }

    public <T extends Number> double subtracao(T numero1, T numero2){
        return numero1.doubleValue() - numero2.doubleValue();
    }

    public <T extends Number> double multiplicacao(T numero1, T numero2){
        return numero1.doubleValue() * numero2.doubleValue();
    }

    public <T extends Number> double divisao(T numero1, T numero2){
        return numero1.doubleValue() / numero2.doubleValue();
    }
}
