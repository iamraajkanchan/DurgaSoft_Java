package multiThreading.packt.chapter1.daemonThread;

import java.util.Date;

/**
 * Creating and running a daemon thread
 * */
public class DaemonThreadEvent {
    private Date date;
    private String event;
    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getEvent() {
        return this.event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
}
