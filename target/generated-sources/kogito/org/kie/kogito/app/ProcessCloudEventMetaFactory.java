package org.kie.kogito.app;

import org.kie.kogito.event.CloudEventMeta;

public class ProcessCloudEventMetaFactory {

    @javax.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_quickstart() {
        return new CloudEventMeta("quickstart", "", org.kie.kogito.event.EventKind.CONSUMED);
    }
}
