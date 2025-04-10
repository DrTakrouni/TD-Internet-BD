import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class AdresseServeur {
      
   public static void main(String[] zero) throws SocketException {

      try{ 
          //Adresse du serveur Laposte
          InetAddress ServeurAdresse = InetAddress.getByName("smtp.laposte.net");
          System.out.println( ServeurAdresse.getHostAddress());
          System.out.println("L'adresse du serveur Laposte = "+ServeurAdresse);
      } catch (UnknownHostException e) {
          e.printStackTrace();
      }
   }
}

