package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Shows.ShowScores;
import net.sf.json.JSONObject;


/**
 * Servlet implementation class ScoreServlet
 */

//@ClassName: ScoreServlet    
//@Description: �û����ֹ���ģ����ǰ�˵����ݴ���
//@author: LYJ
//@date: 2018.8.28

@WebServlet("/ScoreServlet")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
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
//					  2.�������Ƶ��ú�����ȡ�û���������
//					  3.��װ���������ݵ�ǰ��
//	����@param: HttpServletRequest request, HttpServletResponse response 
//	����@return: void
//	����@throws: ServletException, IOException
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//��ȡ����
		String sort = request.getParameter("name");
		
		//��ȡ����
		Map<String, Integer> top = new ShowScores().getTop(sort);
		ArrayList<String> key=new ArrayList<String>();
		ArrayList<Integer> value=new ArrayList<Integer>();
		
		for(Entry<String, Integer> topn:top.entrySet()){
			key.add(topn.getKey());
			value.add(topn.getValue());
		}
		
		//��װ����
		JSONObject  json=new JSONObject();
		json.put("x", key);
		json.put("y", value);
		
		//��������
		PrintWriter out=response.getWriter();
		out.print(json);
	}

}
