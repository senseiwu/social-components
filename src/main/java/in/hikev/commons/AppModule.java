package in.hikev.commons;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import in.hikev.commons.guice.listeners.Log4jTypeListener;

/**
 * Created by Administrator on 2015/6/26.
 */
public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bindListener(Matchers.any(), new Log4jTypeListener());
    }
}