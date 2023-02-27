public interface GroundTransport {

    String start();
    String stop();
    String startMoving();
    String stopMoving();
    String reverseMoving();
    String getSpeed();
    String openDoor();
    String closeDoor();
}
