public class Produto {
    String marca, fabricante, codigoDeBarras;
    float preco;
    public Produto(String m, String fab, String cdb, float p){
        marca = m;
        fabricante = fab;
        this.codigoDeBarras = cdb;
        preco = p;
    }
}
