package ra.bussinessImp;

import ra.bussiness.IShop;
import ra.config.Config;

import java.util.List;

public class Book implements IShop {
    int bookId;
    String bookName;
    String title;
    int numberOfPages;
    Author author;
    float importPrice;
    float exportPrice;
    int quantity;
    boolean bookStatus;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Book() {

    }

    public Book(int bookId, String bookName, String title, int numberOfPages, Author author, float importPrice, float exportPrice, int quantity, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData(List<Author> listAuthor) {
        System.out.println("Nhập vào tên sách: ");
        bookName = Config.scanner.nextLine();
        System.out.println("Nhập vào tiêu đề sách: ");
        title = Config.scanner.nextLine();
        System.out.println("Nhập vào số trang: ");
        numberOfPages = Integer.parseInt(Config.scanner.nextLine());
        System.out.println("Nhập vào giá nhập: ");
        importPrice = Integer.parseInt(Config.scanner.nextLine());
        exportPrice = importPrice*RATE;
        System.out.println("Nhập vào số lượng sách: ");
        quantity = Integer.parseInt(Config.scanner.nextLine());
        for (Author aut: listAuthor) {
            aut.displayData();
        }
        System.out.println("Chọn tác giả: ");
        int authorIdSelect = Integer.parseInt(Config.scanner.nextLine());
        for (Author aut: listAuthor) {
            if (aut.getAuthorId() == authorIdSelect) {
                author = aut;
            }
        }
        System.out.println("Nhập vào trạng thái sách (true/false): ");
        bookStatus = Boolean.parseBoolean(Config.scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("-----------------------------");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tên tác giả: " + author.authorName);
        System.out.println("Giá bán sách: " + exportPrice);
        System.out.println("Số lượng sách: " + quantity);
        System.out.println("Trạng thái sách: " + ((bookStatus)? "còn hàng" : "hết hàng"));
        System.out.println("-----------------------------");
    }
}
