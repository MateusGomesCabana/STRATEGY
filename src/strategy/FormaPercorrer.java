/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class FormaPercorrer {

    protected Percorrer percorrer;
    ArrayList<Integer> list = new ArrayList<>();

    public FormaPercorrer(int forma) {
        switch (forma) {
            case 1:
                percorrer = new Percorrer1();

                break;
            case 2:
                percorrer = new Percorrer2();
                break;
        }
    }

    public ArrayList<Integer> getList() {
        return list;
    }
    

}
