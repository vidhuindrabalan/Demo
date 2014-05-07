package demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.json.JsonObject;
import com.restfb.types.Page;
import com.restfb.types.Post;
import com.restfb.types.User;

@Repository
public class FbDaoImpl implements FbDao {

	public void getFbDao() {
		// TODO Auto-generated method stub
		
		try {
			FacebookClient facebookClient = new DefaultFacebookClient(
					"CAACEdEose0cBAK6ZAuhPlfWiEBSa0MvFj8kY1RZBtV5pX0xJTh72iU96d9MKhI9Sm6TZChz1MZC0QUkgtfYxp4j6fHzmRVsRu8HT4UyCFFUK1PbVY08Sj1UPUjalZCZCZC4PPuo4PtOW72IC8eQ6DnZCsbooDUdzkT4L6zgslECPMZBBhrKK3TGvWZAxaIeSUm51MZD");
			//User user = facebookClient.fetchObject("me", User.class);
			//Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
			//System.out.println("Count of my friends: " + myFriends.getData().size());
			//Page page = facebookClient.fetchObject("CentreForStudies", Page.class);
			//Connection<User> myFriends = facebookClient.fetchConnection("me/photos", User.class);
			//Connection<User> myFriends = facebookClient.fetchConnection("me/friends",User.class,Parameter.with("Fields", "name,id,picture"));
		   // Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class);
			//Fetch fetch =
					 // facebookClient.fetchObjects(Arrays.asList("me", "CentreForStudies"), Fetch.class);

					//System.out.println("User name: " + fetch.me.getName());
					//System.out.println("Page likes: " + fetch.page.getLikes());
			//Connection<User> myFriends = facebookClient.fetchConnection("me/friends", User.class);
			//Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class);

			//System.out.println("Count of my friends: " + myFriends.getData().size());
			//System.out.println("First item in my feed: " + myFeed.getData().get(0));
			//User user = facebookClient.fetchObject("me", User.class,
					 // Parameter.with("fields", "id, name"));
			JsonObject VidhuIndrabalan = facebookClient.fetchObject("VidhuIndrabalan", JsonObject.class);
			System.out.println(VidhuIndrabalan.getString("name"));

			JsonObject photosConnection = facebookClient.fetchObject("me/photos", JsonObject.class);
			String firstPhotoUrl = photosConnection.getJsonArray("data").getJsonObject(0).getString("source");
			System.out.println(firstPhotoUrl);


			//System.out.println("Count of my friends: " + myFriends.getData().size());
			//System.out.println("User name: " + user.getName());
			//System.out.println("Page likes: " + page.getLikes());

		} finally {
			// SLF4JBridgeHandler.uninstall();
		}
		
	}
	

}
