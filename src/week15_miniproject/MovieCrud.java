package week15_miniproject;

import java.io.*;
import java.util.*;

public class MovieCrud implements iCRUD {
    private ArrayList<MovieItem> list;

    public MovieCrud() {
        this.list = new ArrayList<MovieItem>();
    }

    public void loadData() throws IOException {
        File file = new File("src/week15_miniproject/moviedata.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            String[] lines = line.split(",");
            MovieItem item = new MovieItem(lines[0], Double.valueOf(lines[1]), Integer.valueOf(lines[2]),
                    Integer.valueOf(lines[3]));
            list.add(item);
        }
        br.close();
    }

    public void saveItem() throws IOException {
        File file = new File("src/week15_miniproject/moviedata.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (MovieItem item : list) {
            bw.write(item.getTitle() + "," + item.getScore() + "," + item.getAudience() + "," + item.getOpenDay());
            bw.newLine();
        }
        bw.close();

        File file2 = new File("src/week15_miniproject/movielist.txt");
        FileWriter fw2 = new FileWriter(file2);
        BufferedWriter bw2 = new BufferedWriter(fw2);
        bw2.write("Total " + this.list.size() + " movies");
        bw2.newLine();
        for (MovieItem item : list) {
            bw2.write(item.toString());
            bw2.newLine();
        }
        bw2.close();
        System.out.println("moviedata.txt and movielist.txt are saved");
    }

    @Override
    public Object createItem() {
        return null;
    }

    @Override
    public int addItem() {
        String title;
        double score;
        int audience;
        int openDay;
        Scanner sc = new Scanner(System.in);

        System.out.print("Add a new movie\n"
                + "Enter movie title > ");
        title = sc.nextLine().trim();
        System.out.print("Enter rate of movie > ");
        score = sc.nextDouble();
        System.out.print("Enter total audiences > ");
        audience = sc.nextInt();
        System.out.print("When the movie open (YYYY) > ");
        openDay = sc.nextInt();

        MovieItem newitem = new MovieItem(title, score, audience, openDay);
        this.list.add(newitem);
        System.out.println(title + " added");
        return 0;
    }

    @Override
    public int updateItem() {
        double rate;
        int audience;
        Scanner sc = new Scanner(System.in);

        System.out.print("Edit information about movie\n"
                + "Enter movie's title to edit > ");
        String title = sc.nextLine().trim();
        MovieItem item_found = findName(title);
        if (item_found == null) {
            System.out.println(title + " not found");
            return 1;
        }

        System.out.println(item_found.toString());

        System.out.print("Enter new rating > ");
        rate = sc.nextDouble();
        System.out.print("Enter new total audience > ");
        audience = sc.nextInt();
        item_found.setScore(rate);
        item_found.setAudience(audience);

        System.out.println(item_found.toString());
        System.out.println(title + " updated");
        return 0;
    }

    @Override
    public int deleteItem() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Delete movie\n"
                + "Enter title to remove > ");
        String title = sc.nextLine().trim();

        MovieItem item_found = findName(title);
        if (item_found == null) {
            System.out.println(title + " not found");
            return 1;
        }

        System.out.println(item_found.toString());

        this.list.remove(item_found);
        System.out.println(title + " deleted");
        return 0;
    }

    public MovieItem findName(String title) {
        for (MovieItem item : this.list) {
            if (item.getTitle().equals(title))
                return item;
        }
        return null;

    }

    @Override
    public int printItem() {
        return 0;
    }

    public int printAll() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total " + this.list.size() + " movies");
        for (MovieItem item : this.list) {
            System.out.println(item.toString());
        }

        return 0;
    }

    public void sortByRate() {
        Collections.sort(this.list, new RateComparator());
    }

    public void sortAudience() {
        Collections.sort(this.list, new AudienceComparator());
    }

    public int searchItem() {
        double min, max;
        System.out.print("Enter the range of rating > ");
        Scanner sc = new Scanner(System.in);
        min = sc.nextDouble();
        max = sc.nextDouble();
        for (MovieItem item : list) {
            if (min <= item.getScore() && max >= item.getScore())
                System.out.println(item.toString());
        }
        return 0;
    }

}

class RateComparator implements Comparator<MovieItem> {
    @Override
    public int compare(MovieItem o1, MovieItem o2) {
        if (o1.getScore() < o2.getScore())
            return -1;
        else
            return 1;
    }
}

class AudienceComparator implements Comparator<MovieItem> {
    @Override
    public int compare(MovieItem o1, MovieItem o2) {
        if (o1.getAudience() < o2.getAudience())
            return -1;
        else
            return 1;
    }
}