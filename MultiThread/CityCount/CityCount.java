package MultiThread.CityCount;

import java.util.List;

public class CityCount extends Thread {

    private String city;
    private Integer count;
    private List<User> userList;

    public CityCount(String city, List<User> userList) {
        setCity(city);
        setUserList(userList);
        setCount(0);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public void run() {
        for (User user : userList) {
            if (user.getCity().equalsIgnoreCase(city)) {
                count += 1;
            }
        }
    }
}
