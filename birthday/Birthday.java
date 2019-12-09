package birthday;

public class Birthday {
    String name;
    int month;

    public Birthday(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "name='" + name + '\'' +
                ", month=" + month +
                '}';
    }
}
/*class Test_Jdbc{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection();
    }
}*/