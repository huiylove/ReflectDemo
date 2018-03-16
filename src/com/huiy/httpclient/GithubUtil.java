package com.huiy.httpclient;

import java.io.IOException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.util.EntityUtils;


/** 
 * Http Get 接口
 * @author : yuanhui 
 * @date   : 2018
 * @version 1.0
 */
public class GithubUtil {
	
	public static void main(String[] args){
		String frontUrl = "https://api.github.com/repos/huiylove/ReflectDemo/releases/latest";
		HttpGet httpGet = new HttpGet(frontUrl);
		HttpResponse res = null;
		try {
			res = getHttpsClient().execute(httpGet);
		} catch (ClientProtocolException e) {
			throw new CommonException("不支持该协议", e);
		} catch (IOException e) {
			throw new CommonException("读取数据发生错误", e);
		}
		String resStr = null;
		if (res != null) {
			if (HttpStatus.SC_OK == res.getStatusLine().getStatusCode()) {
				HttpEntity entity = res.getEntity();
				try {
					resStr = EntityUtils.toString(entity);
					System.out.print(resStr);
				} catch (ParseException e) {
					throw new CommonException("HTTP响应数据转换发生错误", e);
				} catch (IOException e) {
					throw new CommonException("读取数据发生错误", e);
				}
			}
		}
	}
	
	// https协议
		@SuppressWarnings("unused")
		private static HttpClient getHttpsClient() {
			HttpParams params = new BasicHttpParams();
			HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setUseExpectContinue(params, true);
			HttpProtocolParams.setUserAgent(params,
					" Mozilla/5.0 (Windows NT 6.1; rv:20.0) Gecko/20100101 Firefox/20.0");
			return wrapClient(new DefaultHttpClient(params));
		}
		
		
		private static HttpClient wrapClient(HttpClient base) {
			try {
				SSLContext ctx = SSLContext.getInstance("TLS");
				X509TrustManager tm = new X509TrustManager() {
					@Override
					public java.security.cert.X509Certificate[] getAcceptedIssuers() {
						return null;
					}

					@SuppressWarnings("unused")
					public void checkClientTrusted(X509Certificate[] arg0,
							String arg1) throws CertificateException {
					}

					@Override
					public void checkClientTrusted(
							java.security.cert.X509Certificate[] chain,
							String authType)
							throws java.security.cert.CertificateException {

					}

					@Override
					public void checkServerTrusted(
							java.security.cert.X509Certificate[] chain,
							String authType)
							throws java.security.cert.CertificateException {
					}
				};
				ctx.init(null, new TrustManager[] { tm }, null);
				SSLSocketFactory ssf = new SSLSocketFactory(ctx,
						SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
				SchemeRegistry registry = new SchemeRegistry();
				registry.register(new Scheme("https", 443,
						ssf));
				ThreadSafeClientConnManager mgr = new ThreadSafeClientConnManager(
						registry);
				return new DefaultHttpClient(mgr, base.getParams());
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}
		}
	//http协议
	private static HttpClient getHttpClient() {
		HttpParams params = new BasicHttpParams();
		HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
		HttpProtocolParams.setUseExpectContinue(params, true);
		HttpProtocolParams
				.setUserAgent(params,
						"Mozilla/5.0 (Windows NT 6.1; rv:20.0) Gecko/20100101 Firefox/20.0");
		return new DefaultHttpClient(params);
	}
	
}
