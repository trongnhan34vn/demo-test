package ra.bussinessImp;

import ra.config.Config;
import ra.bussiness.IShop;

import java.util.List;

public class Author implements IShop {
    int authorId;
    String authorName;
    boolean sex;
    int year;

    public Author() {
    }

    public Author(int authorId, String authorName, boolean sex, int year) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.sex = sex;
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void inputData(List<Author> list) {
        System.out.println("Nhập vào tên tác giả: ");
        authorName = Config.scanner.nextLine();
        System.out.println("Nhập vào giới tính (true/false): ");
        sex = Boolean.parseBoolean(Config.scanner.nextLine());
        System.out.println("Nhập vào năm sinh tác giả: ");
        year = Integer.parseInt(Config.scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("-----------------------------");
        System.out.println("Mã tác giả: " + authorId);
        System.out.println("Tên tác giả: " + authorName);
        System.out.println("-----------------------------");
    }
}
