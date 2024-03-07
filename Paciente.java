public class Paciente {
    String nome, rg, endereco, telefone, dataNascimento, profissao;

    public Paciente(String n, String rg, String end, String tel, String dN, String pro){
        nome = n;
        this.rg = rg;
        endereco = end;
        this.telefone = tel;
        this.dataNascimento = dN;
        profissao = pro;
    }
}
