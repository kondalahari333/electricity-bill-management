import java.util.*;
public class electricitybill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many units consumed:");
        int u=sc.nextInt();
        double bill=0;
        if(u<=100){
            bill=u*1;
        }
        else if(u<=200){
            bill=(100*1)+(u-100)*2;
        }
        else{
            bill=(100*1)+(100*2)+(u-200)*3;
        }
        double surcharge=0;
        if(bill>500){
            surcharge=bill*0.10;
            bill=bill+surcharge;
        }
        System.out.println("electricity bill details:");
        System.out.println("units consumed:"+u);
        if(surcharge>0){
        System.out.println("surcharge(10%):"+surcharge);
        }
        System.out.println("final bill is:"+bill);
    }
    
}
