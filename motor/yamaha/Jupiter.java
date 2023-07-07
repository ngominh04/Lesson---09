package motor.yamaha;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.util.Scanner;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Jupiter extends Motor{


    @Override
    public void inputInfor() {
        Scanner input=new Scanner(System.in);
        System.out.println("=============== <Jupiter> =============");
        System.out.println("Thoi gian bao hanh: ");
        warranty=Integer.parseInt(input.nextLine());
        super.inputInfor();
    }

    @Override
    public String toString() {
        return "Jupiter{" +
                "warraty=" + warranty +
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