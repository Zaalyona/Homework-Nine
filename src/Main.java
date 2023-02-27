import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import engines.Engine;
import engines.EngineD245;
import engines.EngineV12;
import engines.EngineV6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создаём Ламборгини
        Beeper horn = new Horn();
        Engine engineV12 = new EngineV12();

        Lambo lambo = new Lambo(horn, engineV12);

        //Создаём Приору
        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();

        Priora priora = new Priora(magicSound, engineV6);

        /*System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.getCost());

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.downShifting());*/

        ArrayList<Car> transporter = new ArrayList();
        transporter.add(lambo);
        transporter.add(priora);
        System.out.println("Характеристики каждой машины:");
        transporter.forEach((Car car) ->  {
            System.out.println("Гудок: " + car.beeper.makeSound());
            System.out.println("Максимальная скорость: " + car.engine.getSpeed() + " km/h");
        });
        System.out.println();

        System.out.println("Тест-драйв Ламборгини");
        System.out.println(lambo.start());
        System.out.println(lambo.startMoving());
        System.out.println("10 секунд и на спидометре " + lambo.getSpeed());
        System.out.println("Трогаем педальку тормоза: " + lambo.stopMoving());
        System.out.println(lambo.reverseMoving());
        System.out.println(lambo.stop());
        System.out.println("Красотка стоит: " + lambo.getCost());
        System.out.println();

        System.out.println("Тест-драйв Приоры...");
        System.out.println(priora.start());
        System.out.println(priora.startMoving());
        System.out.println("2 часа и на спидометре... " + priora.getSpeed());
        System.out.println("Сильно нажимаем на педаль тормоза... " + priora.stopMoving());
        System.out.println(priora.reverseMoving());
        System.out.println(priora.stop());
        System.out.println("Один плюс данной машины: " + priora.downShifting());
        System.out.println();

        Engine engineD245 = new EngineD245();
        Belarus belarus = new Belarus(magicSound, engineD245);
        belarus.haveLadle = true;
        belarus.setColor("Синий");

        System.out.println("Окунёмся в удивительный мир живых тракторов Беларусь!");
        if (belarus.haveLadle) {
            System.out.println("Наш трактор с ковшом");
        } else {
            System.out.println("Наш трактор без ковша");
        }
        System.out.println("Цвет настроения нашего трактора: " + belarus.getColor());
        System.out.println(belarus.openDoor());
        System.out.println("А теперь заведём его!");
        System.out.println(belarus.start());
        System.out.println(belarus.startMoving());
        System.out.println("Гоняем по полю на тракторе со скоростью " + belarus.getSpeed());
        System.out.println("Накатались, пора тормозить! " + belarus.stopMoving());
        System.out.println("Блин, надо бы убраться отсюда... " + belarus.reverseMoving());
        System.out.println(belarus.startMoving());
        System.out.println("Фух, оторвались вроде... " + belarus.stopMoving());
        System.out.println("Глушу мотор. " + belarus.stop());
        System.out.println("Закрываю дверь. Звук, как будто кто-то говорит: " + belarus.closeDoor());
        System.out.println("Зверь-машина!");
    }
}