package Assets;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Читаем и пишем в файл: Human
*/
public class Lesson2001 {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (ivanov == somePerson)
                System.out.println("yes");
            else System.out.println("no");

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println((name==null)?"N":"Y");
            printWriter.flush();
            if ( name!=null ) {
                printWriter.println(name);
                printWriter.flush();
                printWriter.println(Integer.toString(assets.size()));
                printWriter.flush();
                for (Asset asset:assets) {
                    printWriter.println(asset.getName());
                    printWriter.println(Double.toString(asset.getPrice()));
                    printWriter.flush();
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String isHuman = bufferedReader.readLine();

            if ( isHuman.equals("Y")) {
                String sName = bufferedReader.readLine();
                List<Asset> loadAssets = new ArrayList<>();
                int count = Integer.parseInt(bufferedReader.readLine());
                for (int i = 0; i < count; i++) {
                    String nameAsset = bufferedReader.readLine();
                    double priceAsset = Double.parseDouble(bufferedReader.readLine());
                    loadAssets.add(new Asset(nameAsset, priceAsset));
                }

                name = sName;
                assets = loadAssets;
            }

            bufferedReader.close();
        }
    }
}
