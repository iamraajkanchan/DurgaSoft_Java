package multiThreading.defogTech.threadLocal;

public class StringDateSource {

    public static void main(String... args) {
        for (String timing : getTimings()) {
            System.out.println(timing);
        }
    }

    public static String[] getTimings() {
        return new String[]{
                "1924-08-12 16:28:02",
                "2077-11-18 19:27:37",
                "2043-02-19 09:22:31",
                "1913-05-27 23:08:02",
                "1901-11-21 07:44:54",
                "1990-12-28 06:33:18",
                "2034-05-14 04:49:50",
                "1971-11-22 03:45:38",
                "2062-02-23 07:43:58",
                "2076-03-09 13:15:50"
        };
    }
}
