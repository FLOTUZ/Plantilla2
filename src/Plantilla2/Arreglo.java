package Plantilla2;

public class Arreglo <T> {
    private T datos[];
    private int ne;

    public Arreglo(T [] ar){
        datos = ar;
        ne = ar.length;
    }

    @Override
    public String toString() {
        String regresa = "\n El arreglo es : \n";
        for (int i = 0; i < ne; i++) {
            regresa += datos [i] + "   ";
        }
        return regresa;
    }
}
