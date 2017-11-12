package trycatchlesson;

import java.io.IOException;

public class MyNewAppForExceptions {

    public static void main(String[] args) throws IOException, CustomNotFoundException {

        UserFileDataMapper userFileDataMapper = new UserFileDataMapper();

        UserFileDataMapper.createUser();

        try {
            System.out.println(userFileDataMapper.findUserByName("Vasya5"));
        } catch (CustomNotFoundException e) {
                System.out.println("no such user");
        }



    }
}
