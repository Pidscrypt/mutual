package pidscrypt.world.mutual.mutal.api;


public class Contact {

        private String name;
        private String number;
        private int img;
        private String tag;

    public Contact(String name, String tag, int img) {
        this.name = name;
        this.tag = tag;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
