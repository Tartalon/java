package book;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setAuthor("Author1");
        content.setContent("Some long content");
        title.setTitle("Title");

        author.show();
        title.show();
        content.show();
    }
}
