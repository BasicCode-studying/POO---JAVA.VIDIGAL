import java.util.ArrayList;
import java.util.Collection;

public class Funcionario extends Pessoa implements IUsuario{

    //INICIO ATRIBUTOS
    private Double salario;
    private Collection<Cargo> cargos = new ArrayList<>();

    //FIM ATRIBUTOS

    //INICIO METODOS GETTERS E SETTERS
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Collection<Cargo> getCargos() {
        return cargos;
    }
    public void setCargos(Collection<Cargo> cargos) {
        this.cargos = cargos;
    }
    //FIM METODOS GETTERS E SETTERS

    public void addCargo(Cargo cargo){
        this.cargos.add(cargo);
    }

    /*CRIANDO A AUTENTICAÇÃO DO USUÁRIO*/
    private String senha;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean autenticar(String nome, String senha) {
        if (this.getNome() == nome) {
            if (this.getSenha() == senha) {
                return true;
            }else {
                System.out.println("[+] Password incorrect");
            }return false;
        }System.out.println("[+] Username incorrect");
        {return true;}
    }


}
