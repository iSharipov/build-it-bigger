package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * 04.03.2018.
 */

public class EndpointAsyncTaskTest extends AndroidTestCase {
    @SuppressWarnings("unchecked")
    public void test() {
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(getContext(), null);
        asyncTask.execute();
        try {
            assertNotNull(asyncTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
