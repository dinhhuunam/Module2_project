package Inheritance;

//Inheritance in Java
public class Runner {
	public static void main(String[] args) {
		//animal
		Animal animal=new Animal("Generic Animal", "Huge", 400);
		doAnimalStuff(animal, "slow");
		//dog
		Dog dog=new Dog();
		doAnimalStuff(dog,"fast");
		
		Dog yorkie = new Dog("Yorkie", 15);
		doAnimalStuff(yorkie, "fast");
		
		Dog retriever = new Dog("Larador Retriever",65,"Floppy","Swimmer");
		doAnimalStuff(retriever, "Slow");
		
		Dog wolf = new Dog("wolf", 40);
		doAnimalStuff(wolf, "slow");
		
		Fish goldie = new Fish("GoldFish",0.25,2,3);
		doAnimalStuff(goldie, "fast");
	}
	
//	Phương thức doAnimalStuff là static bởi vì muốn gọi trực tiếp trong hàm main
//	mà không phải khởi tạo đối tượng
	public static void doAnimalStuff(Animal animal,String speed) {
		animal.makeNoise();
		animal.move(speed);
		System.out.println(animal);
		System.out.println("----------------------------------------");
	}
}
