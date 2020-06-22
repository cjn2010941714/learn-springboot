package com.cjn.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Sky
 * @date 2020/6/4 0004 22:06
 * 将配置文件中配置的每一个属性值，映射到这个组件中
 * @ConfigurationProperties 告诉SpringBoot将版本中所有的属性和配置文件中相关的配置进行板顶
 * prefix = "person" 配置文件中哪个下面的所有属性进行一一映射
 * 只有组件是容器中的组件，才能提供@ConfigurationProperties功能
 *
 * @ConfigurationProperties 默认是从全局配置中获取值
 *
 * @PropertySource(value = "classpath:person.properties") 可以加载指定的配置文件
 */
@PropertySource(value = "classpath:person.properties")
@Component
@ConfigurationProperties(prefix = "person")
public class Person {


    /**
     * @Value(${})
     * <bean class="Person">
     *     <property name="lastName"/>
     * </bean>
     */
    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birth;

    private Map<String, Object> map;

    private List<Object> list;

    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
