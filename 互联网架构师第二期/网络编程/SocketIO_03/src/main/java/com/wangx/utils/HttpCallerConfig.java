package com.wangx.utils;

import java.io.Serializable;
import java.util.Map;

public class HttpCallerConfig implements Serializable {
	/** 默认版本唯一标识 */
	private static final long serialVersionUID = 1L;

	/** 默认配置：字符集 */
	public static final String DEFAULT_CONFIG_CHARSET = "UTF-8";

	/** 默认配置：连接超时（毫秒） */
	public static final int DEFAULT_CONFIG_CONN_TIMEOUT = 30000;

	/** 默认配置：读取超时（毫秒） */
	public static final int DEFAULT_CONFIG_READ_TIMEOUT = 30000;

	/** 默认配置：最大缓冲大小（字符/字节数） */
	public static final int DEFAULT_CONFIG_MAX_BUFFER_SIZE = 500;

	/** URL地址 */
	private String url;

	/** 请求方法 */
	private String method;

	/** 字符集 */
	private String charset = DEFAULT_CONFIG_CHARSET;

	/** 连接超时（毫秒） */
	private int connTimeout = DEFAULT_CONFIG_CONN_TIMEOUT;

	/** 读取超时（毫秒） */
	private int readTimeout = DEFAULT_CONFIG_READ_TIMEOUT;

	/** 最大缓冲大小（字符数） */
	private int maxBufferSize = DEFAULT_CONFIG_MAX_BUFFER_SIZE;

	/** 参数 */
	private Map<String, String> params;

	/** 是否获取为流数据信息 */
	private boolean isStream;
}
