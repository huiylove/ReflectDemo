package com.huiy.Lambda.AnonymousInnerClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.httpclient.protocol.Protocol;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Http Post
 * 
 * 
 */
public class HttpPoster {

	private  static Logger log = LoggerFactory.getLogger(HttpPoster.class);
			
	public HttpPoster() {
	}

	private String url;

	private String charset = "UTF-8";

	public void setUrl(String url) {
		this.url = url;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public HttpPoster(String url, String charset) {
		super();
		this.url = url;
		this.charset = charset;
	}

	public HttpPoster(String url) {
		super();
		this.url = url;
		this.charset = "UTF-8";
	}

	/**
	 * 发�?�参数包
	 * 
	 * @param parameters
	 * @return
	 * @throws IOException
	 */
	public String post(final Map<String, String> parameters){
//		return post(new PostMethodCallback() {
//
//			@Override
//			public void doInPostMethod(PostMethod postMethod) {
//				NameValuePair[] nameValuePairs = new NameValuePair[parameters.size()];
//				Set<Entry<String, String>> set = parameters.entrySet();
//				int i = 0;
//				// 设置查询参数
//				for (Entry<String, String> entry : set) {
//					NameValuePair pair = new NameValuePair(entry.getKey(), entry.getValue());
//					nameValuePairs[i] = pair;
//					i++;
//				}
//				// 发�?�参数包
//				postMethod.setRequestBody(nameValuePairs);
//
//			}
//		});
		
		return post((m)->{
			NameValuePair[] nameValuePairs = new NameValuePair[parameters.size()];
			Set<Entry<String, String>> set = parameters.entrySet();
			int i = 0;
			for (Entry<String, String> entry : set) {
				NameValuePair pair = new NameValuePair(entry.getKey(), entry.getValue());
				nameValuePairs[i] = pair;
				i++;
			}
			m.setRequestBody(nameValuePairs);
		});
	}

	/**
	 * 使用http协议发�?�xmltext到url
	 * 
	 * @param url
	 *            将要发�?�的地址
	 * @param xmltext
	 *            将要发�?�的内容
	 * @return http返回�?
	 */
	public String post(final String body){
		return post(new PostMethodCallback() {

			@Override
			public void doInPostMethod(PostMethod postMethod) {

				try {
					InputStream instream = new ByteArrayInputStream(body.getBytes(charset));
					postMethod.setRequestEntity(new InputStreamRequestEntity(instream, body.getBytes(charset).length));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * 使用http协议发�?�xmltext到url
	 * 
	 * @param url
	 *            将要发�?�的地址
	 * @param xmltext
	 *            将要发�?�的内容
	 * @return http返回�?
	 * @throws SpsException
	 */
	private String post(PostMethodCallback callback) {
		HttpClient httpclient = new HttpClient();
		PostMethod xmlpost = new PostMethod(url);
		try {
			log.info("发�?�数�? url:"+url);
			// https设置
			if (url.indexOf("https://") != -1) {
				// 创建SSL连接
				@SuppressWarnings("deprecation")
				Protocol myhttps = new Protocol("https", new MySSLSocketFactory(), 443);
				Protocol.registerProtocol("https", myhttps);
			}
			httpclient.getHttpConnectionManager().getParams().setConnectionTimeout(1000 * 60);
			httpclient.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, charset);
			httpclient.getParams().setContentCharset(charset);
			// xmlpost.setRequestHeader("content-type", "text/xml; charset=" +
			// charset);

			// 内部回调，发送数据，设置参数�?
			callback.doInPostMethod(xmlpost);
			// 执行请求
			httpclient.executeMethod(xmlpost);

			// 获取返回信息
			InputStream ips = xmlpost.getResponseBodyAsStream();
			List<Byte> byteList = new ArrayList<Byte>();

			int is = 0;
			while ((is = ips.read()) != -1)
				byteList.add((byte) is);

			byte[] allb = new byte[byteList.size()];
			for (int j = 0; j < byteList.size(); j++)
				allb[j] = byteList.get(j);
			String responseString = new String(allb, charset);
			// LogWriter.debug(this, "HTTP返回�?=" + responseStatCode);
			log.info("应答数据=" + responseString);

			if (url.indexOf("https://") != -1)
				Protocol.unregisterProtocol("https");
			return responseString;
		} catch (IOException ex2) {
			ex2.printStackTrace();
			log.error( "报文发送到[" + url + "]失败:" + ex2.getMessage());
			throw new IllegalArgumentException("目标方超时");
		} finally {
			try {
				xmlpost.releaseConnection();
				httpclient.getHttpConnectionManager().closeIdleConnections(0);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * PostMethod回调处理
	 * 
	 */
	public interface PostMethodCallback {
		public void doInPostMethod(PostMethod postMethod);
	}

}
