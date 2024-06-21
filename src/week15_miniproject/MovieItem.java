package week15_miniproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MovieItem {
    private String title;
    private double score;
    private int audience;
    private int openDay;

    public MovieItem(String title, double score, int audience, int openDay) {
        this.title = title;
        this.score = score;
        this.audience = audience;
        this.openDay = openDay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public int getOpenDay() {
        return openDay;
    }

    public void setOpenDay(int openDay) {
        this.openDay = openDay;
    }

    @Override
    public String toString() {
        return String.format("[" + title + "] rating: " + score + ", total audiences: " + audience
                + ", open-date: " + openDay);
    }
}
