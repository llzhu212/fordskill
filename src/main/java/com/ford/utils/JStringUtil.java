package com.ford.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import org.springframework.cglib.beans.BeanMap;

import sun.misc.BASE64Decoder;

public class JStringUtil {
	
	/**
	 * 获取车辆业务状态名称
	 * @param val
	 * @return
	 */
	public static String getWorkstateReName(String val){
//		1,2,3,4;
//			if("1".equals(val)){
//				return "分时";
//			}else if("2".equals(val)){
//				return "长租";
//			}else if("3".equals(val)){
//				return "试驾";
//			}else if("4".equals(val)){
//				return "网约车";
//			}else {
//				return "无状态";
//			}
		if("1".equals(val)){
			return "1";
		}else if("2".equals(val)){
			return "3";
		}else if("3".equals(val)){
			return "2";
		}else if("4".equals(val)){
			return "4";
		}else {
			return "-1";
		}

	}
	
	// base64字符串转化成图片
	/**
	 * @param imgStr
	 *            base64字符串
	 * @param filePath
	 *            文件保存位置
	 * @return
	 */
	public static boolean GenerateImage(String imgStr, String imgFilePath) { // 对字节数组字符串进行Base64解码并生成图片
		if (imgStr == null) // 图像数据为空
			return false;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] b = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {// 调整异常数据
					b[i] += 256;
				}
			}
			// 生成jpeg图片
			File file = new File(imgFilePath);
			// 判断目标文件所在的目录是否存在
			if (!file.getParentFile().exists()) {
				// 如果目标文件所在的目录不存在，则创建父目录
				if (!file.getParentFile().mkdirs()) {
					System.out.println("创建目标文件所在目录失败！");
				}
			}
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(b);
			out.flush();
			out.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("图片编码：" + imgFilePath);
			return false;
		}
	}

	/**
	 * 生成随机文件名：当前年月日时分秒+五位随机数
	 * 
	 * @return
	 * @param delimiter
	 *            分割符
	 * @param prefix
	 *            前缀
	 * @param suffix
	 *            后缀.jpg,.png
	 * @return
	 */
	public static String getRandomFileName(String delimiter, String prefix, String suffix) {

		SimpleDateFormat simpleDateFormat;

		simpleDateFormat = new SimpleDateFormat("\\yyyy-MM-dd\\");

		Date date = new Date();

		String str = simpleDateFormat.format(date);
		simpleDateFormat = new SimpleDateFormat("HHmmssSSS");
		str += (((null == prefix || prefix.trim().length() == 0) ? "" : prefix + (delimiter == null ? "" : delimiter)) + simpleDateFormat.format(date));
		Random random = new Random();
		int rannum = (int) (random.nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
		return str + "-" + rannum + (null == suffix ? "" : suffix);// 当前时间
	}

	/**
	 * 获取webRoot文件绝对路径
	 * 
	 * @return
	 */
	public static String getUploadRootPath(HttpServletRequest request, String path) {
		path = request.getSession().getServletContext().getRealPath(path);
		return path;
	}

	/**
	 * 获取文件扩展名
	 * 
	 * @param filename
	 * @return
	 */
	public static String getExtensionName(String filename) {
		if ((filename != null) && (filename.length() > 0)) {
			int dot = filename.lastIndexOf('.');
			if ((dot > -1) && (dot < (filename.length() - 1))) {
				return filename.substring(dot + 1);
			}
		}
		return filename;
	}

	/**
	 * null ture not null false
	 * 
	 * 同时验证多个参数是否为空
	 * 
	 * @param o
	 * @return
	 */
	public static boolean isnull(Object... o) {
		if (null == o)
			return true;
		for (Object object : o) {
			if (null == object || "".equals(object.toString().trim())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 将实体名称转换为数据表名
	 * 
	 * @param benName
	 * @return
	 */
	public static String benToTable(String benName) {
		String str = "";
		if (isnull(benName))
			return null;
		int lastIndexOf = benName.lastIndexOf(".");
		if (lastIndexOf >= 0) {
			benName = benName.substring(lastIndexOf + 1, benName.length());
		}
		char[] ch = benName.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
				str += i == 0 ? "" : "_";
			}
			str += ch[i];
		}
		return str;
	}

	/**
	 * 表名下划线首字母大写转换 Hugx
	 * 
	 * @param str
	 * @return
	 */
	public static String UpperCaseTable(String str) {
		str = str.toLowerCase();
		String[] split = str.split("_");
		String restr = split[0];
		for (int i = 1; i < split.length; i++) {
			restr += upperCase(split[i]);
		}
		return restr;
	}

	// 首字母大写转换
	public static String upperCase(String str) {
		char[] ch = str.toCharArray();
		if (ch[0] >= 'a' && ch[0] <= 'z') {
			ch[0] = (char) (ch[0] - 32);
		}
		return new String(ch);
	}

	/**
	 * 测试专用 打印request所有参数项
	 * 
	 * @param req
	 */
	public static void TestReqParameters(HttpServletRequest req) {
		System.out.println("================》》Start");
		// page rows
		Enumeration enu = req.getParameterNames();
		while (enu.hasMoreElements()) {
			String paraName = (String) enu.nextElement();
			if (paraName.equals("base64Code"))
				continue;
			System.out.println(paraName + ": " + req.getParameter(paraName));
		}

		System.out.println("《《================End");
	}

	/**
	 * 解析用户参数
	 * 
	 * @param req
	 * @return
	 */
	public static Map<String, String> getMap(HttpServletRequest req) {
		Object attribute = req.getSession().getAttribute("carOperate");
		String carOperate = JStringUtil.isnull(attribute) ? req.getParameter("carOperate") : attribute.toString();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", req.getParameter("id"));
		map.put("cname", req.getParameter("cname"));
		map.put("ename", req.getParameter("ename"));
		map.put("operator", req.getParameter("operator"));
		map.put("carOperate", carOperate);
		map.put("phone", req.getParameter("phone"));
		return map;
	}

	/**
	 * 将对象装换为map
	 * 
	 * @param bean
	 * @return
	 */
	public static <T> Map<String, Object> beanToMap(T bean) {
		Map<String, Object> map = new HashMap<String, Object>();
		if (bean != null) {
			BeanMap beanMap = BeanMap.create(bean);
			for (Object key : beanMap.keySet()) {
				map.put(key + "", beanMap.get(key));
			}
		}
		return map;
	}

	/**
	 * 将对象装换为map 键值为String
	 * 
	 * @param bean
	 * @return
	 */
	public static Map<String, String> beanToMapStr(Object obj) {
		Map<String, String> map = new HashMap<String, String>();
		if (obj != null) {
			BeanMap beanMap = BeanMap.create(obj);
			for (Object key : beanMap.keySet()) {
				map.put(key + "", JStringUtil.isnull(beanMap.get(key)) ? null : beanMap.get(key).toString());
			}
		}
		return map;
	}

	/**
	 * 将map装换为javabean对象
	 * 
	 * @param map
	 * @param bean
	 * @return
	 */
	public static <T> T mapToBean(Map<String, Object> map, T bean) {
		BeanMap beanMap = BeanMap.create(bean);
		beanMap.putAll(map);

		return bean;
	}

	/**
	 * 转换下拉框的值
	 * 
	 * @param <T>
	 * @param map
	 * @param bean
	 * @return
	 */
	public static <T> T getSelectData(Map<String, List<Map<String, Object>>> map, T bean) {
		Map<String, Object> beanToMap = JStringUtil.beanToMap(bean);
		Set<String> key = beanToMap.keySet();
		for (String str : key) {
			List<Map<String, Object>> lis = map.get(str);
			if (lis == null)
				continue;
			for (Map<String, Object> m : lis) {
				if (m.get("value") == null)
					continue;
				if (beanToMap.get(str) == null)
					continue;
				if (m.get("value").toString().toLowerCase().equals(beanToMap.get(str).toString().toLowerCase())) {
					if ("carModels".equals(str)) {
						beanToMap.put("modelsName", m.get("text"));
					} else {
						beanToMap.put(str, m.get("text"));
					}

				}
			}
		}
		T mapToBean = JStringUtil.mapToBean(beanToMap, bean);
		return mapToBean;

	}

	/**
	 * 转换下拉框的值 text 转为 value
	 * 
	 * @param <T>
	 * @param map
	 * @param bean
	 * @return
	 */
	public static <T> T getSelectDataValue(Map<String, List<Map<String, Object>>> map, T bean) {
		Map<String, Object> beanToMap = JStringUtil.beanToMap(bean);
		Set<String> key = beanToMap.keySet();
		for (String str : key) {
			List<Map<String, Object>> lis = map.get(str);
			if (lis == null)
				continue;
			for (Map<String, Object> m : lis) {
				if (m.get("text") == null)
					continue;
				if (beanToMap.get(str) == null)
					continue;
				//if ("carModels".equals(str)) {
					//beanToMap.put("column4", m.get("text"));
				//} 
				if (m.get("text").toString().toLowerCase().equals(beanToMap.get(str).toString().toLowerCase())) {
					beanToMap.put(str, JStringUtil.isnull(m.get("value")) ? "" : (m.get("value").toString()));
				}
			}
		}
		T mapToBean = JStringUtil.mapToBean(beanToMap, bean);
		return mapToBean;

	}

	/**
	 * >//ASCII码 ，不能判断 小数点有几个 ：1.1.1 也会返回true</span>
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		for (int i = str.length(); --i >= 0;) {
			int chr = str.charAt(i);
			if (chr < 48 || chr > 57) {
				if (chr != 46)
					return false;
			}
		}
		return true;
	}
	/**
	 * >//ASCII码 ，不能判断 小数点有几个 ：1.1.1 也会返回true</span>
	 * 
	 * @param str
	 * @return
	 */
	public static double getNumeric(Object obj) {
		if(isnull(obj) || !isNumeric(obj.toString())){
			return 0;
		}
		String str = obj.toString();
		double parseDouble = Double.parseDouble(str);
		return parseDouble;
	}
	

	/**
	 * 每天分期计算
	 * 
	 * @param priceDateS
	 *            分期开始时间
	 * @param priceDateE
	 *            分期结束时间
	 * @param requestPrice
	 *            申请总金额
	 * @return 每天分期金额
	 */
	public static double getDatePrice(String priceDateS, String priceDateE, String requestPrice, String residualPrice) {
		String[] priceDateSs = priceDateE.split("-");
		String[] priceDateEs = priceDateS.split("-");
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Date dataS = null;
		Date dataE = null;
		
		if(residualPrice == null || "".equals(residualPrice)){
			residualPrice = "0";
		}
		
		try {
			dataS = sim.parse(priceDateS);
			dataE = sim.parse(priceDateE);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Integer day = (int) ((dataE.getTime() - dataS.getTime()) / (1000 * 3600 * 24));
		double requestPricenum = Double.valueOf(requestPrice);
		double residualPricenum = Double.valueOf(residualPrice);

		Double remnantPrice = (requestPricenum - residualPricenum);

		BigDecimal b1 = new BigDecimal(Double.valueOf(remnantPrice));
		BigDecimal b2 = new BigDecimal(Double.valueOf(day + 1));
		// System.out.println(b1.divide(b2,2,BigDecimal.ROUND_HALF_UP).doubleValue());
		return b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
