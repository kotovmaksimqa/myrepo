package trycatchlesson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileDataMapper implements UserDataMapper {

    CustomNotFoundException customNotFoundException = new CustomNotFoundException();
    private User.UserBuilder foundUser = new User.UserBuilder();


    public static void createUser() throws IOException {
        FileWriter fr = new FileWriter("users.txt" );
        User.UserBuilder newUser = new User.UserBuilder();

        for (int i = 0; i < 6; i++) {

            User spanStr = newUser.name("Vasya" + i)
                                    .password("password" + i)
                                    .email("v.z.vasya" + i + "@gmail.com")
                                    .build();
            fr.write(String.valueOf(spanStr));

        }
        fr.close();

    }

    @Override
    public User findUserByName(String name) throws IOException, CustomNotFoundException {
        FileReader fr = new FileReader("users.txt");
        BufferedReader br = new BufferedReader(fr);

        String text = "";
        String line = br.readLine();
        while (line != null){
            text = line;
            String[] str = text.split(" ");

            for (String s : str) {
                if (s.equals(name)) return foundUser.name(str[0]).password(str[1]).email(str[2]).build();
            }
            line = br.readLine();
        }
        throw new CustomNotFoundException();
    }

    @Override
    public User findUserByEmail(String email) throws IOException, CustomNotFoundException {

        FileReader fr = new FileReader("users.txt");
        BufferedReader br = new BufferedReader(fr);

        String text = "";
        String line = br.readLine();
        while (line != null){
            text = line;
            String[] str = text.split(" ");

            for (String s : str) {
                if (s.equals(email)) return foundUser.name(str[0]).password(str[1]).email(str[2]).build();
            }
            line = br.readLine();
        }


        throw new CustomNotFoundException();
    }

//    private User searchUserInTextLine(String spanArr[] ) throws IOException, CustomNotFoundException {
//        while (spanLine != null){
//            spanText = spanLine;
//            String[] str = spanText.split(" ");
//
//            for (String s : str) {
//                if (s.equals(seekNameOrEmail)) return foundUser.name(str[0]).password(str[1]).email(str[2]).build();
//            }
//            spanLine = brR.readLine();
//        }
//        throw new CustomNotFoundException();
//    }
}
