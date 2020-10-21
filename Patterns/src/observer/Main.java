package observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lehrer l=new Lehrer("Schöpf");
        Sekretaeriat s=new Sekretaeriat();
        Direktion d=new Direktion();

        Observable heizung=new Observable(20);
        heizung.addObserver(l);
        heizung.addObserver(s);
        heizung.addObserver(d);

        boolean running=true;
        while(running){
            Scanner scanner =new Scanner(System.in);
            String string=scanner.nextLine();
            if (string.equals("stop")){
                running=false;
            }else{
                try {
                    int value=Integer.parseInt(string);
                    System.out.println("Set Heizung to "+value);
                    heizung.setValue(value);
//                    System.out.println("Set Heizung to 25");
//                    heizung.setValue(25);
//                    System.out.println("Set Heizung to 30");
//                    heizung.setValue(30);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("bb");
    }
}
