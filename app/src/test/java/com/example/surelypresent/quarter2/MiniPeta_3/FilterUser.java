public static void main(String[] args) {
    User.java
    public class filterUser {

    userList.add(new User(1, "clyde", 16, true));
    userList.add(new User(2, "cerbito", 16, true));
    userList.add(new User(3, "joaquin", 16, true));
    userList.add(new User(4, "galang", 16, true));

    // Get active users aged 18+
    List<User> filtered = filterUsers(userList, 18, true);

    System.out.println("Filtered Users (age 18+, active):");
    if (filtered.isEmpty()) {
        System.out.println("No users match the filter.");
    } else {
        for (User u : filtered) {
            System.out.println("- " + u);
        }
    }
}
