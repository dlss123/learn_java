package chapter05;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;

public class DateTest {
    public static void main(String[] args) {
        System.out.println("周一\t周二\t周三\t周四\t周五" +
                "\t周六\t周日\t");
        Calendar fDate=Calendar.getInstance();
        fDate.set(Calendar.DAY_OF_MONTH,1);
        int maxDay=fDate.getMaximum(Calendar.DAY_OF_MONTH);
        for(int i=0;i<maxDay;i++){

        }


    }

}
class Aqq{

}
