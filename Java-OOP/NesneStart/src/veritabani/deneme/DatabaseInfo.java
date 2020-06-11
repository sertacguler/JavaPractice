package veritabani.deneme;

public enum DatabaseInfo {

    DATABASE_URL("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"),
    KULLANICI_ADI("root"),
    SIFRE("12345");

    private String value;

    private DatabaseInfo(String value){
        this.value=value;
    }

    public String getValue(){
        return this.value;
    }

}
