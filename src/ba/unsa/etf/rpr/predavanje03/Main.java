package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Sat s = new Sat(15, 5,4);
    s.Ispisi();
    s.Sljedeci();
    s.Ispisi();
    s.PomjeriZa(-48);
    s.Ispisi();
    s.Postavi(0,0,0);
    s.Ispisi();
    }
    static class Sat{
      int h;
        int m;
        int s;

        public int getS() {
            return s;
        }

        public int getM() {
            return m;
        }

        public int getH() {
            return h;
        }

       Sat (int sati, int minute, int sekunde){Postavi(sati,minute,sekunde);}

       void Postavi(int sati, int minute, int sekunde){h = sati; m = minute; s = sekunde;}

       void Sljedeci(){
            s++;
            if(s == 60){s = 0; m++;}
            if(m == 60){m = 0; h++;}
            if(h == 24)h=0;
        }


    void Prethodni(){
        s++;
        if(s == -1){s = 59; m--;}
        if(m == -1){m = 59; h--;}
        if(h == -1)h = 23;
    }

    void PomjeriZa (int pom){
            if(pom > 0)for(int i = 0; i < pom; i++) Sljedeci();
            else for(int i = 0; i < -pom; i++) Prethodni();
    }

    void Ispisi(){
            System.out.println(h+":"+ m+":"+s);
    }

    };

}
