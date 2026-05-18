package edu.teamrocket.receipt;

import edu.teamrocket.order.Comanda;
import edu.teamrocket.extras.Extra;

public interface Ticket {

    Comanda getorder();
    
    void setChain(Extra extra);

    Extra getChain();

    Double total();

    void sumExtrasCharge();

    void print();
}