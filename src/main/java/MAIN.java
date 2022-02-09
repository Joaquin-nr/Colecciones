public class MAIN {
    public static void main(String[] args) {
        int ArrayN[] = new int[25];
        float suma =0;
        float prom=0;
        //llenando el array
        for (int i = 0; i < ArrayN.length; i++) {
            ArrayN[i]=0+(int)(Math.random()*100);
        }
        System.out.println("      -SIN ORDENAR-");
        mostrarN.mostrar(ArrayN);
        ordenar.ordenabucketsort(ArrayN);
        System.out.println("      -ORDENADO-");
        mostrarN.mostrar(ArrayN);
        for (int i = 0; i < ArrayN.length; i++) {
            suma = suma + ArrayN[i];
        }
        System.out.println("Suma: "+ suma);
        prom=suma/ ArrayN.length;
        System.out.println("Promedio: "+prom);

    }
}
