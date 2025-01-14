package calculadora_exerc_facil;

import javax.swing.JOptionPane;

public class Calculadora_exerc_facil {

    public static void main(String[] args) {
        // Declarando variáveis que serão usadas
        float fNum1;
        float fNum2;
        float fResposta;
        boolean bContinuar = true;

        // Esse trecho é onde o usuário deve selecionar a opção de usar ou não a calculadora
        String sInicio = JOptionPane.showInputDialog(null, "Seja bem-vindo ao projeto de nível fácil. Gostaria de usar a calculadora?\nY/N");
        
        // Verificação das respostas
        if (sInicio.equals("N")) {
            JOptionPane.showMessageDialog(null, "Tudo bem! Até o próximo projeto!");
        } else if (sInicio.equals("Y")) {
            while (bContinuar) {
                JOptionPane.showMessageDialog(null, "Ótimo! Preciso que pense em dois números e qual operação básica deseja realizar.");
                
                // Coletando os algarismos que ele selecionar
                String sNum1 = JOptionPane.showInputDialog("Escolha o primeiro número da operação:");
                fNum1 = Float.parseFloat(sNum1);
                
                String sNum2 = JOptionPane.showInputDialog("Escolha o segundo número da operação:");
                fNum2 = Float.parseFloat(sNum2);

                // Perguntando qual operação deseja
                String sOperacao = JOptionPane.showInputDialog("Digite abaixo o símbolo de qual operação deseja realizar com os números " + fNum1 + " e " + fNum2 + "?\n Adição (+)\n Subtração (-)\n Divisão (/)\n Multiplicação (*)");
                
                // Realizando a operação escolhida
                switch (sOperacao) {
                    case "+":
                        fResposta = fNum1 + fNum2;
                        JOptionPane.showMessageDialog(null, "A soma de " + fNum1 + " + " + fNum2 + " = " + fResposta);
                        break;
                    case "-":
                        fResposta = fNum1 - fNum2;
                        JOptionPane.showMessageDialog(null, "A subtração de " + fNum1 + " - " + fNum2 + " = " + fResposta);
                        break;
                    case "/":
                        if (fNum2 != 0) {
                            fResposta = fNum1 / fNum2;
                            JOptionPane.showMessageDialog(null, "A divisão de " + fNum1 + " / " + fNum2 + " = " + fResposta);
                        } else {
                            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!");
                        }
                        break;
                    case "*":
                        fResposta = fNum1 * fNum2;
                        JOptionPane.showMessageDialog(null, "A multiplicação de " + fNum1 + " * " + fNum2 + " = " + fResposta);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida!");
                        continue; // Se a operação não for válida, volta para a escolha da operação
                }

                // Perguntando se o usuário deseja continuar
                String sFinal = JOptionPane.showInputDialog("Deseja continuar?\nY/N");
                if (sFinal.equals("N")) {
                    bContinuar = false;
                    JOptionPane.showMessageDialog(null, "Até logo!");
                } else if (!sFinal.equals("Y")) {
                    JOptionPane.showMessageDialog(null, "Resposta inválida! Por favor, digite 'Y' para continuar ou 'N' para sair.");
                }
            }
        }
    }
}
