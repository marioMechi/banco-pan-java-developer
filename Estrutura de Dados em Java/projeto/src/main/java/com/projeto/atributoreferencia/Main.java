package main.java.com.projeto.atributoreferencia;

public class Main {
    public static void main(String[] args){
        int intA =1;
        int intB = intA;
        System.out.println("IntA="+intA+" IntB="+intB);
        intA = 2;
        System.out.println("IntA="+intA+" IntB="+intB);
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("ObjA="+objA+" ObjB="+objB);
        objA.setNum(2);
        System.out.println("ObjA="+objA+" ObjB="+objB);
    }
}
