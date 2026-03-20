class WashingMachine{
    int wmSwitch=0,clothes=0,detergent=0;

    void switchOn(){
        wmSwitch=1;
        System.out.println("Washing Machine is ON");
    }
    int acceptClothes(int noofClothes){
        if(wmSwitch==0)clothes+=noofClothes;
        else System.out.println("Cannot accept clothes. Washing Machine is ON");
        return clothes;
    }
    void acceptDetergent(){
        if(wmSwitch==0)detergent++;
        else System.out.println("Cannot accept detergent. Washing Machine is on");
    }
    void switchOff(){
        wmSwitch=0;
        clothes=0;
        detergent=0;
        System.out.println("Washing Machine is OFF");

    }
}

public class lab6_3 {
    public static void main(String[] args) {
        WashingMachine wm1 = new WashingMachine();

        System.out.println("Total clothes: " + wm1.acceptClothes(3));
        System.out.println("Total clothes: " + wm1.acceptClothes(2));

        wm1.acceptDetergent();
        wm1.switchOn();

        System.out.println("Total clothes: " + wm1.acceptClothes(1));

        wm1.switchOff();

    }
}
