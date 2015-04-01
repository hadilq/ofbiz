/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package org.ofbiz.base.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.ofbiz.base.util.UtilDateTime;

/**
 * A class to simply switch between com.ibm.icu.util.Calendar and java.util.Calendar
 * classes.
*/
public class Calendar {

    /**
     * This is the parameter that define this calender work as
     * com.ibm.icu.util.Calendar or as java.util.Calendar
    */
    public final static boolean isICU = true;

    /**
     * An instance when we choose isICU == true
    */
    public com.ibm.icu.util.Calendar icuCalendar = null;

    /**
     * An instance when we choose isICU == false
    */
    public java.util.Calendar javaCalendar = null;

    /**
     * Convert java.util.TimeZone to com.ibm.icu.util.TimeZone
    */
    private static com.ibm.icu.util.TimeZone toICUTimeZone(java.util.TimeZone tz) {
        if (tz == null) {
            return com.ibm.icu.util.TimeZone.getDefault();
        }
        return com.ibm.icu.util.TimeZone.getTimeZone(tz.getID());
    }

    /**
     * Convert com.ibm.icu.util.TimeZone to java.util.TimeZone
    */
    private static java.util.TimeZone fromICUTimeZone(com.ibm.icu.util.TimeZone tz) {
        return java.util.TimeZone.getTimeZone(tz.getID());
    }

    /**
     * Language tag of farsi with Jalali Calendar in ICU library
    */
    private static final String ICU_FA_JALALI_TAG = "fa_IR@calendar=persian";

    /**
     * Convert java.util.Locale to com.ibm.icu.util.ULocale
    */
    private static com.ibm.icu.util.ULocale toICULocale(java.util.Locale locale) {
        String localeTag = null;
        if (locale == null) {
            localeTag = com.ibm.icu.util.ULocale.getDefault().toLanguageTag();
        } else {
            localeTag = locale.toLanguageTag();
        }
        com.ibm.icu.util.ULocale ulocale = null;
        if (localeTag.equals(UtilDateTime.FA_JALALI_PERSIAN_TAG)
            || localeTag.equals(UtilDateTime.FA_JALALI_TAG)) {
            ulocale = new com.ibm.icu.util.ULocale(ICU_FA_JALALI_TAG);
        } else {
            ulocale = new com.ibm.icu.util.ULocale(localeTag);
        }
        return ulocale;
    }

    /**
     * java.util.Calendar doesn't keep the locale! So we do this for it
    */
    public Locale locale = null;

    /**
     * All parameters that both com.ibm.icu.util.Calendar and
     * java.util.Calendar have.
    */
    public final static int ERA = 0;
    public final static int YEAR = 1;
    public final static int MONTH = 2;
    public final static int WEEK_OF_YEAR = 3;
    public final static int WEEK_OF_MONTH = 4;
    public final static int DATE = 5;
    public final static int DAY_OF_MONTH = 5;
    public final static int DAY_OF_YEAR = 6;
    public final static int DAY_OF_WEEK = 7;
    public final static int DAY_OF_WEEK_IN_MONTH = 8;
    public final static int AM_PM = 9;
    public final static int HOUR = 10;
    public final static int HOUR_OF_DAY = 11;
    public final static int MINUTE = 12;
    public final static int SECOND = 13;
    public final static int MILLISECOND = 14;
    public final static int ZONE_OFFSET = 15;
    public final static int DST_OFFSET = 16;

    public final static int SUNDAY = 1;
    public final static int MONDAY = 2;
    public final static int TUESDAY = 3;
    public final static int WEDNESDAY = 4;
    public final static int THURSDAY = 5;
    public final static int FRIDAY = 6;
    public final static int SATURDAY = 7;
    public final static int JANUARY = 0;
    public final static int FEBRUARY = 1;
    public final static int MARCH = 2;
    public final static int APRIL = 3;
    public final static int MAY = 4;
    public final static int JUNE = 5;
    public final static int JULY = 6;
    public final static int AUGUST = 7;
    public final static int SEPTEMBER = 8;
    public final static int OCTOBER = 9;
    public final static int NOVEMBER = 10;
    public final static int DECEMBER = 11;
    public final static int UNDECIMBER = 12;
    public final static int AM = 0;
    public final static int PM = 1;

