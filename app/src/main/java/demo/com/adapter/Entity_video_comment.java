package demo.com.adapter;

public class Entity_video_comment {
    private int head;
    private String title;
    private String content;
    private String time;


    private boolean like;
    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
