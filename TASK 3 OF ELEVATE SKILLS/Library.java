import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();
    private Map<Integer, Integer> issuedBooks = new HashMap<>(); // bookId -> userId

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBook(bookId);
        User user = findUser(userId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book.isIssued()) {
            System.out.println("Book already issued.");
            return;
        }

        book.issue();
        issuedBooks.put(bookId, userId);
        System.out.println("Book issued to user: " + user.getName());
    }

    public void returnBook(int bookId) {
        Book book = findBook(bookId);
        if (book != null && book.isIssued()) {
            book.returned();
            issuedBooks.remove(bookId);
            System.out.println("Book returned.");
        } else {
            System.out.println("Book is not currently issued.");
        }
    }

    public void viewBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    private Book findBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) return book;
        }
        return null;
    }

    private User findUser(int id) {
        for (User user : users) {
            if (user.getId() == id) return user;
        }
        return null;
    }
}
