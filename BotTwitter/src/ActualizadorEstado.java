import twitter4j.conf.*;
import twitter4j.*;
import twitter4j.auth.*;
import twitter4j.api.*;

import java.io.IOException;
import java.util.*;


public class ActualizadorEstado {
	
	
	Twitter twitter;

	void setup()
	{
	    ConfigurationBuilder cb = new ConfigurationBuilder();
	    cb.setOAuthConsumerKey(AuthInfo.OAuthConsumerKey);
	    cb.setOAuthConsumerSecret(AuthInfo.OAuthConsumerKey);
	    cb.setOAuthAccessToken(AuthInfo.OAuthAccessToken);
	    cb.setOAuthAccessTokenSecret(AuthInfo.OAuthAccessTokenSecret);
	    TwitterFactory tf = new TwitterFactory(cb.build());
	    twitter = tf.getInstance();
	}
	
	void twitear(){
		try {
			twitter.updateStatus("test");
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	

	public static void main (String[] args){
		ActualizadorEstado actualizador = new ActualizadorEstado();
		actualizador.setup();
		actualizador.twitear();
	}

}

