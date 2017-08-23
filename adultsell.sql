DROP TABLE IF EXISTS `banners`;
CREATE TABLE IF NOT EXISTS `banners` (
	`banner_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`banner_pic_url` varchar(500),
	`banner_change_link` varchar(255),
	`banner_type` tinyint(1) unsigned NOT NULL DEFAULT 0,
	`banner_pic_desc` varchar(255),
	PRIMARY KEY (`banner_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `banners` (`banner_pic_url`, `banner_change_link`, `banner_type`, `banner_pic_desc`) VALUES
('http://img4.imgtn.bdimg.com/it/u=3109357359,20942065&fm=11&gp=0.jpg','','','成人用品'),
('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502013029402&di=eede799c70b0941d6a37ceabb0a30cb4&imgtype=0&src=http%3A%2F%2Fd6.yihaodianimg.com%2FN07%2FM0A%2FD2%2F05%2FChEbvFTyhraACrRRAALSkNQWhLU06700.jpg','','','成人用品'),
('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502012739177&di=d9e0fc9bb0b7195676e2689325d17eae&imgtype=0&src=http%3A%2F%2Fwww.ccrnews.com.cn%2Fueditor%2Fphp%2Fupload%2Fimage%2F20151218%2F1450404677106598.png','','','够不够色情'),
('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502012900791&di=f706c004a7353bc6be728852ec8838ed&imgtype=0&src=http%3A%2F%2Fimg10.360buyimg.com%2Fcms%2Fjfs%2Ft655%2F302%2F1094509851%2F168392%2F25d608a9%2F54ae241cNf2a88963.jpg','','','劲不劲爆'),
('https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502607645&di=e542664a9cec1739d9c91e9042af20ed&imgtype=jpg&er=1&src=http%3A%2F%2Fimg11.360buyimg.com%2Fcms%2Fjfs%2Ft763%2F206%2F1000961300%2F287611%2Fc2ecae01%2F550fc429Nd80b9b6d.jpg','','','浪的飞起');


DROP TABLE IF EXISTS `videos`;
CREATE TABLE IF NOT EXISTS `videos` (
	`video_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`video_title` varchar(255) NOT NULL DEFAULT '',
	`video_img` varchar(500) NOT NULL DEFAULT '',
	`play_count` mediumint(8) NOT NULL DEFAULT 0,
	`video_mp4_url` varchar(500) NOT NULL DEFAULT '',
	`video_description` text DEFAULT '',
	`source_from` varchar(255),
	`video_keywords` varchar(255),
	`video_tags` varchar(255),
	`is_ads` boolean DEFAULT false,
	`has_video` boolean DEFAULT true,
	PRIMARY KEY (`video_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `videos` (`video_title`, `video_img`, `video_mp4_url`, `video_description`) VALUES
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀'),
('国家化妆品高级配方师','http://vimg2.ws.126.net/image/snapshot/2016/11/7/A/VC5O5977A.jpg','http://flv2.bn.netease.com/videolib3/1611/24/BCcfR1400/HD/BCcfR1400-mobile.mp4','个人化妆品见解，，打击三无，国家化妆品高级配方师。告诉你各种美容护肤小窍门、皮肤保养秘诀');


DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
	`user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`user_nickname` varchar(20) NOT NULL DEFAULT '',
	`user_phone` varchar(20) NOT NULL DEFAULT '',
	`user_password` varchar(20),
	`user_type` mediumint(8) NOT NULL DEFAULT 10,
	PRIMARY KEY (`user_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `user` (`user_nickname`, `user_phone`, `user_password`, `user_type`) VALUES
('管理员', '11011011011', '123456', 0),
('飞火', '15323454321', '123456', 10);

DROP TABLE IF EXISTS `user_address`;
CREATE TABLE IF NOT EXISTS `user_address` (
	`address_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`user_id` mediumint(8) unsigned NOT NULL,
	`receive_name` varchar(20) NOT NULL,
	`receive_phone` varchar(20) NOT NULL,
	`country` varchar(20) NOT NULL DEFAULT '中国',
	`province` varchar(20) NOT NULL DEFAULT '',
	`city` varchar(20) NOT NULL DEFAULT '',
	`area` varchar(20) NOT NULL DEFAULT '',
	`detail` varchar(255),
	PRIMARY KEY (`address_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `user_address` (`user_id`, `receive_name`, `receive_phone`, `province`, `city`, `area`, `detail`) VALUES
(1, '张先生', '15345453453', '北京市', '北京市', '朝阳区', 'xx路xx小区xx室');


DROP TABLE IF EXISTS `goods_sort`;
-- 顶级分类parenttype为0
CREATE TABLE IF NOT EXISTS `goods_sort` (
	`sort_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`sort_name` varchar(60) NOT NULL DEFAULT '',
	`sort_type` mediumint(8) unsigned NOT NULL,
	`sort_parent_type` mediumint(8) unsigned NOT NULL,
	`sort_en_name` varchar(60) NOT NULL DEFAULT '',
	`sort_desc` varchar(60) NOT NULL DEFAULT '',
	`sort_img` varchar(500) NOT NULL DEFAULT '',
	UNIQUE (`sort_type`),
	PRIMARY KEY (`sort_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `goods_sort` (`sort_name`, `sort_type`, `sort_parent_type`, `sort_en_name`, `sort_img`, `sort_desc`) VALUES
('男性玩具', 1, 0, 'Male Toys', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('女性玩具', 2, 0, 'FeMale Toys', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('喷剂／保养', 3, 0, 'MenSpray', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('助情', 4, 0, 'Increase Lust', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('套套专区', 5, 0, 'Condom', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('润滑剂', 6, 0, 'Lubricants', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('情趣服饰', 7, 0, 'Erotic Clothing', 'https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=906954903,1906944572&fm=26&gp=0.jpg','描述信息'),
('自动自慰杯', 100, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('手动飞机杯', 101, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('前列腺按摩', 102, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('女优名器', 103, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('男用震动环', 104, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('男性润滑', 105, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('男士辅助／保养', 106, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('名器加热棒', 107, '1', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('内外双头G点棒', 130, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('AV震动棒', 131, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('情趣跳蛋', 132, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('仿真阳具', 133, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('胸部刺激', 134, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('后庭玩具', 135, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('女用私处', 136, '2', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('男用喷剂/湿巾', 150, '3', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('锻炼／保养', 151, '3', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('避孕套', 152, '3', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('情欲提升', 170, '4', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('私处保养', 171, '4', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('按摩丰胸', 172, '4', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('超薄体贴', 180, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('超凡持久', 181, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('加倍润滑', 182, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('浮点颗粒', 183, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('螺纹刺激', 184, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('果味热情', 185, '5', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('防过敏润滑剂', 190, '6', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('硅性润滑剂', 191, '6', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('自然润滑剂', 192, '6', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('玩具润滑剂', 193, '6', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('冰火润滑剂', 194, '6', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('性感睡衣', 200, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('连体网衣', 201, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('吊带丝袜', 202, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('情趣内衣', 203, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('男士内衣', 204, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息'),
('性感内裤', 205, '7', '', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502466439&di=50010dbcc9cb973a880572f711de04ff&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.gomein.net.cn%2Fimage%2Fbbcimg%2Fproduction_image%2Fnimg%2F201509%2F28%2F19%2F35%2F39821137640410912be_360.jpg', '描述信息');



DROP TABLE if EXISTS `goods_info`;
CREATE TABLE IF NOT EXISTS `goods_info` (
	`goods_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
	`goods_code` VARCHAR(255) NOT NULL DEFAULT 'xxxxoooo',
	`goods_name` varchar(255) NOT NULL DEFAULT '',
	`goods_type` varchar(255) NOT NULL DEFAULT '',
	`goods_shop_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00',
	`goods_market_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00',
	`goods_num` smallint(5) unsigned NOT NULL DEFAULT '0',
	`goods_sell_count` smallint(5) unsigned NOT NULL DEFAULT '0',
	`is_promote` tinyint(1) unsigned NOT NULL DEFAULT '0',
	`promote_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00',
	`promote_start_date` int(11) unsigned NOT NULL DEFAULT '0',
	`promote_end_date` int(11) unsigned NOT NULL DEFAULT '0',
	`promote_gift` varchar(255),
	`keywords` varchar(255) NOT NULL DEFAULT '',
	`goods_desc` text NOT NULL,
	`goods_desc_url` varchar(255),
	`goods_thumb` varchar(255) NOT NULL DEFAULT '',
	`goods_img` varchar(255) NOT NULL DEFAULT '',
	`goods_text_img_detail` varchar(500) NOT NULL DEFAULT 'http://wap.chunshuitang.com/goods/4351.html',
	`goods_video_show` varchar(500) NOT NULL DEFAULT '',
	`goods_real_test` VARCHAR(500) NOT NULL DEFAULT '',
	`is_on_sale` tinyint(1) unsigned NOT NULL DEFAULT '1',
	`goods_add_time` int(10) unsigned NOT NULL DEFAULT '0',
	`is_shipping` tinyint(1) unsigned NOT NULL DEFAULT '0',
	`shipping_code` varchar(255),
	PRIMARY KEY (`goods_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `goods_info` (`goods_name`, `goods_type`, `goods_shop_price`, `goods_market_price`, `goods_num`, `goods_sell_count`, `goods_desc`, `goods_img`)VALUES 
('测试商品1', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品2', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品3', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品4', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品5', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品6', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品7', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品8', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品9', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品10', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品11', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品12', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品13', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品14', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品15', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品16', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品17', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品18', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品19', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品20', '100', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品21', '101', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品22', '102', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品23', '103', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品24', '104', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品25', '105', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品26', '130', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品27', '131', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品26', '132', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品29', '133', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品30', '150', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品31', '151', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品32', '170', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品33', '171', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品34', '172', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品35', '180', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品36', '180', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品37', '181', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品38', '182', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品35', '190', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品36', '190', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品37', '191', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品39', '192', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品40', '193', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品41', '194', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品42', '200', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品43', '200', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品44', '201', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品45', '202', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品46', '203', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg'),
('测试商品47', '204', 100.30, 189.99, 30, 12, '全球有超过300万女性正在使用NEREIDS,打造惹火身材', 'http://img73.nipic.com/file/20160422/22830428_212520255235_1.jpg');
DROP TABLE IF EXISTS `goods_price`;
CREATE TABLE IF NOT EXISTS `goods_price` (
	`goods_price_id` MEDIUMINT(8) UNSIGNED NOT NULL AUTO_INCREMENT,
	`goods_id` MEDIUMINT(8) UNSIGNED NOT NULL,
	`goods_color_style_model` VARCHAR(255) NOT NULL,
	`goods_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00',
	PRIMARY KEY (`goods_price_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `goods_price` (`goods_id`, `goods_color_style_model`, `goods_price`) VALUES
(1, "红色金边边 小号", 100.30),
(1, "红色金边边 中号", 100.30),
(1, "红色金边边 大号", 100.30),
(1, "绿色金边边 小号", 100.30),
(1, "绿色金边边 中号", 100.30),
(1, "绿色金边边 大号", 100.30),
(1, "黑色蕾丝边 小号", 100.30),
(1, "黑色蕾丝边 中号", 100.30),
(1, "黑色蕾丝边 大号", 100.30),
(1, "白色半透明蕾丝 小号", 100.30),
(1, "白色半透明蕾丝 中号", 100.30),
(1, "白色半透明蕾丝 大号", 100.30),
(2, "黑色半透明边 中号", 100.30),
(3, "红色蕾丝边 中号", 100.30),
(3, "黑色蕾丝边 小号", 100.30),
(3, "红色金边边 中号", 100.30),
(4, "黑色半透明边 中号", 100.30),
(4, "红色蕾丝边 中号", 100.30),
(5, "黑色蕾丝边 小号", 100.30),
(5, "红色金边边 中号", 100.30),
(6, "黑色半透明边 中号", 100.30),
(7, "红色蕾丝边 中号", 100.30),
(7, "黑色蕾丝边 小号", 100.30),
(8, "红色金边边 中号", 100.30),
(8, "黑色半透明边 中号", 100.30),
(9, "红色蕾丝边 中号", 100.30),
(10, "黑色蕾丝边 小号", 100.30),
(11, "红色金边边 中号", 100.30),
(12, "黑色半透明边 中号", 100.30),
(13, "红色蕾丝边 中号", 100.30),
(14, "黑色蕾丝边 小号", 100.30),
(15, "红色金边边 中号", 100.30),
(16, "黑色半透明边 中号", 100.30),
(17, "红色蕾丝边 中号", 100.30),
(18, "黑色蕾丝边 小号", 100.30),
(19, "红色金边边 中号", 100.30),
(20, "黑色半透明边 中号", 100.30),
(21, "红色蕾丝边 中号", 100.30),
(22, "黑色蕾丝边 小号", 100.30);



DROP TABLE IF EXISTS `goods_transfer`;
CREATE TABLE IF NOT EXISTS `goods_transfer` (
	`transfer_id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
	`transfer_code` varchar(20) NOT NULL DEFAULT '',
	`transfer_name` varchar(120) NOT NULL DEFAULT '',
	`transfer_desc` varchar(255) NOT NULL DEFAULT '',
	`transfer_able` BOOLEAN NOT NULL DEFAULT TRUE,
	PRIMARY KEY (`transfer_id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `goods_transfer` (`transfer_code`, `transfer_name`, `transfer_desc`) VALUES
('normal', '普通类型', '快递方式只能卖家选择'),
('post_express', '邮政快递包裹', '邮政快递包裹的描述内容。'),
('yto', '圆通速递', '上海圆通物流（速递）有限公司经过多年的网络快速发展，在中国速递行业中一直处于领先地位'),
('city_express', '城际快递', '配送的运费是固定的'),
('flat', '市内快递', '固定运费的配送方式内容'),
('sto_express', '申通快递', '江、浙、沪地区首重为15元/KG，其他地区18元/KG， 续重均为5-6元/KG， 云南地区为8元'),
('post_mail', '邮局平邮', '邮局平邮的描述内容。'),
('fpd', '运费到付', '所购商品到达即付运费');


DROP TABLE IF EXISTS `goods_transfer_service`;
CREATE TABLE IF NOT EXISTS `goods_transfer_service` (
	`transfers_service__id` INT unsigned NOT NULL AUTO_INCREMENT,
	`goods_id` MEDIUMINT(8) UNSIGNED NOT NULL,
	`transfer_id` TINYINT(3) UNSIGNED NOT NULL,
	PRIMARY KEY (`transfers_service__id`)
) DEFAULT CHARSET=utf8;
INSERT INTO `goods_transfer_service` (`goods_id`, `transfer_id`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(2, 5),
(2, 6),
(2, 7),
(2, 8),
(3, 1),
(3, 2),
(3, 3),
(4, 1),
(4, 5),
(5, 1),
(6, 1),
(7, 1),
(8, 1),
(9, 1),
(10, 1),
(11, 1),
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 1);






