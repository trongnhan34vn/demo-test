package ra.run;

import ra.bussinessImp.Author;
import ra.bussinessImp.Book;
import ra.config.Config;

import java.util.ArrayList;
import java.util.List;

public class BookManagement {
    public static void main(String[] args) {
        List<Author> listAuthors = new ArrayList<>();
        List<Book> listBooks = new ArrayList<>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập số tác giả và nhập thông tin các tác giả\n" +
                    "2. Nhập số sách và nhập thông tin các sách\n" +
                    "3. Sắp xếp sách theo giá xuất sách tăng dần (Comparable/Comparator)\n" +
                    "4. Tìm kiếm sách theo tên tác giả sách\n" +
                    "5. Thoát");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(Config.scanner.nextLine());
            switch (choice) {
                case 1:
//                    Thêm mới n tác giả
                    createAuthor(listAuthors);
                    break;
                case 2:
//                    Thêm mới n sách
                    createBooks(listBooks,listAuthors);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    public static void createAuthor(List<Author> list) {
        System.out.println("Nhập số tác giả: ");
        int mount = Integer.parseInt(Config.scanner.nextLine());
        for (int i = 0; i < mount; i++) {
            System.out.println("Nhập vào thông tin tác giả thứ " + (i + 1));
            Author newAuthor = new Author();
            newAuthor.inputData(list);
            if (list.isEmpty()) {
                newAuthor.setAuthorId(1);
            } else {
                newAuthor.setAuthorId(list.get(list.size() - 1).getAuthorId() + 1);
            }
            list.add(newAuthor);
        }
        System.out.println("Thêm mới thành công!");
        displayAuthors(list);
    }

    public static void createBooks(List<Book> listBooks, List<Author> listAuthors) {
        System.out.println("Nhập số sách: ");
        int mount = Integer.parseInt(Config.scanner.nextLine());
        for (int i = 0; i < mount; i++) {
            System.out.println("Nhập vào thông tin sách thứ " + (i + 1));
            Book newBook = new Book();
            if (listBooks.isEmpty()) {
                newBook.setBookId(1);
            } else {
                newBook.setBookId(listBooks.get(listBooks.size() - 1).getBookId() + 1);
            }
            newBook.inputData(listAuthors);
            listBooks.add(newBook);
        }
        displayBooks(listBooks);
    }

    public static void displayAuthors(List<Author> list) {
        for (Author aut : list) {
            aut.displayData();
        }
    }

    public static void displayBooks(List<Book> list) {
        for (Book book : list) {
            book.displayData();
        }
    }
}
