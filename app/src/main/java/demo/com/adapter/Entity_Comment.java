package demo.com.adapter;
public class Entity_Comment {
    private String commenttit;
    private String commentcov;
    private String commentcov2;
    private int commentimg;
    public Entity_Comment(String commentcov, String commentcov2,String commenttit, int commentimg){
        this.commentcov=commentcov;
        this.commentcov2=commentcov2;
        this.commentimg=commentimg;
        this.commenttit=commenttit;
    }
    public String getcommenttit(){
        return commenttit;
    }
    public String getcommentcov(){
        return commentcov;
    }
    public String getcommentcov2(){
        return commentcov;
    }
    public int getcommentimg() {
        return commentimg;
    }
}