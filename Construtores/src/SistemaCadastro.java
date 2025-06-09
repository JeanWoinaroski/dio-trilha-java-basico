public static void main(String[] args) {
    pessoa marcos = new pessoa("Marcos", "123");

    marcos.setEndereco("Rua das Flores, 123");
    

    System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    System.out.println("Endereço: " + marcos.getEndereco());
}