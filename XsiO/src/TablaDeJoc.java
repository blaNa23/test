public class TablaDeJoc {

    private char[][] tabla;
    private int spatiiGoale;


    public TablaDeJoc() {
        this.tabla = new char[3][3];
        this.spatiiGoale = 9;
    }

    public boolean completareTabla(int linie, int coloana, char c) {
        if (tabla[linie][coloana] == 'X' || tabla[linie][coloana] == '0') {
            return false;
        } else {
            tabla[linie][coloana] = c;
        }
        return true;
    }

    public boolean win() {

        // verificare x pe linii, coloane, diagonale
        // linia 3
        if (tabla[2][0] == 'X' && tabla[2][1] == 'X' && tabla[2][2] == 'X') {
            return true;
        } // linia 2
        if (tabla[1][0] == 'X' && tabla[1][1] == 'X' && tabla[1][2] == 'X') {
            return true;
        } // linia 1
        if (tabla[0][0] == 'X' && tabla[0][1] == 'X' && tabla[0][2] == 'X') {
            return true;
        } // coloana 1
        if (tabla[0][0] == 'X' && tabla[1][0] == 'X' && tabla[2][0] == 'X') {
            return true;
        } //coloana 2
        if (tabla[0][1] == 'X' && tabla[1][1] == 'X' && tabla[2][1] == 'X') {
            return true;
        } // coloana 3
        if (tabla[0][2] == 'X' && tabla[1][2] == 'X' && tabla[2][2] == 'X') {
            return true;
        }// diagonala 1
        if (tabla[2][0] == 'X' && tabla[1][1] == 'X' && tabla[0][2] == 'X') {
            return true;
        } // diagonala 2
        if (tabla[0][0] == 'X' && tabla[1][1] == 'X' && tabla[2][2] == 'X') {
            return true;
        }
        // verificare 0 pe linii, coloane, diagonale
        //------------------------------------------------------------
        if (tabla[2][0] == '0' && tabla[2][1] == 'X' && tabla[2][2] == 'X') {
            return true;
        } // linia 2
        if (tabla[1][0] == '0' && tabla[1][1] == '0' && tabla[1][2] == '0') {
            return true;
        } // linia 1
        if (tabla[0][0] == '0' && tabla[0][1] == '0' && tabla[0][2] == '0') {
            return true;
        } // coloana 1
        if (tabla[0][0] == '0' && tabla[1][0] == '0' && tabla[2][0] == '0') {
            return true;
        } //coloana 2
        if (tabla[0][1] == '0' && tabla[1][1] == '0' && tabla[2][1] == '0') {
            return true;
        } // coloana 3
        if (tabla[0][2] == '0' && tabla[1][2] == '0' && tabla[2][2] == '0') {
            return true;
        }// diagonala 1
        if (tabla[2][0] == '0' && tabla[1][1] == '0' && tabla[0][2] == '0') {
            return true;
        } // diagonala 2
        if (tabla[0][0] == '0' && tabla[1][1] == '0' && tabla[2][2] == '0') {
            return true;
        }
        return false;
    }

    public int getSpatiiGoale() {
        return spatiiGoale;
    }

    public void setSpatiiGoale(int spatiiGoale) {
        this.spatiiGoale = spatiiGoale;
    }

    @Override
    public String toString() {

        String s = "";

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                if (tabla[i][j] == 0) {
                    s += " _";
                } else {
                    s += " " + tabla[i][j];
                }
            }
            s += "\n";
        }

        return s;
    }
}
