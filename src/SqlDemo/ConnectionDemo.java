package SqlDemo;

import java.sql.ResultSet;

public class ConnectionDemo {
	
	static String sql = null;
	static SQLConnection db = null;
	static ResultSet ret = null;
	
	public static void main(String[] args) {
		sql = "select * from food";
		db = new SQLConnection(sql);
		
		try {
			ret = db.pst.executeQuery(sql);
			while (ret.next()) {
				String id = ret.getString(1);
				String id1 = ret.getString(2);
				String name =  ret.getString(3);
				String price = ret.getString(4);
				String sels = ret.getString(5);
				String url = ret.getString(6);
				String des = ret.getString(7);
				System.out.println(id + "\t" + id1 + "\t" + name + "\t" + price + "\t" + sels + "\t" + url + "\t" + des);
			}
			ret.close();
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
