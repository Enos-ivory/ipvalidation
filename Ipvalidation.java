package treinos;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipvalidation {
    public static boolean isValidIP(String ip){
        try {
            InetAddress inet = InetAddress.getByName(ip);


            //verifica se é realmente um IPv4 (e não um hostname)
            return  ip.equals(inet.getHostAddress()) && ip.contains(".");
        } catch (UnknownHostException e){
            return false;
        }
    }
}
