'use strict';

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
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbInNwZWFrLXN1Y2Nlc3Mud3hjIl0sIm5hbWVzIjpbImRhdGEiLCIkdG9hc3QiLCJzaG93IiwibWV0aG9kcyIsInNob3dUb2FzdCIsInNldERhdGEiLCJzZXRUaW1lb3V0Iiwid3giLCJuYXZpZ2F0ZUJhY2siLCJkZWx0YSJdLCJtYXBwaW5ncyI6Ijs7Ozs7O0FBT0lBLFFBQU07QUFDSkMsWUFBUTtBQUNOQyxZQUFNO0FBREE7QUFESixHOztBQU1OQyxXQUFTO0FBQ1BDLGFBRE8sdUJBQ0s7QUFBQTs7QUFDVixXQUFLQyxPQUFMLENBQWE7QUFDWEosZ0JBQVE7QUFDTkMsZ0JBQU07QUFEQTtBQURHLE9BQWI7QUFLQUksaUJBQVcsWUFBTTtBQUNmLGNBQUtELE9BQUwsQ0FBYTtBQUNiSixrQkFBUTtBQUNOQyxrQkFBTTtBQURBO0FBREssU0FBYjtBQUtESyxXQUFHQyxZQUFILENBQWdCO0FBQ2ZDLGlCQUFPO0FBRFEsU0FBaEI7QUFHRixPQVRDLEVBU0MsSUFURDtBQVVEO0FBakJNIiwiZmlsZSI6InNwZWFrLXN1Y2Nlc3Mud3hjIiwic291cmNlc0NvbnRlbnQiOlsiZXhwb3J0IGRlZmF1bHQge1xyXG4gICAgY29uZmlnOiB7XHJcbiAgICAgIHVzaW5nQ29tcG9uZW50czoge1xyXG4gICAgICAgICd3eGMtdG9hc3QnOiAnQG1pbnVpL3d4Yy10b2FzdCdcclxuICAgICAgICBcclxuICAgICAgfVxyXG4gICAgfSxcclxuICAgIGRhdGE6IHtcclxuICAgICAgJHRvYXN0OiB7XHJcbiAgICAgICAgc2hvdzogZmFsc2VcclxuICAgICAgfVxyXG4gICAgfSxcclxuXHJcbiAgICBtZXRob2RzOiB7XHJcbiAgICAgIHNob3dUb2FzdCgpIHtcclxuICAgICAgICB0aGlzLnNldERhdGEoe1xyXG4gICAgICAgICAgJHRvYXN0OiB7XHJcbiAgICAgICAgICAgIHNob3c6IHRydWVcclxuICAgICAgICAgIH1cclxuICAgICAgICB9KVxyXG4gICAgICAgIHNldFRpbWVvdXQoKCkgPT4ge1xyXG4gICAgICAgICAgdGhpcy5zZXREYXRhKHtcclxuICAgICAgICAgICR0b2FzdDoge1xyXG4gICAgICAgICAgICBzaG93OiBmYWxzZVxyXG4gICAgICAgICAgfVxyXG4gICAgICAgIH0pXHJcbiAgICAgICAgIHd4Lm5hdmlnYXRlQmFjayh7XHJcbiAgICAgICAgICBkZWx0YTogMlxyXG4gICAgICAgIH0pXHJcbiAgICAgIH0sIDE1MDApXHJcbiAgICAgIH1cclxuICAgIH1cclxuICB9Il19