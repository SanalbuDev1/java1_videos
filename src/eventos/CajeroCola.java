package cajerocola;//se crea la cola dinamica

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CajeroCola {//clase creada
    
    ArrayList<Object> cola=new ArrayList<Object>();//arreglo que va a tener dentro un objeto. la cola es nuestro primer objeto
    
    public void Push (String s){//desntro push una variable de tipo estring (s)
        cola.add(s);//agrega lo que esta dentro de la varaible (s)
    }
    public void Pop(){//dentro de este metodo ocurre todo el procedimiento del programa
        if(cola.size()==0){//el tamaño de la cola es de cero si s cumple la condicion se envia mensaje
            JOptionPane.showMessageDialog(null,"El Cajero ya esta vacio");//mensaje mostrado si la cola es igual a cero
        }
        else{//si no cumple la condicion de cero
            cola.remove(0);//la cola es el primer elemento que ingresa y sale y remueve lo que esta en la posicion cero
        }
    }
    public String VerCola(){//este metodo mostrara lo que hay en la cola
        String p="";//variable de tipo string y se iguala a nada
        for(int i=0; i<cola.size();i++)//el tamaño de la cola aumenta de a uno
            p+="Cliente"+(i+1)+ " "+cola.get(i)+"\n";//con esto se visualiza lo que hay en la cola
        return p;//retorna lo que hay en la variable
    }
    public int numItems(){//nos da el numero de iteraciones que se van a hacer dentro de la cola
        return cola.size();//muestra lo que hay dentro de la cola
    }
    public String Empty(){
        String e="";
        if(cola.size()==0){//si es igual a cero se cumple la condicion
            e="El Cajero esta vacio";//si cumple se pone un texto 
        }
        else{//si no cumple la condicion se muestra el texto
            e="El Cajero no esta vacio";
        }
        return e;
    }
    public String Primero(){//mostrar cual fue el primer elemento ingresado en la cola
        String u=" ";//variable de tipo string
        if(cola.size()==0){//la misma condicion anterior 
        u=" ";//no hay ningun dato dentro de la cola, por eso se iguala a nada
        }
        else{
            u+=cola.get(0);//
        }
        return u;
    }
    public String Ultimo(){
        String u=" ";
            
        if(cola.size()==0){//no hay elementos dentro de la cola
            JOptionPane.showMessageDialog(null,"No hay Clientes");//si se cumple la condicion se muestra el mensaje
        }
        else{
        u+=cola.get(cola.size()-1);//de lo contratio muestre el ultimo valor que hay en la cola
        }
        return u;
        }
        public void Vaciarpila(){
            cola.clear();//para vaciar los elementos que hay dentro de la cola.
        }
    int cajero=0;
    public String cajero(){
        String mensaje="";
        cajero=cajero+1;
        if(cajero%2==0 && cajero%3!=0 && cajero%5!=0){
            mensaje="Lo atendio cajero 1";
        } else if(cajero%3==0 && cajero%2!=0 && cajero%5!=0){
            mensaje="Lo atendio cajero 2";
        }else if(cajero%5==0 && cajero%2!=0 && cajero%3!=0){
            mensaje="Lo atendio cajero 3";
        }else{
            mensaje="Lo atendieron en cola especial";
        }
        
        return mensaje;
    }
            
}
