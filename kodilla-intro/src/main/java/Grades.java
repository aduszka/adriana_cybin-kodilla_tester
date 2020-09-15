public class Grades {
        private int[] grades;
        private int size;
        private int last;

    public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void add ( int value ) {
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }

        public int lastValues() {
            int last = this.grades[this.size - 1];
            return last;
        }

        public int sumGrades(int[] grades) {
            int sum = 0;
            for (int i = 0; i < this.grades.length; i++) {
                sum = sum + this.grades[i];
            }
            return sum;
        }

        public float averageGrades() {
            float sum = sumGrades(grades);
            float average = sum / size;
            return average;
        }

        public static void main(String[] args) {
            Grades grades = new Grades();
            grades.add(4);
            grades.add(5);
            grades.add(3);
            grades.add(1);

            System.out.println(grades.size);
            System.out.println(grades.lastValues());
            System.out.println(grades.sumGrades(grades.grades));
            System.out.println(grades.averageGrades());
    }
}
