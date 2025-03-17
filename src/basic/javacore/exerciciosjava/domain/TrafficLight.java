package basic.javacore.exerciciosjava.domain;

public class TrafficLight {

    public char trafficLightCurrentState(char trafficLight) {

        switch(trafficLight){
            case 'Y':
                System.out.println("Is Yellow");
                break;

            case 'G':
                System.out.println("Is Green");
                break;

            case 'R':
                System.out.println("Its Red");
                break;
        }
        return '0';
    }

}
