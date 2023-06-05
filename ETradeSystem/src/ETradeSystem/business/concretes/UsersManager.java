package ETradeSystem.business.concretes;

import ETradeSystem.business.abstracts.IUsersService;
import ETradeSystem.entities.concretes.UsersInfo;


public class UsersManager implements IUsersService {
    public UsersManager(){}
    @Override
    public void add(UsersInfo usersInfo) {
        if (usersInfo.getPassword().length()>=6 && usersInfo.getFirstName().length()>=2 &&
                usersInfo.getLastName().length()>=2 ){
            return;
        }else {
            System.out.println("Tekrar");
        }


    }

}
