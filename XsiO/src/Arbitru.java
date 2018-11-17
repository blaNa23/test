public class Arbitru {

    private boolean rand;
    private Jucator jucator1;
    private Jucator jucator2;
    private TablaDeJoc tablaDeJoc;

    public Arbitru(Jucator jucator1, Jucator jucator2, TablaDeJoc tablaDeJoc) {
        this.jucator1 = jucator1;
        this.jucator2 = jucator2;
        this.tablaDeJoc = tablaDeJoc;
        this.rand = true;
    }

    public void mutare(TablaDeJoc tablaDeJoc) {

        boolean quit = false;
        while (tablaDeJoc.getSpatiiGoale() != 0) {

            int alegere1 = 0;
            char c = '.';
            String nume = "";
            System.out.println(tablaDeJoc);

            if (rand) {
                nume = jucator1.getNume();
                c = jucator1.getSymbol();
                System.out.println("Este randul lui: " + nume + " -> " + c);
                jucator1.setAlegere();
                alegere1 = jucator1.getAlegere();
            } else if (!rand) {
                nume = jucator2.getNume();
                c = jucator2.getSymbol();
                System.out.println("Este randul lui: " + nume + " -> " + c);
                jucator2.setAlegere();
                alegere1 = jucator2.getAlegere();
            }

            switch (alegere1) {
                case 1:
                    if (tablaDeJoc.completareTabla(2, 0, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 2:
                    if (tablaDeJoc.completareTabla(2, 1, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 3:
                    if (tablaDeJoc.completareTabla(2, 2, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 4:
                    if (tablaDeJoc.completareTabla(1, 0, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 5:
                    if (tablaDeJoc.completareTabla(1, 1, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 6:
                    if (tablaDeJoc.completareTabla(1, 2, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 7:
                    if (tablaDeJoc.completareTabla(0, 0, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 8:
                    if (tablaDeJoc.completareTabla(0, 1, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                case 9:
                    if (tablaDeJoc.completareTabla(0, 2, c)) {
                        tablaDeJoc.setSpatiiGoale(tablaDeJoc.getSpatiiGoale() - 1);
                        schimbareRand();
                    } else {
                        System.out.println("Pozitie ocupta");
                    }
                    break;
                default:
                    System.out.println("Tasta gresita !");
                    break;
            }
            if (verificareCastigator(nume)) {
                return;
            }
        }
        System.out.println(tablaDeJoc);
        System.out.println("REMIZA !");
    }

    private void schimbareRand() {
        if (rand) {
            rand = false;
        } else if (!rand) {
            rand = true;
        }
    }

    private boolean verificareCastigator(String nume) {
        if (tablaDeJoc.win()) {
            System.out.println(tablaDeJoc);
            System.out.println("Sfarsit !\n" +
                    "" + nume + " este castigator !!");
            return true;
        }
        return false;
    }
}
