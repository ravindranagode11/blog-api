package comcom.codewithdurgesg.blog.blogappapis.Service;

import java.util.List;

import comcom.codewithdurgesg.blog.blogappapis.entities.User;
import comcom.codewithdurgesg.blog.blogappapis.payloads.UserDto;

public interface UserService {
	
	
	 UserDto createUser (UserDto user);
            
	 UserDto updateUser(UserDto User,Integer userId);
	 
	 UserDto getUserById(Integer userId);
	 
	 List<UserDto> getAllUser();
	  
	 
	   void deleteUser(Integer userId); 
}
