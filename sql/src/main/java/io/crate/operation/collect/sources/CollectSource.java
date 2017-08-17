package io.crate.operation.collect.sources;

import io.crate.data.BatchConsumer;
import io.crate.data.Row;
import io.crate.operation.collect.CrateCollector;
import io.crate.operation.collect.JobCollectContext;
import io.crate.planner.node.dql.CollectPhase;

public interface CollectSource {

    CrateCollector getCollector(CollectPhase collectPhase, BatchConsumer<Row> consumer, JobCollectContext jobCollectContext);
}
