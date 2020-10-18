public class youtuber{
    public int youtuber(){
        int duracionVideo=15;
        int duracionCancionmin=2;
        int duracionCancionseg=30;
        int minutoasegundo=60;
        int duracionVideoseg=duracionVideo*minutoasegundo;
        int duracionCancionseg1=duracionCancionmin*minutoasegundo+duracionCancionseg;
        int res=duracionVideoseg/duracionCancionseg1;
        return res;
        
    }
}
