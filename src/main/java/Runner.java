import db.DBHelper;
import db.DBManager;
import models.Administrator;
import models.Department;
import models.Manager;

import java.util.List;

public class Runner {

    public static void main(String[] args) {



        Manager manager1 = new Manager("Angelina", "ABC12345", 20000 );
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Angelina", "ABC12345", 20000);
        DBHelper.save(manager2);

        Department department1 = new Department("IT", manager1);
        DBHelper.save(department1);
        Department department2 = new Department("Biology", manager2);
        DBHelper.save(department2);

        Administrator administrator1 = new Administrator("Abi", "ABCD1234", manager1);
        DBHelper.save(administrator1);
        Administrator administrator2 = new Administrator("Louise", "ABCD1234", manager1);
        DBHelper.save(administrator2);
        Administrator administrator3 = new Administrator("Christy", "ABCD1234", manager1);
        DBHelper.save(administrator3);
        Administrator administrator4 = new Administrator("Emily", "ABCD1234", manager1);
        DBHelper.save(administrator4);

        List<Administrator> managersEmployees = DBManager.employeesUnderManager(manager1);

        Department departmentManagers = DBManager.departmentManagers(manager2);
    }
}
