using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class ClientObjectivesViewModel : INotifyPropertyChanged
    {

        #region TOP

        private String _FirstTopObjective;
        public String FirstTopObjective
        {
            get { return _FirstTopObjective; }
            set
            {
                if (value == _FirstTopObjective)
                    return;

                _FirstTopObjective = value;

                OnPropertyChanged("FirstTopObjective");
            }
        }

        private String _SecondTopObjective;
        public String SecondTopObjective
        {
            get { return _SecondTopObjective; }
            set
            {
                if (value == _SecondTopObjective)
                    return;

                _SecondTopObjective = value;

                OnPropertyChanged("SecondTopObjective");
            }
        }

        private String _ThirdTopObjective;
        public String ThirdTopObjective
        {
            get { return _ThirdTopObjective; }
            set
            {
                if (value == _ThirdTopObjective)
                    return;

                _ThirdTopObjective = value;

                OnPropertyChanged("ThirdTopObjective");
            }
        }

        #endregion

        #region Brand

        private bool _IntroduceNewDepartment;
        public bool IntroduceNewDepartment
          {
            get { return _IntroduceNewDepartment; }
            set
            {
              if (value == _IntroduceNewDepartment)
                return;

              _IntroduceNewDepartment = value;

              OnPropertyChanged("IntroduceNewDepartment");
            }
          }

        private bool _IntroduceNewProductsServiceLines;
        public bool IntroduceNewProductsServiceLines
          {
            get { return _IntroduceNewProductsServiceLines; }
            set
            {
              if (value == _IntroduceNewProductsServiceLines)
                return;

              _IntroduceNewProductsServiceLines = value;

              OnPropertyChanged("IntroduceNewProductsServiceLines");
            }
          }

        private bool _CallAttentiontoBrandsPrivateLabelsCarried;
        public bool CallAttentiontoBrandsPrivateLabelsCarried
          {
            get { return _CallAttentiontoBrandsPrivateLabelsCarried; }
            set
            {
              if (value == _CallAttentiontoBrandsPrivateLabelsCarried)
                return;

              _CallAttentiontoBrandsPrivateLabelsCarried = value;

              OnPropertyChanged("CallAttentiontoBrandsPrivateLabelsCarried");
            }
          }

        private bool _PromoteOffPriceItemsServices;
        public bool PromoteOffPriceItemsServices
          {
            get { return _PromoteOffPriceItemsServices; }
            set
            {
              if (value == _PromoteOffPriceItemsServices)
                return;

              _PromoteOffPriceItemsServices = value;

              OnPropertyChanged("PromoteOffPriceItemsServices");
            }
          }

        private bool _FeatureSpecialtyDepartmentsPractices;
        public bool FeatureSpecialtyDepartmentsPractices

          {
            get { return _FeatureSpecialtyDepartmentsPractices; }
            set
            {
              if (value == _FeatureSpecialtyDepartmentsPractices)
                return;

              _FeatureSpecialtyDepartmentsPractices = value;

              OnPropertyChanged("FeatureSpecialtyDepartmentsPractices");
            }
          }

        private bool _FeatureSpecificProducts;
        public bool FeatureSpecificProducts

        {
            get { return _FeatureSpecificProducts; }
            set
            {
                if (value == _FeatureSpecificProducts)
                    return;

                _FeatureSpecificProducts = value;

                OnPropertyChanged("FeatureSpecificProducts");
            }
        }

        private bool _UtilizeCoopVendorDollars;
        public bool UtilizeCoopVendorDollars

        {
            get { return _UtilizeCoopVendorDollars; }
            set
            {
                if (value == _UtilizeCoopVendorDollars)
                    return;

                _UtilizeCoopVendorDollars = value;

                OnPropertyChanged("UtilizeCoopVendorDollars");
            }
        }
        #endregion

        #region Consumer

        private bool _RetainCurrentConsumers;
        public bool RetainCurrentConsumers
          {
            get { return _RetainCurrentConsumers; }
            set
            {
              if (value == _RetainCurrentConsumers)
                return;

              _RetainCurrentConsumers = value;

              OnPropertyChanged("RetainCurrentConsumers");
            }
          }

        private bool _RecaptureLostCustomers;
        public bool RecaptureLostCustomers
          {
            get { return _RecaptureLostCustomers; }
            set
            {
              if (value == _RecaptureLostCustomers)
                return;

              _RecaptureLostCustomers = value;

              OnPropertyChanged("RecaptureLostCustomers");
            }
          }

        private bool _IncreaseCustomerVisits;
        public bool IncreaseCustomerVisits
        {
            get { return _IncreaseCustomerVisits; }
            set
            {
                if (value == _IncreaseCustomerVisits)
                    return;

                _IncreaseCustomerVisits = value;

                OnPropertyChanged("IncreaseCustomerVisits");
            }
        }

        private bool _IncreaseTrafficLeadCalls;
        public bool IncreaseTrafficLeadCalls
          {
            get { return _IncreaseTrafficLeadCalls; }
            set
            {
              if (value == _IncreaseTrafficLeadCalls)
                return;

              _IncreaseTrafficLeadCalls = value;

              OnPropertyChanged("IncreaseTrafficLeadCalls");
            }
          }

        private bool _ExpandTargetConsumers;
        public bool ExpandTargetConsumers
          {
            get { return _ExpandTargetConsumers; }
            set
            {
              if (value == _ExpandTargetConsumers)
                return;

              _ExpandTargetConsumers = value;

              OnPropertyChanged("ExpandTargetConsumers");
            }
          }

        private bool _ChangeConsumerAttitudes;
        public bool ChangeConsumerAttitudes
          {
            get { return _ChangeConsumerAttitudes; }
            set
            {
              if (value == _ChangeConsumerAttitudes)
                return;

              _ChangeConsumerAttitudes = value;

              OnPropertyChanged("ChangeConsumerAttitudes");
            }
          }           

        #endregion

        #region Promotion

        private bool _MakePromotionalEventsStronger;
        public bool MakePromotionalEventsStronger
          {
            get { return _MakePromotionalEventsStronger; }
            set
            {
              if (value == _MakePromotionalEventsStronger)
                return;

              _MakePromotionalEventsStronger = value;

              OnPropertyChanged("MakePromotionalEventsStronger");
            }
          }

        private bool _DevelopDatabaseMarketing;
        public bool DevelopDatabaseMarketing
        {
            get { return _DevelopDatabaseMarketing; }
            set
            {
                if (value == _DevelopDatabaseMarketing)
                    return;

                _DevelopDatabaseMarketing = value;

                OnPropertyChanged("DevelopDatabaseMarketing");
            }
        }

        private bool _InitiateCauseMarketingProgram;
        public bool InitiateCauseMarketingProgram
        {
            get { return _InitiateCauseMarketingProgram; }
            set
            {
                if (value == _InitiateCauseMarketingProgram)
                    return;

                _InitiateCauseMarketingProgram = value;

                OnPropertyChanged("InitiateCauseMarketingProgram");
            }
        }
        private bool _DevelopAQuarterlySpike;
        public bool DevelopAQuarterlySpike
          {
            get { return _DevelopAQuarterlySpike; }
            set
            {
              if (value == _DevelopAQuarterlySpike)
                return;

              _DevelopAQuarterlySpike = value;

              OnPropertyChanged("DevelopAQuarterlySpike");
            }
          }

        private bool _DevelopSeasonalCampaign;
        public bool DevelopSeasonalCampaign
          {
            get { return _DevelopSeasonalCampaign; }
            set
            {
              if (value == _DevelopSeasonalCampaign)
                return;

              _DevelopSeasonalCampaign = value;

              OnPropertyChanged("DevelopSeasonalCampaign");
            }
          }

        private bool _IncreaseDigitalMobileOnlineResponse;
        public bool IncreaseDigitalMobileOnlineResponse
          {
            get { return _IncreaseDigitalMobileOnlineResponse; }
            set
            {
              if (value == _IncreaseDigitalMobileOnlineResponse)
                return;

              _IncreaseDigitalMobileOnlineResponse = value;

              OnPropertyChanged("IncreaseDigitalMobileOnlineResponse");
            }
          }

        private bool _ImproveOtherMediaResults;
        public bool ImproveOtherMediaResults
          {
            get { return _ImproveOtherMediaResults; }
            set
            {
              if (value == _ImproveOtherMediaResults)
                return;

              _ImproveOtherMediaResults = value;

              OnPropertyChanged("ImproveOtherMediaResults");
            }
          }

        private bool _DevelopSpeciallyStagedEvent;
        public bool DevelopSpeciallyStagedEvent
          {
            get { return _DevelopSpeciallyStagedEvent; }
            set
            {
              if (value == _DevelopSpeciallyStagedEvent)
                return;

              _DevelopSpeciallyStagedEvent = value;

              OnPropertyChanged("DevelopSpeciallyStagedEvent");
            }
          }           

        #endregion

        #region Brand

        private bool _MaintainMarketDominance;
        public bool MaintainMarketDominance
          {
            get { return _MaintainMarketDominance; }
            set
            {
              if (value == _MaintainMarketDominance)
                return;

              _MaintainMarketDominance = value;

              OnPropertyChanged("MaintainMarketDominance");
            }
          }

        private bool _ImproveBusinessNameBrand;
        public bool ImproveBusinessNameBrand
          {
            get { return _ImproveBusinessNameBrand; }
            set
            {
              if (value == _ImproveBusinessNameBrand)
                return;

              _ImproveBusinessNameBrand = value;

              OnPropertyChanged("ImproveBusinessNameBrand");
            }
          }

        private bool _EstablishorReestablishBusinessImage;
        public bool EstablishorReestablishBusinessImage
          {
            get { return _EstablishorReestablishBusinessImage; }
            set
            {
              if (value == _EstablishorReestablishBusinessImage)
                return;

              _EstablishorReestablishBusinessImage = value;

              OnPropertyChanged("EstablishorReestablishBusinessImage");
            }
          }

        private bool _CreatePentUpDemand;
        public bool CreatePentUpDemand
          {
            get { return _CreatePentUpDemand; }
            set
            {
              if (value == _CreatePentUpDemand)
                return;

              _CreatePentUpDemand = value;

              OnPropertyChanged("CreatePentUpDemand");
            }
          }

        private bool _IncreaseMarketShare;
        public bool IncreaseMarketShare
          {
            get { return _IncreaseMarketShare; }
            set
            {
              if (value == _IncreaseMarketShare)
                return;

              _IncreaseMarketShare = value;

              OnPropertyChanged("IncreaseMarketShare");
            }
          }

        private bool _Other;
        public bool Other
          {
              get { return _Other; }
            set
            {
                if (value == _Other)
                return;

                _Other = value;

              OnPropertyChanged("Other");
            }
          }

        private String _OtherValue;
        public String OtherValue
        {
            get { return _OtherValue; }
            set
            {
                if (value == _OtherValue)
                    return;

                _OtherValue = value;

                OnPropertyChanged("OtherValue");
            }
        }

        #endregion

        #region INotifyPropertyChanged Handler

        public event PropertyChangedEventHandler PropertyChanged;

        protected void OnPropertyChanged(string propertyName)
        {
            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
            }
        }

        #endregion

    }
}
