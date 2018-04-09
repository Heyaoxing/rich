"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.default = Page({
  data: {
    nearby: []
  },
  onLoad: function onLoad(event) {
    var that = this;
    var latitude = 0;
    var longitude = 0;
    wx.getLocation({
      type: "wgs84",
      success: function success(res) {
        latitude = res.latitude;
        longitude = res.longitude;
      }
    });
    console.log("latitude:" + latitude + " longitude:" + longitude);

    wx.request({
      url: "http://192.168.56.1:8889/rich/dev/api/nearby/show", //仅为示例，并非真实的接口地址
      header: {
        "content-type": "application/json"
      },
      method: "POST",
      data: {
        lat: latitude,
        lng: longitude,
        currPage: 1,
        pageSize: 20
      },
      success: function success(res) {
        //更新数据 
        that.setData({
          nearby: res.data.nearbyShow
        });

        console.log(that.data.nearby);
      }
    });
  }
});
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNob3cud3hwIl0sIm5hbWVzIjpbImRhdGEiLCJuZWFyYnkiLCJvbkxvYWQiLCJldmVudCIsInRoYXQiLCJsYXRpdHVkZSIsImxvbmdpdHVkZSIsInd4IiwiZ2V0TG9jYXRpb24iLCJ0eXBlIiwic3VjY2VzcyIsInJlcyIsImNvbnNvbGUiLCJsb2ciLCJyZXF1ZXN0IiwidXJsIiwiaGVhZGVyIiwibWV0aG9kIiwibGF0IiwibG5nIiwiY3VyclBhZ2UiLCJwYWdlU2l6ZSIsInNldERhdGEiLCJuZWFyYnlTaG93Il0sIm1hcHBpbmdzIjoiOzs7Ozs7QUFVRUEsUUFBTTtBQUNKQyxZQUFRO0FBREosRztBQUdOQyxVQUFRLGdCQUFTQyxLQUFULEVBQWdCO0FBQ3RCLFFBQUlDLE9BQU8sSUFBWDtBQUNBLFFBQUlDLFdBQVcsQ0FBZjtBQUNBLFFBQUlDLFlBQVksQ0FBaEI7QUFDQUMsT0FBR0MsV0FBSCxDQUFlO0FBQ2JDLFlBQU0sT0FETztBQUViQyxlQUFTLGlCQUFTQyxHQUFULEVBQWM7QUFDcEJOLG1CQUFXTSxJQUFJTixRQUFmO0FBQ0FDLG9CQUFZSyxJQUFJTCxTQUFoQjtBQUNGO0FBTFksS0FBZjtBQU9BTSxZQUFRQyxHQUFSLENBQVksY0FBWVIsUUFBWixHQUFxQixhQUFyQixHQUFtQ0MsU0FBL0M7O0FBRUFDLE9BQUdPLE9BQUgsQ0FBVztBQUNUQyxXQUFLLG1EQURJLEVBQ2lEO0FBQzFEQyxjQUFRO0FBQ04sd0JBQWdCO0FBRFYsT0FGQztBQUtUQyxjQUFRLE1BTEM7QUFNVGpCLFlBQU07QUFDSmtCLGFBQUliLFFBREE7QUFFSmMsYUFBSWIsU0FGQTtBQUdKYyxrQkFBVSxDQUhOO0FBSUpDLGtCQUFVO0FBSk4sT0FORztBQVlUWCxlQUFTLGlCQUFTQyxHQUFULEVBQWM7QUFDckI7QUFDQVAsYUFBS2tCLE9BQUwsQ0FBYTtBQUNYckIsa0JBQVFVLElBQUlYLElBQUosQ0FBU3VCO0FBRE4sU0FBYjs7QUFJQVgsZ0JBQVFDLEdBQVIsQ0FBWVQsS0FBS0osSUFBTCxDQUFVQyxNQUF0QjtBQUNEO0FBbkJRLEtBQVg7QUFxQkQiLCJmaWxlIjoic2hvdy53eHAiLCJzb3VyY2VzQ29udGVudCI6WyJleHBvcnQgZGVmYXVsdCB7XHJcbiAgY29uZmlnOiB7XHJcbiAgICB1c2luZ0NvbXBvbmVudHM6IHtcclxuICAgICAgXCJ3eGMtaWNvblwiOiBcIkBtaW51aS93eGMtaWNvblwiLFxyXG4gICAgICBcInd4Yy1mbGV4XCI6IFwiQG1pbnVpL3d4Yy1mbGV4XCIsXHJcbiAgICAgIFwid3hjLWNjXCI6IFwiQG1pbnVpL3d4Yy1jY1wiLFxyXG4gICAgICBcInd4Yy1hdmF0YXJcIjogXCJAbWludWkvd3hjLWF2YXRhclwiLFxyXG4gICAgICBcInd4Yy1lbGlwXCI6IFwiQG1pbnVpL3d4Yy1lbGlwXCJcclxuICAgIH1cclxuICB9LFxyXG4gIGRhdGE6IHtcclxuICAgIG5lYXJieTogW11cclxuICB9LFxyXG4gIG9uTG9hZDogZnVuY3Rpb24oZXZlbnQpIHtcclxuICAgIHZhciB0aGF0ID0gdGhpcztcclxuICAgIHZhciBsYXRpdHVkZSA9IDA7XHJcbiAgICB2YXIgbG9uZ2l0dWRlID0gMDtcclxuICAgIHd4LmdldExvY2F0aW9uKHtcclxuICAgICAgdHlwZTogXCJ3Z3M4NFwiLFxyXG4gICAgICBzdWNjZXNzOiBmdW5jdGlvbihyZXMpIHtcclxuICAgICAgICAgbGF0aXR1ZGUgPSByZXMubGF0aXR1ZGU7XHJcbiAgICAgICAgIGxvbmdpdHVkZSA9IHJlcy5sb25naXR1ZGU7XHJcbiAgICAgIH1cclxuICAgIH0pO1xyXG4gICAgY29uc29sZS5sb2coXCJsYXRpdHVkZTpcIitsYXRpdHVkZStcIiBsb25naXR1ZGU6XCIrbG9uZ2l0dWRlKTtcclxuICAgIFxyXG4gICAgd3gucmVxdWVzdCh7XHJcbiAgICAgIHVybDogXCJodHRwOi8vMTkyLjE2OC41Ni4xOjg4ODkvcmljaC9kZXYvYXBpL25lYXJieS9zaG93XCIsIC8v5LuF5Li656S65L6L77yM5bm26Z2e55yf5a6e55qE5o6l5Y+j5Zyw5Z2AXHJcbiAgICAgIGhlYWRlcjoge1xyXG4gICAgICAgIFwiY29udGVudC10eXBlXCI6IFwiYXBwbGljYXRpb24vanNvblwiXHJcbiAgICAgIH0sIFxyXG4gICAgICBtZXRob2Q6IFwiUE9TVFwiLFxyXG4gICAgICBkYXRhOiB7XHJcbiAgICAgICAgbGF0OmxhdGl0dWRlLFxyXG4gICAgICAgIGxuZzpsb25naXR1ZGUsXHJcbiAgICAgICAgY3VyclBhZ2U6IDEsXHJcbiAgICAgICAgcGFnZVNpemU6IDIwXHJcbiAgICAgIH0sXHJcbiAgICAgIHN1Y2Nlc3M6IGZ1bmN0aW9uKHJlcykge1xyXG4gICAgICAgIC8v5pu05paw5pWw5o2uIFxyXG4gICAgICAgIHRoYXQuc2V0RGF0YSh7XHJcbiAgICAgICAgICBuZWFyYnk6IHJlcy5kYXRhLm5lYXJieVNob3dcclxuICAgICAgICB9KTtcclxuXHJcbiAgICAgICAgY29uc29sZS5sb2codGhhdC5kYXRhLm5lYXJieSk7XHJcbiAgICAgIH1cclxuICAgIH0pO1xyXG4gIH1cclxufTsiXX0=