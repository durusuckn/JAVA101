public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage,int health,int weight,double dodge){

        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;

    }
    public boolean dodge(){
        double randomValue=Math.random()*100;
        return randomValue<=this.dodge;
    }
    public int hit(Fighter fht){
        System.out.println("-------------------------");
        System.out.println(this.name+"=>"+fht.name+" "+this.damage+" hasar vurdu");
        if(fht.dodge()){
            System.out.println(fht.name+" gelen hasarı savurdu...");
            return fht.health;
        }
        if(fht.health-this.damage<0){
            return 0;
        }
        return fht.health-this.damage;
    }
}
