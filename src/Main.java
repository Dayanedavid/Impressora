public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNome("Contrato1");
        contrato.setTipo("Tipo X");

       Documento documento = new Documento();
        documento.setNome("Documento1");
        documento.setTipo("Tipo X");

        Foto foto = new Foto();
        foto.setNome("foto1");
        foto.setTipo("Tipo X");

        Impressora.adicionarImprimivel(contrato);
        Impressora.adicionarImprimivel(documento);
        Impressora.adicionarImprimivel(foto);

        Impressora.imprimirTudo();

    }
}
