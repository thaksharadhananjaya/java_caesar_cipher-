import java.util.Scanner;

public class CaesarCiper {
    private int key = 3;
    private String text;

    CaesarCiper(int key, String text) {
        this.key = key;
        this.text = text;
    }
    public String getEncyText() {
        String ciperText = "";
        for (int i = 0; i < text.length(); i++) {
            String ch = text.substring(i, i + 1);
            if (!ch.equals(" ")) {
                int p = getCharPossion(text.substring(i, i + 1));
                int val = (p + key) % 26;
                ciperText += getChar(val);
            } else {
                ciperText += ch;
            }
        }
        return ciperText;
    }

    public String getDecyText() {
        String paintText = "";
        for (int i = 0; i < text.length(); i++) {
            String ch = text.substring(i, i + 1);
            if (!ch.equals(" ")) {
                int p = getCharPossion(ch);
                int val = (p - key) % 26;
                if (val < 0)
                    val = val + 26;
                paintText += getChar(val);
            } else {
                paintText += ch;
            }
        }
        return paintText;
    }

    private String getChar(int val) {

        String ch = null;
        switch (val) {
            case 0:
                ch = "A";
                break;
            case 1:
                ch = "B";
                break;
            case 2:
                ch = "C";
                break;
            case 3:
                ch = "D";
                break;
            case 4:
                ch = "E";
                break;
            case 5:
                ch = "F";
                break;
            case 6:
                ch = "G";
                break;
            case 7:
                ch = "H";
                break;
            case 8:
                ch = "I";
                break;
            case 9:
                ch = "J";
                break;
            case 10:
                ch = "K";
                break;
            case 11:

                ch = "L";
                break;
            case 12:
                ch = "M";
                break;
            case 13:
                ch = "N";
                break;
            case 14:
                ch = "O";
                break;
            case 15:
                ch = "P";
                break;
            case 16:
                ch = "Q";
                break;
            case 17:
                ch = "R";
                break;
            case 18:
                ch = "S";
                break;
            case 19:
                ch = "T";
                break;
            case 20:
                ch = "U";
                break;
            case 21:
                ch = "V";
                break;
            case 22:
                ch = "W";
                break;
            case 23:
                ch = "X";
                break;
            case 24:
                ch = "Y";
                break;
            case 25:
                ch = "Z";
                break;

        }
        return ch;
    }

    private int getCharPossion(String ch) {

        int p = 0;
        switch (ch) {
            case "B":
                p = 1;
                break;
            case "C":
                p = 2;
                break;
            case "D":
                p = 3;
                break;
            case "E":
                p = 4;
                break;
            case "F":
                p = 5;
                break;
            case "G":
                p = 6;
                break;
            case "H":
                p = 7;
                break;
            case "I":
                p = 8;
                break;
            case "J":
                p = 9;
                break;
            case "K":
                p = 10;
                break;
            case "L":
                p = 11;
                break;
            case "M":
                p = 12;
                break;
            case "N":
                p = 13;
                break;
            case "O":
                p = 14;
                break;
            case "P":
                p = 15;
                break;
            case "Q":
                p = 16;
                break;
            case "R":
                p = 17;
                break;
            case "S":
                p = 18;
                break;
            case "T":
                p = 19;
                break;
            case "U":
                p = 20;
                break;
            case "V":
                p = 21;
                break;
            case "W":
                p = 22;
                break;
            case "X":
                p = 23;
                break;
            case "Y":
                p = 24;
                break;
            case "Z":
                p = 25;
                break;
            case "b":
                p = 1;
                break;
            case "c":
                p = 2;
                break;
            case "d":
                p = 3;
                break;
            case "e":
                p = 4;
                break;
            case "f":
                p = 5;
                break;
            case "g":
                p = 6;
                break;
            case "h":
                p = 7;
                break;
            case "i":
                p = 8;
                break;
            case "j":
                p = 9;
                break;
            case "k":
                p = 10;
                break;
            case "l":
                p = 11;
                break;
            case "m":
                p = 12;
                break;
            case "n":
                p = 13;
                break;
            case "o":
                p = 14;
                break;
            case "p":
                p = 15;
                break;
            case "q":
                p = 16;
                break;
            case "r":
                p = 17;
                break;
            case "s":
                p = 18;
                break;
            case "t":
                p = 19;
                break;
            case "u":
                p = 20;
                break;
            case "v":
                p = 21;
                break;
            case "w":
                p = 22;
                break;
            case "x":
                p = 23;
                break;
            case "y":
                p = 24;
                break;
            case "z":
                p = 25;
                break;
        }
        return p;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nSelect:\n1) Encryption (1)\n2) Decryption (2)\n");
        int option = 3;
        try {
            option = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {

        }

        if (option == 1) {
            System.out.print("\nEnter your paint text: ");
            String paintText = scanner.nextLine();

            CaesarCiper caesarCiper = new CaesarCiper(3, paintText);
            System.out.println("\nCaesar Ciper Text: " + caesarCiper.getEncyText());
            System.out.println();
        } else if (option == 2) {
            System.out.print("\nEnter your Caesar Ciper text: ");
            String caesarCiperText = scanner.nextLine();
            scanner.close();

            CaesarCiper caesarCiper = new CaesarCiper(3, caesarCiperText);
            System.out.println("\nPaint Text: " + caesarCiper.getDecyText().toLowerCase());
            System.out.println();
        } else {
            System.out.println("\nInvalid Input!");
        }
    }
}