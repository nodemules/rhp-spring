package com.nodemules.rhp.util;

import org.springframework.stereotype.Component;

/**
 * @author brent
 * @since 7/29/17.
 */
@Component
public final class TimeUtil {

  private static final int TWELVE_HOURS = 12;
  private static final String AM = "AM";
  private static final String PM = "PM";

  public static String getTime(int hour, int minute) {
    return getTime(hour, minute, true);
  }

  public static String getTime(int hour, int minute, boolean twelveHourDay) {
    StringBuilder sb = new StringBuilder();
    if (twelveHourDay) {
      int h = hour > TWELVE_HOURS ? hour - TWELVE_HOURS : hour;
      sb.append(h).append(":").append(minute).append(hour > h ? PM : AM);
    } else {
      sb.append(hour).append(minute);
    }
    return sb.toString();
  }

}
