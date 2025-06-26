public class Book{
    private int id;
    private String title;
    private boolean isIssued;

    public Book(int id,String title){
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public int getId(){return id;}

    public String getTitle(){ return title; }
    public boolean isIssued() {return isIssued;}

    public void issue() {isIssued = true;}
    public void returned(){isIssued = false;}

    public String toString(){
        return "Book ID: " + id + ", Title: " + title + ", Issued: " + isIssued;
    }
}