public class Principal {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Lucas Dantas", "38.710.594-3", "R da maçonaria 175", "(11) 95030-7469", "27/11/2000", "Auxiliar de produção");
        Paciente p2 = new Paciente("Eliete Dantas", "49.568.327-9", "R pedro soares de andrade 33", "(11) 94242-0819", "04/03/1970", "Vendedora");

        System.out.println("\n Registro de Pacientes: "+
                "\n----------------------------------------"+
                "\nNome: "+ p1.nome +
                "\nRG: "+ p1.rg +
                "\nEndereço: "+ p1.endereco +
                "\nTelefone: "+ p1.telefone +
                "\nData de nascimento: "+ p1.dataNascimento +
                "\nProfissão: "+ p1.profissao +
                "\n----------------------------------------"+
                "\nNome: "+ p2.nome +
                "\nRG: "+ p2.rg +
                "\nEndereço: "+ p2.endereco +
                "\nTelefone: "+ p2.telefone +
                "\nData de nascimento: "+ p2.dataNascimento +
                "\nProfissão: "+ p2.profissao +
                "\n----------------------------------------");
    }

}
