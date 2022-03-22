package polymorphism;

public class 저쩔TV implements TV {
    public void powerOn(){
        System.out.println("저쩔티비 전원 ON");
    }
    public void powerOff(){
        System.out.println("저쩔티비 전원 OFF");
    }
    public void volumeUp(){
        System.out.println("저쩔티비 볼륨 UP");
    }
    public void volumeDown(){
        System.out.println("저쩔티비 볼륨 DOWN");
    }
}
