package demo.dao;
import com.restfb.Facebook;
import com.restfb.types.Page;
import com.restfb.types.User;


public class Fetch {
	@Facebook
	User me;
	@Facebook("CentreForStudies")
	Page page;

}
