package common.frontController;

import java.util.HashMap;

import com.market.index.controller.IndexController;

import common.exception.Status404;

public class HandlerMapping {

	private HashMap<String, Controller> list = null;

	public HandlerMapping() {

		// 모든 컨트롤러 리스트에 넣을것. - Ryan

		list = new HashMap<String, Controller>();
		list.put("index", new IndexController());
		// list.put("book", new BookController());
		// list.put("index", new IndexController());
		// list.put("member", new MemberController());
		// list.put("mypage", new MyPageController());
		// list.put("use", new UseController());
		// list.put("notice", new NoticeController());

	}

	public Controller getController(String[] uriArr) throws Status404 {

		Controller res = list.get(uriArr[2]);
		if (res == null) {
			throw new Status404("uri를 다시 확인해주세요");
		}
		return res;
	}

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
