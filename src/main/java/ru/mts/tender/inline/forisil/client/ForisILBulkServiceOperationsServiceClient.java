/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mts.tender.inline.forisil.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 */
public class ForisILBulkServiceOperationsServiceClient {

    private static Logger log = LoggerFactory.getLogger(ForisILBulkServiceOperationsServiceClient.class);

// создаем объект уровня «Service» - один для всего класса
//    private static final MonitoringNotifier ntf = MonitoringNotifier.create("V1FasadeForisILBulkServiceOperationsWS");
    public String getBalances(String msisdn) {
        // Создаем сообщение уровня «Method» (имя задается явно)
//        SimpleMethodEventev = SimpleMethodEvent.startMethod(ntf, "getBalances");
        java.lang.String result;

        try { // Call Web Service Operation
            ru.mts.tender.inline.forisil.ForisILBulkServiceOperationsService_Service service = new ru.mts.tender.inline.forisil.ForisILBulkServiceOperationsService_Service();
            ru.mts.tender.inline.forisil.ForisILBulkServiceOperationsService port = service.getForisILBulkServiceOperationsServicePort();
            // TODO initialize WS operation arguments here
            String suscriberId = msisdn;
            // TODO process result here
            result = port.getBalances(suscriberId);
            log.info("ForisILBulkServiceOperationsService result is : " + result);
        } catch (Exception ex) {
            log.error("Exception calling ForisILBulkServiceOperationsService");
            ex.printStackTrace();
            // TODO обрабатываем необходимые ошибки

            result = "Exception calling ForisILBulkServiceOperationsService";
        }

        // метод успешно выполнен. Добавляем метрику KPI_RETURN=result
//        ev.completed(result);
        //предполагается, что здесь исключений возникнуть не должно,
        // в противном получим KPI_RESULT=UNKNOWN
        return msisdn + ", ForisILBulkServiceOperationsService result : " + result + ".\n";
    }

}
