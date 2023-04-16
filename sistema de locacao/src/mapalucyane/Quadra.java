/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapalucyane;

import javax.swing.JOptionPane;


public class Quadra {
    
    private String nome;
    private String tipoDaQuadra;
    private int valorMinuto;
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipoDaQuadra;
    }

    public void setTipo(String tipo) {
        this.tipoDaQuadra = tipo;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = (int) valorMinuto;
    }       
    
    public void cadastrarQuadra() {
        String nomeQuadra = JOptionPane.showInputDialog("Nome da Quadra:");
        String tipoQuadra = JOptionPane.showInputDialog("Tipo da Quadra:");
        int valorMinuto = (int) Double.parseDouble(JOptionPane.showInputDialog("Valor do Minuto:"));
        this.setNome(nomeQuadra);
        this.setTipo(tipoQuadra);
        this.setValorMinuto(valorMinuto);
    }

    

}
