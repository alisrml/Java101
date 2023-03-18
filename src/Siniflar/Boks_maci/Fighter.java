public class Fighter {
    string name;
    int damage;
    int health;
    int weight;

    Fighter(String name,int damage,int health,int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    int hit(Fighter foe){
        System.out.print(this.name + " => "+ foe.name + " "+ this.damage+" hasar vurdu.")
        return 0;
    }
}