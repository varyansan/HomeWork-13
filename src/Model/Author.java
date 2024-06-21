package Model;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Author temp = (Author) obj;
        return temp.firstName.equals(this.firstName) && temp.secondName.equals(this.secondName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + secondName.hashCode();
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }

}