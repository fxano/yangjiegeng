package demo.com.adapter;
public class Collect {
    private String collecttit;
    private String collectcov;
    private int collectimg;
    public Collect(String collectcov,String collecttit,int collectimg){
        this.collectcov=collectcov;
        this.collectimg=collectimg;
        this.collecttit=collecttit;
    }
    public String getCollecttit(){
        return collecttit;
    }
    public String getCollectcov(){
        return collectcov;
    }
    public int getCollectimg() {
        return collectimg;
    }
}