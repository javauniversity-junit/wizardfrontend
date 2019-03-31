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
    public partial class ConfidentialClientEvaluationContPage : WizardPage
    {
        public ConfidentialClientEvaluationContPage()
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

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {
            //ConfidentialClientEvaluationContViewModel _ConfidentialClientEvaluationCont = (ConfidentialClientEvaluationContViewModel)this.DataContext;

            //this.IndustryAverage.Value = _ConfidentialClientEvaluationCont.IndustryAverage;
        }

        private void ImportPlanA_Click(object sender, RoutedEventArgs e)
        {
            //ImportPlanA();
            //string test = "Tina";


            //ConfidentialClientEvaluationOneViewModel _ConfidentialClientEvaluationOneViewModel = new SCRWizard2015Controller.ViewModels.ConfidentialClientEvaluationOneViewModel();

            ConfidentialClientEvaluationContViewModel _ConfidentialClientEvaluationCont = (ConfidentialClientEvaluationContViewModel)this.DataContext;
            _ConfidentialClientEvaluationCont.ProposedLabel1 = _ConfidentialClientEvaluationCont.ProposedLabel1TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel2 = _ConfidentialClientEvaluationCont.ProposedLabel2TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel3 = _ConfidentialClientEvaluationCont.ProposedLabel3TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel4 = _ConfidentialClientEvaluationCont.ProposedLabel4TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel5 = _ConfidentialClientEvaluationCont.ProposedLabel5TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel6 = _ConfidentialClientEvaluationCont.ProposedLabel6TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel7 = _ConfidentialClientEvaluationCont.ProposedLabel7TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel8 = _ConfidentialClientEvaluationCont.ProposedLabel8TMP;
            _ConfidentialClientEvaluationCont.ProposedLabel9 = _ConfidentialClientEvaluationCont.ProposedLabel9TMP;

            _ConfidentialClientEvaluationCont.ProposedValue1 = _ConfidentialClientEvaluationCont.ProposedValue1TMP;
            _ConfidentialClientEvaluationCont.ProposedValue2 = _ConfidentialClientEvaluationCont.ProposedValue2TMP;
            _ConfidentialClientEvaluationCont.ProposedValue3 = _ConfidentialClientEvaluationCont.ProposedValue3TMP;
            _ConfidentialClientEvaluationCont.ProposedValue4 = _ConfidentialClientEvaluationCont.ProposedValue4TMP;
            _ConfidentialClientEvaluationCont.ProposedValue5 = _ConfidentialClientEvaluationCont.ProposedValue5TMP;
            _ConfidentialClientEvaluationCont.ProposedValue6 = _ConfidentialClientEvaluationCont.ProposedValue6TMP;
            _ConfidentialClientEvaluationCont.ProposedValue7 = _ConfidentialClientEvaluationCont.ProposedValue7TMP;
            _ConfidentialClientEvaluationCont.ProposedValue8 = _ConfidentialClientEvaluationCont.ProposedValue8TMP;
            _ConfidentialClientEvaluationCont.ProposedValue9 = _ConfidentialClientEvaluationCont.ProposedValue9TMP;
            _ConfidentialClientEvaluationCont.ProposedValueTotal = _ConfidentialClientEvaluationCont.TotalMediaInvestment;

        }

    }
}
