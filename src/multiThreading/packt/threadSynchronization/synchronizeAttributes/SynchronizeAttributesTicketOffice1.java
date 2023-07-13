package multiThreading.packt.threadSynchronization.synchronizeAttributes;

import java.util.concurrent.TimeUnit;

/**
 * Arranging independent attributes in synchronized classes
 */
public class SynchronizeAttributesTicketOffice1 implements Runnable {
    private final SynchronizeAttributesCinema cinema;

    public SynchronizeAttributesTicketOffice1(SynchronizeAttributesCinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        SynchronizeAttributesRespond respond1 = () -> cinema.sellTickets1(3);
        operate(respond1, 3, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond2 = () -> cinema.sellTickets1(2);
        operate(respond2, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond3 = () -> cinema.sellTickets2(2);
        operate(respond3, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond4 = () -> cinema.returnTickets1(3);
        operate(respond4, 3, CinemaOperation.RETURNED);
        simulatePause();
        SynchronizeAttributesRespond respond5 = () -> cinema.sellTickets1(5);
        operate(respond5, 5, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond6 = () -> cinema.sellTickets2(2);
        operate(respond6, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond7 = () -> cinema.sellTickets2(2);
        operate(respond7, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond8 = () -> cinema.sellTickets2(2);
        operate(respond8, 2, CinemaOperation.SOLD);
        simulatePause();
    }

    private void simulatePause() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }

    private void operate(SynchronizeAttributesRespond respond, int number, CinemaOperation operation) {
        if (respond.isSuccess()) {
            System.out.printf("Ticket Office 1 : %d tickets %s - Successfully\n", number, operation);
        } else {
            System.out.printf("Ticket Office 1 : %d tickets %s - Unsuccessfully\n", number, operation);
        }
    }

}
