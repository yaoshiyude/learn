package learnTest.java数据结构;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @description:
 * @author: yaoshiyu
 * @create: 2020-03-03 15:53
 **/

public class TimeTest {

    public static final String YYYYMMDD = "yyyyMMdd";


    public static void main(String[] args) {

        try {
            System.out.println(getDayBeforeStr2("20200302",1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static String getDayBeforeStr2(String time, int day) throws ParseException {
        Date d = new SimpleDateFormat("yyyyMMdd").parse(time);
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return format(now.getTime(), YYYYMMDD);
    }

    public static String format(Date date, String pattern) {
        return new SimpleDateFormat(pattern).format(date);
    }
}
