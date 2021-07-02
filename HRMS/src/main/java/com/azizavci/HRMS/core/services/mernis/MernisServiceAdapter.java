package com.azizavci.HRMS.core.services.mernis;

import java.rmi.RemoteException;

import org.springframework.stereotype.Service;

import com.azizavci.HRMS.entities.concretes.Candidate;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


@Service
public class MernisServiceAdapter implements CandidateCheckService{

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
        boolean result = false;
          try {
              result = soapClient.TCKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthYear());
          } catch (NumberFormatException e) {
               e.printStackTrace();
          } catch (RemoteException e) {
               e.printStackTrace();
          }
         return result;
		
	}	

}
