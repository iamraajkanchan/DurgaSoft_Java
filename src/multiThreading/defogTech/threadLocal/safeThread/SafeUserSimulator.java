package multiThreading.defogTech.threadLocal.safeThread;

import multiThreading.defogTech.threadLocal.ThreadLocalUser;

public class SafeUserSimulator {

    public static class ThreadLocalService1 {
        public void processForChris() {
            ThreadLocalUser user = new ThreadLocalUser("Chris Homeland", "CEO", "9467567457");
            SafeUserFormatter.holder.set(user);
        }
    }

    public static class ThreadLocalService2 {
        public void processForChris() {
            // Here the user will get the same instance when called inside the same thread.
            ThreadLocalUser user = SafeUserFormatter.holder.get();
            // Note if you use the same method to get an instance of ThreadLocalUser in another thread then you will get null
            user.showDetails();
        }
    }

    public static void main(String... args) {
        final Runnable assignWorkForChris = () -> {
            ThreadLocalService1 assignService = new ThreadLocalService1();
            assignService.processForChris();
            ThreadLocalService2 fetchService = new ThreadLocalService2();
            fetchService.processForChris();
        };
        final Thread thread = new Thread(assignWorkForChris);
        thread.start();
    }
}
