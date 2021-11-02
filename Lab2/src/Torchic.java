import ru.ifmo.se.pokemon.*;
public class Torchic extends Pokemon{
    public Torchic(String name, int level){
        super(name, level);
        setStats(45, 60, 40, 70, 50, 45);
        setType(Type.FIRE);
        setMove(new Bulldoze(), new Confide()
        );
    }
}