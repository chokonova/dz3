
public class Main {
    public static void main(String[] args) {
        double[] num = {0.56, -0.78, 0.90, 0.12, 0.4, -0.55, 0.77, 0.30, 0.1, 0.5, 0.9, -0.88, 0.73, 0.66, 0.50};
        boolean hp=true;
int ls=0;
double neosfera=0.0;
        for(double art: num){
       if(art<0){
       hp=false;
       } else if (hp) {
   ls++;
   neosfera+=art;
       }
   }
        System.out.println(neosfera/ls);
    }
}
