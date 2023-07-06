package country;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Country> list=new ArrayList<Country>();
        do {


            Scanner input=new Scanner(System.in);
            System.out.println("1.Input information for n coutries of Asia"+"\n2.Display information"+"\n3.Sort descending by area and display result"+"\n4. Find information by coutryName");
            int chon;
            System.out.println("Nhap so ban muon chon: ");
            chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    int n;
                    System.out.println("Nhap n: ");
                    n=Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n ; i++) {
                        AsiaCountry as =new AsiaCountry();
                        System.out.println("---------------- "+(i+1)+" ----------------");
                        as.input();
                        list.add(as);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 3:
                    System.out.println("DS giam dan theo Area :  ");
                    List<Country> list1=list.stream().sorted(Comparator.comparingDouble(Country::getArea)).collect(Collectors.toList());
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.println(list1.get(i));
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    String CountryName;
                    System.out.println("Nhap CountryName can in: ");
                    CountryName=input.nextLine();

                    for (Country country: list) {
                         if(country.getCountryName().equals(CountryName)){
                             System.out.println(country);
                         }
                    }
                    System.out.println("\n");
                    break;
            }
        }while (true);
    }
}
