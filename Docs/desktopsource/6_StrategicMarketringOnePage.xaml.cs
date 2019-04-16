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
    public partial class StrategicMarketingOnePage : WizardPage
    {

        StrategicMarketingOneViewModel _StrategicMarketingOne;

        public StrategicMarketingOnePage()
        {
            InitializeComponent();

            _StrategicMarketingOne = (StrategicMarketingOneViewModel)this.DataContext;
        }

        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {
            _StrategicMarketingOne = (StrategicMarketingOneViewModel)this.DataContext;

            if (_StrategicMarketingOne.PlansToExpand != null)
                this.PlanToExpand.Text = _StrategicMarketingOne.PlansToExpand;
        }

        private void PlanToExpand_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            _StrategicMarketingOne.PlansToExpand = ((ComboBoxItem)this.PlanToExpand.SelectedItem).Content.ToString();
        }

    }
}
