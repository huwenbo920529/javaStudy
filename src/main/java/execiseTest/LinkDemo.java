package execiseTest;


/**
 * @author huwenbo
 * @date 2019/7/22 13:59
 */
interface ILink<E>{
    void add(E e);
    int size();
    boolean isEmpty();
    Object[] toArray();
    E get(int index);
    void set(int index, E data);
    boolean contains(E data);
    void remove(E data);
    void clean();
}

class LinkImpl<E> implements ILink<E> {
    private Node root;
    private int count;
    private int foot;
    private Object [] returnData;

    private class Node{
        private E data;
        private Node next;
        private Node(E data){
            this.data = data;
        }

        private void addNode(Node newNode){
            if(this.next == null){
                this.next = newNode;
            }else {
                this.next.addNode(newNode);
            }
        }

        private void toArrayNode(){
            LinkImpl.this.returnData[LinkImpl.this.foot ++] = this.data;
            if(this.next != null) this.next.toArrayNode();
        }

        private E getNode(int index){
            if(LinkImpl.this.foot++ == index) return this.data;
            else return this.next.getNode(index);
        }

        private void setNode(int index, E data){
            if(LinkImpl.this.foot++ == index) this.data = data;
            else this.next.setNode(index, data);
        }

        private boolean containsNode(E data){
            if(this.data.equals(data)) return true;
            else {
                if(this.next == null) return false;
                else return this.next.containsNode(data);
            }
        }

        private void removeNode(Node previous, E data){
            if(this.data.equals(data)){
                previous.next = this.next;
            }else {
                if(this.next!= null){
                    this.next.removeNode(this, data);
                }
            }
        }
    }


    @Override
    public void add(E e) {
        if(e == null) return ;
        Node newNode = new Node(e);
        if(this.root == null)this.root = newNode;
        else this.root.addNode(newNode);
        this.count ++;
    }


    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Object[] toArray() {
        if(this.isEmpty()) return null;
        this.foot = 0;
        this.returnData = new Object[this.count];
        this.root.toArrayNode();
        return this.returnData;
    }

    @Override
    public E get(int index) {
        if(index >= this.count) return null;
        this.foot = 0;
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E data) {
        if(index >= this.count) return;
        this.foot = 0;
        this.root.setNode(index, data);
    }

    @Override
    public boolean contains(E data) {
        if(data == null) return false;
        return this.root.containsNode(data);
    }

    @Override
    public void remove(E data) {
        if(this.contains(data)) {
            if(this.root.data.equals(data))
                this.root = this.root.next;
            else this.root.next.removeNode(this.root, data);
            this.count --;
        }
    }

    @Override
    public void clean() {
        this.root = null;
        this.count = 0;
    }
}

public class LinkDemo{
    public static void main(String[] args) {
        ILink<String> all = new LinkImpl<String>();
        all.add("hello");
        all.add("world");
        all.add("spring");
        all.set(1, "java");
        all.remove("world");

        System.out.println(all.size());
        System.out.println(all.isEmpty());
        System.out.println(all.get(1));
        System.out.println(all.contains("flink"));
        System.out.println(all.contains("java"));

        all.clean();
        Object[] result = all.toArray();
        if(result!= null)
        for (Object object: result) {
            System.out.println(object);
        }

    }
}
