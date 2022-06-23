package com.benjamin.springbootclickhousestudy;

import com.benjamin.springbootclickhousestudy.entity.PersonEntity;
import com.benjamin.springbootclickhousestudy.mapper.IPersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootClickhouseStudyApplicationTests {

    @Autowired
    private IPersonMapper personMapper;

    @Test
    void test01() {
        List<PersonEntity> result = personMapper.selectList();
        result.forEach(System.out::println);
    }

}
