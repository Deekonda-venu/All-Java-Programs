package Advance_number;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class P8ipadress {
    public static void main(String[] args) {
        InetAddress myIpAdd = null;
        try {
            myIpAdd = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

        System.out.println("My IP Address is");
        System.out.println(myIpAdd.getHostAddress());
    }
}
