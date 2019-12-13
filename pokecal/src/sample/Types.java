package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public interface Types {


    default String[] getPokeTypeList()
    {
        String[] typeskeyval = {"Normal", "Fire", "Water", "Electric", "Grass", "Ice", "Fighting", "Poison", "Ground", "Flying", "Psychic", "Bug", "Rock", "Ghost", "Dragon", "Dark", "Steel", "Fairy", "None"};
        return typeskeyval;
    }

default String getNewLine()

    {
        String newLine = "\n";
        return newLine;
    }
    default HashMap<String, List<Double>> getPokeAttackHashDef() {
        List<Double> normaldef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.5, 1.0, 1.0)); //Normal
        List<Double> firedef = new ArrayList<>(Arrays.asList(1.0, 0.5, 2.0, 1.0, 0.5, 0.5, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0));
        List<Double> waterdef = new ArrayList<>(Arrays.asList(1.0, 0.5, 0.5, 2.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0));
        List<Double> electricdef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0));
        List<Double> grassdef = new ArrayList<>(Arrays.asList(1.0, 2.0, 0.5, 0.5, 0.5, 2.0, 1.0, 2.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        List<Double> icedef = new ArrayList<>(Arrays.asList(1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0));
        List<Double> fightingdef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 0.5, 0.5, 1.0, 1.0, 0.5, 1.0, 2.0, 1.0));
        List<Double> poisondef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 0.5, 0.5, 2.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5));
        List<Double> grounddef = new ArrayList<>(Arrays.asList(1.0, 1.0, 2.0, 0.0, 2.0, 2.0, 1.0, 0.5, 1.0, 0.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        List<Double> flyingdef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 2.0, 0.5, 2.0, 0.5, 1.0, 0.0, 1.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        List<Double> psychicdef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0));
        List<Double> bugdef = new ArrayList<>(Arrays.asList(1.0, 2.0, 1.0, 1.0, 0.5, 1.0, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        List<Double> rockdef = new ArrayList<>(Arrays.asList(0.5, 0.5, 2.0, 1.0, 2.0, 1.0, 2.0, 0.5, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        List<Double> ghostdef = new ArrayList<>(Arrays.asList(0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.5, 1.0, 1.0, 1.0, 0.5, 1.0, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0));
        List<Double> dragondef = new ArrayList<>(Arrays.asList(1.0, 0.5, 0.5, 0.5, 0.5, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0));
        List<Double> darkdef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.0, 2.0, 1.0, 0.5, 1.0, 0.5, 1.0, 2.0, 1.0));
        List<Double> steeldef = new ArrayList<>(Arrays.asList(0.5, 2.0, 1.0, 1.0, 0.5, 0.5, 2.0, 0.0, 2.0, 0.5, 0.5, 0.5, 0.5, 1.0, 0.5, 1.0, 0.5, 0.5, 1.0));
        List<Double> fairydef = new ArrayList<>(Arrays.asList(1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 0.0, 0.5, 2.0, 1.0, 1.0));
        List<Double> nonedef = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        HashMap<String, List<Double>> pokeTypesAttackOf = new HashMap<>();


        pokeTypesAttackOf.put("Normal", normaldef);//norm
        pokeTypesAttackOf.put("Fire", firedef);//fire
        pokeTypesAttackOf.put("Water", waterdef);//
        pokeTypesAttackOf.put("Electric", electricdef);
        pokeTypesAttackOf.put("Grass", grassdef);
        pokeTypesAttackOf.put("Ice", icedef);
        pokeTypesAttackOf.put("Fighting", fightingdef);
        pokeTypesAttackOf.put("Poison", poisondef);
        pokeTypesAttackOf.put("Ground", grounddef);
        pokeTypesAttackOf.put("Flying", flyingdef);
        pokeTypesAttackOf.put("Psychic", psychicdef);
        pokeTypesAttackOf.put("Bug", bugdef);
        pokeTypesAttackOf.put("Rock", rockdef);
        pokeTypesAttackOf.put("Ghost", ghostdef);
        pokeTypesAttackOf.put("Dragon", dragondef);
        pokeTypesAttackOf.put("Steel", steeldef);
        pokeTypesAttackOf.put("Fairy", fairydef);
        pokeTypesAttackOf.put("Dark", darkdef);
        pokeTypesAttackOf.put("None", nonedef);
return pokeTypesAttackOf;
    }
    default HashMap<String, List<Double>> getPokeAttackHashOf() {
        List<Double> normalof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 0.0, 1.0, 1.0, 0.5, 1.0, 1.0)); //Normal
        List<Double> fireof = new ArrayList<>(Arrays.asList(1.0, 0.5, 0.5, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 2.0, 1.0, 1.0));
        List<Double> waterof = new ArrayList<>(Arrays.asList(1.0, 2.0, 0.5, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0));
        List<Double> electricof = new ArrayList<>(Arrays.asList(1.0, 1.0, 2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0));
        List<Double> grassof = new ArrayList<>(Arrays.asList(1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 1.0, 0.5, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 0.5, 1.0, 0.5, 1.0, 1.0));
        List<Double> iceof = new ArrayList<>(Arrays.asList(1.0, 0.5, 0.5, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0));
        List<Double> fightingof = new ArrayList<>(Arrays.asList(2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5, 0.5, 0.5, 2.0, 0.0, 1.0, 2.0, 2.0, 0.5, 1.0));
        List<Double> poisonof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 1.0, 0.5, 0.5, 1.0, 1.0, 0.0, 2.0, 1.0));
        List<Double> groundof = new ArrayList<>(Arrays.asList(1.0, 2.0, 1.0, 2.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.0, 1.0, 0.5, 2.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0));
        List<Double> flyingof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0));
        List<Double> psychicof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 0.0, 0.5, 1.0, 1.0));
        List<Double> bugof = new ArrayList<>(Arrays.asList(1.0, 0.5, 1.0, 1.0, 2.0, 1.0, 0.5, 0.5, 1.0, 0.5, 2.0, 1.0, 1.0, 0.5, 1.0, 2.0, 0.5, 0.5, 1.0));
        List<Double> rockof = new ArrayList<>(Arrays.asList(1.0, 2.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0));
        List<Double> ghostof = new ArrayList<>(Arrays.asList(0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 1.0, 1.0));
        List<Double> dragonof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 0.5, 0.0, 1.0));
        List<Double> darkof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 0.5, 1.0, 0.5, 1.0));
        List<Double> steelof = new ArrayList<>(Arrays.asList(1.0, 0.5, 0.5, 0.5, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 0.5, 2.0, 1.0));
        List<Double> fairyof = new ArrayList<>(Arrays.asList(1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 0.5, 1.0, 1.0));
        List<Double> noneof = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0));
        //List<Double> sone(1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0);
        HashMap<String, List<Double>> pokeTypesAttackOf = new HashMap<>();


        pokeTypesAttackOf.put("Normal", normalof);//norm
        pokeTypesAttackOf.put("Fire", fireof);//fire
        pokeTypesAttackOf.put("Water", waterof);//
        pokeTypesAttackOf.put("Electric", electricof);
        pokeTypesAttackOf.put("Grass", grassof);
        pokeTypesAttackOf.put("Ice", iceof);
        pokeTypesAttackOf.put("Fighting", fightingof);
        pokeTypesAttackOf.put("Poison", poisonof);
        pokeTypesAttackOf.put("Ground", groundof);
        pokeTypesAttackOf.put("Flying", flyingof);
        pokeTypesAttackOf.put("Psychic", psychicof);
        pokeTypesAttackOf.put("Bug", bugof);
        pokeTypesAttackOf.put("Rock", rockof);
        pokeTypesAttackOf.put("Ghost", ghostof);
        pokeTypesAttackOf.put("Dragon", dragonof);
        pokeTypesAttackOf.put("Steel", steelof);
        pokeTypesAttackOf.put("Fairy", fairyof);
        pokeTypesAttackOf.put("Dark", darkof);
        pokeTypesAttackOf.put("None", noneof);

return pokeTypesAttackOf ;
    }


}
