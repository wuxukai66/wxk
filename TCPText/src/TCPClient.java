import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * author 武旭凯
 * date: 2021/4/15 20:02
 */
public class TCPClient {
    private static final String ip="127.0.0.1";
    private static final int port=9002;
    public static void main(String[] args) throws IOException {
            //创建并启动客户端
        Socket socket=new Socket(ip,port);
        //创建收发消息对象
        try(
                BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                Scanner scanner=new Scanner(System.in);
                ){
            while(true){
                System.out.println("->");
                //构建消息
                String Msg=scanner.nextLine();
                writer.write(Msg+"\n");
                writer.flush();
                String serMsg=reader.readLine();
                if(serMsg!=null&&!serMsg.equals("")){
                    System.out.println("服务器端返回：" + serMsg);
                }
            }
        }
    }
}
