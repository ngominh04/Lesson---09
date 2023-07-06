package motor.yamaha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motor implements IMotor{
    private String code; // Mã xe
    private String name; // Tên Loại xe
    private double capacity; // Dung tích xi lanh
    private int num; // kiểu truyền lực

    @Override
    public void inputInfor() {
        Scanner input=new Scanner(System.in);
        System.out.println("Ma xe:");
        code=input.nextLine();
        System.out.println("Ten loai xe:");
        name=input.nextLine();
        System.out.println("Dung tich xi lanh: ");
        capacity=Double.parseDouble(input.nextLine());
        System.out.println("Kieu truyen luc may so: ");
        num=Integer.parseInt(input.nextLine());

    }

    @Override
    public String toString() {
        return "Motor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", num=" + num +
                '}';
    }

    @Override
    public void displayInfor() {

    }

    @Override
    public void changeInfor() {
        System.out.println("");
    }
}
