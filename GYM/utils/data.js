/**
 * banner数据
 */
function getBannerData() {

     var arr = ['../../images/banner_01.jpg',
            '../../images/banner_02.jpg', 
            '../../images/banner_03.jpg', 
            '../../images/banner_04.jpg'
    ]
     return arr
}
/*
 * 首页 navn 数据
 */
// function getIndexNavData() {
//     // console.log(111);
//     var ret;
//     wx.request({
//         url: 'http://localhost:8080/test1.json',
//         method: 'GET',
//         header: {
//             'content-type': 'application/json'
//         },
//         success: function (res) {
//             // console.log(res.data)
//             ret =res.data;
//         }
//     })
//     return ret;
// }
function getIndexNavData(){
    var arr =  [
            {
                "pt_icon": "../../images/nav_icon_01.png",
                "pt_id": 1,
                "pt_name": "推荐"
            },
            {
                "pt_icon": "http://localhost/images/nav_icon_02.png",
                "pt_id": 2,
                "pt_name": "运动"
            },
            {
                "pt_icon": "http://localhost/images/nav_icon_03.png",
                "pt_id": 3,
                "pt_name": "拳击"
            },
            {
                "pt_icon": "http://localhost/images/nav_icon_05.png",
                "pt_id": 4,
                "pt_name": "静坐"
            },
            {
                "pt_icon": "http://localhost/images/nav_icon_06.png",
                "pt_id": 5,
                "pt_name": "瑜伽"
            }
        ]
    return arr
}
/*
 * 首页 对应 标签 数据项
 */
function getIndexNavSectionData() {
    var arr = [
        // [
        //     {
        //         "p_count": 100,
        //         "p_id": 101,
        //         "p_img": "http://localhost/images/recommend_img_01.png",
        //         "p_message": "增进肌肉力量，促进身体的协调性",
        //         "p_price": 26,
        //         "p_sale": 22,
        //         "p_title": "杠铃训练"
        //     },
        //     {
        //         "p_count": 100,
        //         "p_id": 102,
        //         "p_img": "h",
        //         "p_message": "丰满肌肉、美化肌肉线条、强化肌力",
        //         "p_price": 25,
        //         "p_sale": 20,
        //         "p_title": "哑铃训练"
        //     },
        //     {
        //         "p_count": 100,
        //         "p_id": 103,
        //         "p_img": "http://localhost/images/recommend_img_04.png",
        //         "p_message": "增强胸部肌肉，美化肌肉线条",
        //         "p_price": 34,
        //         "p_sale": 30,
        //         "p_title": "蝴蝶机训练"
        //     },
        //     {
        //         "p_count": 100,
        //         "p_id": 104,
        //         "p_img": "http://localhost/images/recommend_img_05.png",
        //         "p_message": "促进白血球和热原质的生成，",
        //         "p_price": 24,
        //         "p_sale": 20,
        //         "p_title": "跑步锻炼"
        //     },
        //     {
        //         "p_count": 100,
        //         "p_id": 105,
        //         "p_img": "http://localhost/images/recommend_img_06.png",
        //         "p_message": "改善血液循环、促进内分泌平衡",
        //         "p_price": 23,
        //         "p_sale": 20,
        //         "p_title": "瑜伽练习"
        //     }
        // ],
        // [{
        //     artype: 'nails',
        //     subject: "乒乓球训练 | 环境好，有休息区",
        //     coverpath: "../../images/list_qiulei.png",
        //     price: '¥12/小时',
        //     price1:'￥15/小时',
        //     message: '国球在手，还再犹豫？？'
        // }],
        [{
                artype: 'beauty',
                subject: "拳击训练",
                coverpath: "../../images/list_quanjiw.png",
                price: '¥15/小时',
                price1:'￥20/小时',
                message: ''
            },
            {
                artype: 'beauty',
                subject: "拳击训练 | 真人对抗",
                coverpath: "../../images/list_quanjin.png",
                price: '¥15/小时',
                price1:'￥20/小时',
                message: '一拳超人，不锻炼能保护得了你爱的人？'
            
            }
        ],
        [

            {
                artype: 'hair',
                subject: "健身气功 | ",
                coverpath: "../../images/list_jingzuo.png",
                price: '¥25/小时',
                price1:'￥30/小时',
                message: '利于后天之气（外气）的调纳和先天之气（内气）的摄纳。'
            }
        ],
        [{
            artype: 'eyelash',
            subject: "瑜伽训练",
            coverpath: "../../images/recommend_img_06.png",
            price: '¥10/小时',
            price1:'￥12/小时',
            message: ''
        }],
    ]
    return arr
}
/**
 * 技师 数据
 * */
