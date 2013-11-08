/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mts.tender.inline.configuration.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import ru.inmetrix.imx.japi.*;
//import ru.inmetrix.imx.japi.eventtypes.*;
/**
 *
 * @author Administrator
 */
public class ESBConfigurationServiceClient {

    private static Logger log = LoggerFactory.getLogger(ESBConfigurationServiceClient.class);
// создаем объект уровня «Service» - один для всего класса
//    private static final MonitoringNotifier ntf = MonitoringNotifier.create("ESBConfigurationServiceClient");

    public String getForisConfigurationData(String id) {
        // Создаем сообщение уровня «Method» (имя задается явно)
//        SimpleMethodEventev = SimpleMethodEvent.startMethod(ntf, "getForisConfigurationData");
        String result = "";
        
        try { // Call Web Service Operation
            ru.mts.tender.inline.config.client.ESBConfigurationService service = new ru.mts.tender.inline.config.client.ESBConfigurationService();
            ru.mts.tender.inline.config.client.ESBConfigurationClientWS port = service.getESBConfigurationClientWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String msisdn = "";
            // TODO process result here
            result = port.getILAdapterParameters(msisdn);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }

//        try { // Call Web Service Operation
//            ru.mts.tender.inline.configuration.ESBConfigurationService service = new ru.mts.tender.inline.configuration.ESBConfigurationService();
////            ru.mts.tender.inline.configuration.client.ESBConfigurationClientWS port = service.getILAdapterParameters(id);
//            // TODO initialize WS operation arguments here
//            java.lang.String msisdn = id;
//            // TODO process result here
////            result = port.getILAdapterParameters(msisdn);
////            log.info("ForisILBulkServiceOperationsService result is : " + result);
//        } catch (Exception ex) {
//            log.error("Exception calling ForisILBulkServiceOperationsService");
//            ex.printStackTrace();
//            // TODO обрабатываем необходимые ошибки
//
//            result = "Exception calling ForisILBulkServiceOperationsService";
//        }

        // метод успешно выполнен. Добавляем метрику KPI_RETURN=result
//        ev.completed(result);
        //предполагается, что здесь исключений возникнуть не должно,
        // в противном получим KPI_RESULT=UNKNOWN
        return id + ", getForisConfigurationData result : " + result + ".\n";
    }

}
