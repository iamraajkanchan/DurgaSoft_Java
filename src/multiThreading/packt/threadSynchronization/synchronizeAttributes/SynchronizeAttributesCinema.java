package multiThreading.packt.threadSynchronization.synchronizeAttributes;

/**
 * Arranging independent attributes in synchronized classes
 * */
public class SynchronizeAttributesCinema {
    private long vacanciesCinema1;
    private long vacanciesCinema2;
    private final Object controlCinema1;
    private final Object controlCinema2;

    public SynchronizeAttributesCinema() {
        controlCinema1 = new Object();
        controlCinema2 = new Object();
        vacanciesCinema1 = 20;
        vacanciesCinema2 = 20;
    }

    public long getVacanciesCinema1() {
        return this.vacanciesCinema1;
    }

    public long getVacanciesCinema2() {
        return this.vacanciesCinema2;
    }

    public boolean sellTickets1(int number) {
        synchronized (controlCinema1) {
            if (number < vacanciesCinema1) {
                vacanciesCinema1 -= number;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean sellTickets2(int number) {
        synchronized (controlCinema2) {
            if (number < vacanciesCinema2) {
                vacanciesCinema2 -= number;
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean returnTickets1(int number) {
        synchronized (controlCinema1) {
            vacanciesCinema1 += number;
            return true;
        }
    }

    public boolean returnTickets2(int number) {
        synchronized (controlCinema2) {
            vacanciesCinema2 += number;
            return true;
        }
    }
}
