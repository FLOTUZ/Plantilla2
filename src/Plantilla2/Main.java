package Plantilla2;

public class Main {

    public static void main(String[] args) {
	Integer ar[] = {2,4,6,8,10,12,14,16,18,20};
	Arreglo <Integer> obj = new Arreglo<>(ar);
        System.out.println(obj);
        String [] ars= {"Hugo", "Paco", "Luis"};
        Arreglo <String> objs = new Arreglo(ars);
        System.out.println(objs);
    }
}
