package com.ms.nao.csid.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2018-09-09T11:30:54.112+05:30
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://Example.org", name = "ICalculator")
@XmlSeeAlso({ObjectFactory.class})
public interface ICalculator {

    @WebMethod(operationName = "Subtract", action = "http://Example.org/ICalculator/Subtract")
    @Action(input = "http://Example.org/ICalculator/Subtract", output = "http://Example.org/ICalculator/SubtractResponse")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://Example.org", className = "com.ms.nao.csid.model.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://Example.org", className = "com.ms.nao.csid.model.SubtractResponse")
    @WebResult(name = "result", targetNamespace = "http://Example.org")
    public java.lang.Integer subtract(
        @WebParam(name = "a", targetNamespace = "http://Example.org")
        java.lang.Integer a,
        @WebParam(name = "b", targetNamespace = "http://Example.org")
        java.lang.Integer b
    );

    @WebMethod(operationName = "Add", action = "http://Example.org/ICalculator/Add")
    @Action(input = "http://Example.org/ICalculator/Add", output = "http://Example.org/ICalculator/AddResponse")
    @RequestWrapper(localName = "Add", targetNamespace = "http://Example.org", className = "com.ms.nao.csid.model.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://Example.org", className = "com.ms.nao.csid.model.AddResponse")
    @WebResult(name = "result", targetNamespace = "http://Example.org")
    public java.lang.Integer add(
        @WebParam(name = "a", targetNamespace = "http://Example.org")
        java.lang.Integer a,
        @WebParam(name = "b", targetNamespace = "http://Example.org")
        java.lang.Integer b
    );
}
