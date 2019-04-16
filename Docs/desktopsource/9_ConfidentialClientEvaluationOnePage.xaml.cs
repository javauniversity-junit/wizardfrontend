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
using SCRWizard2015Controller.ViewModels;


namespace SCRWizard2015
{
    /// <summary>
    /// Interaction logic for _1_IntroPage.xaml
    /// </summary>
    public partial class ConfidentialClientEvaluationOnePage : WizardPage
    {
        public ConfidentialClientEvaluationOnePage()
        {
            InitializeComponent();
        }

        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void TextBox_GotFocus(object sender, RoutedEventArgs e)
        {
            (sender as TextBox).SelectAll();
        }

        //// tms
        //private void TextBox_LostFocus(object sender, RoutedEventArgs e)
        //{
        //   string tinaval = string.Empty;
        //    // ConfidentialClientEvaluationContViewModel _ConfidentialClientEvaluationCont = (ConfidentialClientEvaluationContViewModel)this.DataContext;
        //    ConfidentialClientEvaluationOneViewModel _ConfidentialClientEvaluationOne = (ConfidentialClientEvaluationOneViewModel)this.DataContext;
        //    if (_ConfidentialClientEvaluationOne.LastYearValue1.ToString().Trim().Length < 1)
        //    { _ConfidentialClientEvaluationOne.LastYearValue1 = Convert.ToDouble("0"); }
        //}
        ////tms
    }
}
