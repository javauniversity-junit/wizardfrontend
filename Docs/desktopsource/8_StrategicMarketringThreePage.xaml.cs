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
    public partial class StrategicMarketingThreePage : WizardPage
    {

        private StrategicMarketingThreeViewModel _StrategicMarketingThree;
        private List<String> _poorestMonths;
        private List<String> _bestMonths;
        private List<String> _bestDays;

        private bool _IsInit;

        public StrategicMarketingThreePage()
        {
            InitializeComponent();

            _StrategicMarketingThree = (StrategicMarketingThreeViewModel)this.DataContext;
        }

        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {

            _StrategicMarketingThree = (StrategicMarketingThreeViewModel)this.DataContext;
            
            char[] delimiterChars = {',',' '};

           _poorestMonths = _StrategicMarketingThree.PoorestMonthA.Split(delimiterChars).ToList();
           _bestMonths = _StrategicMarketingThree.BestMonthA.Split(delimiterChars).ToList();
           _bestDays = _StrategicMarketingThree.BestDayA.Split(delimiterChars).ToList();

           _IsInit = true;

            LoadPoorestMonths();
            LoadBestMonths();
            LoadBestDays();

            _IsInit = false;
        }

        #region Loads

        private void LoadPoorestMonths() 
        {
            this.PoorestJanuary.IsChecked = (_poorestMonths.IndexOf("January") >= 0);
            this.PoorestFebruary.IsChecked = (_poorestMonths.IndexOf("February") >= 0);
            this.PoorestMarch.IsChecked = (_poorestMonths.IndexOf("March") >= 0);
            this.PoorestApril.IsChecked = (_poorestMonths.IndexOf("April") >= 0);
            this.PoorestMay.IsChecked = (_poorestMonths.IndexOf("May") >= 0);
            this.PoorestJune.IsChecked = (_poorestMonths.IndexOf("June") >= 0);
            this.PoorestJuly.IsChecked = (_poorestMonths.IndexOf("July") >= 0);
            this.PoorestAugust.IsChecked = (_poorestMonths.IndexOf("August") >= 0);
            this.PoorestSeptember.IsChecked = (_poorestMonths.IndexOf("September") >= 0);
            this.PoorestOctober.IsChecked = (_poorestMonths.IndexOf("October") >= 0);
            this.PoorestNovember.IsChecked = (_poorestMonths.IndexOf("November") >= 0);
            this.PoorestDecember.IsChecked = (_poorestMonths.IndexOf("December") >= 0);
            
        }
        private void LoadBestMonths()
        {
            this.BestJanuary.IsChecked = (_bestMonths.IndexOf("January") >= 0);
            this.BestFebruary.IsChecked = (_bestMonths.IndexOf("February") >= 0);
            this.BestMarch.IsChecked = (_bestMonths.IndexOf("March") >= 0);
            this.BestApril.IsChecked = (_bestMonths.IndexOf("April") >= 0);
            this.BestMay.IsChecked = (_bestMonths.IndexOf("May") >= 0);
            this.BestJune.IsChecked = (_bestMonths.IndexOf("June") >= 0);
            this.BestJuly.IsChecked = (_bestMonths.IndexOf("July") >= 0);
            this.BestAugust.IsChecked = (_bestMonths.IndexOf("August") >= 0);
            this.BestSeptember.IsChecked = (_bestMonths.IndexOf("September") >= 0);
            this.BestOctober.IsChecked = (_bestMonths.IndexOf("October") >= 0);
            this.BestNovember.IsChecked = (_bestMonths.IndexOf("November") >= 0);
            this.BestDecember.IsChecked = (_bestMonths.IndexOf("December") >= 0);

        }
        private void LoadBestDays() 
        {
            this.BestMonday.IsChecked = (_bestDays.IndexOf("Monday") >= 0);
            this.BestTuesday.IsChecked = (_bestDays.IndexOf("Tuesday") >= 0);
            this.BestWednesday.IsChecked = (_bestDays.IndexOf("Wednesday") >= 0);
            this.BestThursday.IsChecked = (_bestDays.IndexOf("Thursday") >= 0);
            this.BestFriday.IsChecked = (_bestDays.IndexOf("Friday") >= 0);
            this.BestSaturday.IsChecked = (_bestDays.IndexOf("Saturday") >= 0);
            this.BestSunday.IsChecked = (_bestDays.IndexOf("Sunday") >= 0);
        }

        #endregion

        #region Checked UnChecked

        private void PoorestMonthACheckBox_Checked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();

            if (_poorestMonths.IndexOf(value) < 0)
                    _poorestMonths.Add(value);

            if (!_IsInit)
                setPoorestMonths();
        }
        private void PoorestMonthACheckBox_Unchecked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();
            _poorestMonths.Remove(value);

            if (!_IsInit)
                setPoorestMonths();
        }

        private void BestMonthACheckBox_Checked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();

            if (_bestMonths.IndexOf(value) < 0)
                _bestMonths.Add(value);

            if (!_IsInit)
                setBestMonths();
        }
        private void BestMonthACheckBox_Unchecked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();
            _bestMonths.Remove(value);
            
            if (!_IsInit)
                setBestMonths();
        }

        private void BestDayACheckBox_Checked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();

            if (_bestDays.IndexOf(value) < 0)
                _bestDays.Add(value);

            if (!_IsInit)
                setBestDays();
        }
        private void BestDayACheckBox_Unchecked(object sender, RoutedEventArgs e)
        {
            String value = (sender as CheckBox).Content.ToString();
            _bestDays.Remove(value);

            if (!_IsInit)
                setBestDays();
        }

        #endregion

        private void setPoorestMonths()
        {
            _StrategicMarketingThree.PoorestMonthA = string.Join(",", _poorestMonths);
        }
        private void setBestMonths()
        {
            _StrategicMarketingThree.BestMonthA = string.Join(",", _bestMonths);
        }
        private void setBestDays()
        {
            _StrategicMarketingThree.BestDayA = string.Join(",", _bestDays);
        }

    }
}
