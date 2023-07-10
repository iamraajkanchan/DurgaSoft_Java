package multiThreading.defogTech.threadLocal.safeThread;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class SafeDateFormatter extends ThreadLocal<SimpleDateFormat> {
    @Override
    protected SimpleDateFormat initialValue() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    }

    @Override
    public SimpleDateFormat get() {
        return super.get();
    }

}
