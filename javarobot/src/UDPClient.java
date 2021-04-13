import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * author 武旭凯
 * date: 2021/4/13 21:29
 */
public class UDPClient {
    private static final String ip="127.0.0.1";
    private static final int port = 9001;
    private static final int bleng = 1024;
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket();
             Scanner scanner=new Scanner(System.in);
             while (true){
                 System.out.print("->");
                 String msg = scanner.nextLine();
                 DatagramPacket datagramPacket = new DatagramPacket(
                         msg.getBytes(),
                         msg.getBytes().length,
                         InetAddress.getByName(ip),
                         port
                 );
                 client.send(datagramPacket);
                 DatagramPacket serPacket = new DatagramPacket(
                         new byte[bleng],
                         bleng
                 );
                 client.receive(serPacket);
                 String serMsg = new String(serPacket.getData());
                 System.out.println("服务器返回："+serMsg);
             }


    }
}
