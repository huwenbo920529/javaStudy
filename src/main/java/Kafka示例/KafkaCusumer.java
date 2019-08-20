package Kafka示例;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/14 17:00
 * Description:
 */
import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Arrays;
import java.util.Properties;

public class KafkaCusumer extends Thread  {
    private String topic;//主题

//    public final String SRC = "D:/testdata/testData.txt";

    public KafkaCusumer(String topic){
        super();
        this.topic = topic;
    }

    //创建消费者
    private Consumer<String, String> createConsumer(){
//        Properties properties = new Properties();
//        //声明zookeeper集群链接地址
//        properties.put("zookeeper.connect","xxx:2181");
//        //必须要使用别的组名称， 如果生产者和消费者都在同一组，则不能访问同一组内的topic数据
//        properties.put("group.id", "group1");
//        properties.put("zookeeper.session.timeout.ms", "100000");
//        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "xxx:2181");
//        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        Properties prop = new Properties();
        //指定kafka  broker地址
//        prop.put("bootstrap.servers", "xxx:9092");
        prop.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.1.29:9092");

        //指定key value的序列化方式
        prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        prop.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");


        return new KafkaConsumer<String, String>(prop);

    }

    @Override
    public void run() {
        //创建消费者
        Consumer consumer = createConsumer();

        consumer.subscribe(Arrays.asList(topic));
        System.out.println("消费者对象："  + consumer);
        while (true) {

            ConsumerRecords<String, String> records = consumer.poll(100);
            System.out.println(records);
            for (ConsumerRecord<String, String> record : records) {

                System.out.println(record.key()+record.value());
                System.out.printf("接收到: ", record.offset(), record.key(), record.value());
            }
        }
    }

    public static void main(String[] args) {
        // 使用kafka集群中创建好的主题 test
        new KafkaCusumer("systemLog_iop_topic_dev").start();
    }
}

