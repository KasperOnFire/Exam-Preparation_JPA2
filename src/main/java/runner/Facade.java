package runner;

import entity.Book;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Facade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("kasper_Exam-Preparation_JPA2_jar_1.0-SNAPSHOTPU");
    EntityManager em;

    public void addBooks(List<Book> books) {
        em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            for (Book book : books) {
                em.persist(book);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
