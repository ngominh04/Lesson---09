package motor.yamaha;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Jupiter extends Motor{
    static int warraty; // time bảo hành
    @Override
    public void inputInfor() {
        Scanner input=new Scanner(System.in);
        System.out.println("=============== <Jupiter> =============");
        System.out.println("Thoi gian bao hanh: ");
        warraty=Integer.parseInt(input.nextLine());
        super.inputInfor();
    }

    @Override
    public String toString() {
        return "Jupiter{" +
                "warraty=" + warraty +
                ", code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", capacity=" + getCapacity() +
                ", num=" + getNum() +
                '}';
    }

    @Override
    public void displayInfor() {
        super.displayInfor();
    }

}
