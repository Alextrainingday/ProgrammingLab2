import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle World_Wide_3 = new Battle();
        World_Wide_3.addAlly(new Smeargle ("Santa",1));
        World_Wide_3.addAlly(new Drifloon  ("Potter",1));
        World_Wide_3.addAlly(new Drifblim("Teflon",1));
        World_Wide_3.addFoe(new Torchic ("Jake",1));
        World_Wide_3.addFoe(new Combusken ("Terry",1));
        World_Wide_3.addFoe(new Blaziken  ("Fred",1));
        World_Wide_3.go();
    }
}
