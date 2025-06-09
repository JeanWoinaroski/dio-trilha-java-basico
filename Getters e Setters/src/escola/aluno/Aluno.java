package escola.aluno;


public class Aluno {
    private String nome;
    private int idade ;
    private String matricula;
    private String curso;

public String getNome() {
    return nome;

}
public void setNome(String newNome){
    nome = newNome;
}
public int getIdade() {
    return idade;
}
public void setIdade(int newIdade) {
    idade = newIdade;
}
public String getMatricula() {
    return matricula;
}
public void setMatricula(String newMatricula) {
    matricula = newMatricula;
}
public String getCurso() {
    return curso;
}
public void setCurso(String newCurso) {
    curso = newCurso;
}
}
