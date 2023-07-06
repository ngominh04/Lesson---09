package motor.yamaha;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Yamaha {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chon;
        List<Motor> list=new ArrayList<Motor>();
        do {
            System.out.println("1. Input\n2. Display\n3. Sort\n4. Search\n5. Exit");
            System.out.println("Nhap so muon thuc hien: ");
            chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    int n;
                    System.out.println("chon so luong xe muon nhap(theo loai):");
                    n=Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("========= ["+(i+1)+"] =========");
                        Jupiter jupiter=new Jupiter();
                        jupiter.inputInfor();
                        list.add(jupiter);
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("========= ["+(i+1)+"] =========");
                        Serius serius=new Serius();
                        serius.inputInfor();
                        list.add(serius);
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 3:
//                    List<Jupiter> list1=list.stream().sorted(Comparator.comparingInt(Jupiter.warraty)).collect(Collectors.toList());
                    break;
                case 4:
                    String nameMotor;
                    System.out.println("Nhap ten xe can tim:");
                    nameMotor= input.nextLine();
                    for (Motor motor :list){
                        if(motor.getName().equals(nameMotor)){
                            System.out.println(motor);
                        }
                    }
                    break;
                case 5:
                    return;
            }

        }while (true);
    }
}
