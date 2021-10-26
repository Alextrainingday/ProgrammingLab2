import ru.ifmo.se.pokemon.*;
public class Bulldoze extends PhysicalMove {
    public Bulldoze (){
        super(Type.GROUND, 60, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}