function getSkilledData() {
    var arr = [{
            company: "钟离",
            avatar: "../../images/coach_01.jpg",
            price1: '￥12/小时',
            price: '￥10/小时',
            message: '获得高级健身教练证书，经验丰富',
           
        },
        {
            company: "凝光",
            avatar: "../../images/coach_02.png",
            price1: '￥15/小时',
            price: ' ￥8/小时',
            message: '获得高级健身教练证书，更加专业',
          
        },
        {
            company: "芭芭啦",
            avatar: "../../images/coach_03.jpg",
            price1: '￥15/小时',
            price: '￥12/小时',
            message: '获得高级教练证书，女神健身法',
       
        },
        {
            company: "逍宮",
            avatar: "../../images/coach_04.png",
            price1: '￥13/小时',
            price: '￥10/小时',
            message: '获得高级健身教练证书，八块腹肌之梦',
          
        }
    ]
    return arr
}

/**
 * 选择器 数据
 */
function getPickerData() {
    var arr = [{
            name: '百里屠苏',
            phone: '13812314563',
            province: '北京',
            city: '北京',
            addr: '朝阳区望京悠乐汇A座8011'
        },
        {
            name: '韩云溪',
            phone: '13812314563',
            province: '北京市',
            city: '北京市',
            addr: '朝阳区望京悠乐汇A座4020'
        }
    ]
    return arr
}
/**
 * 查询 地址
 * */
var user_data = userData()

function searchAddrFromAddrs(addrid) {
    var result
    for (let i = 0; i < user_data.addrs.length; i++) {
        var addr = user_data.addrs[i]
        console.log(addr)
        if (addr.addrid == addrid) {
            result = addr
        }
    }
    return result || {}
}
/**
 * 用户数据
 * */
function userData() {
    var arr = {
        uid: '1',
        nickname: '荣荣大灰狼',
        name: '百里屠苏',
        phone: '13833337998',
        avatar: '../../images/avatar.png',
        addrs: [{
                addrid: '1',
                name: '百里屠苏',
                phone: '13812314563',
                province: '北京',
                city: '直辖市',
                addr: '朝阳区望京悠乐汇A座8011'
            },
            {
                addrid: '2',
                name: '韩云溪',
                phone: '13812314563',
                province: '北京',
                city: '直辖市',
                addr: '朝阳区望京悠乐汇A座4020'
            }
        ]
    }
    return arr
}
/**
 * 省
 * */
function provinceData() {
    var arr = [
        // {pid:1,pzip:'110000',pname:'北京市'},
        // {pid:2,pzip:'120000',pname:'天津市'}
        '请选择省份', '福建省'
    ]
    return arr
}
/**
 * 市
 * */
function cityData() {
    var arr = [
        // {cid:1,czip:'110100',cname:'市辖区',pzip:'110000'},
        // {cid:2,czip:'120100',cname:'市辖区',pzip:'120000'}
        '请选择城市', '福州市', '厦门市', '宁德市'
    ]
    return arr
}
/*
 * 对外暴露接口
 */
module.exports = {
    getBannerData: getBannerData,
    getIndexNavData: getIndexNavData,
    getIndexNavSectionData: getIndexNavSectionData,
    getPickerData: getPickerData,
    getSkilledData: getSkilledData,
    userData: userData,
    provinceData: provinceData,
    cityData: cityData,
    searchAddrFromAddrs: searchAddrFromAddrs

}