/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapalucyane;


public class MapaLucyane {

    public static void main(String[] args) {
        Quadra quadra = new Quadra();
        Locatario locatario = new Locatario();
        
        Locacao locacao = new Locacao(quadra, locatario);
        locacao.cadastrarLocacao();
    }
}
    

