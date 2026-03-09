public class Book {
    private String bookName;
    private String author;
    private int page;
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getPage(){
        return page;
    }
    public void setPage(int page){
        this.page=page;
    }
    public void checkBook(){
        if(page>300){
            System.out.println(bookName+"是厚书");
        }
        else {
            System.out.println(bookName+"是薄书");
        }
    }
}
