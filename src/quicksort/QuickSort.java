/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author HP
 */
public class QuickSort {
       private static int num[]={20,12,28,24,8,4,16};
        
        public static void main(String[] args) {
                System.out.println("Numeros originales");
                imprimirNum(num);
                ordenacionRapida(num);
                System.out.println("\nNumeros ordenados");
                imprimirNum(num);
        }

        public static void ordenacionRapida(int vec[]){
                final int N=vec.length;
                quickSort(vec, 0, N-1);
        }
        
        public static void quickSort(int num[], int inicio, int fin){
                if(inicio>=fin) return;
                int piv=num[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && num[elemIzq]<piv){
                                elemIzq++;
                        }
                        while(elemDer>inicio && num[elemDer]>=piv){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=num[elemIzq];
                                num[elemIzq]=num[elemDer];
                                num[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=num[inicio];
                        num[inicio]=num[elemDer];
                        num[elemDer]=temp;
                }
                quickSort(num, inicio, elemDer-1);
                quickSort(num, elemDer+1, fin);
        }
        
        public static void imprimirNum(int num[]){
                for(int i=0;i<num.length;i++){
                        System.out.print(num[i]+" ");
                }
        }
        
}
