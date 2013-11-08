/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mts.tender.inline.synch;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.mts.tender.inline.configuration.client.ESBConfigurationServiceClient;
import ru.mts.tender.inline.forisil.client.ForisILBulkServiceOperationsServiceClient;

//import ru.inmetrix.imx.japi.*;
//import ru.inmetrix.imx.japi.eventtypes.*;
/**
 *
 * @author Administrator
 */
@WebService(serviceName = "V1FasadeForisILBulkServiceOperationsWS")
@Stateless()
public class V1FasadeForisILBulkServiceOperationsWS {

    private static Logger log = LoggerFactory.getLogger(V1FasadeForisILBulkServiceOperationsWS.class);

// создаем объект уровня «Service» - один для всего класса
//    private static final MonitoringNotifier ntf = MonitoringNotifier.create("V1FasadeForisILBulkServiceOperationsWS");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBalances")
    public String getBalances(@WebParam(name = "msisdn") String msisdn) {
        // Создаем сообщение уровня «Method» (имя задается явно)
//        SimpleMethodEventev = SimpleMethodEvent.startMethod(ntf, "getBalances");
        ESBConfigurationServiceClient eSBConfigurationServiceClient = new ESBConfigurationServiceClient();
        String configParameters = eSBConfigurationServiceClient.getForisConfigurationData(msisdn);
       log.error("ESBConfigurationService response is: " + configParameters);
        System.out.println("ESBConfigurationService response is: " + configParameters);
        System.err.println("ESBConfigurationService response is: " + configParameters);
         
// Configuring IL port here
//        ....................
//        Получаем из сконфигурированного порта ForisILBulkServiceOperations балансы
        ForisILBulkServiceOperationsServiceClient forisILBulkClient = new ForisILBulkServiceOperationsServiceClient();
        String balancesResponse = forisILBulkClient.getBalances(msisdn + " : " + configParameters);
        log.error("ForisIL response is: " + balancesResponse);
        log.error("ForisIL response is: ", balancesResponse);
        
        String result = new String("For " + msisdn + " balances : " + balancesResponse);
        
//        log.info(msisdn + " received OK, now responding with balances...");
        // метод успешно выполнен. Добавляем метрику KPI_RETURN=result
//        ev.completed(result);
        //предполагается, что здесь исключений возникнуть не должно,
        // в противном получим KPI_RESULT=UNKNOWN
        return result;
    }
}
