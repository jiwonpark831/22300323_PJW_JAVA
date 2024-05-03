package week9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main pStudio = new Main();
        pStudio.j043();
    }

    void j041() {
        Lotto lotto = new Lotto();
        System.out.println("초기 생성된 로또 번호");
        lotto.printNumbers();
        System.out.println("새로 생성된 로또 번호");
        lotto.remakeAuto();
        lotto.printNumbers();
    }

    void j042() {
        Lotto lotto = new Lotto();
        System.out.println("초기 생성된 로또 번호");
        lotto.printNumbers();
        lotto.remake();
        System.out.println("사용자가 생성한 로또 번호");
        lotto.printNumbers();
    }

    void j043() {
        Lotto lotto = new Lotto();
        System.out.println("초기 생성된 로또 번호");
        lotto.printNumbers();
        Lotto lottoTry = new Lotto();
        lottoTry.remake();
        System.out.println("사용자가 생성한 로또 번호");
        lottoTry.printNumbers();
        int match = lotto.checkWin(lotto, lottoTry);
        System.out.println("match : " + match);
    }

    void j044() {

    }

    void j045() {

    }

}