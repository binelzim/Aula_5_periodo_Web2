import java.util.List;
import java.util.ArrayList;

public class Disciplina{
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private int cargahoraria;

    public Disciplina(){
        this("", 0, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina, ins cargahoraria){
        this(nomeDisciplina, cargahoraria, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina, int cargahoraria, List<Aluno> alunos, List<Professor> professores){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
        this.cargahoraria = cargahoraria;
    }

    public void setCargaHoraria(int cargahoraria){
        this.cargahoraria = cargahoraria;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargahoraria(){
        return this.cargahoraria;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }

    public List<Professor> getProfessores(){
        return this.professores;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString(){
        return "Disciplina{" +
                getNomeDisciplina() +
                ", alunos=" + getAlunos() +
                ", professores=" + getProfessores() + ", carga horaria=" + getCargahoraria() +
                "}";
    }
}