import java.util.Objects;

public class City implements Comparable<City>{
    private int code;
    private String name;
    private String country;

    public City(int code, String name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int compareTo(City o) {
        int c = code-o.code;
        if (c==0){
            return name.compareTo(o.getName());
        }
        return c;
    }


//    @Override
//    public int compareTo(City o) {
//        return o.code-code;
//    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

}
