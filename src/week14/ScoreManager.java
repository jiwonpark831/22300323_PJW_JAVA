package week14;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreManager {
    Map<String, Score> scores;

    public ScoreManager() {
        this.scores = new HashMap<>();
        try {
            File file = new File("./src/week14/scores.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                addScore(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public Map<String, Score> getScores() {
        return scores;
    }

    public void setScores(Map<String, Score> scores) {
        this.scores = scores;
    }

    public void addScore(Score score) {
        scores.put(score.getName(), score);
    }

    public void addScore(String data) {
        String[] arrayData = data.split(" ");
        scores.put(arrayData[0], new Score(arrayData[0], Integer.parseInt(arrayData[1]), Integer.parseInt(arrayData[2]),
                Integer.parseInt(arrayData[3])));
    }

    public void removeScore(String key) {
        scores.remove(key);
    }

    public void saveScores() {
        String datas = "";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./src/week14/scores.txt");
            for (String key : scores.keySet()) {
                datas += scores.get(key).toString() + "\n";
            }

            byte b[] = datas.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public int getScoreKorToal() {
        int total = 0;
        for (String key : scores.keySet()) {
            total += scores.get(key).getKor();
        }
        return total;
    }

    public int getScoreEngToal() {
        int total = 0;
        for (String key : scores.keySet()) {
            total += scores.get(key).getEng();
        }
        return total;
    }

    public int getScoreMatToal() {
        int total = 0;
        for (String key : scores.keySet()) {
            total += scores.get(key).getMat();
        }
        return total;
    }

    void print() {
        int tKor = getScoreKorToal();
        int teng = getScoreEngToal();
        int tmath = getScoreMatToal();
        System.out.println("학생별 평균");
        for (String key : scores.keySet()) {
            Score score = scores.get(key);
            System.out.println(score.getName() + ": " + score.getAvg());
        }

        System.out.println("\n과목별 평균");
        System.out.println("korea: " + tKor / scores.size());
        System.out.println("english: " + teng / scores.size());
        System.out.println("math: " + tmath / scores.size());
    }

    void search(String name) {
        if (scores.containsKey(name)) {
            System.out.println("N : N  K  E  M");
            System.out.println(name + ": " + scores.get(name));
        } else
            System.out.println("Can't find " + name);
    }

    void modify(String name) {
        if (scores.containsKey(name)) {
            System.out.println(name + ": " + scores.get(name));
            Score newScore = scores.get(name);
            Scanner scanner = new Scanner(System.in);
            int newK = scanner.nextInt();
            int newE = scanner.nextInt();
            int newM = scanner.nextInt();
            newScore.setKor(newK);
            newScore.setEng(newE);
            newScore.setMat(newM);
            saveScores();
        } else
            System.out.println("Can't find " + name);
    }
}