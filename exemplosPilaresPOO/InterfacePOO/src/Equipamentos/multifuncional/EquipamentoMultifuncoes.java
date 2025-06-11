package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultifuncoes implements Copiadora, Digitalizadora,Impressora{

    @Override
    public void copiar() {
        System.out.println("Copiando Via Equipamento Multifuncoes");
        
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando Via Equipamento Multifuncoes");
        
    }

    @Override
    public void imprimir() {

        System.out.println("Imprimindo Via Equipamento Multifuncoes");
        
    }



}
