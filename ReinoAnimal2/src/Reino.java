

abstract class Animalabstrato {
		
	String Raca;
	
	public void atributos() {
		System.out.println("Animal  Leao Terrestre Carnivoro");
			
	}
}	
class Leao extends Animalabstrato{
	
}
	


public class Reino {

	
	
	public static void main(String[] args) {
	
	Leao c = new Leao();
	
	c.atributos();
		
	Animal a1 = new Animal();
	a1.Animais = "Girafa";
	a1.Classe = "Terrestre";
	a1.Tipo = "Mamifero";
	a1.status();
	
	Animal a2 = new Animal();
	a2.Animais = "Morcego";
	a2.Classe = "Voador";
	a2.Tipo = "Mamifero";
	a2.status();
	
	Animal a3 = new Animal();
	a3.Animais = "Baleia Azul";
	a3.Classe = "Aquatico";
	a3.Tipo = "Mamifero";
	a3.status();
	}

}
