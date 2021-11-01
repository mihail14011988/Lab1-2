
package Book;

public class Storage {
    private String namePublish;
    private String city;

    public Storage(String namePublish, String city) {
        setPublish(namePublish);
        setCity(city);
    }
    public String getNamePublish() {
        return namePublish;
    }
    public String getCity() {
        return city;
    }

    public void setPublish(String namePublish) {
        if(namePublish != null && ! namePublish.equals ("")){
            this.namePublish = namePublish;
        } else {
            System.out.println("Название издательства не должно быть пустым.");
        }
    }

    public void setCity(String city) {
        if(city != null && ! city.equals("")) {
            this.city = city;
        }
    }
}











