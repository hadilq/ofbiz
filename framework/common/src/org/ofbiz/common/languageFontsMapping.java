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
import java.util.Locale;

import javolution.util.FastMap;


public final class languageFontsMapping {

    private static Map<String, String> localeFontsFamily = FastMap.newInstance();
    private static String defaultFontFamily = "Helvetica";

    static {
        localeFontsFamily.put("en", "Helvetica");
        localeFontsFamily.put("fa-IR", "Tahoma");
        localeFontsFamily.put("fa-IR-u-ca-jalali", "Tahoma");
        localeFontsFamily.put("fa-IR-u-ca-jalali-nu-persian", "Tahoma");
    }

    public static String getFontFamily(Locale locale) {
        String localeTag = locale.toLanguageTag();
        if (localeFontsFamily.containsKey(localeTag)) {
            return localeFontsFamily.get(localeTag);
        }
        return defaultFontFamily;
    }

    private static Map<String, String> localeInLineFontsFamily = FastMap.newInstance();
    private static String defaultInLineFontFamily = "Arial";

    static {
        localeInLineFontsFamily.put("en", "Arial");
        localeInLineFontsFamily.put("fa-IR", "Tahoma");
        localeInLineFontsFamily.put("fa-IR-u-ca-jalali", "Tahoma");
        localeInLineFontsFamily.put("fa-IR-u-ca-jalali-nu-persian", "Tahoma");
    }

    public static String getInLineFontFamily(Locale locale) {
        String localeTag = locale.toLanguageTag();
        if (localeInLineFontsFamily.containsKey(localeTag)) {
            return localeInLineFontsFamily.get(localeTag);
        }
        return defaultInLineFontFamily;
    }

}
