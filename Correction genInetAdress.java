
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class genInetAdress{
      
   public static void main(String[] zero) throws SocketException {

try{
    InetAddress monAdresse = InetAddress.getByName("smtp.laposte.net");
    System.out.println(monAdresse.getHostName());
    System.out.println( monAdresse.getHostAddress());
    System.out.print( monAdresse.isAnyLocalAddress() + " ");
    System.out.print( monAdresse.isLoopbackAddress() + " ");
    System.out.print( monAdresse.isLinkLocalAddress() + " ");
    System.out.println( monAdresse.isReachable(100));
    } 
    catch (UnknownHostException exp){
    System.out.println("machine inconnue");
    } catch (IOException e) {
    System.out.println("machine non atteignable");
}
   
}
}
