/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mts.tender.inline.configuration;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author Administrator
 */
@WebService(serviceName="ESBConfigurationService", wsdlLocation = "META-INF/wsdl/configuration/ESBConfigurationService.wsdl")
@Stateless()
public class ESBConfigurationService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getILAdapterParameters")
    public String getILAdapterParameters(@WebParam(name = "msisdn") final String msisdn) {
        //TODO write your implementation code here:
        return "ILAdapterParameters for " + msisdn;
    }
}
