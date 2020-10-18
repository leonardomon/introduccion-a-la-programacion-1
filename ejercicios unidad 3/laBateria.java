public class laBateria{
    public int CalcularBateria(){
        int rBateriaJugando=20;
        int rBateriaRedes=10;
        int rBateriaYoutube=15;
        int NivelBateria=55;
        double mediahora=0.5;
        double cuartohora=0.25;
        double dosterciosdehora=2/3;
        double res=-rBateriaJugando*mediahora-rBateriaRedes*cuartohora-rBateriaYoutube*dosterciosdehora+NivelBateria;
        return res;
    }
    }

