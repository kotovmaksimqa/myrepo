package trycatchlesson;

import java.io.IOException;

public interface UserDataMapper {

    User findUserByName(String name) throws IOException, CustomNotFoundException;

    User findUserByEmail(String email) throws IOException, CustomNotFoundException;

}
