package app;

import interfaces.IObserver;
import interfaces.Subject;
import java.util.ArrayList;
import java.util.List;
import observer.Aluno;
import subject.Professor;
import subject.Categoria;

public class Main {
    public static void main(String[] args) throws Exception {
        IObserver a1 = new Aluno();
        IObserver a2 = new Aluno();
        IObserver a3 = new Aluno();
//        IObserver professor = new Professor();
        
        Subject categoria = new Categoria();
        Subject categoria2 = new Categoria();
//        Subject professor = new Categoria();
        List<IObserver> turma = new ArrayList<>();
        List<IObserver> turma2 = new ArrayList<>();
//        List<IObserver> observerList2 = new ArrayList<IObserver>();

        turma.add(a1);
        turma.add(a2);
        turma.add(a3);
        
        categoria.addSubject("Engenharia", turma);
        categoria.setState("Turma em andamento");
        categoria.notifyObserver("Engenharia");

        turma2.add(a1);
        turma2.add(a3);
        
        categoria2.addSubject("Mestrado", turma2);
        categoria2.setState("Em aberto");
        categoria2.notifyObserver("Mestrado");
        
//        observerList2.add(professor);
        
//        try {
//            disciplina1.setState("Engenharia");
//            disciplina1.update();
//            System.out.println();
//            professor.setState("IFBA");
//            professor.update();
//            System.out.println();
//        } catch (Exception ex) {
//            System.out.println("Fail to set state: " + ex.getMessage());
//        }
    }
}
