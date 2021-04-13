import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * author 武旭凯
 * date: 2021/4/13 20:53
 */
public class UdpServer {
    // 端口号
    private static final int port=9001;
    // 数据的最大值
    private static final int bleng=1024;

    public static void main(String[] args) throws IOException {
        // 1.启动一个 UDP 服务器端(IP、端口号)
        DatagramSocket socket=new DatagramSocket(port);
        System.out.println("服务器已经启动！");
        while(true){
            DatagramPacket clientPacket=new DatagramPacket(
            new byte[bleng],
                    bleng
            );
            socket.receive(clientPacket);
            String msg=new String(clientPacket.getData());
            System.out.println("接到到客户端的信息"+msg);
            String serMsg="接收到了";
            DatagramPacket serPacket=new DatagramPacket(
                    serMsg.getBytes(),
                    serMsg.getBytes().length,
                    clientPacket.getAddress(),
                    clientPacket.getPort()
            );
            socket.send(serPacket);
        }

    }

}
