public class ordenar {
    static void ordenabucketsort(int ArrayN[]) {
        int valor=0,conti=0;
        int ArrayB[] = new int[100000];
        for (int i=0; i<ArrayB.length;i++){
            ArrayB[i]=0;
        }
        for (int i = 0; i < ArrayN.length; i++) {
            ArrayB[ArrayN[i]]++;
        }
        for (int i=0;i<ArrayB.length; i++){
            for (int j=0; j<ArrayB[i];j++){
                ArrayN[conti]=i;
                conti++;
            }
        }
    }
}
