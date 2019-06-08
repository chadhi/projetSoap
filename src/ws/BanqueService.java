package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "convertToDh")
    public double erouToDh(@WebParam(name = "montant") double montant){
        return montant*11.3;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code){
        return new Compte(code,Math.random()*300,new Date());
    }

    @WebMethod
    public List<Compte> listCompte(){
        List<Compte> list= new ArrayList<Compte>();
        list.add(new Compte(1L,Math.random()*1300,new Date()));
        list.add(new Compte(2L,Math.random()*1300,new Date()));
        list.add(new Compte(3L,Math.random()*1300,new Date()));
        return list;
    }
}
