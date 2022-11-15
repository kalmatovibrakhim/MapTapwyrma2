import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<City>cities=new ArrayList<>();

        cities.add(new City(312,"Bishkek","kyrgyzstan"));
        cities.add(new City(3222,"Osh","kyrgyzstan"));
        cities.add(new City(495,"Moscow","russia"));
        cities.add(new City(3133,"Karabalta","kyrgyzstan"));
        cities.add(new City(3922,"karakol","kyrgyzstan"));
        cities.add(new City(3656,"Isfana","kyrgyzstan"));
        cities.add(new City(3657,"Kyzylkya","kyrgzstan"));

        Set<City>treeSet =new TreeSet<>(new reverseComparator());

        for (City c:cities) {
//            System.out.println(c);
            if(c.getCode()%2!=0){
//                System.out.println(c);
                treeSet.add(c);
            }
        }
        System.out.println(treeSet);


    }
}
class reverseComparator implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        int x = o2.getCode()-o1.getCode();
        if (x==0){
            return o2.getName().compareTo(o1.getName());
        }
        return x;
    }
}

