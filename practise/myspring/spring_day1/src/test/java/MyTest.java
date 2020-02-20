import lfh.dao.UserDaoImpl;
import lfh.dao.UserDaoImpl2;
import lfh.dao.UserDaoImpl3;
import lfh.service.UserService;
import lfh.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl3());
        userService.getUser();
    }
}
