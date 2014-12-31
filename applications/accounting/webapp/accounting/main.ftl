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
<div>
<table>
  <tr>
     <td colspan="3"><h1>${uiLabelMap.AccountingAgreements}</h1></td>
  </tr>

  <tr>
     <td colspan="3">
<ul>
<li><a href="<@ofbizUrl>FindAgreement</@ofbizUrl>">${uiLabelMap.AccountingAgreementAvailable}</a></li>
</ul>
<br />
     </td>
  </tr>
  <tr>
     <td colspan="3"><h1 class="h1">${uiLabelMap.AccountingBillingMenu}</h1></td>
  </tr>

  <tr>
     <td colspan="3">
<ul>
<li><a href="<@ofbizUrl>FindBillingAccount</@ofbizUrl>">${uiLabelMap.CommonShow} ${uiLabelMap.AccountingCustomer} ${uiLabelMap.AccountingBillingAccount}</a></li>
</ul>
<br />
     </td>
  </tr>

  <tr>
     <td colspan="3"><h1 class="h1">${uiLabelMap.AccountingFixedAssets}</h1></td>
  </tr>

  <tr>
     <td colspan="3">
<ul>
<li><a href="<@ofbizUrl>ListFixedAssets</@ofbizUrl>">${uiLabelMap.AccountingShowAllFixedAssets}</a></li>
</ul>
<br />
     </td>
  </tr>

  <tr>
     <td colspan="3"><h1 class="h1">${uiLabelMap.AccountingInvoicesMenu}</h1></td>
  </tr>

  <tr valign="top">
<td>
<ul>
<li><a href="<@ofbizUrl>findInvoices?noConditionFind=Y&amp;lookupFlag=Y</@ofbizUrl>">${uiLabelMap.AccountingShowAllInvoices}</a></li>
</ul>
</td>

<td>
<ul>
<#list invoiceTypes as invoiceType>
<li><a href="<@ofbizUrl>findInvoices?lookupFlag=Y&amp;invoiceTypeId=${invoiceType.invoiceTypeId}</@ofbizUrl>">${uiLabelMap.AccountingShowInvoices} ${invoiceType.get("description",locale)!invoiceType.invoiceTypeId}</a></li>
</#list>
</ul>
</td>
<td>
<ul>
<#list invoiceStatus as status>
<li><a href="<@ofbizUrl>findInvoices?lookupFlag=Y&amp;statusId=${status.statusId}</@ofbizUrl>">${uiLabelMap.AccountingShowInvoices} ${status.get("description",locale)!status.statusId}</a></li>
</#list>
</ul>
</td>
<td>
<ul>
<#assign invoicePatternKeys = ["patternName", "invoiceTypeId", "partyIdFrom", "partyId", "statusId", "billingAccountId", "referenceNumber", "description", "descriptionOperator", "descriptionIgnoreCase", "referenceNumberOperator", "referenceNumberIgnoreCase"]>
<#assign keysInForm = {"descriptionOperator":"description_op", "descriptionIgnoreCase":"description_ic", "referenceNumberOperator":"referenceNumber_op", "referenceNumberIgnoreCase":"referenceNumber_ic"}>
<#list invoicePatterns as invoicePattern>
<#assign param = "">
<#list invoicePatternKeys as key>
<#if invoicePattern[key]?has_content >
<#if keysInForm[key]?has_content>
<#assign param = param + "&amp;" + "${keysInForm[key]}" + "=" + "${invoicePattern[key]}">
<#else>
<#assign param = param + "&amp;" + "${key}" + "=" + "${invoicePattern[key]}">
</#if>
</#if>
</#list>
<li><div class="remove-button ui-corner-all" title="${uiLabelMap.CommonRemove}"><a class="ui-icon ui-icon-closethick" href="<@ofbizUrl>main?isRemoveInvoicePattern=Y&amp;invoicePatternSeqId=${invoicePattern.invoicePatternSeqId}</@ofbizUrl>">-</a></div><a class="remove-pair" href="<@ofbizUrl>findInvoices?noConditionFind=Y&amp;${param}</@ofbizUrl>">${invoicePattern.patternName}</a></li>
</#list>
</ul>
</td>
</tr>

  <tr>
     <td colspan="3"><h1 class="h1">${uiLabelMap.AccountingPaymentsMenu}</h1></td>
  </tr>

<tr valign="top">
<td>
<ul>
<li><a href="<@ofbizUrl>findPayments?noConditionFind=Y&amp;lookupFlag=Y</@ofbizUrl>">${uiLabelMap.AccountingShowAllPayments}</a></li>
</ul>
</td>
<td>

<ul>
<#list paymentTypes as paymentType>
<li><a href="<@ofbizUrl>findPayments?lookupFlag=Y&amp;paymentTypeId=${paymentType.paymentTypeId}</@ofbizUrl>">${uiLabelMap.AccountingShowPayments} ${paymentType.get("description",locale)!paymentType.paymentTypeId}</a></li>
</#list>
</ul>
</td>


<td>
<ul>
<#list paymentMethodTypes as paymentMethodType>
<li><a href="<@ofbizUrl>findPayments?lookupFlag=Y&amp;paymentMethodTypeId=${paymentMethodType.paymentMethodTypeId}</@ofbizUrl>">${uiLabelMap.AccountingShowPayments} ${paymentMethodType.get("description",locale)!paymentMethodType.paymentMethodTypeId}</a></li>
</#list>
</ul>
</td>

<td>
<ul>
<#list paymentStatus as status>
<li><a href="<@ofbizUrl>findPayments?lookupFlag=Y&amp;statusId=${status.statusId}</@ofbizUrl>">${uiLabelMap.AccountingShowPayments} ${status.get("description",locale)!status.statusId}</a></li>
</#list>
</ul>
</td>
</tr>
</table>
</div>
