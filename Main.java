public class Main {
    public static void main(String[] args) {
        String meuNomeCompleto = "Lucas";
        String nomeDaNamorada = "Emily";
        String naturalidade = "Manauara";

        int minhaIdade = 19;

        short quantidadeDeIrmaos = 2;

        float minhaAltura = 1.72f;
        float meuPeso = 56.9f;
        boolean isMaiorDeIdade = true;
        boolean isEstudante = true;
        boolean isVacinado = true;

        int dias = minhaIdade * 365;
        int horas = dias * 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Meu nome completo: " + meuNomeCompleto);
        System.out.println("Minha idade: " + minhaIdade);
        System.out.println("Minha altura: " + minhaAltura);
        System.out.println("Meu peso: " + meuPeso);
        System.out.println("Maior de Idade: " + isMaiorDeIdade);
        System.out.println("Estudante: " + isEstudante);
        System.out.println("Vacinado: " + isVacinado);
        System.out.println("Nome da namorada: " + nomeDaNamorada);
        System.out.println("Quantidade de irmãos: " + quantidadeDeIrmaos);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Dias de vida: " + dias);
        System.out.println("Horas de vida: " + horas);
        System.out.println("Minutos de vida: " + minutos);
        System.out.println("Segundos de vida: " + segundos);
    }
}
