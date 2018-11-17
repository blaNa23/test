import java.util.Scanner;

public class Jucator {
    Scanner scanner = new Scanner(System.in);
    private String nume;
    private char symbol;
    private int alegere;

    public Jucator(String nume, char symbol) {
        this.nume = nume;
        this.symbol = symbol;
    }

    public String getNume() {
        return nume;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setAlegere() {
        this.alegere = scanner.nextInt();
    }

    public int getAlegere() {
        return alegere;
    }
}
