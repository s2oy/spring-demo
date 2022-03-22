package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuser {
    public static void main(String[] args){
        //1. Spring 컨테이너 구동
        AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
        TV tv = (TV)factory.getBean("tv");

        //2. Spring 컨테이너로부터 필요한 객체를 요청 (Look up)한다.
        tv.powerOn();
        tv.volumeDown();
        tv.volumeUp();
        tv.powerOff();

        //3. spring container 종료
        factory.close();
    }
}
