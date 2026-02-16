package enumComp.StrBuilder.application;

import enumComp.StrBuilder.entities.Comment;
import enumComp.StrBuilder.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDateTime dateTime = LocalDateTime.parse("23/02/2026 T00:12:21", DateTimeFormatter.ofPattern("dd/MM/yyyy 'T'HH:mm:ss"));
        String title = "Traveling to New Zealand";
        String content = "I'm going to visit this wonderful contry!";
        int likes = 12;

        // Instânciando primeiro post

        Post post1 = new Post(dateTime, title, content, likes);

        Comment comment_1 = new Comment("Have a nice trip");
        Comment comment_2 = new Comment("Wow that's awesome!");

        post1.addComment(comment_1);
        post1.addComment(comment_2);

        LocalDateTime dateTime2 = LocalDateTime.parse("01/10/2025 T12:31:56", DateTimeFormatter.ofPattern("dd/MM/yyyy 'T'HH:mm:ss"));
        String title2 = "Good night guys";
        String content2 = "See you tomorrow";
        int likes2 = 5;

        Post post2 = new Post(dateTime2, title2, content2, likes2);

        Comment comment_3 = new Comment("Good night guys");
        Comment comment_4 = new Comment("May the force be with you");

        post2.addComment(comment_3);
        post2.addComment(comment_4);

        System.out.println(post1 + "\n" + post2);

        sc.close();
    }
}
