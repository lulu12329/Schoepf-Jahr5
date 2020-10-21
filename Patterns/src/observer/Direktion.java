package observer;

class Direktion implements Observer {

    @Override
    public void notifying(int value) {
        if(value>=30){
            System.out.println("Direktion notified: "+value);
        }
    }
}
