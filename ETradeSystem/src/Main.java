import ETradeSystem.business.concretes.UsersManager;
import ETradeSystem.entities.concretes.UsersInfo;

public class Main {
    public static void main(String[] args) {

        UsersManager usersManager=new UsersManager();
        usersManager.add(new UsersInfo("123124","fdssdf","sdfsdf","wddfsdfsd"));

    }
}