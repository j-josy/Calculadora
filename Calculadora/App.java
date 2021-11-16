public class App {

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();

        float primeiroNumero = 34;
        float segundoNumero = 58.78f;
        //  float resultado = calculadora.somar(primeiroNumero);
        //float resultado =calculadora.subtrair(primeiroNumero,segundoNumero);
        
        //float resultado = calculadora.multiplicar(primeiroNumero,segundoNumero);
        float resultado = calculadora.dividir(primeiroNumero,segundoNumero);

        System.out.println(resultado);
    }
        

}
