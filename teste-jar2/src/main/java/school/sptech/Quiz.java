package school.sptech;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Antes de começar preciso fazer algumas verfificações");

        System.out.println("Seu nome é Lucas?");
        String confirma = scanner.next();

        if (confirma.equals("sim")){
            System.out.println("qual deles? digite o sobrenome");
            String sobrenome = scanner.next();

            if (sobrenome.toLowerCase().equals("coelho") || sobrenome.toLowerCase().equals("gonçalves")){
                System.out.println("Vamos começar nossas perguntas! (dica: utlize / para datas, e não tem nem acento ou ç");
                System.out.println("Qual é minha data de nascimento?");
                String pergunta1 = scanner.next();

                if (pergunta1.equals("16/07/2007")){
                    System.out.println("Qual é minha cor favorita?");
                    String pergunta2 = scanner.next();

                    if (pergunta2.toLowerCase().equals("rosa") || pergunta2.toLowerCase().equals("preto") || pergunta2.toLowerCase().equals("branco") || pergunta2.toLowerCase().equals("cinza")){
                        System.out.println("Quantos gatos eu tenho?");
                        int pergunta3 = scanner.nextInt();

                        if (pergunta3 == 3){
                            System.out.println("Qual palavra que eu falo e te deixa bravo? (geralmente ocorre quando eu falei algo e vc não escutou)");
                            String pergunta4 = scanner.next();

                            if (pergunta4.toLowerCase().equals("deixa")){
                                System.out.println("Qual é minha música favorita?");
                                int pergunta5 = scanner.nextInt();

                                if (pergunta5 == 505){
                                    System.out.println("Qual alimento é a mesma cor da minha pele?");
                                    String pergunta6 = scanner.next();
                                    System.out.println(pergunta6);

                                    if (pergunta6.toLowerCase().equals("pacoca") ){
                                        System.out.println("Qual pessoa da sala tem a voz que me irrita?");
                                        String pergunta7 = scanner.next();

                                        if (pergunta7.toLowerCase().equals("thabata")){
                                            System.out.println("Quem era o monitor que tinha um 'crush' em mim?");
                                            String pergunta8 = scanner.next();

                                            if (pergunta8.toLowerCase().equals("alan")){
                                                System.out.println("Qual foi a série que eu te recomendei?");
                                                scanner.nextLine();
                                                String pergunta9 = scanner.nextLine();

                                                if (pergunta9.toLowerCase().equals("the big bang theory")){
                                                    System.out.println("o que eu falava quando eu era inocente?");
                                                    String pergunta10 = scanner.nextLine();

                                                    if (pergunta10.toLowerCase().equals("inocente como cliente")){
                                                        System.out.println("PARABÉNS VC REALMENTE ME CONHECE!!");
                                                        System.out.println("obrigado por estar comigo nessa! :D");
                                                    }else {
                                                        System.out.println("perdeu");
                                                    }
                                                }else {
                                                    System.out.println("perdeu");
                                                    return;
                                                }
                                            }else {
                                                System.out.println("perdeu");
                                            }
                                        }else {
                                            System.out.println("perdeu");
                                        }
                                    }else {
                                        System.out.println("perdeu");
                                    }
                                }else {
                                    System.out.println("perdeu");
                                }
                            }else {
                                System.out.println("perdeu");
                            }
                        }else {
                            System.out.println("perdeu");
                        }
                    }else {
                        System.out.println("perdeu");
                    }

                }else {
                    System.out.println("perdeu");
                }
            }else {
                System.out.println("você não é o lucas que eu quero!");
            }
        }else {
            System.out.println("isso não é paa vc");
        }
    }
}