package ru.master.function;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.LongFunction;
import java.util.function.ToLongFunction;

public class Test1 {
  public void RunOne() {
    Map<Integer, String> map = new HashMap<>(Map.of(1, "num_1", 2, "num_2", 3, "num_3"));

    final String aDefault = map.getOrDefault(3, "default");
    System.out.println("aDefault: " + aDefault);
  }

  public void RunTwo() {
//    long l = 10_000_000_000L;
    long l = 3333333333L;
    LongFunction<Date> lfd = Date::new;

    final Date apply = lfd.apply(l);


    System.out.println("apply: " + apply);
  }

  public void RunThree() {
    Date d = new Date(1973, 8, 8);
    ToLongFunction<Date> tlfd = n -> n.toInstant().toEpochMilli();
    final long l = tlfd.applyAsLong(d);
    System.out.println("l: " + l);
  }


}
