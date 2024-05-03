package week9;

import java.util.Random;

public class MakePW {

    public MakePW() {
        // make(10);
    };

    public void make(int length) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (random.nextBoolean())
                stringBuilder.append(random.nextInt(10));
            else
                stringBuilder.append(Character.toLowerCase((char) (random.nextInt(26) + 65)));
        }
        System.out.println(stringBuilder);
    };

    public void makeCode(int length1, int length2) {
        Random random = new Random();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < length1; i++) {
            stringBuilder1.append((char) (random.nextInt(26) + 65));
        }
        for (int i = 0; i < length2; i++) {
            stringBuilder2.append(random.nextInt(10));
        }
        System.out.println(stringBuilder1 + "-" + stringBuilder2);

    }

}
