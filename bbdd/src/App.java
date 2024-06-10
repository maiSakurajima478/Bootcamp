import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import models.Departament;
import models.Label;
import models.Municipality;
import models.Report;
import models.TrainStation;
import models.User;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime curren_date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = curren_date.format(formatter);

        Departament departament_1 = new Departament(1, "Boyaca", now, now);
        Municipality municipality_1 = new Municipality(1, "Example Municipio", departament_1, now, now);
        TrainStation train_station_1 = new TrainStation(1, "Example Name", "Example Ubicacion", municipality_1, now, now);
        Label label_1 = new Label(1, "label 1", now, now);

        User user_1 = new User(1, "Juan", "Perez", "user@gmail.com", "example123", now, now);

        Report report_1 = new Report(1, "Example Titulo", "Example Contenido", "https://drive.google.com/publicaciones/example.jpg", user_1, label_1, train_station_1, now, now);

        System.out.println("\n\t\t==== Mostrando Reporte =====");
        System.out.println("Label: "+report_1.getLabel().getName());
        System.out.println("Titulo: "+ report_1.getTitle());
        System.out.println("Contenido: "+report_1.getContent());
        System.out.println("Archivo: "+report_1.getFile_url());
        System.out.println("Posteado: "+report_1.getCreated_at());
        System.out.println("Usuario: "+report_1.getUser().getEmail());
        System.out.println("Estacion: "+report_1.getTrain_satation().getName());
        System.out.println("Municipio: "+report_1.getTrain_satation().getMunicipality().getName());
        System.out.println("Departamento: "+report_1.getTrain_satation().getMunicipality().getDepartament().getName());

    }
}
