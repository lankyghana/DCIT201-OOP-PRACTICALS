public class BookDetails {
    private String title;
    private String author;
    private int numberOfPages;
    private int currentPage = 1;

    public BookDetails(String title, String author, int numberOfPages, int currentPage){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.currentPage = currentPage;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }
    public int nextPage(int currentPage){
        if (this.currentPage < numberOfPages){
            return currentPage + 1;
        }
        return currentPage;
    }
    public int previousPage(int currentPage){
        if (this.currentPage > 1){
            return currentPage - 1;
        }
        return currentPage;
    }
    public static void main(String[] args) {
        BookDetails book1 = new BookDetails("Deep Learning", "Aaron Courville", 1000, 25);
        int currentPage = 1;

        System.out.println("The Current Page is: " + currentPage);

        currentPage = book1.nextPage(currentPage);
        System.out.println("The Next Page is: " + currentPage);

        currentPage = book1.previousPage(currentPage);
        System.out.println("The Previous Page is: " + currentPage);
    }

}
