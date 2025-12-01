/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionedomotica;

import gestionedomotica.dispositivi.Dispositivo;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author angel
 */
public class Impianto {
    private final String nome;
    private final Map<Integer, Dispositivo> dispositivi;
    private final List<Regola> regole;

    public Impianto(String nome) {
        this.nome = nome;
        this.dispositivi = new HashMap<>();
        this.regole = new ArrayList<>();
    }

    public Dispositivo add(Dispositivo dispositivo) {
        
        dispositivi.put(dispositivo.getId(), dispositivo);
        return dispositivo;
    }

    public void add(Regola r){
        regole.add(r);
    }
    
    public Dispositivo getDispositivo(int id) {
        return dispositivi.get(id);
    }

    public void applicaRegole() throws Exception {
        for (Regola regola : regole) {
            regola.applica();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Informazioni impianto\n");
        sb.append("--------------------\n");
        sb.append("Nome: ").append(nome).append("\n\n");
        
        sb.append("--- Elenco dispositivi ---\n");
        for (Dispositivo dispositivo : dispositivi.values()) {
            sb.append(dispositivo.toString()).append("\n");
        }
        
        sb.append("\n--- Elenco regole ---\n");
        for (int i = 0; i < regole.size(); i++) {
            sb.append(i + 1).append(" ").append(regole.get(i).toString()).append("\n");
        }
        
        return sb.toString();
    }
}
