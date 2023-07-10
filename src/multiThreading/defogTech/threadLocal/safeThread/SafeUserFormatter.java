package multiThreading.defogTech.threadLocal.safeThread;

import multiThreading.defogTech.threadLocal.ThreadLocalUser;

public class SafeUserFormatter {
    public static ThreadLocal<ThreadLocalUser> holder = new ThreadLocal<>();
}
