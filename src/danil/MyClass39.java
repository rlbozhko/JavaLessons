package danil;
public class MyClass39 {
    public static String funcCalc() {

        String tmpPassword = "";
        char bigCharOrLittle;
        int variant, charOrder, numbers;
        int tmpIntChar;

        for (int i = 0; i < 8; i++) {
            variant = (int) (Math.random() * 4);
            charOrder = (int) (Math.random() * 26);
            numbers = (int) (Math.random() * 10);
            if (variant == 0) {
                //доб. большую
                tmpIntChar = charOrder + 65;
                bigCharOrLittle = (char) tmpIntChar;
                tmpPassword += bigCharOrLittle;
            } else if (variant == 1) {
                //доб. мален
                tmpIntChar = charOrder + 97;
                bigCharOrLittle = (char) tmpIntChar;
                tmpPassword += bigCharOrLittle;
            } else if (variant == 2) {
                //доб. цифру
                tmpPassword += numbers;
            } else if (variant == 3) {
                //доб. подчерк
                tmpPassword += "_";
            }
        }

        char specPasswordArray[] = tmpPassword.toCharArray();
        int countBig = 0, countLittle = 0, countDigits = 0;
        int spec = 0, spec1 = 0, spec2 = 0;
        String finallPassword = "";

        spec = (int) (Math.random() * 8);
        spec1 = (int) (Math.random() * 25);
        spec2 = (int) (Math.random() * 10);


        for (int charNumber = 0, passwordCharNumber = 0; charNumber < 25; charNumber++) {
            if (specPasswordArray[passwordCharNumber] == charNumber + 65) {
                countBig++;
            } else if (specPasswordArray[passwordCharNumber] == charNumber + 97) {
                countLittle++;
            }

            if (charNumber == 24) {
                charNumber = 0;
                passwordCharNumber++;
            }

            if (passwordCharNumber == 8) {
                break;
            }
        }

        for (int digit = 0, passwordCharNumber = 0; digit < 10; digit++) {
            if (specPasswordArray[passwordCharNumber] == digit + 48) {
                countDigits++;
            }

            if (digit == 9) {
                digit = 0;
                passwordCharNumber++;
            }

            if (passwordCharNumber == 8) {
                break;
            }
        }

        if (countBig == 0) {
            specPasswordArray[spec] = (char) (spec1 + 65);
        }
        if (countLittle == 0) {
            specPasswordArray[spec] = (char) (spec1 + 97);
        }
        if (countDigits == 0) {
            specPasswordArray[spec] = (char) (spec2 + 48);
        }


        for (int p = 0; p < specPasswordArray.length; p++) {
            finallPassword += specPasswordArray[p];
        }
        return finallPassword;

    }


    public static void main(String[] args) {
        String finalString = funcCalc();
        System.out.println(finalString);
    }
}
