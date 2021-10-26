import ru.ifmo.se.pokemon.*;
public class Combusken extends Pokemon{
    public Combusken(String name, int level){
        super(name, level);
        setStats(60, 85, 60, 85, 60, 55);
        setType(Type.FIRE, Type.FIGHTING);
        setMove(new Bulldoze(), new Confide(), new Leer()
        );
    }
}