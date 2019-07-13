package chapter7;

import java.util.Collection;

import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.common.TopicPartition;

/**
 * Created by 朱小厮 on 2019-03-02.
 */
public class TheOldRebalanceListener implements ConsumerRebalanceListener {
    @Override
    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        for (TopicPartition topicPartition : partitions) {
//            commitOffsets(partition);
//            cleanupState(partition);
        }
    }

    @Override
    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
        for (TopicPartition topicPartition : partitions) {
//            initializeState(partition)；
//            initializeOffset(partition);
        }
    }
}
