// Pour executer le code il faut
// javac client1.java
// javac client2.java
// javac server.java
// java server client1 client2
// ----------------------------------------
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

class Multi extends Thread{
private Socket soc =null;
DataInputStream infromClient;
Multi() throws IOException{


}
Multi(Socket soc) throws IOException{
    this.soc =soc;
    infromClient = new DataInputStream(soc.getInputStream());
}
@Override
public void run(){  

    String req=new String();
    try {
        req = infromClient.readUTF();
    } catch (IOException ex) {
        Logger.getLogger(Multi.class.getName()).log(Level.SEVERE, null, ex);
    }
    System.out.println("Query: " + req); 
    try {
        System.out.println("Fermeture du Socket");
        soc.close();
    } catch (IOException ex) {
        Logger.getLogger(Multi.class.getName()).log(Level.SEVERE, null, ex);
       }
   }  
}
public class server {

public static void main(String args[]) throws IOException, 
InterruptedException{   

    while(true){
        ServerSocket serSoc = new ServerSocket(11111);
        System.out.println("Server en attente"); 
        Socket soc =serSoc.accept();
        Multi t= new Multi(soc);
        t.start();

        // Thread.sleep(1);
        serSoc.close();
    }    

    }   
}