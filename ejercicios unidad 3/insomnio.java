
public class insomnio{
    public int calcularTiempo(){
        int horaDurmio=2;
        int minutoDurmio=45;
        int HoraDesperto=11;
        int minutoDesperto=25;
        int HoraDurmioMinutos=horaDurmio*60+minutoDurmio;
        int HoraDespertoMinutos=HoraDesperto*60+minutoDesperto;
        int res=HoraDespertoMinutos-HoraDurmioMinutos;
        return res;
    }
}
