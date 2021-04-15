import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * author 武旭凯
 * date: 2021/4/15 19:30
 */
public class TCPServer {
    private static final int port=9002;
    public static void main(String[] args) throws IOException {
        //创建并启动服务器
        ServerSocket serverSocket=new ServerSocket(port);
        System.out.println("客户端已经启动");
        //等待客户端连接
        Socket clientSocket=serverSocket.accept();
        //已经有客户端连接
        System.out.println(String.format("已经有客户端连接,ip:%s,端口号:%d",
                clientSocket.getInetAddress().getHostAddress(),
                    clientSocket.getPort()
                ));
        try (
            BufferedWriter writer=new BufferedWriter(
                    new OutputStreamWriter(clientSocket.getOutputStream())
            );
            BufferedReader reader=new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );
            ) {
            while (true) {
                //收发消息
                String msg = reader.readLine();
                if(msg!=null&&!msg.equals("")){
                    System.out.println("接收到客户端消息：" + msg);
                    String serMsg = "我收到了";
                    writer.write(serMsg + "\n");
                    // \n 不能省略
                    // 发送缓冲区刷新操作【执行此步骤意味着里面将缓冲区的消息发送出去】
                    writer.flush();
                }


            }
        }
    }
}
