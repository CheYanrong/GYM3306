var header //请求头
const req="http://localhost";
// const req="http://192.168.137.1";
// 封装post请求
const post = (url, data, isUrl) => {
 
  header = {
    'content-type': isUrl ? 'application/x-www-form-urlencoded' : 'application/json ',
    'Cookie': wx.getStorageSync("cookieKey") //读取cookie
    //'toekn':'123456'
  };
 
  var promise = new Promise((resolve, reject) => {
    //网络请求
    wx.request({
      url: req + url,
      data: data,
      method: 'POST',
      header: header,
      success: function (res) { //服务器返回数据
        if (res.statusCode == 200) {
          if (res.data.code == '301') {
            wx.hideLoading()
            wx.showModal({
              showCancel: false,
              content: res.data.msg,
              success(res) {
                if (res.confirm) {
                  // console.log('用户点击确定')
                  wx.clearStorage()
                  wx.navigateBack()
                } else if (res.cancel) {
                  // console.log('用户点击取消')
                }
              }
            })
          } else {
              // console.log("success")
            resolve(res);//返回成功信息
          }
        } else { //返回错误提示信息
          reject(res.data);
        }
      },
      error: function (e) {
        reject('网络出错');
      }
    })
  });
  return promise;
}
// 封装get请求
const get = (url, data, isUrl) => {
  header = {
    'content-type': !isUrl ? 'application/x-www-form-urlencoded' : 'application/json ',
    'Cookie': wx.getStorageSync("cookieKey") //读取cookie
    // 'toekn':'123456'
  }
 
  var promise = new Promise((resolve, reject) => {
    //网络请求
    wx.request({
      url: req + url+"?a="+Math.random(),
      data: data,
      header: header,
      success: function (res) { //服务器返回数据
        if (res.statusCode == 200) {
          if (res.data.code == '301') {
            //身份验证过期
            wx.hideLoading()
            wx.showModal({
              showCancel: false,
              content: res.data.msg,
              success(res) {
                if (res.confirm) {
                  // console.log('用户点击确定')
                  wx.clearStorage()
                  wx.navigateBack()
                } else if (res.cancel) {
                  // console.log('用户点击取消')
                }
              }
            })
          } else {
             resolve(res);//返回成功信息
          }
        } else { //返回错误提示信息
          reject(res.data);
        }
      },
      error: function (e) {
        reject('网络出错');
      }
    })
  });
  return promise;
}
 
function json2Form(json) {
  var str = [];
  for (var p in json) {
    str.push(encodeURIComponent(p) + "=" + encodeURIComponent(json[p]));
  }
  return str.join("&");
}
 
//图片地址转换
function addX(b) {
  var d
  var c = []
  b.map(item => {
    c.push('\\"' + item + '\\"');
  })
 
  if (c[2]) {
    d = "[" + c[0] + ',' + c[1] + ',' + c[2] + "]"
  } else if (c[1]) {
    d = "[" + c[0] + ',' + c[1] + "]"
  } else if (c[0]) {
    d = "[" + c[0] + "]"
  }
  return d
}
 
module.exports = {
  post,
  get,
  json2Form,
  addX //图片地址转换
}

/*
var req = require('../../utils/reqUtils.js')

 req.get('/TestServlet', {
        "name":"杨",
        "age":20
    }, 1)
    .then(res => {
      // console.log(res.data)
      that.setData({
        banner_url:res.data
      })
    })
*/