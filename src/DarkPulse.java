import ru.ifmo.se.pokemon.*;
public class DarkPulse extends SpecialMove {
    public DarkPulse (){
        super(Type.DARK, 80, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

