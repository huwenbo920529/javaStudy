package java文件操作;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Author: Wenbo Hu
 * Date: 2019/5/13 11:43
 * Description:
 */
public class Reader {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader in = new BufferedReader(new FileReader("kafka_data.txt"));

            String str;
            while ((str = in.readLine()) != null){
//                System.out.println(str);
                buffer.append(str);
            }

        }catch (IOException e){
            System.out.println(e.getCause().toString());
        }

        Properties prop = new Properties();
        //指定kafka  broker地址
        prop.setProperty("bootstrap.servers", "192.168.1.29:9092");

        //指定key value的序列化方式
//        prop.put("key.serializer", StringSerializer.class.getName());
//        prop.put("value.serializer", StringSerializer.class.getName());
        prop.setProperty("key.serializer", StringSerializer.class.getName());
        prop.setProperty("value.serializer",StringSerializer.class.getName());

        //指定topic名称
        String topic = "systemLog_iop_topic_dev";

        KafkaProducer<String, String> producer = new KafkaProducer<String,String>(prop);

        String message = buffer.toString();
        System.out.println(message);
        producer.send(new ProducerRecord<String, String>(topic, message));
        System.out.println("send data to kafka successfully!");
        //生产消息
//        while (true){
//            String message = buffer.toString();
//            System.out.println(message);
//            producer.send(new ProducerRecord<String, String>(topic, message));
////            Thread.sleep(2000);
//        }

    }
}
