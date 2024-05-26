package unitTest;

public class Calculadora {

    private static Calculadora instance;

    public static Calculadora getInstance(){
        if(instance == null){
            instance = new Calculadora();
        }
        return instance;
    }

    public int diferenca(int a, int b){
        return a - b;
    }

    public int divisao(int a, int b){
        return a/b;
    }

    public int produto(int a, int b){
        return a*b;
    }

    public int soma(int a, int b){
        return a+b;
    }

}
