package observer;

class Sekretaeriat implements Observer {

    @Override
    public void notifying(int value) {
        System.out.println("Sekretäriat notified "+value);
    }
}
