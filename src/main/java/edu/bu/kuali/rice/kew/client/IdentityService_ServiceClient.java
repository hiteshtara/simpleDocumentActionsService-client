
package edu.bu.kuali.rice.kew.client;

import java.net.URL;

import javax.xml.namespace.QName;

import org.kuali.rice.kim.v2_0.CodedAttributeType;
import org.kuali.rice.kim.v2_0.EntityAffiliationTypeType;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeId;
import org.kuali.rice.kim.v2_0.GetEntityByEmployeeIdResponse;
import org.kuali.rice.kim.v2_0.IdentityService;
import org.kuali.rice.kim.v2_0.IdentityService_Service;



/**
 * This class was generated by Apache CXF 2.1.2
 * Sat Jan 26 22:59:19 EST 2013
 * Generated source version: 2.1.2
 *
 */

public final class IdentityService_ServiceClient {

    private static final QName SERVICE_NAME = new QName("http://rice.kuali.org/kim/v2_0", "identityService");

    private IdentityService_ServiceClient() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = IdentityService_Service.WSDL_LOCATION;
      KSBCampusServiceClient client = new KSBCampusServiceClient();

      IdentityService svc = client.getCampusService( wsdlURL );
		//Campuses campuses = svc.findAllCampuses();
      GetEntityByEmployeeId id= new GetEntityByEmployeeId();
      id.setEmployeeId("U17116978");
      GetEntityByEmployeeIdResponse test=   svc.getEntityByEmployeeId(id);
      System.out.println( test.toString() );

      //for( CodedAttributeType campus : svc.findAllEmploymentStatuses() )
		//{
		///	System.out.printf( "%s : %s : %s \n", campus.getCode(), campus.getSortCode(), campus.getName() );
		//}


        //System.exit(0);
    }



}
