package htsdecrypter;

/**
 *
 * @author Rumesh Eranga Hapuarachchi
 */
public class AlgoLogic {

    public static String algo(int a) {
        String ret = null;
        char c = '"';
        if (a == 65) {
            ret = "A";
        } else if (a == 66) {
            ret = "B";
        } else if (a == 67) {
            ret = "C";
        } else if (a == 68) {
            ret = "D";
        } else if (a == 69) {
            ret = "E";
        } else if (a == 70) {
            ret = "F";
        } else if (a == 71) {
            ret = "G";
        } else if (a == 72) {
            ret = "H";
        } else if (a == 73) {
            ret = "I";
        } else if (a == 74) {
            ret = "J";
        } else if (a == 75) {
            ret = "K";
        } else if (a == 76) {
            ret = "L";
        } else if (a == 77) {
            ret = "M";
        } else if (a == 78) {
            ret = "N";
        } else if (a == 79) {
            ret = "O";
        } else if (a == 80) {
            ret = "P";
        } else if (a == 81) {
            ret = "Q";
        } else if (a == 82) {
            ret = "R";
        } else if (a == 83) {
            ret = "S";
        } else if (a == 84) {
            ret = "T";
        } else if (a == 85) {
            ret = "U";
        } else if (a == 86) {
            ret = "V";
        } else if (a == 87) {
            ret = "W";
        } else if (a == 88) {
            ret = "X";
        } else if (a == 89) {
            ret = "Y";
        } else if (a == 90) {
            ret = "Z";
        } else if (a == 97) {
            ret = "a";
        } else if (a == 98) {
            ret = "b";
        } else if (a == 99) {
            ret = "c";
        } else if (a == 100) {
            ret = "d";
        } else if (a == 101) {
            ret = "e";
        } else if (a == 102) {
            ret = "f";
        } else if (a == 103) {
            ret = "g";
        } else if (a == 104) {
            ret = "h";
        } else if (a == 105) {
            ret = "i";
        } else if (a == 106) {
            ret = "j";
        } else if (a == 107) {
            ret = "k";
        } else if (a == 108) {
            ret = "l";
        } else if (a == 109) {
            ret = "m";
        } else if (a == 110) {
            ret = "n";
        } else if (a == 111) {
            ret = "o";
        } else if (a == 112) {
            ret = "p";
        } else if (a == 113) {
            ret = "q";
        } else if (a == 114) {
            ret = "r";
        } else if (a == 115) {
            ret = "s";
        } else if (a == 116) {
            ret = "t";
        } else if (a == 117) {
            ret = "u";
        } else if (a == 118) {
            ret = "v";
        } else if (a == 119) {
            ret = "w";
        } else if (a == 120) {
            ret = "x";
        } else if (a == 121) {
            ret = "y";
        } else if (a == 122) {
            ret = "z";
        } else if (a == 48) {
            ret = "0";
        } else if (a == 49) {
            ret = "1";
        } else if (a == 50) {
            ret = "2";
        } else if (a == 51) {
            ret = "3";
        } else if (a == 52) {
            ret = "4";
        } else if (a == 53) {
            ret = "5";
        } else if (a == 54) {
            ret = "6";
        } else if (a == 55) {
            ret = "7";
        } else if (a == 56) {
            ret = "8";
        } else if (a == 57) {
            ret = "9";
        } else if (a == 96) {
            ret = "`";
        } else if (a == 126) {
            ret = "~";
        } else if (a == 33) {
            ret = "!";
        } else if (a == 64) {
            ret = "@";
        } else if (a == 35) {
            ret = "#";
        } else if (a == 36) {
            ret = "$";
        } else if (a == 37) {
            ret = "%";
        } else if (a == 94) {
            ret = "^";
        } else if (a == 38) {
            ret = "&";
        } else if (a == 42) {
            ret = "*";
        } else if (a == 40) {
            ret = "(";
        } else if (a == 41) {
            ret = ")";
        } else if (a == 47) {
            ret = "/";
        } else if (a == 63) {
            ret = "?";
        } else if (a == 46) {
            ret = ".";
        } else if (a == 62) {
            ret = ">";
        } else if (a == 44) {
            ret = ",";
        } else if (a == 60) {
            ret = "<";
        } else if (a == 34) {
            ret = "" + c;
        } else if (a == 39) {
            ret = "'";
        } else if (a == 59) {
            ret = ";";
        } else if (a == 58) {
            ret = ":";
        } else if (a == 92) {
            ret = "\\";
        } else if (a == 124) {
            ret = "|";
        } else if (a == 93) {
            ret = "]";
        } else if (a == 125) {
            ret = "}";
        } else if (a == 91) {
            ret = "[";
        } else if (a == 123) {
            ret = "{";
        } else if (a == 45) {
            ret = "-";
        } else if (a == 95) {
            ret = "_";
        } else if (a == 61) {
            ret = "=";
        } else if (a == 43) {
            ret = "+";
        } else if (a == 32) {
            ret = " ";
        } else if (a == 13) {
            ret = "";
        } else if (a == 10) {
            ret = "\n";
        } else {
            ret = "";
        }


        return ret;
    }

    public static String chaAn(String lett) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int hash;
        int count = 1;
        String convertedWord = "";
        String bufferNum = "";
        String dot = ".";

        System.out.println("Variable decalration succeded");

        for (int i = 0; i < lett.length(); i++) {
            System.out.println("Loop Started");
            if (!Character.toString(lett.charAt(i)).equals(dot)) {
                bufferNum = bufferNum + lett.charAt(i);
                System.out.println("buffer " + bufferNum);
            } else if (Character.toString(lett.charAt(i)).equals(dot)) {
                if (count == 1) {
                    num1 = Integer.parseInt(bufferNum);
                    System.out.println("Number 1 is " + num1);
                    count = count + 1;
                    System.out.println("Counter set to 2");
                    bufferNum = "";
                } else if (count == 2) {
                    num2 = Integer.parseInt(bufferNum);
                    System.out.println("Number 2 is " + num2);
                    count = count + 1;
                    System.out.println("Counter set to 3");
                    bufferNum = "";
                } else if (count == 3) {
                    num3 = Integer.parseInt(bufferNum);
                    System.out.println("Number 3 is " + num3);
                    count = 1;

                    hash = (num1 + num2 + num3) - 762;
                    System.out.println("hash value created\nHash value is" + hash);

                    convertedWord = convertedWord + algo(hash);
                    System.out.println("Hash converted to ASCII");
                    System.out.println(convertedWord);
                    bufferNum = "";
                    count = 1;
                    System.out.println("buffer set to null");
                }
            }
        }

        return convertedWord;

    }
}
