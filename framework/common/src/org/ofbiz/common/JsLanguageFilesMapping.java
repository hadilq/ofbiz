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


package org.ofbiz.common;

import java.util.Map;

import javolution.util.FastMap;


public final class JsLanguageFilesMapping {

    // DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA CHANGE
    // Rather use the createJsLanguageFileMapping service to create or update it. You will still need to compile thereafter

    public static class datejs {

        private static Map<String, String> localeFiles = FastMap.newInstance();
        private static String defaultDateJs = "/images/jquery/plugins/datejs/date-en-US.js";

        static {
            localeFiles.put("en", "/images/jquery/plugins/datejs/date-en-US.js");
            localeFiles.put("fa-IR", "/images/jquery/plugins/datejs/date-fa-IR.js");
            localeFiles.put("fa-IR-u-ca-jalali", "/images/jquery/plugins/datejs/date-fa-IR.js");
            localeFiles.put("fa-IR-u-ca-jalali-nu-persian", "/images/jquery/plugins/datejs/date-fa-IR.js");
        }

        public static String getFilePath(String locale) {
            if (datejs.localeFiles.containsKey(locale)) {
                return datejs.localeFiles.get(locale);
            }
            return datejs.defaultDateJs;
        }

    }

    public static class jquery {
        private static Map<String, String> localeFiles = FastMap.newInstance();
        private static String defaultDateJs = "/images/jquery/ui/i18n/jquery.ui.datepicker-en.js";

        static {
            localeFiles.put("en", "/images/jquery/ui/i18n/jquery.ui.datepicker-en.js");
            localeFiles.put("fa-IR", "/images/jquery/ui/i18n/jquery.ui.datepicker-fa-IR.js");
            localeFiles.put("fa-IR-u-ca-jalali", "/images/jquery/ui/i18n/jquery.ui.datepicker-fa-IR-u-ca-jalali.js");
            localeFiles.put("fa-IR-u-ca-jalali-nu-persian", "/images/jquery/ui/i18n/jquery.ui.datepicker-fa-IR-u-ca-jalali-nu-persian.js");
        }

        public static String getFilePath(String locale) {
            if (datejs.localeFiles.containsKey(locale)) {
                return jquery.localeFiles.get(locale);
            }
            return jquery.defaultDateJs;
        }

    }

    public static class validation {
        private static Map<String, String> localeFiles = FastMap.newInstance();
        private static String defaultValidation = "/images/webapp/images/jquery/plugins/validate/localization/messages_en.js";

        static {
            localeFiles.put("en", "/images/jquery/plugins/validate/localization/messages_en.js");
            localeFiles.put("fa-IR", "/images/jquery/plugins/validate/localization/messages_fa.js");
            localeFiles.put("fa-IR-u-ca-jalali", "/images/jquery/plugins/validate/localization/messages_fa.js");
            localeFiles.put("fa-IR-u-ca-jalali-nu-persian", "/images/jquery/plugins/validate/localization/messages_fa.js");
        }

        public static String getFilePath(String locale) {
            if (validation.localeFiles.containsKey(locale)) {
                return validation.localeFiles.get(locale);
            }
            return validation.defaultValidation;
        }
    }

    public static class dateTime {
        private static Map<String, String> localeFiles = FastMap.newInstance();
        private static String defaultDateTime = "/images/webapp/images/jquery/ui/i18n/jquery.ui.datepicker-en.js";

        static {
            localeFiles.put("en", "/images/jquery/plugins/datetimepicker/localization/jquery-ui-timepicker-en.js");
            localeFiles.put("fa-IR", "/images/jquery/plugins/datetimepicker/localization/jquery-ui-timepicker-fa.js");
            localeFiles.put("fa-IR-u-ca-jalali", "/images/jquery/plugins/datetimepicker/localization/jquery-ui-timepicker-fa.js");
            localeFiles.put("fa-IR-u-ca-jalali-nu-persian", "/images/jquery/plugins/datetimepicker/localization/jquery-ui-timepicker-fa.js");
        }

        public static String getFilePath(String locale) {
            if (dateTime.localeFiles.containsKey(locale)) {
                return dateTime.localeFiles.get(locale);
            }
            return dateTime.defaultDateTime;
        }
    }
}
