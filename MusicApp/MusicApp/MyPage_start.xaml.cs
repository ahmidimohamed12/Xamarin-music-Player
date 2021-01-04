using System;
using System.Collections.Generic;
using Lottie.Forms;
using Xamarin.Forms;

namespace MusicApp
{
    public partial class MyPage_start : ContentPage
    {
        public MyPage_start()
        {
            InitializeComponent();

            Device.StartTimer(TimeSpan.FromSeconds(3),  () =>
            {
                Navigation.PushModalAsync(new MainPage());
                return false;
            });

        }
    }
}
