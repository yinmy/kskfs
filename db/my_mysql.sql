-- 电影管理
DROP TABLE IF EXISTS `test_film`;

CREATE TABLE `test_film` (
  `id` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '编号',
  `film_name` varchar(2000) COLLATE utf8_bin NOT NULL COMMENT '电影名称',
  `film_type` varchar(100) COLLATE utf8_bin NOT NULL COMMENT '电影类型',
  `film_sort` decimal(10,0) NOT NULL COMMENT '排序',
  `create_by` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '创建者',
  `create_date` datetime NOT NULL COMMENT '创建时间',
  `update_by` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '更新者',
  `update_date` datetime NOT NULL COMMENT '更新时间',
  `remarks` varchar(255) COLLATE utf8_bin DEFAULT NULL COMMENT '备注信息',
  `del_flag` char(1) COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`id`),
  KEY `test_film_del_flag` (`del_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='电影列表';