public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2, int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run(){
        if(isCheck()){
            while (this.f1.health > 0 && this.f2.health > 0){
                f2.health = f1.hit(f2);
                break;
            }

        }else {
            System.out.println("Sporcuların sikletleri uymuyor.")
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.wight <= maxWeight);
    }
}