package site.rootalone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

// 工具类
public class HibernateUtils {

	private static SessionFactory sessionFactory;
	static {

	//创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建会话工厂对象
        sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	/**
	 * 创建Session
	 */
	public static Session getSession() {
		return sessionFactory.openSession();
	}
}
