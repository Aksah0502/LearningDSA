//package Hashing;
//
//import java.util.*;
//
//public class HashMapImplementation {
//    static class HashMap<K,V>{
//        // Creating Class for Nodes of LinkedList
//        public class Node{
//            K key;
//            V value;
//
//            public Node(K key, V value){
//                this.key = key;
//                this.value = value;
//
//            }
//        }
//        private int n;// No. of Nodes
//        private int N;// No. of Bucket(N=bucket.length)
//        public LinkedList<Node> buckets[];
//
//        @SuppressWarnings("Unchecked")   // This annotation is used to handle some Warning that may occur in some JAVA versions. Although Code will run but with some warning.
//        public HashMap(){
//            this.N = 4;
//            this.buckets = new LinkedList[4];
//            for(int i= 0;i<4;i++){
//                this.buckets[i] = new LinkedList<>(); // Creating an empty LinkedList at each bucket index. This simply means initializing linked list.
//                // This helps to directly store nodes in this, otherwise we can't simply add elements in LL.
//
//            }
//        }
//        private int hashfunction(K key){
//
//
//        };
//        //Inserting Values
//        public void put(K key, V value){
//            int bi = hashfunction(key); // getting the Bucket index of node from the HashFunction.
//            int di = searchinLL(key,bi); // di=0+-> Valid and di=-1-> key doesn't exist at the bi
//
//            if(di==-1){
//                buckets[bi].add(new Node(key,value));
//            } else{
//              Node data = buckets[bi].get[di];
//              data.value = value;
//            }
//
//        }
//
//
//
//
//
//    }
//}
