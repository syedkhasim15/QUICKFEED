package com.project.controller;

import com.project.model.Image;
import com.project.service.ImageService;
import com.project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


//@RestController
//@RequestMapping("/student")
//@CrossOrigin
@Controller
public class ClientController {
    @Autowired
    private ImageService imageService;    
    private StudentService studentService;
    
    

    @GetMapping("/ping")
    @ResponseBody
    public String hello_world(){
        return "Hello World!";
    }

    // display image
    @GetMapping("/display")
    public ResponseEntity<byte[]> displayImage(@RequestParam("id") long id) throws IOException, SQLException
    {
        Image image = imageService.viewById(id);
        byte [] imageBytes = null;
        imageBytes = image.getImage().getBytes(1,(int) image.getImage().length());
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    }
    
    
    @GetMapping("/dis_name")
    public ResponseEntity<byte[]> displayName(@RequestParam("id") long id) throws IOException, SQLException
    {
        Image image = imageService.viewById(id);
        byte [] imageBytes = null;
        imageBytes = image.getImage().getBytes(1,(int) image.getImage().length());
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
    } 

    
    //get content
    @GetMapping("/getAll")
    public List<Image> list(){
        return studentService.getAllStudents();
    }
    

    // view All images
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView("index");
        List<Image> imageList = imageService.viewAll();
        mv.addObject("imageList", imageList);
        return mv;
    }

    
    // add image - get
    @GetMapping("/add")
    public ModelAndView addImage(){
        return new ModelAndView("addimage");
    }

    // add image - post
    @PostMapping("/add")
    public String addImagePost(HttpServletRequest request,@RequestParam("image") MultipartFile file,
    		@RequestParam("name") String name,
    		@RequestParam("cap") String cap,
    		@RequestParam("location") String location,
			@RequestParam("content") String content)
				
    		throws IOException, SerialException, SQLException
    {
	      byte[] bytes = file.getBytes();
	      Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
	     
	      
	      Image image = new Image();
	      image.setImage(blob);
	      image.setCaption(cap);
	      image.setName(name);
	      image.setContent(content);
	      image.setLocation(location);
	      imageService.create(image);
	              
	      return "redirect:/";
    }
    
    
   //student
    
//    @PostMapping("/add")
//    public String add(@RequestBody Image student){
//        studentService.saveStudent(student);
//        return "New student is added";
//    }

}
