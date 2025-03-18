package basic.javacore.exerciciosjava.domain;

public class TrafficLight {

    public static String trafficLightCurrentState(String trafficLight) {

        char charOfTrafficLight = trafficLight.toUpperCase().charAt(0);

        switch(charOfTrafficLight){
            case 'G':
                trafficLight = "Yellow";
                break;

            case 'Y':
                trafficLight = "Red";
                break;

            case 'R':
                trafficLight = "Green";
                break;

            default:
                throw new IllegalArgumentException();

        }

        System.out.println("Output: " + trafficLight);
        return trafficLight;
    }

}
