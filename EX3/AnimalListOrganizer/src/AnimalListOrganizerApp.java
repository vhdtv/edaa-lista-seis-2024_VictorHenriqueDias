public class AnimalListOrganizerApp {
    public static void main(String[] args) throws Exception {
        AnimalListInterface animalList = new AnimalList();
        animalList.addAnimal("Onça-pintada (Jaguar)");
        animalList.addAnimal("Macaco-prego (Black-capped Capuchin)");
        animalList.addAnimal("Arara-azul (Hyacinth Macaw)");
        animalList.addAnimal("Tamanduá-bandeira (Giant Anteater)");
        animalList.addAnimal("Cobra-coral (Coral Snake)");
        animalList.addAnimal("Sucuri (Green Anaconda)");
        animalList.addAnimal("Gavião-real (Harpy Eagle)");
        animalList.addAnimal("Capivara (Capybara)");
        animalList.addAnimal("Cutia (Agouti)");
        animalList.addAnimal("Preguiça (Sloth)");
        System.out.println("---Lista desordenada---");
        animalList.showAnimalList();
        animalList.organizeAnimalList();
        System.out.println("---Lista Ordenada---");
        animalList.showAnimalList();

    }
}
