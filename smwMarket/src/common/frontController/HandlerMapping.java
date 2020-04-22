package common.frontController;

import java.util.HashMap;

import com.market.index.controller.IndexController;

import common.exception.Status404;

public class HandlerMapping {

	private HashMap<String, Controller> list = null;

	public HandlerMapping() {

		// 모든 컨트롤러 구현하려면 아래와같이 리스트에 넣을것. - Ryan

		list = new HashMap<String, Controller>();
		list.put("index", new IndexController());

	}

	/**
	 * <pre>
	 * common.frontController
	 * HandlerMapping.java
	 * </pre>
	 * 
	 * @작성자 : Ryan Oh
	 * @작업일 : 2020. 4. 23.
	 * @해야할일 :TODO Controller 이름 URI 이름과 통일할 것
	 * 
	 * @param uriArr
	 * @return
	 * @throws Status404
	 */
	public Controller getController(String[] uriArr) throws Status404 {

		Controller res = list.get(uriArr[2]);
		if (res == null) {
			throw new Status404("uri를 다시 확인해주세요");
		}
		return res;
	}

	/**
	 * <pre>
	 * common.frontController
	 * HandlerMapping.java
	 * </pre>
	 * 
	 * @작성자 : Ryan Oh
	 * @작업일 : 2020. 4. 23.
	 * @해야할일 :TODO - 추가되는 기능 URI 와 Controller Method이름 통일할 것.
	 * 
	 * @param uriArr
	 * @return
	 * @throws Status404
	 */
	public String getMethod(String[] uriArr) throws Status404 {

		String methodName = "";

		switch (uriArr[2]) {
		case "index":
			switch (uriArr[3]) {
			case "index.do":
				methodName = "index";
				break;
			default:
				throw new Status404("uri를 다시 확인해주세요");
			}
			break;

		default:
			throw new Status404("uri를 다시 확인해주세요");
		}

		return methodName;

	}

}
