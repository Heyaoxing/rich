"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.default = Component({
  data: {
    $toast: {
      show: false
    }
  },

  methods: {
    showToast: function showToast() {
      var _this = this;

      this.setData({
        $toast: {
          show: true
        }
      });
      setTimeout(function () {
        _this.setData({
          $toast: {
            show: false
          }
        });
        wx.navigateBack({
          delta: 2
        });
      }, 1500);
    }
  }
});
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNwZWFrLXN1Y2Nlc3Mud3hjIl0sIm5hbWVzIjpbImRhdGEiLCIkdG9hc3QiLCJzaG93IiwibWV0aG9kcyIsInNob3dUb2FzdCIsInNldERhdGEiLCJzZXRUaW1lb3V0Iiwid3giLCJuYXZpZ2F0ZUJhY2siLCJkZWx0YSJdLCJtYXBwaW5ncyI6Ijs7Ozs7O0FBTUVBLFFBQU07QUFDSkMsWUFBUTtBQUNOQyxZQUFNO0FBREE7QUFESixHOztBQU1OQyxXQUFTO0FBQ1BDLGFBRE8sdUJBQ0s7QUFBQTs7QUFDVixXQUFLQyxPQUFMLENBQWE7QUFDWEosZ0JBQVE7QUFDTkMsZ0JBQU07QUFEQTtBQURHLE9BQWI7QUFLQUksaUJBQVcsWUFBTTtBQUNmLGNBQUtELE9BQUwsQ0FBYTtBQUNYSixrQkFBUTtBQUNOQyxrQkFBTTtBQURBO0FBREcsU0FBYjtBQUtBSyxXQUFHQyxZQUFILENBQWdCO0FBQ2RDLGlCQUFPO0FBRE8sU0FBaEI7QUFHRCxPQVRELEVBU0csSUFUSDtBQVVEO0FBakJNIiwiZmlsZSI6InNwZWFrLXN1Y2Nlc3Mud3hjIiwic291cmNlc0NvbnRlbnQiOlsiZXhwb3J0IGRlZmF1bHQge1xyXG4gIGNvbmZpZzoge1xyXG4gICAgdXNpbmdDb21wb25lbnRzOiB7XHJcbiAgICAgIFwid3hjLXRvYXN0XCI6IFwiQG1pbnVpL3d4Yy10b2FzdFwiXHJcbiAgICB9XHJcbiAgfSxcclxuICBkYXRhOiB7XHJcbiAgICAkdG9hc3Q6IHtcclxuICAgICAgc2hvdzogZmFsc2VcclxuICAgIH1cclxuICB9LFxyXG5cclxuICBtZXRob2RzOiB7XHJcbiAgICBzaG93VG9hc3QoKSB7XHJcbiAgICAgIHRoaXMuc2V0RGF0YSh7XHJcbiAgICAgICAgJHRvYXN0OiB7XHJcbiAgICAgICAgICBzaG93OiB0cnVlXHJcbiAgICAgICAgfVxyXG4gICAgICB9KTtcclxuICAgICAgc2V0VGltZW91dCgoKSA9PiB7XHJcbiAgICAgICAgdGhpcy5zZXREYXRhKHtcclxuICAgICAgICAgICR0b2FzdDoge1xyXG4gICAgICAgICAgICBzaG93OiBmYWxzZVxyXG4gICAgICAgICAgfVxyXG4gICAgICAgIH0pO1xyXG4gICAgICAgIHd4Lm5hdmlnYXRlQmFjayh7XHJcbiAgICAgICAgICBkZWx0YTogMlxyXG4gICAgICAgIH0pO1xyXG4gICAgICB9LCAxNTAwKTtcclxuICAgIH1cclxuICB9XHJcbn07Il19