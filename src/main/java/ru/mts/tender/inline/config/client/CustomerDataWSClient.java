/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mts.tender.inline.config.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import ru.inmetrix.imx.japi.*;
//import ru.inmetrix.imx.japi.eventtypes.*;

/**
 *
 * @author Administrator
 */
public class CustomerDataWSClient {
       private static Logger log = LoggerFactory.getLogger(CustomerDataWSClient.class);
// создаем объект уровня «Service» - один для всего класса
//    private static final MonitoringNotifier ntf = MonitoringNotifier.create("CustomerDataWSClient");

    public String getForisConfigurationData(String id){
         // Создаем сообщение уровня «Method» (имя задается явно)
//        SimpleMethodEventev = SimpleMethodEvent.startMethod(ntf, "getForisConfigurationData");
        
// запрашиваем балансы согласно id и данным конфигурации        
log.info(id + " received OK, now responding with ForisConfigurationData...");
        // метод успешно выполнен. Добавляем метрику KPI_RETURN=result
//        ev.completed(result);
       return id + " ForisConfigurationData";
    }
    
}
