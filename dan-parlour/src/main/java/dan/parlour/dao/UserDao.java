package dan.parlour.dao;

import dan.parlour.entity.User;

//DAO Pattern for User
public interface UserDao {

    public User findUserByEmail(String email);

    public User findUserByUsername(String username);
    
    public void saveUser(User user);
        
}
