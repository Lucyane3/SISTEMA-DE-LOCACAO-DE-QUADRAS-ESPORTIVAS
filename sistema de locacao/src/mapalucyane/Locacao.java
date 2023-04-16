/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapalucyane;

import javax.swing.JOptionPane;

public class Locacao { 
    
    private Locatario locatario;
    private Quadra quadra;   
    private int tempoMinuto;
    private char necessitaEquipamento;
   
    public Locacao(Quadra quadra, Locatario locatario) {
        this.quadra = quadra;
        this.locatario = locatario;
    }
    
  
    public Locatario getLocatario() {
        return locatario;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }
      public double calcularLocacao() {
        double valorLocacao = tempoMinuto * quadra.getValorMinuto();
        if (tempoMinuto >= 120) {
            valorLocacao *= 0.9;
        }
        if (necessitaEquipamento == 's' || necessitaEquipamento == 'S') {
            valorLocacao += 50.0;
        }
       
        return valorLocacao;
    }
    
    public void mostrarResumoLocacao() {
        System.out.println("Locatário");
        System.out.println("Nome: " + locatario.getNome());
        System.out.println("CPF: " + locatario.getCpf());
        System.out.println("Telefone: " + locatario.getTelefone());
        System.out.println("Ano de Nascimento: " + locatario.getAnoNascimento());
        System.out.println("Quadra");
        System.out.println("Tipo de Quadra: " + quadra.getTipo());
        System.out.println("Nome da Quadra: " + quadra.getNome());
        System.out.println("Valor do Minuto: " + quadra.getValorMinuto());
        System.out.println("Locação");
        System.out.println("Tempo em Minutos: " + tempoMinuto);
        System.out.println("Necessita Equipamento: " + necessitaEquipamento);
        System.out.println("Valor Calculado: " + calcularLocacao());
    }

    public void cadastrarLocacao() {
        this.quadra.cadastrarQuadra();
        this.locatario.cadastrarLocatario();
        this.locatario.verificarMaiorIdade();
        tempoMinuto = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da locação em minutos:"));
        necessitaEquipamento = JOptionPane.showInputDialog("Necessita equipamento? (S - Sim, N - Não)").charAt(0);
        mostrarResumoLocacao();
    }
}