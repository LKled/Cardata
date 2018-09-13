package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CharacterModel;
import Shows.ShowCharacter;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class CharacterServlet
 */

//@ClassName: CharacterServlet    
//@Description: ����ָ�깦��ģ����ǰ�˵����ݴ���
//@author: LYJ
//@date: 2018.8.30

@WebServlet("/CharacterServlet")
public class CharacterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CharacterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//		@Title: doPost()  
//	����@Description: 1.��ȡ��Ҫ��ѯ�ĳ�������
//					  2.�������Ƶ��ú�����ȡָ������
//					  3.��װ��������Ϣ��ǰ��
//	����@param: HttpServletRequest request, HttpServletResponse response 
//	����@return: void
//	����@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��ȡ����
		String car = request.getParameter("cname");
		
		//��ȡ����
		CharacterModel character = new ShowCharacter().getCharacter(car);
		
		//��װ����
		JSONObject json = new JSONObject();
		json.put("name", car);
		json.put("comfort", character.getComfort());
		json.put("space", character.getSpace());
		json.put("surface", character.getSurface());
		json.put("interior", character.getInterior());
		json.put("power", character.getPower());
		json.put("control", character.getControl());
		json.put("consumption", character.getConsumption());
		json.put("carsort", character.getCarSort());
	
		//��������
		PrintWriter writer = response.getWriter();
		writer.print(json);
	}

}
