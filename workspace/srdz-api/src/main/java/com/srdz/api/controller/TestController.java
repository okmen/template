package com.srdz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.srdz.entity.EErrors;
import com.srdz.service.IEErrorService;
import com.utils_max.ParseUtils;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Autowired
	private IEErrorService errorService;

	@ResponseBody
	@RequestMapping(value = "/pushOrder")
	public String downloadorder(String a) throws Exception {
		try {
			EErrors mode = errorService.selectById(ParseUtils.parseLong(a));
			if (mode != null) {
				return mode.getCreatetime().toGMTString();// ss
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		return String.valueOf(a);
	}

	/**
	 * 
	 * @param a
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/generator")
	public String generator(String a) throws Exception {
		AutoGenerator mpg = new AutoGenerator();
		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir("D:\\gitwork\\model-generator");
		gc.setFileOverride(true);
		gc.setActiveRecord(true);
		gc.setEnableCache(true);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList
		gc.setAuthor("max");

		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setMapperName("%sDao");
		gc.setXmlName("%sMapper");
		gc.setServiceName("%sService");
		gc.setServiceImplName("%sServiceImpl");
		gc.setControllerName("%sController");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		

		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUrl("jdbc:mysql://118.178.131.1:3306/bbyiya?useUnicode=true&characterEncoding=UTF-8&amp;generateSimpleParameterMetadata=true");
		dsc.setUsername("root");
		dsc.setPassword("bbyiya.net@20170111");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		// strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
		// strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });//
		// 此处可以修改为您的表前缀
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
		strategy.setInclude(new String[] { "u_users" }); // 需要生成的表
		// strategy.setExclude(new String[]{"test"}); // 排除生成的表
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.srdz");
		mpg.setPackageInfo(pc);

		// 执行生成
		mpg.execute();
		return "";
	}
}
