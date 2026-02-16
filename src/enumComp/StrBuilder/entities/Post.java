package enumComp.StrBuilder.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDateTime dateTime;
    private String title;
    private String content;
    private int likes;

    private List<Comment> commentList = new ArrayList<>(); // Cria associação de comp com os comentários

    public Post(LocalDateTime dateTime, String title, String content, int likes) {
        this.dateTime = dateTime;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addComment(Comment text) {
        commentList.add(text);
    }

}
