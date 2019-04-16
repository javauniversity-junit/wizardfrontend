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
    public partial class ClientObjectivesTwoPage : WizardPage
    {
        public ClientObjectivesTwoPage()
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
            LoadObjectives();
            LoadTopObjectives();
        }

        private void LoadTopObjectives()
        {
            ClientObjectivesViewModel _ClientObjectives = (ClientObjectivesViewModel)this.DataContext;

            TopObjectives.Items.Clear();

            if(!String.IsNullOrEmpty(_ClientObjectives.FirstTopObjective))
                TopObjectives.Items.Add(_ClientObjectives.FirstTopObjective);
            
            if(!String.IsNullOrEmpty(_ClientObjectives.SecondTopObjective))
                TopObjectives.Items.Add(_ClientObjectives.SecondTopObjective);

            if (!String.IsNullOrEmpty(_ClientObjectives.ThirdTopObjective))
                TopObjectives.Items.Add(_ClientObjectives.ThirdTopObjective);


        }

        private void LoadObjectives()
        {
            ClientObjectivesViewModel _ClientObjectives = (ClientObjectivesViewModel)this.DataContext;

            Objectives.Items.Clear();

            //Product/Service
            if (_ClientObjectives.IntroduceNewDepartment)
                // tms Objectives.Items.Add("Introduce New Department");
                Objectives.Items.Add("Introduce New Department/Products/Services");

            if (_ClientObjectives.FeatureSpecificProducts)
                // tms Objectives.Items.Add("Introduce New Products/Service Lines");
                Objectives.Items.Add("Feature Specific Products/Services");

            if (_ClientObjectives.CallAttentiontoBrandsPrivateLabelsCarried)
                Objectives.Items.Add("Call Attention to Brands/Private Labels Carried");

            if (_ClientObjectives.PromoteOffPriceItemsServices)
                Objectives.Items.Add("Promote Off-price Items/Services");

            if (_ClientObjectives.UtilizeCoopVendorDollars)
                // tms Objectives.Items.Add("Feature Specialty Departments/Practices");
                Objectives.Items.Add("Utilize Co-op/Vendor Dollars");

            //Promotion
            if (_ClientObjectives.MakePromotionalEventsStronger)
                Objectives.Items.Add("Make Promotional Events Stronger");

            if (_ClientObjectives.IncreaseDigitalMobileOnlineResponse)
                // tms Objectives.Items.Add("Increase Digital/Mobile/On-line Response");
                Objectives.Items.Add("Develop Digital/Mobile/Social Strategies");

            //if (_ClientObjectives.DevelopSeasonalCampaign)
            //    // tms Objectives.Items.Add("Develop Seasonal Campaign");
            //    Objectives.Items.Add("Establish a Quarterly Spike/Seasonal Campaign");

            if (_ClientObjectives.DevelopAQuarterlySpike)
                Objectives.Items.Add("Establish a Quarterly Spike/Seasonal Campaign");

            if (_ClientObjectives.DevelopDatabaseMarketing)
                // tms Objectives.Items.Add("Develop Seasonal Campaign");
                Objectives.Items.Add("Develop Database Marketing (Email and Text)");

            if (_ClientObjectives.InitiateCauseMarketingProgram)
                Objectives.Items.Add("Initiate Cause Marketing Programs");

            if (_ClientObjectives.DevelopSpeciallyStagedEvent)
                // tms Objectives.Items.Add("Develop Specially Staged Event");
                Objectives.Items.Add("Develop Specially Staged Events");

            //Consumer 
            if (_ClientObjectives.RetainCurrentConsumers)
                // tms Objectives.Items.Add("Retain Current Consumers");
                Objectives.Items.Add("Retain/Recapture Consumers");

            if (_ClientObjectives.IncreaseCustomerVisits)
                Objectives.Items.Add("Increase Frequency of Customer Visits");

            if (_ClientObjectives.IncreaseTrafficLeadCalls)
                // tms Objectives.Items.Add("Increase Traffic/Lead Calls");
                Objectives.Items.Add("Grow New Traffic/Lead Calls");

            if (_ClientObjectives.ExpandTargetConsumers)
                // tms Objectives.Items.Add("Expand Target Consumers (by age, sex, income, geography)");
                Objectives.Items.Add("Expand Target Consumers (by age, sex, geography)");

            if (_ClientObjectives.ChangeConsumerAttitudes)
                Objectives.Items.Add("Change Consumer Attitudes");

            //Brand  
            if (_ClientObjectives.MaintainMarketDominance)
                Objectives.Items.Add("Maintain Market Dominance");

            if (_ClientObjectives.ImproveBusinessNameBrand)
                // tms Objectives.Items.Add("Improve Business’s Name Brand");
                Objectives.Items.Add("Elevate Business Brand/Image");

            if (_ClientObjectives.EstablishorReestablishBusinessImage)
                Objectives.Items.Add("Improve Reputation and Listing Management");

            if (_ClientObjectives.CreatePentUpDemand)
                Objectives.Items.Add("Enhance Website (Mobile, Response, SEO, SEM)");

            if (_ClientObjectives.IncreaseMarketShare)
                Objectives.Items.Add("Increase Market Share");

            if (_ClientObjectives.Other)
                Objectives.Items.Add(_ClientObjectives.OtherValue);

            //Remove Top Objectives from List
            if (Objectives.Items.IndexOf((object)_ClientObjectives.FirstTopObjective) != -1)
            Objectives.Items.RemoveAt(Objectives.Items.IndexOf((object)_ClientObjectives.FirstTopObjective));

            if (Objectives.Items.IndexOf((object)_ClientObjectives.SecondTopObjective) != -1)
            Objectives.Items.RemoveAt(Objectives.Items.IndexOf((object)_ClientObjectives.SecondTopObjective));

            if (Objectives.Items.IndexOf((object)_ClientObjectives.ThirdTopObjective) != -1)
            Objectives.Items.RemoveAt(Objectives.Items.IndexOf((object)_ClientObjectives.ThirdTopObjective));
        }

        private void btnAdd_Click(object sender, RoutedEventArgs e)
        {
            if (TopObjectives.Items.Count < 3)
            {
                TopObjectives.Items.Add(Objectives.SelectedItem);
                Objectives.Items.Remove(Objectives.SelectedItem);
                SetObjectives();
            }
            else { Xceed.Wpf.Toolkit.MessageBox.Show("Only Three Top Objectives Allowed."); }
        }

        private void btnRemove_Click(object sender, RoutedEventArgs e)
        {
            if (TopObjectives.SelectedItem != null)
            {
                Objectives.Items.Add(TopObjectives.SelectedItem);
                TopObjectives.Items.Remove(TopObjectives.SelectedItem);
                SetObjectives();
            }
        }

        private void SetObjectives()
        { 
            ClientObjectivesViewModel _ClientObjectivesViewModel =  new ClientObjectivesViewModel();
            _ClientObjectivesViewModel = (ClientObjectivesViewModel)this.DataContext;

            _ClientObjectivesViewModel.FirstTopObjective = string.Empty;
            _ClientObjectivesViewModel.SecondTopObjective  = string.Empty;
            _ClientObjectivesViewModel.ThirdTopObjective = string.Empty;

            if (TopObjectives.Items.Count >= 1)
            _ClientObjectivesViewModel.FirstTopObjective = TopObjectives.Items[0].ToString();

            if (TopObjectives.Items.Count >= 2)
                _ClientObjectivesViewModel.SecondTopObjective = TopObjectives.Items[1].ToString();

            if (TopObjectives.Items.Count >= 3)
                _ClientObjectivesViewModel.ThirdTopObjective = TopObjectives.Items[2].ToString();
        }

        private void Objectives_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            if (Objectives.SelectedItem != null)
            {
                if (TopObjectives.Items.Count < 3)
                {
                    TopObjectives.Items.Add(Objectives.SelectedItem);
                    Objectives.Items.Remove(Objectives.SelectedItem);
                    SetObjectives();
                }
                else { Xceed.Wpf.Toolkit.MessageBox.Show("Only Three Top Objectives Allowed."); }
            }
        }

        private void TopObjectives_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            if (TopObjectives.SelectedItem != null)
            {
                Objectives.Items.Add(TopObjectives.SelectedItem);
                TopObjectives.Items.Remove(TopObjectives.SelectedItem);
                SetObjectives();
            }
        }

    }
}
