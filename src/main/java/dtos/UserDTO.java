package dtos;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserDTO
{

    String userName;
    String userPassword;

    public UserDTO(User user)
    {
        this.userName = user.getUserName();
        this.userPassword = user.getUserPass();
    }

    public static List<UserDTO> getDTOs(List<User> users)
    {
        List<UserDTO> userDTOs = new ArrayList<>();
        users.forEach(u -> userDTOs.add(new UserDTO(u)));
        return userDTOs;
    }
}

