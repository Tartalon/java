package task_2;

public class Pupil {

    void study () {

    }

    void read() {

    }

    void write () {

    }

    void relax () {

    }
}

class ExcellentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Excellent study");
    }
    @Override
    void read() {
        System.out.println("Excellent read");
    }
    @Override
    void write() {
        System.out.println("Excellent write");
    }
    @Override
    void relax() {
        System.out.println("Excellent relax");
    }
}

class GoodPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Good study");
    }
    @Override
    void read() {
        System.out.println("Good read");
    }
    @Override
    void write() {
        System.out.println("Good write");
    }
    @Override
    void relax() {
        System.out.println("Good relax");
    }
}

class BedPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Bed study");
    }
    @Override
    void read() {
        System.out.println("Bed read");
    }
    @Override
    void write() {
        System.out.println("Bed write");
    }
    @Override
    void relax() {
        System.out.println("Bed relax");
    }
}