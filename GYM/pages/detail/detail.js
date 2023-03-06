var app = getApp()
var req = require('../../utils/reqUtils.js')
Page( {
  data: {
    detailItem:[]
  },
  onLoad: function (options) {
    console.log(options)
   req.get('/DetailAction',{
      "id":options.id
    },1)
    .then(res => {
      console.log(res.data)
      this.setData({
        detailItem:res.data
      })
    })
    // this.setData({
    //   artype:options.artype
    // })    
  },
  getLocation:function(){
    wx.navigateTo({
      url:'../location/location'
    })
  },
  bookTap:function(){
    wx.navigateTo({
      url:'../book/book'
    })
  }
})