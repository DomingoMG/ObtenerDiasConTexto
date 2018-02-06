import java.text.SimpleDateFormat;
import java.util.Date;

public class testMain
{
    public static String ObtenerDias, ObtenerMes, ObtenerAnos;
    public static void main(String[] args)
    {
        int dias;
        int mes;
        String anos;
        SimpleDateFormat sacarAnos;

        Date date = new Date();
        dias = date.getDay();
        mes = date.getMonth();

        String[] DiasSemanas, Meses;
        DiasSemanas = new String[] {"Domingos", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábados"};
        Meses = new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre","Octubre", "Noviembre", "Diciembre"};

        // Calcular Años Actual
        sacarAnos = new SimpleDateFormat("yyyy");
        anos = sacarAnos.format(date);
        ObtenerAnos = anos;

        //Calcular el Día Actual
        for (int d=0; d<7; d++)
        {
            if (dias == d)
            {
                ObtenerDias = DiasSemanas[dias];
            }
        }
        //Calcular Mes actual
        for (int m=0; m<11; m++)
        {
            if (mes == m)
            {
                ObtenerMes = Meses[m];
            }
        }
        System.out.println(ObtenerDias);
        System.out.println(ObtenerMes);
        System.out.println(ObtenerAnos);
    }
}
