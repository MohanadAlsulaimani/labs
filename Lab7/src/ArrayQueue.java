
    /** Array-based queue using a circular array. */
    public class ArrayQueue<E> implements Queue<E> {
        public static final int CAPACITY = 1000;

        private E[] data;
        private int f = 0;
        private int sz = 0;

        public ArrayQueue() {

            this(CAPACITY);
        }

        public ArrayQueue(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be positive.");
            }
            data = (E[]) new Object[capacity];
        }

        @Override
        public int size() {
            return sz;
        }

        @Override
        public boolean isEmpty() {
            return sz == 0;
        }

        @Override
        public void enqueue(E e) {
            if (sz == data.length) {
                throw new IllegalStateException("Queue is full.");
            }
            int avail = (f + sz) % data.length;
            data[avail] = e;
            sz++;
        }

        @Override
        public E first() {
            if (isEmpty()) return null;
            return data[f];
        }

        @Override
        public E dequeue() {
            if (isEmpty()) return null;
            E answer = data[f];
            data[f] = null;
            f = (f + 1) % data.length;
            sz--;
            return answer;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("[");
            for (int i = 0; i < sz; i++) {
                if (i > 0) result.append(", ");
                result.append(data[(f + i) % data.length]);
            }
            return result.append("]").toString();
        }
    }



