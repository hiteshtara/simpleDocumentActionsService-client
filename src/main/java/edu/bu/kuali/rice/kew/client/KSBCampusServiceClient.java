package edu.bu.kuali.rice.kew.client;



import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;


public class KSBCampusServiceClient



{
    private static final QName SERVICE_NAME = new QName("http://rice.kuali.org/kim/v2_0", "identityService");


	public IdentityService getCampusService( URL url )
	{

		 IdentityService_Service ss = new IdentityService_Service(url, SERVICE_NAME);
	        IdentityService identityservice = ss.getIdentityServicePort();


	        org.apache.cxf.endpoint.Client client = ClientProxy.getClient(identityservice);
	        org.apache.cxf.endpoint.Endpoint cxfEndpoint = client.getEndpoint();

		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put( WSHandlerConstants.ACTION, "Signature" );
		outProps.put( WSHandlerConstants.USER, "rice" );
		outProps.put( WSHandlerConstants.PW_CALLBACK_CLASS, KSBClientCallbackHandler.class.getName() );
		outProps.put( WSHandlerConstants.SIG_PROP_FILE, "client-sign.properties" );
		cxfEndpoint.getInInterceptors().add(new LoggingInInterceptor());
		WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor( outProps );

		cxfEndpoint.getOutInterceptors().add( wssOut );

		return identityservice;
	}


}
