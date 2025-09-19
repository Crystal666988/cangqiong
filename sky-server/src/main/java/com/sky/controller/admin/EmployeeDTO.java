package com.sky.controller.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "新增员工数据传输对象")
public class EmployeeDTO {

    @ApiModelProperty(value = "员工登录用户名", required = true, example = "zhangsan")
    private String username;

    @ApiModelProperty(value = "员工姓名", required = true, example = "张三")
    private String name;

    @ApiModelProperty(value = "手机号", required = true, example = "13812344321")
    private String phone;

    @ApiModelProperty(value = "身份证号", required = true, example = "110101199001011234")
    private String idNumber;

    @ApiModelProperty(value = "性别", required = true, example = "1", notes = "1代表男，2代表女")
    private String sex;

    // 特别注意：根据图片中的讨论，id 是后端自动生成的，不应由前端传入。
    // 因此这里千万不要定义 id 字段！
    // private Long id;
}