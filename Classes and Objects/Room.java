class employee {
    int empID = 5;

    void showEmpID() {
        System.out.println(empID);
    }

    public static void main(String[] args) {
        employee e = new employee(); // object declaration
        // e = new employee();
        e.showEmpID();
    }
}