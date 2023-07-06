package country;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country implements ICountry{

    private String countryName;
    double area;
    long numberPerson;


    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap country name: ");
        countryName=input.nextLine();
        System.out.println("Nhap area: ");
        area=Double.parseDouble(input.nextLine());
        System.out.println("Nhap so person: ");
        numberPerson=Long.parseLong(input.nextLine());
    }

    @Override
    public String toString() {
        return
                "countryName='" + countryName + '\'' +
                ", area=" + area +
                ", numberPerson=" + numberPerson ;
    }

    @Override
    public void display() {

    }

    @Override
    public float everageArea(double area, long numberPerson) {
        System.out.printf((numberPerson/area)+"%. (so nguoi/km^2)");
        return 0;
    }
}
