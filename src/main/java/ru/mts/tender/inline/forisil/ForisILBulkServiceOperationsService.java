/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.mts.tender.inline.forisil;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "ForisILBulkServiceOperationsService")
@Stateless
public class ForisILBulkServiceOperationsService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getBalances")
    public String getBalances(@WebParam(name = "suscriberId") String suscriberId) {
        //TODO write your implementation code here:
        return suscriberId + " balances from ForisILBulkServiceOperationsService.";
    }
}
