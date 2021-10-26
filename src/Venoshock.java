import ru.ifmo.se.pokemon.*;
public class Venoshock extends SpecialMove {
    public Venoshock (){
        super(Type.POISON, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

