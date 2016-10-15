
package jp.mixi.assignment.recyclerview;

public class Book {

    private String mTitle;
    private String mPublisher;
    private int mPrice;

    public Book(String title, String publisher, int price) {
        super();
        mTitle = title;
        mPublisher = publisher;
        mPrice = price;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getPublisher() {
        return mPublisher;
    }
}
