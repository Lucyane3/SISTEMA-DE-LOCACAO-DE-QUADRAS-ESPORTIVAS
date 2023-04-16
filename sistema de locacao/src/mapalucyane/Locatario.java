/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapalucyane;

import java.util.Calendar;
import javax.swing.JOptionPane;


public class Locatario {
    
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
   
    public boolean verificarMaiorIdade() {
        int anoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoCorrente - this.getAnoNascimento();
        
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer o cadastro. Locatário menor de idade!");
            System.exit(0);
        }
        return false;
    }
     
    public void cadastrarLocatario() {
        this.setNome(JOptionPane.showInputDialog("Digite o nome do locatário:"));
        this.setCpf(JOptionPane.showInputDialog("Digite o CPF do locatário:"));
        this.setTelefone(JOptionPane.showInputDialog("Digite o telefone do locatário:"));
        this.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do locatário:")));
    }
}
