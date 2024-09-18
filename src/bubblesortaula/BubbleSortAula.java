
package bubblesortaula;

import java.util.Random;


public class BubbleSortAula {

    static void troca(Integer[] v, int i, int j){
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    static void bSort(Integer v[], int n){
        for(int fase=1;fase<n;fase++)
            for(int j=0;j<n-fase;j++)
                if(v[j]>v[j+1])
                    troca(v,j,j+1);
    }
    
    static Integer[] gerarVetor(int n, int max){
        Random rand = new Random();
        Integer[] vetor = new Integer[n];
        for(int i=0;i<n;i++)
            vetor[i] = rand.nextInt(max)+1;
        
        return vetor;
    }
    
    static void mostrarVetor(Integer[] v){
          int tamanho = v.length;
          for(int i=0;i<tamanho;i++)
              System.out.print(v[i]+ "|");
          System.out.println("");
    }
    
    public static void main(String[] args) {
        Integer[] meuVetor = gerarVetor(10, 100);
        System.out.println("Vetor Gerado");
        mostrarVetor(meuVetor);
        bSort(meuVetor, 10);
        System.out.println("Vetor Ordenado");
        mostrarVetor(meuVetor);
    }
    
}
