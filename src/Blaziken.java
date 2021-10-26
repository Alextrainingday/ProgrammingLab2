import ru.ifmo.se.pokemon.*;
public class Blaziken extends Pokemon{
    public Blaziken(String name, int level){
        super(name, level);
        setStats(80, 120, 70, 110, 70, 80);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new Bulldoze(), new Confide(), new Leer(), new DarkPulse()
        );
    }
}
