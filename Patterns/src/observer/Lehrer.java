package observer;

class Lehrer implements Observer{
    private String name;

    Lehrer(String name){
        this.name=name;
    }

    @Override
    public void notifying(int value) {
        if(value>=25) {
            System.out.println("Lehrer "+name+" notified "+value);
        }
    }
}
