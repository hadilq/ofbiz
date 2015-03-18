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

<#if security.hasEntityPermission("ORDERMGR", "_VIEW", session)>
<div class="screenlet">
    <div class="screenlet-title-bar">
      <h3>${uiLabelMap.OrderOrderStatisticsPage}</h3>
    </div>
    <div class="screenlet-body">
        <table class="basic-table" cellspacing='0'>
          <tr class="label">
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td class="opposite-align-text">${uiLabelMap.CommonToday}</td>
            <td class="opposite-align-text">${uiLabelMap.OrderWTD}</td>
            <td class="opposite-align-text">${uiLabelMap.OrderMTD}</td>
            <td class="opposite-align-text">${uiLabelMap.OrderYTD}</td>
          </tr>
          <tr>
          <td colspan="2">&nbsp;</td>
          <td colspan="4"><hr /></td></tr>
          <tr>
            <td class="label">${uiLabelMap.OrderOrdersTotals}</td>
            <td colspan="5">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderGrossDollarAmountsIncludesAdjustmentsAndPendingOrders}</td>
            <td class="opposite-align-text">${dayItemTotal}</td>
            <td class="opposite-align-text">${weekItemTotal}</td>
            <td class="opposite-align-text">${monthItemTotal}</td>
            <td class="opposite-align-text">${yearItemTotal}</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderPaidDollarAmountsIncludesAdjustments}</td>
            <td class="opposite-align-text">${dayItemTotalPaid}</td>
            <td class="opposite-align-text">${weekItemTotalPaid}</td>
            <td class="opposite-align-text">${monthItemTotalPaid}</td>
            <td class="opposite-align-text">${yearItemTotalPaid}</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderPendingPaymentDollarAmountsIncludesAdjustments}</td>
            <td class="opposite-align-text">${dayItemTotalPending}</td>
            <td class="opposite-align-text">${weekItemTotalPending}</td>
            <td class="opposite-align-text">${monthItemTotalPending}</td>
            <td class="opposite-align-text">${yearItemTotalPending}</td>
          </tr>
          <tr><td colspan="6"><hr /></td></tr>
          <tr>
            <td class="label">${uiLabelMap.OrderOrdersItemCounts}</td>
            <td colspan="5">&nbsp;</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderGrossItemsSoldIncludesPromotionsAndPendingOrders}</td>
            <td class="opposite-align-text">${dayItemCount?string.number}</td>
            <td class="opposite-align-text">${weekItemCount?string.number}</td>
            <td class="opposite-align-text">${monthItemCount?string.number}</td>
            <td class="opposite-align-text">${yearItemCount?string.number}</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderPaidItemsSoldIncludesPromotions}</td>
            <td class="opposite-align-text">${dayItemCountPaid?string.number}</td>
            <td class="opposite-align-text">${weekItemCountPaid?string.number}</td>
            <td class="opposite-align-text">${monthItemCountPaid?string.number}</td>
            <td class="opposite-align-text">${yearItemCountPaid?string.number}</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderPendingPaymentItemsSoldIncludesPromotions}</td>
            <td class="opposite-align-text">${dayItemCountPending?string.number}</td>
            <td class="opposite-align-text">${weekItemCountPending?string.number}</td>
            <td class="opposite-align-text">${monthItemCountPending?string.number}</td>
            <td class="opposite-align-text">${yearItemCountPending?string.number}</td>
          </tr>
          <tr><td colspan="6"><hr /></td></tr>
          <tr>
            <td class="label">${uiLabelMap.OrderOrdersPending}</td>
            <td colspan="5">&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderWaitingPayment}</td>
            <td class="opposite-align-text">${waitingPayment?default(0)?string.number}</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderWaitingApproval}</td>
            <td class="opposite-align-text">${waitingApproval?default(0)?string.number}</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderWaitingCompletion}</td>
            <td class="opposite-align-text">${waitingComplete?default(0)?string.number}</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
            <td class="opposite-align-text">--</td>
          </tr>
          <tr><td colspan="6"><hr /></td></tr>
          <tr>
            <td class="label">${uiLabelMap.OrderStatusChanges}</td>
            <td colspan="5">&nbsp;</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderCreated}</td>
            <td class="opposite-align-text">${dayOrder?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${weekOrder?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${monthOrder?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${yearOrder?size?default(0)?string.number}</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderApproved}</td>
            <td class="opposite-align-text">${dayApprove?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${weekApprove?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${monthApprove?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${yearApprove?size?default(0)?string.number}</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderCompleted}</td>
            <td class="opposite-align-text">${dayComplete?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${weekComplete?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${monthComplete?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${yearComplete?size?default(0)?string.number}</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderCancelled}</td>
            <td class="opposite-align-text">${dayCancelled?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${weekCancelled?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${monthCancelled?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${yearCancelled?size?default(0)?string.number}</td>
          </tr>
          <tr class="alternate-row">
            <td>&nbsp;</td>
            <td>${uiLabelMap.OrderRejected}</td>
            <td class="opposite-align-text">${dayRejected?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${weekRejected?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${monthRejected?size?default(0)?string.number}</td>
            <td class="opposite-align-text">${yearRejected?size?default(0)?string.number}</td>
          </tr>
        </table>
    </div>
</div>
<#else>
  <h3>${uiLabelMap.OrderViewPermissionError}</h3>
</#if>
