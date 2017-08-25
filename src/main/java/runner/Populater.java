package runner;

import entity.PaperBook;

public class Populater {

    Facade face = new Facade();

    public void fillDB() {
        createEbooks();
        createPaperBooks();
    }

    private void createPaperBooks() {
        PaperBook b1 = new PaperBook();
        b1.setAuthor("Hemingway");
        b1.setTitle("For Whom the Bell Tolls");
        b1.setId((long) 1);
        b1.setInStock(250);
        b1.setShippingWeight(200.0);

    }

    private void createEbooks() {
    }

}
