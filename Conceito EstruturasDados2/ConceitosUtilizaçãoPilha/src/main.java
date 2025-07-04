public class main {
    public static void main(String[] args) {


        Pilha minhaPilha = new Pilha();
		
		
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		minhaPilha.push(new No(6));
		minhaPilha.push(new No(7));
        minhaPilha.push(new No(8));

        minhaPilha.pop();
        minhaPilha.pop();
		System.out.println(minhaPilha);
    }
}
