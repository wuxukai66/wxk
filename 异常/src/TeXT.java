import java.util.Scanner;
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TeXT {
    public static void main(String[] args) {
        System.out.println("请输入用户名");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println("请输入密码");
        String password=scanner.nextLine();
        try{
            if(!("wxk".equals(str))){
                throw new UserError("用户名错误！");

            }else{
                if(!("123456".equals(password))){
                    throw new PasswordError("密码错误！");
                }

            }System.out.println("登陆成功");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}