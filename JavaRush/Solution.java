package JavaRush;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут

            User user = new User();
            user.setFirstName("Ivan");
            user.setLastName("Ivanov");
            user.setBirthDate(new GregorianCalendar(1984, 11, 03).getTime());
            user.setCountry(User.Country.RUSSIA);
            user.setMale(true);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            for (User u : loadedObject.users) {
                System.out.println(u.getFirstName() + " " + u.getLastName() + " " + u.getCountry() + " " + u.getBirthDate());
            }

        outputStream.close();
        inputStream.close();

    } catch(IOException e)

    {
        //e.printStackTrace();
        System.out.println("Oops, something is wrong with my file");
    } catch(
    Exception e)

    {
        //e.printStackTrace();
        System.out.println("Oops, something is wrong with the save/load method");
    }

}
    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter pw = new PrintWriter(outputStream);
            SimpleDateFormat sDf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            for (User user : users) {
                pw.println(user.getFirstName());
                pw.println(user.getLastName());
                pw.println(sDf.format(user.getBirthDate()));
                pw.println(user.isMale());
                pw.println(user.getCountry());
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataInputStream reader = new DataInputStream(inputStream);

            int count = reader.readInt();
            for (int i = 0; i < count; i++){
                User user = new User();

                String firstName = reader.readUTF();
                if (firstName.equals("null")) firstName = null;
                user.setFirstName(firstName);
                String lastName = reader.readUTF();
                if (lastName.equals("null")) lastName = null;
                user.setLastName(lastName);
                user.setBirthDate(new Date(reader.readLong()));
                user.setMale(reader.readBoolean());
                user.setCountry(User.Country.valueOf(reader.readUTF()));

                users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
