package com.parse.samples.parsequeryadapter;

import com.parse.Parse;
import com.parse.ParseUser;

public class Application extends android.app.Application {

	public void onCreate() {
		Parse.initialize(this, "YOUR_APP_ID", "YOUR_CLIENT_KEY");
	}

}
