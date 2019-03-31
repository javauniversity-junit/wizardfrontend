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
    public partial class TargetMarketingPage : WizardPage
    {
        TargetMarketingViewModel _TargetMarketing;

        public TargetMarketingPage()
        {
            InitializeComponent();

            _TargetMarketing = (TargetMarketingViewModel)this.DataContext;
        }
        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void pctMen_ValueChanged(object sender, RoutedPropertyChangedEventArgs<object> e)
        {

            if (pctWomen != null && pctMen != null)
            {
                pctWomen.Value = 100 - pctMen.Value;
                if (_TargetMarketing != null)
                {
                    _TargetMarketing.pctMen = (Decimal)pctMen.Value;
                    _TargetMarketing.pctWomen = (Decimal)pctWomen.Value;
                }
            }
        }

        private void pctWomen_ValueChanged(object sender, RoutedPropertyChangedEventArgs<object> e)
        {

            if (pctWomen != null && pctMen != null)
            { 
                pctMen.Value = 100 - pctWomen.Value;
                if (_TargetMarketing != null)
                {
                    _TargetMarketing.pctMen = (Decimal)pctMen.Value;
                    _TargetMarketing.pctWomen = (Decimal)pctWomen.Value;
                }
            }
        }

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {
            _TargetMarketing = (TargetMarketingViewModel)this.DataContext;

            this.pctMen.Value = _TargetMarketing.pctMen;
            this.pctWomen.Value = _TargetMarketing.pctWomen;

            foreach (ListBoxItem item in this.HouseholdIncome.Items)
            {
                if (item.Content.ToString() == _TargetMarketing.HouseholdIncome)
                {
                    this.HouseholdIncome.SelectedItem = item;
                    item.IsSelected = true;
                }
                else
                    item.IsSelected = false;
            }
        }

        private void HouseholdIncome_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (((sender as ListBox).SelectedItem as ListBoxItem) != null)
                if(((sender as ListBox).SelectedItem as ListBoxItem).Content != null)
                    _TargetMarketing.HouseholdIncome = ((sender as ListBox).SelectedItem as ListBoxItem).Content.ToString();
        }


    }
}
