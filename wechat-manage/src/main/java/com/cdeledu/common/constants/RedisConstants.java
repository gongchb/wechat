/**  
* @Title：RedisConstants.java
* @Package：com.cdeledu.common.constants
* @Description：TODO(用一句话描述该文件做什么)
* @author：皇族灬战狼
* @date：2017年12月12日 下午8:23:52
* @version：V1.0  
*/
package com.cdeledu.common.constants;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 *
 * Today the best performance as tomorrow newest starter!
 *
 * @类描述: Redis 常量
 * @创建者: 皇族灬战狼
 * @创建时间: 2017年12月12日 下午8:23:52
 * @版本: V1.0
 * @since: JDK 1.7
 */
public final class RedisConstants {

	/** ----------------------------------------------- [失效时间] */
	/** 缓存时效 1分钟 */
	public static final int RREDIS_EXP_MINUTE = 60;
	/** 缓存时效 10分钟 */
	public static final int RREDIS_EXP_MINUTES = 60 * 10;
	/** 缓存时效 60分钟 */
	public static final int RREDIS_EXP_HOURS = 60 * 60;
	/** 缓存时效 半天 */
	public static final int RREDIS_EXP_HALF_DAY = 3600 * 12;
	/** 缓存时效 1天 */
	public static final int RREDIS_EXP_DAY = 3600 * 24;
	/** 缓存时效 1周 */
	public static final int RREDIS_EXP_WEEK = 3600 * 24 * 7;
	/** 缓存时效 1月 */
	public static final int RREDIS_EXP_MONTH = 3600 * 24 * 30 * 7;
	/** ----------------------------------------------- [自定义的各种key] */
	/** 存放uid的对象前缀 */
	public static final String SHIRO_SESSION_PRE = "shiro_sessionid:";
	/** 存放uid当前状态状态的前缀 uid */
	public static final String UID_PRE = "uid:";
	/** 存放用户信息uid */
	public static final String USER_PRE = "user:";
	/** 存放用户权限的前缀 */
	public static final String PERMISSION_PRE = "permission:";
	/** 角色中的权限 */
	public static final String ROLE_PRE = "role:";
	/** 字典缓存前缀 */
	public static final String DICT_PRE = "dict:";
	
}
