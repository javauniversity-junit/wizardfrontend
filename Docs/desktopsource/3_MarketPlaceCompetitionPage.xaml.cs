using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using Xceed.Wpf.Toolkit;


namespace SCRWizard2015
{
    /// <summary>
    /// Interaction logic for _1_IntroPage.xaml
    /// </summary>
    public partial class MarketPlaceCompetitionPage : WizardPage
    {
        


        public MarketPlaceCompetitionPage()
        {
            InitializeComponent();
        }
        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        //tms private void TextBox_LostFocus(object sender, RoutedEventArgs e)
        //{
        //    string myValue = "Tina";
         
        //    SCRWizard2015Controller.SingletonController singletonControllerObject = SCRWizard2015Controller.SingletonController.Instance;
        //    singletonControllerObject.sCRXViewController.SCRXView.MarketPlaceCompetition.ThirdTierBusiness = "testme";
        //   // singletonControllerObject.sCRXViewController.SCRXView.
        //    myValue = "new";
            
        //tms }
    }
}
