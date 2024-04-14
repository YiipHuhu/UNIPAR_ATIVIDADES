// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        String nomeAluno;
        int idadeAluno;
        double notaProva1;
        double notaProva2;
        double mediaFinal;

//var de  info
        nomeAluno = "Alan Przyvara";
        idadeAluno = 19;
        notaProva1 = 8.4;
        notaProva2 = 9.8;

//calc
        mediaFinal = (notaProva1 + notaProva2) / 2;

//exibicao
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("Nota da prova 1: " + notaProva1);
        System.out.println("Nota da prova 2: " + notaProva2);
        System.out.printf("Media final: %.1f\n", mediaFinal);
        
        //System.out.printf("Media final: %.1f\n", mediaFinal); forma mais simples de como formatar a exibicao do valor %.1f\n
    }
}
