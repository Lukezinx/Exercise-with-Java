public class Lamp {
    private Boolean on;

    public Lamp(Boolean on) {
        this.on = on;
    }

    public Boolean getOn() {
        return on;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }


    void showStates() {
        System.out.println(getOn() == true ? "Lampada ligada" : "Lampada desligada");
    }
}
