package multiThreading.packt.syncUtility.countdownLatch;

/**
 * Waiting for multiple concurrent events
 */
public class CLSimulator {
    public static void main(String... args) {
        final int participantCount = 100;
        final CLVideoConference conference = new CLVideoConference(100);
        final Thread conferenceThread = new Thread(conference);
        conferenceThread.start();
        for (int i = 0; i < participantCount; i++) {
            final CLParticipant participant = new CLParticipant(conference, "Participant " + i);
            final Thread participantThread = new Thread(participant);
            participantThread.start();
        }
    }
}
