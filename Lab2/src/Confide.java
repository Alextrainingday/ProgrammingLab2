import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide (){
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

