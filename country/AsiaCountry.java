package country;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsiaCountry extends Country{
    private String location;


    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap location: ");
        location=input.nextLine();
        super.input();
    }

    @Override
    public String toString() {
        return "AsiaCountry{" +
                "location='" + location + '\'' +super.toString()+
                '}';
    }

    @Override
    public void display() {
        super.display();
        toString();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
