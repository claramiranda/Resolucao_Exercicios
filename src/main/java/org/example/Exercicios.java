package org.example;

public class Exercicios {

    int valorSomaInteirosImpares;

    public int somaNumerosImpares(int valorMaximo){
        int somaDosImpares = 0;

        for( int i = 1; i <= valorMaximo; i++){

            if( i % 2 != 0){
                somaDosImpares = somaDosImpares + i;
            }
        }
        return somaDosImpares;
    }

    public Exercicios(){
        this.valorSomaInteirosImpares = somaNumerosImpares(99);
    }

    public Exercicios(int valorMaximo){
        this.valorSomaInteirosImpares = somaNumerosImpares(valorMaximo);
    }

    public void calcularFatorial(int maxFatorial){
        long resultadoFatorial = 1;

        for (int i = 1; i < maxFatorial; i++) {
            resultadoFatorial = resultadoFatorial * i;
            
        }

    }




    public static void main(String[] args) {
        Exercicios ex = new Exercicios(14);
        //System.out.println(ex.somaNumerosInteiros(99));


        // int vlr = ex.somaNumerosInteiros(99);
        // System.out.println(vlr)

        ex.calcularFatorial(10);

    }


}
