package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int month = 5;
    int day = 1;
    int timeStampToDayUnit = 1000 * 3600 * 24;
    int year = date.getMonthValue() > month - 1 ? date.getYear() + 1 : date.getYear();
    LocalDate targetDate = LocalDate.of(year, month, day);
    long dateTimeStamp = date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
    long targetTimeStamp = targetDate.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().toEpochMilli();
    long dayTime = (targetTimeStamp - dateTimeStamp) / timeStampToDayUnit;

    return dayTime;
  }
}
