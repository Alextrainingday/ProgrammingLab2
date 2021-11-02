import ru.ifmo.se.pokemon.*;
public class Leer extends StatusMove {
    public Leer (){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

