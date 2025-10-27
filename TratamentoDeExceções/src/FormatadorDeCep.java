public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23176064");
            System.out.println(cepFormatado);
        } catch (CepInvvalidoException e) {
            System.out.println("O cep é inválido");
            e.printStackTrace();
        }
    }
    static String formatarCep (String cep) throws CepInvvalidoException{
        if (cep.length()!= 8)
            throw new CepInvvalidoException();

            return "23.765-064";
        
    }
}