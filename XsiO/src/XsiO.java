public class XsiO {

    public static void main(String[] args) {

        Jucator jucator1 = new Jucator("Tetic1", 'X');
        Jucator jucator2 = new Jucator("blaNa", '0');
        TablaDeJoc tablaDeJoc = new TablaDeJoc();

        Arbitru arbitru = new Arbitru(jucator1, jucator2, tablaDeJoc);

        arbitru.mutare(tablaDeJoc);

    }
}

