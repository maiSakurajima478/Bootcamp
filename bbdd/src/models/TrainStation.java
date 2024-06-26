package models;

public class TrainStation {
    private Integer id;
    private String name;
    private Municipality municipality;
    private String created_at;
    private String updated_at;


    public TrainStation(Integer id, String name, String ubicacion, Municipality municipality, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.municipality = municipality;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Municipality getMunicipality() {
        return municipality;
    }


    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }


    public String getCreated_at() {
        return created_at;
    }


    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }


    public String getUpdated_at() {
        return updated_at;
    }


    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    
}
