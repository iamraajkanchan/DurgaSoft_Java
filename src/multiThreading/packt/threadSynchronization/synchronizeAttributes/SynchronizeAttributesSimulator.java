package multiThreading.packt.threadSynchronization.synchronizeAttributes;

/**
 * Arranging independent attributes in synchronized classes
 */
public class SynchronizeAttributesSimulator<K, V> {
    public static void main(String... args) {
        final SynchronizeAttributesCinema cinema = new SynchronizeAttributesCinema();
        final SynchronizeAttributesTicketOffice1 firstOffice = new SynchronizeAttributesTicketOffice1(cinema);
        final Thread firstOfficeTask = new Thread(firstOffice);
        final SynchronizeAttributesTicketOffice2 secondOffice = new SynchronizeAttributesTicketOffice2(cinema);
        final Thread secondOfficeTask = new Thread(secondOffice);
        firstOfficeTask.start();
        secondOfficeTask.start();
        try {
            firstOfficeTask.join();
            secondOfficeTask.join();
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        System.out.printf("Vacancies in First Office : %d\n", cinema.getVacanciesCinema1());
        System.out.printf("Vacancies in Second Office : %d\n", cinema.getVacanciesCinema2());
    }
}
