import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Manager manager1 = new Manager("Angelina", "ABC12345", 20000, "IT" );
        DBHelper.save(manager1);

        Administrator administrator1 = new Administrator("Abi", "ABCD1234", manager1);
        DBHelper.save(administrator1);
        Administrator administrator2 = new Administrator("Louise", "ABCD1234", manager1);
        DBHelper.save(administrator2);
        Administrator administrator3 = new Administrator("Christy", "ABCD1234", manager1);
        DBHelper.save(administrator3);
        Administrator administrator4 = new Administrator("Emily", "ABCD1234", manager1);
        DBHelper.save(administrator4);

        List<Administrator> managersEmployees = DBManager.employeesUnderManager(manager1);
    }
}
