/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class Armario {
    String Cor;
    String NumModelo;
    String GeC;
    int QGavetas;
    int QPortas;
    
    public String getCor(){
        return Cor;
    }
    public void setCor (String Cor){
        this.Cor=Cor;
    }
    public String getNumModelo(){
        return NumModelo;
    }
    public void setNumModelo (String NumModelo){
        this.NumModelo=NumModelo;
    }
    public int getQGavetas(){
        return QGavetas;
    }
    public void setQGavetas (int QGavetas){
        this.QGavetas=QGavetas;
    }
    public int getQPortas(){
        return QPortas;
    }
    public void setQPortas (int QPortas ){
        this.QPortas=QPortas;
    }
    public String getGeC(){
        return GeC;
    }
    public void setGeC (String GeC){
        this.GeC=GeC;
    }

}
