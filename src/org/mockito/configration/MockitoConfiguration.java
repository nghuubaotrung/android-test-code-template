package org.mockito.configration;

import org.mockito.configuration.DefaultMockitoConfiguration;

/**
 * Created by nghuubaotrung on 15/06/30.
 */
public class MockitoConfiguration extends DefaultMockitoConfiguration {

    @Override
    public boolean enableClassCache() {
        return false;
    }
}
