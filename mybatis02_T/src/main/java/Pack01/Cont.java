package Pack01;

import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Pack01.Person;


@Controller
public class Cont {
	@RequestMapping("/t1")
	public String method01(Model model, 
			@RequestParam(value="name") String name,
			@RequestParam(value="age") int age
			) {
		System.out.println("함수콜");
		System.out.println(name + " " + age);

		//System.out.println(1);

		SqlSessionFactory ssf = null;
		SqlSession session = null;
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}

		ssf = new SqlSessionFactoryBuilder().build(is);
		session = ssf.openSession();

		try {
			System.out.println("연결"); //result가 양수 값이면 정상적으로 실행됨
			
			Person p = new Person();
			p.setName(name);
			p.setAge(age);
			
			if(session.insert("test05", p) > 0)	session.commit();
			//if(session.insert("test06", p) > 0)	session.commit();
			//if(session.insert("test07", p) > 0)	session.commit();
			
			LinkedList<String> mm = new LinkedList<String>();
			
			List<Person> m1 = session.selectList("test08");
			for (Person pp : m1) {
				mm.add(pp.getName() + " " + pp.getAge());
			}
			
			model.addAttribute("mm", mm);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close(); 
		}
		System.out.println("------------------");
		
		return "ContViews";
	}
}
