<#--
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
-->
<<<<<<< HEAD
<#assign docLangAttr = locale.toString()?replace("_", "-")>
<<<<<<< HEAD
<#assign langDir = "ltr">
<#if "ar.iw"?contains(docLangAttr?substring(0, 2))>
=======
=======
<#assign docLangAttr = locale.toLanguageTag()>
<<<<<<< HEAD
>>>>>>> 55bc110... modifying avalableLocales and listLocales to use Locale.forLanguageTag instead of toString
<#assign RightToLeftLocales = Static["org.ofbiz.base.util.UtilMisc"].RightToLeftLocales()/>
<#assign langDir = "ltr">
<#if RightToLeftLocales?contains(docLangAttr?substring(0, 2))>
>>>>>>> df11098... ofbiz-commit
=======
<#assign rightToLeftLocales = Static["org.ofbiz.base.util.UtilMisc"].rightToLeftLocales()/>
<#assign langDir = "ltr">
<#if rightToLeftLocales?contains(docLangAttr?substring(0, 2))>
>>>>>>> 8429f5f... after solving error of UtilHttp of time-dropdown
    <#assign langDir = "rtl">
</#if>
<html lang="${docLangAttr?substring(0, 2)}" xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  </head>
  <body>
<#--<br class="clear" />-->