    public static Calendar getInstance() {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = com.ibm.icu.util.Calendar.getInstance();
        } else {
            cal.locale = Locale.getDefault();
            cal.javaCalendar = java.util.Calendar.getInstance();
        }
        return cal;
    }


    public static Calendar getInstance(TimeZone zone) {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = com.ibm.icu.util.Calendar.getInstance(toICUTimeZone(zone));
        } else {
            cal.locale = Locale.getDefault();
            cal.javaCalendar = java.util.Calendar.getInstance(zone);
        }
        return cal;
    }

    public static Calendar getInstance(com.ibm.icu.util.TimeZone zone) {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = com.ibm.icu.util.Calendar.getInstance(zone);
        } else {
            cal.locale = Locale.getDefault();
            cal.javaCalendar = java.util.Calendar.getInstance(fromICUTimeZone(zone));
        }
        return cal;
    }

    public static Calendar getInstance(Locale aLocale) {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = com.ibm.icu.util.Calendar.getInstance(toICULocale(aLocale));
        } else {
            if (aLocale == null) {
                cal.locale = Locale.getDefault();
            } else {
                cal.locale = aLocale;
            }
            cal.javaCalendar = java.util.Calendar.getInstance(aLocale);
        }
        return cal;
    }


    public static Calendar getInstance(TimeZone zone,
                                        Locale aLocale)
    {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = com.ibm.icu.util.Calendar.getInstance(toICUTimeZone(zone)
                                                                , toICULocale(aLocale));
        } else {
            if (aLocale == null) {
                cal.locale = Locale.getDefault();
            } else {
                cal.locale = aLocale;
            }
            cal.javaCalendar = java.util.Calendar.getInstance(zone, aLocale);
        }
        return cal;
    }

    public final Date getTime() {
        if (isICU) {
            return icuCalendar.getTime();
        }
        return javaCalendar.getTime();
    }

    public final void setTime(Date date) {
        if (isICU) {
            icuCalendar.setTime(date);
            return;
        } else {
            javaCalendar.setTime(date);
        }
    }

    public long getTimeInMillis() {
        if (isICU) {
            return icuCalendar.getTimeInMillis();
        }
        return javaCalendar.getTimeInMillis();
    }

    public void setTimeInMillis(long millis) {
        if (isICU) {
            icuCalendar.setTimeInMillis(millis);
        } else {
            javaCalendar.setTimeInMillis(millis);
        }
    }

    public int get(int field) {
        if (isICU) {
            return icuCalendar.get(field);
        }
        return javaCalendar.get(field);
    }

    public void set(int field, int value) {
        if (isICU) {
            icuCalendar.set(field, value);
        } else {
            javaCalendar.set(field, value);
        }
    }

    public final void set(int year, int month, int date) {
        if (isICU) {
            icuCalendar.set(year, month, date);
        } else {
            javaCalendar.set(year, month, date);
        }
    }

    public final void set(int year, int month, int date, int hourOfDay, int minute) {
        if (isICU) {
            icuCalendar.set(year, month, date, hourOfDay, minute);
        } else {
            javaCalendar.set(year, month, date, hourOfDay, minute);
        }
    }

    public final void set(int year, int month, int date, int hourOfDay, int minute,
                            int second)
    {
        if (isICU) {
            icuCalendar.set(year, month, date, hourOfDay, minute, second);
        } else {
            javaCalendar.set(year, month, date, hourOfDay, minute, second);
        }
    }

    public final void clear() {
        if (isICU) {
            icuCalendar.clear();
        } else {
            javaCalendar.clear();
        }
    }

    public final void clear(int field) {
        if (isICU) {
            icuCalendar.clear(field);
        } else {
            javaCalendar.clear(field);
        }
    }

    public final boolean isSet(int field) {
        if (isICU) {
            return icuCalendar.isSet(field);
        }
        return javaCalendar.isSet(field);
    }

    public boolean equals(Object obj) {
        if (isICU) {
            return icuCalendar.equals(obj);
        }
        return javaCalendar.equals(obj);
    }

    public int hashCode() {
        if (isICU) {
            return icuCalendar.hashCode();
        }
        return javaCalendar.hashCode();
    }

    public boolean before(Object when) {
        if (isICU) {
            return icuCalendar.before(((Calendar) when).icuCalendar);
        }
        return javaCalendar.before(((Calendar) when).javaCalendar);
    }

    public boolean after(Object when) {
        if (isICU) {
            return icuCalendar.after(((Calendar) when).icuCalendar);
        }
        return javaCalendar.after(((Calendar) when).javaCalendar);
    }

    public int compareTo(Calendar anotherCalendar) {
        if (isICU) {
            return icuCalendar.compareTo(anotherCalendar.icuCalendar);
        }
        return javaCalendar.compareTo(anotherCalendar.javaCalendar);
    }

    public void add(int field, int amount) {
        if (isICU) {
            icuCalendar.add(field, amount);
        } else {
            javaCalendar.add(field, amount);
        }
    }

    public void roll(int field, boolean up) {
        if (isICU) {
            icuCalendar.roll(field, up);
        } else {
            javaCalendar.roll(field, up);
        }
    };

    public void roll(int field, int amount) {
        if (isICU) {
            icuCalendar.roll(field, amount);
        } else {
            javaCalendar.roll(field, amount);
        }
    }

    public void setTimeZone(TimeZone value) {
        if (isICU) {
            icuCalendar.setTimeZone(toICUTimeZone(value));
        } else {
            javaCalendar.setTimeZone(value);
        }
    }

    public TimeZone getTimeZone()
    {
        if (isICU) {
            return fromICUTimeZone(icuCalendar.getTimeZone());
        }
        return javaCalendar.getTimeZone();
    }

    public void setLenient(boolean lenient)
    {
        if (isICU) {
            icuCalendar.setLenient(lenient);
        } else {
            javaCalendar.setLenient(lenient);
        }
    }

    public void setFirstDayOfWeek(int value)
    {
        if (isICU) {
            icuCalendar.setFirstDayOfWeek(value);
        } else {
            javaCalendar.setFirstDayOfWeek(value);
        }
    }

    public int getFirstDayOfWeek()
    {
        if (isICU) {
            return icuCalendar.getFirstDayOfWeek();
        }
        return javaCalendar.getFirstDayOfWeek();
    }

    public void setMinimalDaysInFirstWeek(int value)
    {
        if (isICU) {
            icuCalendar.setMinimalDaysInFirstWeek(value);
        } else {
            javaCalendar.setMinimalDaysInFirstWeek(value);
        }
    }

    public int getMinimum(int field) {
        if (isICU) {
            return icuCalendar.getMinimum(field);
        }
        return javaCalendar.getMinimum(field);
    }

    public int getMaximum(int field) {
        if (isICU) {
            return icuCalendar.getMaximum(field);
        }
        return javaCalendar.getMaximum(field);
    }

    public int getGreatestMinimum(int field) {
        if (isICU) {
            return icuCalendar.getGreatestMinimum(field);
        }
        return javaCalendar.getGreatestMinimum(field);
    }

    public int getLeastMaximum(int field) {
        if (isICU) {
            return icuCalendar.getLeastMaximum(field);
        }
        return javaCalendar.getLeastMaximum(field);
    }

    public int getActualMinimum(int field) {
        if (isICU) {
            return icuCalendar.getActualMinimum(field);
        }
        return javaCalendar.getActualMinimum(field);
    }

    public int getActualMaximum(int field) {
        if (isICU) {
            return icuCalendar.getActualMaximum(field);
        }
        return javaCalendar.getActualMaximum(field);
    }

    public Object clone() {
        Calendar cal = new Calendar();
        if (isICU) {
            cal.icuCalendar = (com.ibm.icu.util.Calendar) icuCalendar.clone();
        } else {
            cal.locale = (Locale) locale.clone();
            cal.javaCalendar = (java.util.Calendar) javaCalendar.clone();
        }
        return cal;
    }

    public String toString() {
        if (isICU) {
            return icuCalendar.toString();
        }
    return javaCalendar.toString();
    }

    public Locale getLocale() {
        if (isICU) {
            return icuCalendar.getLocale(com.ibm.icu.util.ULocale.VALID_LOCALE).toLocale();
        }
        return locale;
    }

    public String getDisplay() {
        Locale locale = getLocale();
        TimeZone timeZone = getTimeZone();
        DateFormat df = UtilDateTime.toDateTimeFormat(timeZone, locale);
        return df.format(this.getTime());
    }
}
