public class FormatadorCepExemplo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
    
    static String formatarCep (String cep) throws CepInvalidoException{
     if (cep.length() != 8)
        throw new CepInvalidoException();

        return "23.765-064";
    }
}
