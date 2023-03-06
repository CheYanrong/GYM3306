var app = getApp()
var req = require('../../utils/reqUtils.js')
Page( {
  data: {
    coachdetailItem:[]
  },
  onLoad: function (options) {
    console.log(options.c_id)
   req.get('/CoachDetailAction',{
      "id":options.c_id
    },1)
    .then(res => {
      console.log(res.data)
      this.setData({
        coachdetailItem:res.data
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