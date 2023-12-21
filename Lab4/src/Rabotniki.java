public class Rabotniki
{
    Integer id;
    String fam;
    String name;
    String otc;
    String dateb;
    String datep;
    String datev;
    String datebegin;
    String dateend;
    Integer vdolid;
    Integer specid;
    Integer kvalid;
    Float stav;
    Integer progid;

    void setId(Integer id) { this.id = id; }
    void setFam(String fam) { this.fam = fam; }
    void setName(String name) { this.name = name; }
    void setOtc(String otc) {this.otc = otc; }
    void setDateb(String dateb) { this.dateb = dateb; }
    void setDatep(String datep) { this.datep = datep; }
    void setDatev(String datev) { this.datev = datev; }
    void setDatebegin(String datebegin) { this.datebegin = datebegin; }
    void setDateend(String dateend) { this.dateend = dateend; }
    void setVdolid(Integer vdolid) { this.vdolid = vdolid; }
    void setSpecid(Integer specid) { this.specid = specid; }
    void setKlavid(Integer klavid) { this.kvalid = klavid; }
    void setStav(Float stav) { this.stav = stav; }
    void setProgid(Integer progid) { this.progid = progid; }

    Integer getId() { return this.id; }
    String getFam() { return this.fam; }
    String getName() { return this.name; }
    String getOtc() { return this.otc; }
    String getDateb() { return this.dateb; }
    String getDatep() { return this.datep; }
    String getDatev() { return this.datev; }
    String getDatebegin() { return this.datebegin; }
    String getDateend() { return this.dateend; }
    Integer getVdolid() { return this.vdolid; }
    Integer getSpecid() { return this.specid; }
    Integer getKlavid() { return this.kvalid; }
    Float getStav() { return this.stav; }
    Integer getProgid() { return this.progid; }
}