public class Cozinheiro {


    public void adicionarLancheNoBalcao(){
            System.out.println("Lanche adicionado ao balcão.");
    }

    public void adicionarSucoNoBalcao(){
            System.out.println("Suco adicionado ao balcão.");
        }

        public void adicionarComboNoBalcao(){
            System.out.println("Combo adicionado ao balcão.");
            adicionarLancheNoBalcao();
            adicionarSucoNoBalcao();
        }
        public void prepararLanche(){
            System.out.println("Lanche preparado.");
        }
        public void prepararVitamina(){
            System.out.println("Vitamina preparada.");
        }
        public void prepararCombo(){
            System.out.println("Combo preparado.");
            prepararLanche();
            prepararVitamina();
        }
    public void prepararSuco(){
            System.out.println("Suco preparado.");
        }
        public void selecionarIgredienteLanche(){
            System.out.println("Ingrediente do lanche selecionado. Pao,salada,carne,queijo,tomate,cebola,alface.");
        }
        public void selecionarIgredientesVitamina(){
            System.out.println("Ingrediente da vitamina selecionado. Banana,leite,aveia.");
        }
        public void selecionarIgredientesSuco(){
            System.out.println("Ingrediente do suco selecionado. Laranja,abacaxi,limão.");
        }
        public void lavarIgredientes(){
            System.out.println("Ingredientes lavados.");
        }
        public void batervitaminaliquidificador(){
            System.out.println("Vitamina batida no liquidificador.");
        }
        public void fritarIgredienteslanche(){
            System.out.println("Ingredientes do lanche fritos,Carne e ovo.");
        }
        public void pedirParaTrocarGas(Atendente meuAmigo){
            meuAmigo.trocarGas();
        }
        public void pedirParaTrocarGas(Almoxarife meuAmigo){
            meuAmigo.trocarGas();
        }
        public void pedirIgredientes(Almoxarife almoxarife){
            almoxarife.entregarIgredientes();
        }
    }






