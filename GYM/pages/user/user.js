//index.js
//获取应用实例
var app = getApp()
var myData = require('../../utils/data')
var util = require('../../utils/util')
var req = require('../../utils/reqUtils.js')
Page({
  // 页面初始数据
  data: {
   //用户信息开始为空
   userInfo:'',
   menuitems: [],
   curNavId: 1,
   curIndex: 0
  },
  onLoad(){
    //获取本地缓存
    var that = this;
    let user=wx.getStorageSync('user')
    console.log("进入小程序的index页面获取缓存",user)
    this.setData({
        userInfo:user
    }),
    req.get('/MenuitemsAction',{

    },1)
    .then(res =>{
      console.log(res.data)
      this.setData({
          menuitems:res.data
      })
    })
},
//授权登录
login(){
    wx.getUserProfile({
        desc:'必须授权后才能继续使用',
        success:res=>{
            let user=res.userInfo
            //设置本地缓存,把用户信息缓存到本地
            wx.setStorageSync('user',user)
            console.log('用户信息',user)
            this.setData({
                userInfo:user
            })
        }
    })
},
//退出登录
loginOut(){
    this.setData({
        userInfo:''
    })
    wx.setStorageSync('user',null)
}
  
})
