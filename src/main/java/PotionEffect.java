package main.java;

import java.util.HashMap;
import java.util.Map;

public class PotionEffect<T extends Entity> {
    

    private T entity;
    private Map<Statut, Integer> effectsStatut;

    public PotionEffect(T entity) {
        this.entity = entity;
        this.effectsStatut = new HashMap<Statut, Integer>();
    }

    public int getEffectDuration(Statut statut) {
        return this.effectsStatut.get(statut);
    }

    public void resetEffectDuration(Statut statut){
        this.effectsStatut.put(statut, statut.getDuration());
    }

    public void downEffectDuration(Statut statut){
        for (Statut this.effectsStatut.keySet() : statuts) {
            
        }
    }



}
