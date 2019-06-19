package com.mesosphere.sdk.metastore.scheduler;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mesosphere.sdk.framework.EnvStore;
import com.mesosphere.sdk.framework.FrameworkConfig;
import com.mesosphere.sdk.http.types.EndpointProducer;
import com.mesosphere.sdk.scheduler.DefaultScheduler;
import com.mesosphere.sdk.scheduler.SchedulerBuilder;
import com.mesosphere.sdk.scheduler.SchedulerConfig;
import com.mesosphere.sdk.scheduler.SchedulerRunner;
import com.mesosphere.sdk.scheduler.SchedulerUtils;
import com.mesosphere.sdk.specification.DefaultServiceSpec;
import com.mesosphere.sdk.specification.yaml.RawServiceSpec;

/**
 * Main entry point for the Scheduler.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected one file argument, got: " + Arrays.toString(args));
        }
        SchedulerRunner
                .fromSchedulerBuilder(createSchedulerBuilder(new File(args[0])))
                .run();
    }

    private static SchedulerBuilder createSchedulerBuilder(File yamlSpecFile) throws Exception {
        RawServiceSpec rawServiceSpec = RawServiceSpec.newBuilder(yamlSpecFile).build();

        final EnvStore envStore = EnvStore.fromEnv();
        final SchedulerConfig schedulerConfig = SchedulerConfig.fromEnvStore(envStore);
        final FrameworkConfig frameworkConfig = FrameworkConfig.fromEnvStore(envStore);

        DefaultServiceSpec defaultServiceSpec =
                DefaultServiceSpec.newGenerator(rawServiceSpec, schedulerConfig, yamlSpecFile.getParentFile())
                        .build();

        return DefaultScheduler.newBuilder(defaultServiceSpec, schedulerConfig)
                .setPlansFrom(rawServiceSpec)
                .withSingleRegionConstraint();
    }
}
