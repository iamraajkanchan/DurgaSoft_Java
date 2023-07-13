package multiThreading.packt.threadSynchronization.synchronizeAttributes;

import java.util.concurrent.TimeUnit;

/**
 * Arranging independent attributes in synchronized classes
 */
public class SynchronizeAttributesTicketOffice2 implements Runnable {
    private final SynchronizeAttributesCinema cinema;

    public SynchronizeAttributesTicketOffice2(SynchronizeAttributesCinema cinema) {
        this.cinema = cinema;
    }

    @Override
    public void run() {
        SynchronizeAttributesRespond respond1 = () -> cinema.sellTickets2(2);
        operate(respond1, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond2 = () -> cinema.sellTickets2(4);
        operate(respond2, 4, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond3 = () -> cinema.sellTickets1(2);
        operate(respond3, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond4 = () -> cinema.sellTickets1(1);
        operate(respond4, 1, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond5 = () -> cinema.returnTickets2(2);
        operate(respond5, 2, CinemaOperation.RETURNED);
        simulatePause();
        SynchronizeAttributesRespond respond6 = () -> cinema.sellTickets1(3);
        operate(respond6, 3, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond7 = () -> cinema.sellTickets2(2);
        operate(respond7, 2, CinemaOperation.SOLD);
        simulatePause();
        SynchronizeAttributesRespond respond8 = () -> cinema.sellTickets1(2);
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
            System.out.printf("Ticket Office 2 : %d tickets %s - Successfully\n", number, operation);
        } else {
            System.out.printf("Ticket Office 2 : %d tickets %s - Unsuccessfully\n", number, operation);
        }
    }
}

