/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args){
    Armario cozinha = new Armario();
    cozinha.setCor("Branco");
    cozinha.setNumModelo("12345");
    cozinha.setQGavetas(3);
    cozinha.setQPortas(8);
    cozinha.setGeC("Sim");
    
    System.out.println("-----------ARMARIO DE COZINHA----------------");
    System.out.println("Cor do armario:"+cozinha.getCor());
    System.out.println("Numero do modelo:"+cozinha.getNumModelo());
    System.out.println("Quantidade de gavetas:"+cozinha.getQGavetas());
    System.out.println("Quantidade de portas:"+cozinha.getQPortas());
    System.out.println("Possui gabinete de pia e cuba? "+cozinha.getGeC());
    
    Geladeira cozinha2 = new Geladeira();
    cozinha2.setCor("Cinza");
    cozinha2.setNumModelo("6789");
    cozinha2.setFreezer("Sim");
    cozinha2.setDA("Não");
    cozinha2.setQPortas(2);
    
    System.out.println("-----------GELADEIRA----------------");
    System.out.println("Cor da geladeira:"+cozinha2.getCor());
    System.out.println("Numero do modelo:"+cozinha2.getNumModelo());
    System.out.println("Possui freezer? "+cozinha2.getFreezer());
    System.out.println("Possui dispenser de água? "+cozinha2.getDA());
    System.out.println("Quantidade de portas:"+cozinha2.getQPortas());
    }
}