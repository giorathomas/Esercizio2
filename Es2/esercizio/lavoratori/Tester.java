package lavoratori;

public class Tester {

    public static void main(String[] args) {
        Volontario v=new Volontario("t", "g", "321654987");
        System.out.println(v);
        System.out.println(v.paga());

        Giornaliero g=new Giornaliero("t","g", "321654987", "gojdfin", 100, 3);
        System.out.println(g);
        System.out.println(g.paga());

        Impiegato i=new Impiegato("t", "g", "321654987", "fnirngin", 30, 5);
        System.out.println(i);
        System.out.println(i.paga());
    }
}
