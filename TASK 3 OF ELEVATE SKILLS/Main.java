public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(1, "Harry Potter"));
        lib.addBook(new Book(2, "The Hobbit"));

        lib.addUser(new User(101, "Alice"));
        lib.addUser(new User(102, "Bob"));

        lib.viewBooks();
        lib.viewUsers();

        lib.issueBook(1, 101);
        lib.issueBook(1, 102);  // Already issued

        lib.returnBook(1);
        lib.issueBook(1, 102);  // Now possible
    }
}
