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
    public partial class PlanBLifetimeValuedPage : WizardPage
    {
        public PlanBLifetimeValuedPage()
        {
            InitializeComponent();
        }
        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {
            PlanBLifetimeValueViewModel _PlanBLifetimeValue = (PlanBLifetimeValueViewModel)this.DataContext;
            _PlanBLifetimeValue.CalcLifetimeValue();

            if (Properties.Settings.Default.VersionType == "Television")
            {
                // tms this.lblJ.Content = "J. Estimated monthly viewers reached ";
                // tms this.lblK.Content = "K. % of monthly viewership (net reach) needed to break even (I/J) ";
            }

            if (Properties.Settings.Default.VersionType == "Radio")
            {
                // tms this.lblJ.Content = "J. Estimated monthly listeners reached ";
                // tms this.lblK.Content = "K. % of monthly listenership (net reach) needed to break even (I/J) ";
            }
        }

    }
}
