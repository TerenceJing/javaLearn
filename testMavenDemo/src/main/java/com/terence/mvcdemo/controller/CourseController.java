package com.terence.mvcdemo.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.terence.mvcdemo.model.Course;
import com.terence.mvcdemo.service.CourseService;

//业务依赖
	//标识Controller注解之后会被Spring的DispatcherServlet的上下文所管理，并且完成依赖注入
@Controller    

//通过类级别的annotation映射注解 标明应该反映哪种类型的url，但是还要映射到类中的方法上
@RequestMapping("/courses")  //处理根目录url下的所有/courses/**,此类url都将被拦截
public class CourseController {
	private static Logger log=LoggerFactory.getLogger(CourseController.class);
	
	
	private CourseService courseService;
	
	@Autowired //快捷键Ctrl+shift+O
	public void setCourseService(CourseService courseService)
	{
		this.courseService=courseService;
	}
	
	//业务方法，提供一个根据课程标识查询课程内容的业务逻辑 	
	/*
	 * 通过注解Annotation，映射到类中的方法上，配合映射的类类完成请求。
	 * 声明方法将处理/courses/view?courseId=123
	 * 其中，要在参数中声明绑定哪个是请求url中的传递的参数
	 * 另外，下面参数Model是Spring MVC 特有的类型
	 * (查询字符串风格)
	 * 访问路径例子 http://localhost:8080/courses/view?courseId=123
	 */
	@RequestMapping(value="/view",method=RequestMethod.GET)					
	public String viewCourse(@RequestParam("courseId") Integer courseId,Model model)
	{
		log.debug("In viewCourse,courseId={}",courseId); //通过日志查看上述url中传递参数绑定的值
		Course course=courseService.getCourseById(courseId);
		model.addAttribute(course);
		System.out.println(courseId);
		return "course_overview";
	}
	///courses/view2/{courseId}
	/*
	 * 通过如下声明可以完成变量的绑定和路参的转换
	 * （Request风格）
	 *访问路径例子 http://localhost:8080/courses/view2/556
	 */
	
	@RequestMapping(value="/view2/{courseId}",method=RequestMethod.GET)
	public String viewCourse2(@PathVariable("courseId")Integer courseId,Map<String,Object> model)
	{
		log.debug("In viewCourse2,courseId={}",courseId);
		Course course=courseService.getCourseById(courseId);
		model.put("course", course);
		return "course_overview";
	}
	/*
	 * 使用HttpServletRequest（或者HttpSession）对象集成在SpringMVC中
	 * 通过Request来获取参数
	 * 首先需要在依赖管理文件pom.xml总引入servlet-api
	 * 
	 */
	//   /courses/view3?courseId=892形式的URL
	@RequestMapping("view3")
	public String viewCourse3(HttpServletRequest request)
	{
		Integer courseId=Integer.valueOf(request.getParameter("courseId"));
		log.debug("In viewCourse3,courseId={}",courseId);
		Course course=courseService.getCourseById(courseId);
		request.setAttribute("course", course);
		return "course_overview";
	}
	
	/*
	 * 管理员可以添加课程
	 * 请求url要以admin的身份，并携带参数"add"
	 */
	@RequestMapping(value="/admin",method=RequestMethod.GET,params="add")
	public String createCourse()
	{
		
		return "course_admin/edit";
	}
	//@ModelAttribute方法参数级别的Annotation，通过参数级别的注解绑定路残
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String doSave(@ModelAttribute Course course)
	{
		//log.debug("Info of course:");
		//log.debug(ReflectionToStringBuilder.toString(course));//阿帕奇lin包中的类
		//在此进行业务操作，如数据库持久化
		course.setCourseId(123);
		
		//完成操作会后，调到一个页面可以看到结果
		//利用请求重定向
		return "redirect:view2/"+course.getCourseId();
		
	}
	
	//响应文件上传请求URL
	@RequestMapping(value="/upload" ,method=RequestMethod.GET)
	public String showUploadPage()
	{
		return "course_admin/file";
	}
	
	//递交上传文件，并且跳到上传后的提示页面
	//通过绑定路参，将递交的MultipartFile类型的的文件file上传到服务器中
	//无损传输单个文件
	@RequestMapping(value="/doUpload" ,method=RequestMethod.POST)
	public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException
	{
		if(!file.isEmpty())
		{
			log.debug("Process file:{}",file.getOriginalFilename());
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("C:\\Users\\Terence\\workspace\\DOCUMENTS",System.currentTimeMillis()+"_"+file.getOriginalFilename()));
		}
		return "success";
	}
	
	//Json
	/*
	 * 访问URL跟下直接跟路参：http://localhost:8080/courses/568
	 * @ResponseBody表示返回的对象course会被响应所使用。
	 * @PathVariable则是用于绑定路参路参
	 */
	@RequestMapping(value="/{courseId}",method=RequestMethod.GET)
	public @ResponseBody Course getCourseInJson(@PathVariable Integer courseId)
	{
		return courseService.getCourseById(courseId);
	}
	
	@RequestMapping(value="/jsontype/{courseId}",method=RequestMethod.GET)
	
	/*
	 * @PathVariable绑定查询参数和方法参数
	 * 返回类型是一个泛型参数，这是一个springMVC提供的一个包裹返回对象的类。
	 */
	public ResponseEntity<Course> getCourseInJson2(@PathVariable Integer courseId)
	{
		Course course=courseService.getCourseById(courseId);
		return new ResponseEntity<Course>(course,HttpStatus.OK);
	}
}
