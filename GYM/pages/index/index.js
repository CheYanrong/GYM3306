//index.js
//获取应用实例
var app = getApp()
var fileData = require('../../utils/data.js')
var req = require('../../utils/reqUtils.js')
Page({
  // 页面初始数据
  data: {
      colors:['red','orange','yellow','green','purple'],
      // banner 初始化
      banner_url: fileData.getBannerData(),
      // banner_url: [],
      indicatorDots: true,
      vertical: false,
      autoplay: true,
      interval: 3000,
      duration: 1000,
      // nav 初始化
      //navTopItems: fileData.getIndexNavData(),
      navTopItems:[],
      navSectionItems: fileData.getIndexNavSectionData(),
      curNavId: 1,
		  curIndex: 0
  },
   
  onLoad:function(){
    setTimeout(function(){
      wx.setNavigationBarColor({
        frontColor: '#ffffff', // 必写项
        backgroundColor: '#009186', // 必写项
        animation: { // 可选项
            duration: 1000,
            timingFunc: 'easeIn'
        }
    })
    },8000);
    var that = this
    that.setData({
      list: that.data.navSectionItems
    })
    req.get('/BannerAction', {
    }, 1)
    .then(res => {
      console.log(res.data)
      that.setData({
        banner_url:res.data
      });
    })
      req.get('/ProjectTypeAction',{

      },1)
      .then(res => {
        console.log(res.data)
        this.setData({
          navTopItems:res.data
        })
      })
      req.get('/ProjectAction',{

      },1)
      .then(res => {
        console.log(res.data)
        this.setData({
          list:res.data
        })
      })
    
    //console.log(this.data)
  },
  //标签切换
  switchTab: function(e) {
      let aid = e.currentTarget.dataset.id
      // console.log(id)
      index = e.currentTarget. dataset.index
      let index = parseInt(e.currentTarget.dataset.index)
      // console.log(e)
      var that = this
      this.setData({
        curNavId: aid,
        curIndex: index,
      })
      // console.log(this.data)
  },
  // 跳转至详情页
  navigateDetail: function(e){
    // console.log(e.currentTarget.dataset.aid)
   

    wx.navigateTo({
       url:'../detail/detail?id=' + e.currentTarget.dataset.aid
     // url:'../detail/detail?id=' + e.currentTarget.dataset.aid
    })
  },
  // 加载更多
  loadMore: function (e) {
    console.log('加载更多')
    var curid = this.data.curIndex

    if (this.data.navSectionItems[curid].length === 0) return
    
    var that = this
    that.data.navSectionItems[curid] = that.data.navSectionItems[curid].concat(that.data.navSectionItems[curid])
    that.setData({
      list: that.data.navSectionItems,
    }) 
  },
  // book
  bookTap: function(e){
    wx.navigateTo({
      url:'../book/book?aid='+e.currentTarget.dataset.aid
    })
  }
  
})
