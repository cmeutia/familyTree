package id.co.ndid.familyTree.rest;

import id.co.ndid.familyTree.model.User;
import id.co.ndid.familyTree.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired  private UserService userService;  
      
    @RequestMapping(value = "/user/findAll", method = RequestMethod.GET, headers = "Accept=application/json")  
    public List<User> findAll(Model model) {            
        List<User> users = userService.findAllUsers(); 
        return users;  
    }  
  
    @RequestMapping(value = "/user/getUser/{id}", method = RequestMethod.GET, headers = "Accept=application/json")  
    public User getUserById(@PathVariable int id) {  
        return userService.findById(id);  
    }  
  
    @RequestMapping(value = "/user/add", method = RequestMethod.POST, headers = "Accept=application/json")  
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);  
    }  
  
    @RequestMapping(value = "/user/update", method = RequestMethod.PUT, headers = "Accept=application/json")  
    public void updateUser(@RequestBody User user) {  
         userService.updateUser(user);  
    }  
  
    @RequestMapping(value = "/user/delete/{ssoId}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
    public void deleteUser(@PathVariable("ssoId") String ssoId) {  
        userService.deleteUserBySSO(ssoId);
    }     

}
