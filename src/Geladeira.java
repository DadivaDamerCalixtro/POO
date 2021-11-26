/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class Geladeira {
    String Cor;
    String NumModelo;
    String Freezer;
    String DA;
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
    public String getFreezer(){
        return Freezer;
    }
    public void setFreezer (String Freezer){
        this.Freezer=Freezer;
    }
    public int getQPortas(){
        return QPortas;
    }
    public void setQPortas (int QPortas ){
        this.QPortas=QPortas;
    }
    public String getDA(){
        return DA;
    }
    public void setDA (String DA){
        this.DA=DA;
    }
}
