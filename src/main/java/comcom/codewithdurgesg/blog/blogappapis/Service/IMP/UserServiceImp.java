package comcom.codewithdurgesg.blog.blogappapis.Service.IMP;
 import comcom.codewithdurgesg.blog.blogappapis.Repositary.*;
 import comcom.codewithdurgesg.blog.blogappapis.Exception.*;
import java.util.List;
import comcom.codewithdurgesg.blog.blogappapis.entities.*;
import comcom.codewithdurgesg.blog.blogappapis.Service.UserService;
import comcom.codewithdurgesg.blog.blogappapis.payloads.UserDto;
import comcom.codewithdurgesg.blog.blogappapis.Exception.*;
public class UserServiceImp implements UserService {

	
	
	   private UserRepo userRepo;
	@Override
	public UserDto createUser(UserDto userDto) {
		 User user = this.dtoTOUser(userDto);
		 User savesUser =   this.userRepo.save(user);
		return this.userTODto(savesUser);
	}

	@Override
	public UserDto updateUser(UserDto User, Integer userId) {
		
		 User user = this.userRepo.findById(userId)
				 .orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		  user.setName(userDto.getName());
		  
		  user.setEmail(userDto.getEmail());
		  user.setPassword(userDto.getPassword());
		  
		return null;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub

	}
	
	
	public User dtoTOUser(UserDto userDto)
	{
		User user = new User();
		
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user;
	}
	 public UserDto userTODto(User user)
	 {
		UserDto userDto= new UserDto();
		 userDto.setId(user.getId());
		 userDto.setName(user.getName());
		 userDto.setEmail(user.getEmail());
		 userDto.setAbout(user.getAbout());
		 userDto.setPassword(user.getPassword());
		   return userDto;
	 }
	
	
	
	
	
	

}
