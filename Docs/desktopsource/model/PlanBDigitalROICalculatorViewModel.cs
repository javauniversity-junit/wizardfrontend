using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PlanBDigitalROICalculatorViewModel : INotifyPropertyChanged
    {
        //decimal ValueG;      
        //decimal ValueJ;

        private Decimal _PlanBMonthlyDigitalInvestment;
        public Decimal PlanBMonthlyDigitalInvestment
        {
            get { return _PlanBMonthlyDigitalInvestment; }
            set
            {
                if (value == _PlanBMonthlyDigitalInvestment)
                    return;

                _PlanBMonthlyDigitalInvestment = value;
                CalcPlanB_ROI();

                OnPropertyChanged("PlanBMonthlyDigitalInvestment");
            }
        }

        private Decimal _PlanBCostPerThousand;
        public Decimal PlanBCostPerThousand
        {
            get { return _PlanBCostPerThousand; }
            set
            {
                if (value == _PlanBCostPerThousand)
                    return;

                _PlanBCostPerThousand = value;
                CalcPlanB_ROI();

                OnPropertyChanged("PlanBCostPerThousand");
            }
        }

        private Decimal _PlanBClosingPctNumber;
        public Decimal PlanBClosingPctNumber
        {
            get { return _PlanBClosingPctNumber; }
            set
            {
                if (value == _PlanBClosingPctNumber)
                    return;

                _PlanBClosingPctNumber = value;

                OnPropertyChanged("PlanBClosingPctNumber");
            }
        }

        private Decimal _PlanBClickThroughRate;
        public Decimal PlanBClickThroughRate
        {
            get { return _PlanBClickThroughRate; }
            set
            {
                if (value == _PlanBClickThroughRate)
                    return;

                _PlanBClickThroughRate = value;
                CalcPlanB_ROI();

                OnPropertyChanged("PlanBClickThroughRate");
            }
        }

        private Decimal _PlanBMonthlyClicks;
        public Decimal PlanBMonthlyClicks
        {
            get { return _PlanBMonthlyClicks; }
            set
            {
                if (value == _PlanBMonthlyClicks)
                    return;

                _PlanBMonthlyClicks = value;

                OnPropertyChanged("PlanBMonthlyClicks");
            }
        }

        private Decimal _PlanBCostPerClicks;
        public Decimal PlanBCostPerClicks
        {
            get { return _PlanBCostPerClicks; }
            set
            {
                if (value == _PlanBCostPerClicks)
                    return;

                _PlanBCostPerClicks = value;

                OnPropertyChanged("PlanBCostPerClicks");
            }
        }

        private Decimal _PlanBSalesConversionPercentage;
        public Decimal PlanBSalesConversionPercentage
        {
            get { return _PlanBSalesConversionPercentage; }
            set
            {
                if (value == _PlanBSalesConversionPercentage)
                    return;

                _PlanBSalesConversionPercentage = value;
                CalcPlanB_ROI();

                OnPropertyChanged("PlanBSalesConversionPercentage");
            }
        }

        private Decimal _PlanBMonthlyConversions;
        public Decimal PlanBMonthlyConversions
        {
            get { return _PlanBMonthlyConversions; }
            set
            {
                if (value == _PlanBMonthlyConversions)
                    return;

                _PlanBMonthlyConversions = value;

                OnPropertyChanged("PlanBMonthlyConversions");
            }
        }

        private Decimal _PlanBCostPerConversion;
        public Decimal PlanBCostPerConversion
        {
            get { return _PlanBCostPerConversion; }
            set
            {
                if (value == _PlanBCostPerConversion)
                    return;

                _PlanBCostPerConversion = value;

                OnPropertyChanged("PlanBCostPerConversion");
            }
        }

        private Decimal _PlanBProjectedGrossProfit;
        public Decimal PlanBProjectedGrossProfit
        {
            get { return _PlanBProjectedGrossProfit; }
            set
            {
                if (value == _PlanBProjectedGrossProfit)
                    return;

                _PlanBProjectedGrossProfit = value;
                CalcPlanB_ROI();

                OnPropertyChanged("PlanBProjectedGrossProfit");
            }
        }

        private Decimal _PlanBMonthlyGrossProfit;
        public Decimal PlanBMonthlyGrossProfit
        {
            get { return _PlanBMonthlyGrossProfit; }
            set
            {
                if (value == _PlanBMonthlyGrossProfit)
                    return;

                _PlanBMonthlyGrossProfit = value;

                OnPropertyChanged("PlanBMonthlyGrossProfit");
            }
        }

        private Decimal _PlanBMonthlyROID;
        public Decimal PlanBMonthlyROID
        {
            get { return _PlanBMonthlyROID; }
            set
            {
                if (value == _PlanBMonthlyROID)
                    return;

                _PlanBMonthlyROID = value;

                OnPropertyChanged("PlanBMonthlyROID");
            }
        }

        private Decimal _PlanBMonthlyROIP;
        public Decimal PlanBMonthlyROIP
        {
            get { return _PlanBMonthlyROIP; }
            set
            {
                if (value == _PlanBMonthlyROIP)
                    return;

                _PlanBMonthlyROIP = value;

                OnPropertyChanged("PlanBMonthlyROIP");
            }
        }
        #region Proposed Schedule

        //private Decimal _PlanBReach;
        //public Decimal PlanBReach
        //  {
        //    get { return _PlanBReach; }
        //    set
        //    {
        //      if (value == _PlanBReach)
        //        return;

        //      _PlanBReach = value;

        //      OnPropertyChanged("PlanBReach");
        //    }
        //  }

        //private String _PlanBCity;
        //public String PlanBCity
        //  {
        //    get { return _PlanBCity; }
        //    set
        //    {
        //      if (value == _PlanBCity)
        //        return;

        //      _PlanBCity = value;

        //      OnPropertyChanged("PlanBCity");
        //    }
        //  }

        //private Decimal _PlanBCommercials;
        //public Decimal PlanBCommercials
        //  {
        //    get { return _PlanBCommercials; }
        //    set
        //    {
        //      if (value == _PlanBCommercials)
        //        return;

        //      _PlanBCommercials = value;

        //      OnPropertyChanged("PlanBCommercials");
        //    }
        //  }

        //private Decimal _PlanBFrequency;
        //public Decimal PlanBFrequency
        //  {
        //    get { return _PlanBFrequency; }
        //    set
        //    {
        //      if (value == _PlanBFrequency)
        //        return;

        //      _PlanBFrequency = value;

        //      OnPropertyChanged("PlanBFrequency");
        //    }
        //  }

        //private Decimal _PlanBMonthly;
        //public Decimal PlanBMonthly
        //  {
        //      get { return _PlanBMonthly; }
        //    set
        //    {
        //        if (value == _PlanBMonthly)
        //        return;

        //        _PlanBMonthly = value;
        //        PlanBInvestment = value;
        //        PlanBDaily = _PlanBMonthly / 30;

        //      OnPropertyChanged("PlanBInvestment");
        //      OnPropertyChanged("PlanBDaily");
        //      OnPropertyChanged("PlanBMonthly");
        //    }
        //  }

        //private Decimal _PlanBDaily;
        //public Decimal PlanBDaily
        //  {
        //      get { return _PlanBDaily; }
        //    set
        //    {
        //        if (value == _PlanBDaily)
        //        return;

        //        _PlanBDaily = value;

        //        OnPropertyChanged("PlanBMonthly");
        //        OnPropertyChanged("PlanBDaily");
        //    }
        //  }

        //private Decimal _PlanBDigitalImpressionsMonthly;
        //public Decimal PlanBDigitalImpressionsMonthly
        //{
        //    get { return _PlanBDigitalImpressionsMonthly; }
        //    set
        //    {
        //        if (value == _PlanBDigitalImpressionsMonthly)
        //            return;

        //        _PlanBDigitalImpressionsMonthly = value;

        //        OnPropertyChanged("PlanBDigitalImpressionsMonthly");
        //        //OnPropertyChanged("PlanBDaily");
        //    }
        //}

        //#endregion

        //#region BEP

        //private Decimal _PlanBAverageSale;
        //public Decimal PlanBAverageSale
        //{
        //    get { return _PlanBAverageSale; }
        //    set
        //    {
        //        if (value == _PlanBAverageSale)
        //            return;

        //        _PlanBAverageSale = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanBAverageSale");
        //    }

        //}

        //private Decimal _PlanBClosingPct;
        //public Decimal PlanBClosingPct
        //{
        //    get { return _PlanBClosingPct; }
        //    set
        //    {
        //        if (value == _PlanBClosingPct)
        //            return;

        //        _PlanBClosingPct = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanBClosingPct");
        //    }

        //}

        //private Decimal _PlanBGrossMargin;
        //public Decimal PlanBGrossMargin
        //{
        //    get { return _PlanBGrossMargin; }
        //    set
        //    {
        //        if (value == _PlanBGrossMargin)
        //            return;

        //        _PlanBGrossMargin = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanBGrossMargin");
        //    }

        //}

        //private Decimal _PlanBInvestment;
        //public Decimal PlanBInvestment
        //{
        //    get { return _PlanBInvestment; }
        //    set
        //    {
        //        if (value == _PlanBInvestment)
        //            return;

        //        _PlanBInvestment = value;

        //        OnPropertyChanged("PlanBInvestment");
        //    }

        //}

        //private int _PlanBMonths;
        //public int PlanBMonths
        //{
        //    get { return _PlanBMonths; }
        //    set
        //    {
        //        if (value == _PlanBMonths)
        //            return;

        //        _PlanBMonths = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanBMonths");
        //    }

        //}

        //private Decimal _PlanBProspectValue;
        //public Decimal PlanBProspectValue
        //  {
        //      get { return _PlanBProspectValue; }

        //      set
        //      {
        //          if (value == _PlanBProspectValue)
        //              return;

        //          _PlanBProspectValue = value;

        //          OnPropertyChanged("PlanBProspectValue");
        //      }
        //  }

        //private Decimal _PlanBProspectsNeeded;
        //public Decimal PlanBProspectsNeeded
        //  {
        //    get { return _PlanBProspectsNeeded; }

        //      set
        //      {
        //          if (value == _PlanBProspectsNeeded)
        //              return;

        //          _PlanBProspectsNeeded = value;

        //        // tms
        //        CalcProspect();
        //        // tms

        //        OnPropertyChanged("PlanBProspectsNeeded");
        //      }
        //  }

        //private Decimal _PlanBProspectSalesNeeded;
        //public Decimal PlanBProspectSalesNeeded
        //  {
        //    get { return _PlanBProspectSalesNeeded; }

        //      set
        //      {
        //          if (value == _PlanBProspectSalesNeeded)
        //              return;

        //          _PlanBProspectSalesNeeded = value;

        //          OnPropertyChanged("PlanBProspectSalesNeeded");
        //      }
        //  }

        //private Decimal _PlanBGrossProfitOnSales;
        //public Decimal PlanBGrossProfitOnSales
        //  {
        //    get { return _PlanBGrossProfitOnSales; }
        //      set
        //      {
        //          if (value == _PlanBGrossProfitOnSales)
        //              return;

        //          _PlanBGrossProfitOnSales = value;

        //          OnPropertyChanged("PlanBGrossProfitOnSales");
        //      }
        //  }

        //private Decimal _PlanBAdditionalGrossSales;
        //public Decimal PlanBAdditionalGrossSales
        //  {
        //      get { return _PlanBAdditionalGrossSales; }

        //      set
        //      {
        //          if (value == _PlanBAdditionalGrossSales)
        //              return;

        //          _PlanBAdditionalGrossSales = value;

        //          OnPropertyChanged("PlanBAdditionalGrossSales");
        //      }
        //  }

        #endregion

        #region RIO

        //private int _pctReturnPlanB;
        //public int pctReturnPlanB
        //{
        //    get { return _pctReturnPlanB; }
        //    set
        //    {
        //        if (value == _pctReturnPlanB)
        //            return;

        //        _pctReturnPlanB = value;
                
        //        CalcPlanB_ROI();

        //        OnPropertyChanged("pctReturnPlanB");
        //    }
        //}

        //private Decimal _AvgReturnLoyalCustomerPlanB;
        //public Decimal AvgReturnLoyalCustomerPlanB
        //{
        //    get { return _AvgReturnLoyalCustomerPlanB; }
        //    set
        //    {
        //        if (value == _AvgReturnLoyalCustomerPlanB)
        //            return;

        //        _AvgReturnLoyalCustomerPlanB = value;

        //        CalcPlanB_ROI();

        //        OnPropertyChanged("AvgReturnLoyalCustomerPlanB");
        //    }
        //}

        //private Decimal _PlanBROIVisits;
        //public Decimal PlanBROIVisits
        //{
        //    get { return _PlanBROIVisits; }
        //    set
        //    {
        //        if (value == _PlanBROIVisits)
        //            return;

        //        _PlanBROIVisits = value;

        //        OnPropertyChanged("PlanBROIVisits");
        //    }
        //}

        //private Decimal _PlanBROIAverageSale;
        //public Decimal PlanBROIAverageSale
        //{
        //    get { return _PlanBROIAverageSale; }
        //    set
        //    {
        //        if (value == _PlanBROIAverageSale)
        //            return;

        //        _PlanBROIAverageSale = value;

        //        CalcPlanB_ROI();

        //        OnPropertyChanged("PlanBROIAverageSale");
        //    }
        //}

        //private Decimal _PlanBROIMargin;
        //public Decimal PlanBROIMargin
        //{
        //    get { return _PlanBROIMargin; }
        //    set
        //    {
        //        if (value == _PlanBROIMargin)
        //            return;

        //        _PlanBROIMargin = value;

        //        CalcPlanB_ROI();

        //        OnPropertyChanged("PlanBROIMargin");
        //    }
        //}

        //private Decimal _PlanBROIAdditionalGross;
        //public Decimal PlanBROIAdditionalGross
        //{
        //    get { return _PlanBROIAdditionalGross; }
        //    set
        //    {
        //        if (value == _PlanBROIAdditionalGross)
        //            return;

        //        _PlanBROIAdditionalGross = value;

        //        OnPropertyChanged("PlanBROIAdditionalGross");
        //    }
        //}

        //private Decimal _PlanBROIProposedMonths;
        //public Decimal PlanBROIProposedMonths
        //{
        //    get { return _PlanBROIProposedMonths; }
        //    set
        //    {
        //        if (value == _PlanBROIProposedMonths)
        //            return;

        //        _PlanBROIProposedMonths = value;

        //        OnPropertyChanged("PlanBROIProposedMonths");
        //    }
        //}

        //private Decimal _PlanBROIAddGrossSales;
        //public Decimal PlanBROIAddGrossSales
        //{
        //    get { return _PlanBROIAddGrossSales; }
        //    set
        //    {
        //        if (value == _PlanBROIAddGrossSales)
        //            return;

        //        _PlanBROIAddGrossSales = value;

        //        OnPropertyChanged("PlanBROIAddGrossSales");
        //    }
        //}

        //private Decimal _PlanBROIAddGrossProfit;
        //public Decimal PlanBROIAddGrossProfit
        //{
        //    get { return _PlanBROIAddGrossProfit; }
        //    set
        //    {
        //        if (value == _PlanBROIAddGrossProfit)
        //            return;

        //        _PlanBROIAddGrossProfit = value;

        //        OnPropertyChanged("PlanBROIAddGrossProfit");
        //    }
        //}

        //private Decimal _PlanBROIAdditionalGrossSales;
        //public Decimal PlanBROIAdditionalGrossSales
        //{
        //    get { return _PlanBROIAdditionalGrossSales; }
        //    set
        //    {
        //        if (value == _PlanBROIAdditionalGrossSales)
        //            return;

        //        _PlanBROIAdditionalGrossSales = value;

        //        OnPropertyChanged("PlanBROIAdditionalGrossSales");
        //    }
        //}

        #endregion

        #region Caculations

        public void CalcProspect()
        {

            //decimal valueA = PlanBAverageSale;
            //decimal valueB = PlanBGrossMargin;
            //decimal valueC = PlanBClosingPct;
            //decimal valueD = PlanBProspectValue;
            //decimal valueE = PlanBInvestment;
            //decimal valueF = 0; //Default

            //decimal valueH = 0; //Default
            //decimal valueI = 0; //Default

            //valueD = (valueA * valueB * valueC);
            //PlanBProspectValue = valueD;

            //if (valueD != 0)
            //    valueF = (valueE / valueD);

            //PlanBProspectsNeeded = valueF;

            //ValueG = valueF * valueC;
            //PlanBProspectSalesNeeded = ValueG;

            //valueH = valueA * ValueG;
            //PlanBGrossProfitOnSales = valueH;

            //valueI = PlanBMonths;

            //ValueJ = valueH * valueI;
            //PlanBAdditionalGrossSales = ValueJ;

            //CalcPlanB_ROI();
            
        }

        public void CalcPlanB_ROI()
        {
            if (PlanBCostPerThousand > 0)
            {
                PlanBClosingPctNumber = (PlanBMonthlyDigitalInvestment / PlanBCostPerThousand) * 1000;
            }

            PlanBMonthlyClicks = PlanBClosingPctNumber * PlanBClickThroughRate;

            if (PlanBMonthlyClicks > 0)
            {
                PlanBCostPerClicks = PlanBMonthlyDigitalInvestment / PlanBMonthlyClicks;
            }

            PlanBMonthlyConversions = PlanBMonthlyClicks * PlanBSalesConversionPercentage;

            if (PlanBMonthlyConversions > 0)
            {
                PlanBCostPerConversion = PlanBMonthlyDigitalInvestment / PlanBMonthlyConversions;
            }

            PlanBMonthlyGrossProfit = PlanBMonthlyConversions * PlanBProjectedGrossProfit;

            PlanBMonthlyROID = PlanBMonthlyGrossProfit - PlanBMonthlyDigitalInvestment;

            if (PlanBMonthlyDigitalInvestment > 0)
            {
                PlanBMonthlyROIP = PlanBMonthlyROID / PlanBMonthlyDigitalInvestment;
            }
            //decimal valueK = System.Convert.ToDecimal(StripFormat(pctReturnPlanB.ToString()));
            //decimal valueL = System.Convert.ToDecimal(StripFormat(AvgReturnLoyalCustomerPlanB.ToString()));

            //PlanBROIVisits = (valueK * (valueL / 100));

            //decimal valueM = System.Convert.ToDecimal(PlanBROIVisits.ToString());
            //decimal valueN = System.Convert.ToDecimal(StripFormat(PlanBROIAverageSale.ToString()));
            //decimal valueO = System.Convert.ToDecimal(StripFormat(PlanBROIMargin.ToString())) / 100;

            //decimal valueP = ValueG * valueM * valueN * valueO;
            //PlanBROIAdditionalGross = valueP;

            ////EDS PlanBMonths
            //decimal valueQ = PlanBMonths;
            //PlanBROIProposedMonths = valueQ;

            //decimal valueR = valueP * valueQ;
            //PlanBROIAddGrossProfit = valueR;

            //decimal valueS = 0;

            //if(valueO > 0 )
            //    valueS = valueR / valueO;

            //PlanBROIAddGrossSales = valueS;

            //PlanBROIAdditionalGrossSales = ValueJ + valueS;

        }

        private Int32 StripFormat(string CurrenctFormat)
        {
            if (CurrenctFormat.IndexOf(".") >= 0)
            {
                //Remove Punto
                CurrenctFormat = CurrenctFormat.Replace(CurrenctFormat.Substring(CurrenctFormat.IndexOf("."), CurrenctFormat.Length - CurrenctFormat.IndexOf(".")), "");
            }
            if (CurrenctFormat.IndexOf(",") >= 0)
            {
                //Remove ,
                CurrenctFormat = CurrenctFormat.Replace(",", "");
            }

            if (CurrenctFormat == "") CurrenctFormat = "0";

            if (!IsInteger(CurrenctFormat.Replace("$", ""))) CurrenctFormat = "0";

            return System.Convert.ToInt32(CurrenctFormat = CurrenctFormat.Replace("$", ""));

        }

        public static bool IsInteger(string theValue)
        {
            try
            {
                Convert.ToInt32(theValue);
                return true;
            }
            catch
            {
                return false;
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
