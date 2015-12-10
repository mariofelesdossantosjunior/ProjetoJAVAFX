package mario.com.util;

import mario.com.model.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mario on 09/12/15.
 */
public class DataLoader {

    public static List<Cliente> load(){
        List<Cliente> clienteList = new ArrayList<Cliente>();

        Cliente clienteUm  = new Cliente("Mario","44.8842-6754");
        Cliente clienteDois = new Cliente("José da Silva","44.9999-9999");

        clienteList.add(clienteUm);
        clienteList.add(clienteDois);

        return clienteList;

    }
}
