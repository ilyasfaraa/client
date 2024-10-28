import ma.emsi.BanqueService;
import ma.emsi.BanqueWS;
import ma.emsi.Compte;

import java.net.StandardSocketOptions;

public class client {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte cp=stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
