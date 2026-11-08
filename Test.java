package com.movie;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Movie[] movies = new Movie[4];
        movies[0] = new Movie("肖申克的救赎", "1994年9月23日", "Frank Darabont", "American");
        movies[1] = new Movie("霸王别姬", "1993年5月30日", "陈凯歌", "China");
        movies[2] = new Movie("阿甘正传", "1994年7月6日", "Robert Zemeckis", "American");
        movies[3] = new Movie("功夫", "2004年12月23日", "周星驰", "China");
        Arrays.sort(movies, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                try {
                    Date d1 = sdf.parse(o1.getMovietime());
                    Date d2 = sdf.parse(o2.getMovietime());
                    return d1.compareTo(d2);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
