package Equipamentos.Estabelecimento;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;
import Equipamentos.impressora.ieskjet;
import Equipamentos.multifuncional.EquipamentoMultifuncoes;

public class Fabrica {
    public static void main(String[] args) {
        ieskjet ieskjet = new ieskjet();


        EquipamentoMultifuncoes em = new EquipamentoMultifuncoes();
        Impressora impressora = ieskjet;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;


        impressora.imprimir();
        System.out.println("Impressora criada com sucesso!");

        digitalizadora.digitalizar();
        System.out.println("Digitalizadora criada com sucesso!");

        copiadora.copiar();
        System.out.println("Copiadora criada com sucesso!");

        
        
    }

}
