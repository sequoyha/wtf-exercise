
CREATE KEYSPACE galaxy WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '3'}  AND durable_writes = true;

CREATE TABLE galaxy.colonial_data (
    date_hour timestamp,
    id text,
    edge_id text,
    read_time timestamp,
    sequence int,
    interval int,
    flowthrough_velocity int,
    pressure double,
    temperature float,
    volume float,
    PRIMARY KEY ((date_hour, id), edge_id, read_time, sequence, interval)
) WITH CLUSTERING ORDER BY (edge_id ASC, read_time ASC, sequence ASC, interval ASC)
    AND bloom_filter_fp_chance = 0.01
    AND caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'}
    AND comment = ''
    AND compaction = {'class': 'org.apache.cassandra.db.compaction.SizeTieredCompactionStrategy', 'max_threshold': '32', 'min_threshold': '4'}
    AND compression = {'chunk_length_in_kb': '64', 'class': 'org.apache.cassandra.io.compress.LZ4Compressor'}
    AND crc_check_chance = 1.0
    AND dclocal_read_repair_chance = 0.1
    AND default_time_to_live = 0
    AND gc_grace_seconds = 864000
    AND max_index_interval = 2048
    AND memtable_flush_period_in_ms = 0
    AND min_index_interval = 128
    AND read_repair_chance = 0.0
    AND speculative_retry = '99PERCENTILE';

