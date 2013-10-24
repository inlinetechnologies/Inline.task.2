/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.mts.tender.inline.task1;

import java.sql.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import ru.inmetrix.imx.japi.*;
//import ru.inmetrix.imx.japi.eventtypes.*;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "V1FasadeForisILBulkServiceOperationsWS")
@Stateless()
public class V1FasadeForisILBulkServiceOperationsWS {
//   private static Logger log = LoggerFactory.getLogger(V1FasadeForisILBulkServiceOperationsWS.class);

// создаем объект уровня «Service» - один для всего класса
//    private static final MonitoringNotifier ntf = MonitoringNotifier.create("V1FasadeForisILBulkServiceOperationsWS");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBalances")
    public String getBalances(@WebParam(name = "msisdn") String msisdn) {
        // Создаем сообщение уровня «Method» (имя задается явно)
//        SimpleMethodEventev = SimpleMethodEvent.startMethod(ntf, "getBalances");

        // методуспешновыполнен. Добавляем метрику KPI_RETURN=result
//        ev.completed(result);
        //предполагается, что здесь исключений возникнуть не должно,
        // в противном получимKPI_RESULT=UNKNOWN
        return msisdn + " balances";
    }
}
