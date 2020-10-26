package check;

import constants.Constants;

public class Check {
 private static String firstName = "見塩";
 private static String lastName = "大地";

 private void printName(String firstName,String lastName) {
     System.out.println("printNameメソッド　→　" + Check.firstName + Check.lastName);
	}
public static void main(String[] args) {
	Check check = new Check();
	Pet p = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    check.printName(firstName, firstName);
    p.introduce();
    rp.introduce();

}
}
