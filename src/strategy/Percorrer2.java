/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author ALUNO
 */
public class Percorrer2 implements Percorrer {

    public Percorrer2() {
    }

    @Override
    public String calculaFormaPercorrer(FormaPercorrer umFuncionario) {
        String a = "";
        for (int i = umFuncionario.getList().size(); i >= 0; i--) {
            a = a + String.valueOf(umFuncionario.getList().get(i));
        }
        return a;
    }

}
