using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PlanADigitalROICalculatorViewModel : INotifyPropertyChanged
    {
        //decimal ValueG;      
        //decimal ValueJ;

        private Decimal _PlanAMonthlyDigitalInvestment;
        public Decimal PlanAMonthlyDigitalInvestment
        {
            get { return _PlanAMonthlyDigitalInvestment; }
            set
            {
                if (value == _PlanAMonthlyDigitalInvestment)
                    return;

                _PlanAMonthlyDigitalInvestment = value;
                CalcPlanA_ROI();

                OnPropertyChanged("PlanAMonthlyDigitalInvestment");
            }
        }

        private Decimal _PlanACostPerThousand;
        public Decimal PlanACostPerThousand
        {
            get { return _PlanACostPerThousand; }
            set
            {
                if (value == _PlanACostPerThousand)
                    return;

                _PlanACostPerThousand = value;
                CalcPlanA_ROI();

                OnPropertyChanged("PlanACostPerThousand");
            }
        }

        private Decimal _PlanAClosingPctNumber;
        public Decimal PlanAClosingPctNumber
        {
            get { return _PlanAClosingPctNumber; }
            set
            {
                if (value == _PlanAClosingPctNumber)
                    return;

                _PlanAClosingPctNumber = value;

                OnPropertyChanged("PlanAClosingPctNumber");
            }
        }

        private Decimal _PlanAClickThroughRate;
        public Decimal PlanAClickThroughRate
        {
            get { return _PlanAClickThroughRate; }
            set
            {
                if (value == _PlanAClickThroughRate)
                    return;

                _PlanAClickThroughRate = value;
                CalcPlanA_ROI();

                OnPropertyChanged("PlanAClickThroughRate");
            }
        }

        private Decimal _PlanAMonthlyClicks;
        public Decimal PlanAMonthlyClicks
        {
            get { return _PlanAMonthlyClicks; }
            set
            {
                if (value == _PlanAMonthlyClicks)
                    return;

                _PlanAMonthlyClicks = value;

                OnPropertyChanged("PlanAMonthlyClicks");
            }
        }

        private Decimal _PlanACostPerClicks;
        public Decimal PlanACostPerClicks
        {
            get { return _PlanACostPerClicks; }
            set
            {
                if (value == _PlanACostPerClicks)
                    return;

                _PlanACostPerClicks = value;

                OnPropertyChanged("PlanACostPerClicks");
            }
        }

        private Decimal _PlanASalesConversionPercentage;
        public Decimal PlanASalesConversionPercentage
        {
            get { return _PlanASalesConversionPercentage; }
            set
            {
                if (value == _PlanASalesConversionPercentage)
                    return;

                _PlanASalesConversionPercentage = value;
                CalcPlanA_ROI();

                OnPropertyChanged("PlanASalesConversionPercentage");
            }
        }

        private Decimal _PlanAMonthlyConversions;
        public Decimal PlanAMonthlyConversions
        {
            get { return _PlanAMonthlyConversions; }
            set
            {
                if (value == _PlanAMonthlyConversions)
                    return;

                _PlanAMonthlyConversions = value;

                OnPropertyChanged("PlanAMonthlyConversions");
            }
        }

        private Decimal _PlanACostPerConversion;
        public Decimal PlanACostPerConversion
        {
            get { return _PlanACostPerConversion; }
            set
            {
                if (value == _PlanACostPerConversion)
                    return;

                _PlanACostPerConversion = value;

                OnPropertyChanged("PlanACostPerConversion");
            }
        }

        private Decimal _PlanAProjectedGrossProfit;
        public Decimal PlanAProjectedGrossProfit
        {
            get { return _PlanAProjectedGrossProfit; }
            set
            {
                if (value == _PlanAProjectedGrossProfit)
                    return;

                _PlanAProjectedGrossProfit = value;
                CalcPlanA_ROI();

                OnPropertyChanged("PlanAProjectedGrossProfit");
            }
        }

        private Decimal _PlanAMonthlyGrossProfit;
        public Decimal PlanAMonthlyGrossProfit
        {
            get { return _PlanAMonthlyGrossProfit; }
            set
            {
                if (value == _PlanAMonthlyGrossProfit)
                    return;

                _PlanAMonthlyGrossProfit = value;

                OnPropertyChanged("PlanAMonthlyGrossProfit");
            }
        }

        private Decimal _PlanAMonthlyROID;
        public Decimal PlanAMonthlyROID
        {
            get { return _PlanAMonthlyROID; }
            set
            {
                if (value == _PlanAMonthlyROID)
                    return;

                _PlanAMonthlyROID = value;

                OnPropertyChanged("PlanAMonthlyROID");
            }
        }

        private Decimal _PlanAMonthlyROIP;
        public Decimal PlanAMonthlyROIP
        {
            get { return _PlanAMonthlyROIP; }
            set
            {
                if (value == _PlanAMonthlyROIP)
                    return;

                _PlanAMonthlyROIP = value;

                OnPropertyChanged("PlanAMonthlyROIP");
            }
        }
        #region Proposed Schedule

        //private Decimal _PlanAReach;
        //public Decimal PlanAReach
        //  {
        //    get { return _PlanAReach; }
        //    set
        //    {
        //      if (value == _PlanAReach)
        //        return;

        //      _PlanAReach = value;

        //      OnPropertyChanged("PlanAReach");
        //    }
        //  }

        //private String _PlanACity;
        //public String PlanACity
        //  {
        //    get { return _PlanACity; }
        //    set
        //    {
        //      if (value == _PlanACity)
        //        return;

        //      _PlanACity = value;

        //      OnPropertyChanged("PlanACity");
        //    }
        //  }

        //private Decimal _PlanACommercials;
        //public Decimal PlanACommercials
        //  {
        //    get { return _PlanACommercials; }
        //    set
        //    {
        //      if (value == _PlanACommercials)
        //        return;

        //      _PlanACommercials = value;

        //      OnPropertyChanged("PlanACommercials");
        //    }
        //  }

        //private Decimal _PlanAFrequency;
        //public Decimal PlanAFrequency
        //  {
        //    get { return _PlanAFrequency; }
        //    set
        //    {
        //      if (value == _PlanAFrequency)
        //        return;

        //      _PlanAFrequency = value;

        //      OnPropertyChanged("PlanAFrequency");
        //    }
        //  }

        //private Decimal _PlanAMonthly;
        //public Decimal PlanAMonthly
        //  {
        //      get { return _PlanAMonthly; }
        //    set
        //    {
        //        if (value == _PlanAMonthly)
        //        return;

        //        _PlanAMonthly = value;
        //        PlanAInvestment = value;
        //        PlanADaily = _PlanAMonthly / 30;

        //      OnPropertyChanged("PlanAInvestment");
        //      OnPropertyChanged("PlanADaily");
        //      OnPropertyChanged("PlanAMonthly");
        //    }
        //  }

        //private Decimal _PlanADaily;
        //public Decimal PlanADaily
        //  {
        //      get { return _PlanADaily; }
        //    set
        //    {
        //        if (value == _PlanADaily)
        //        return;

        //        _PlanADaily = value;

        //        OnPropertyChanged("PlanAMonthly");
        //        OnPropertyChanged("PlanADaily");
        //    }
        //  }

        //private Decimal _PlanADigitalImpressionsMonthly;
        //public Decimal PlanADigitalImpressionsMonthly
        //{
        //    get { return _PlanADigitalImpressionsMonthly; }
        //    set
        //    {
        //        if (value == _PlanADigitalImpressionsMonthly)
        //            return;

        //        _PlanADigitalImpressionsMonthly = value;

        //        OnPropertyChanged("PlanADigitalImpressionsMonthly");
        //        //OnPropertyChanged("PlanADaily");
        //    }
        //}

        //#endregion

        //#region BEP

        //private Decimal _PlanAAverageSale;
        //public Decimal PlanAAverageSale
        //{
        //    get { return _PlanAAverageSale; }
        //    set
        //    {
        //        if (value == _PlanAAverageSale)
        //            return;

        //        _PlanAAverageSale = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanAAverageSale");
        //    }

        //}

        //private Decimal _PlanAClosingPct;
        //public Decimal PlanAClosingPct
        //{
        //    get { return _PlanAClosingPct; }
        //    set
        //    {
        //        if (value == _PlanAClosingPct)
        //            return;

        //        _PlanAClosingPct = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanAClosingPct");
        //    }

        //}

        //private Decimal _PlanAGrossMargin;
        //public Decimal PlanAGrossMargin
        //{
        //    get { return _PlanAGrossMargin; }
        //    set
        //    {
        //        if (value == _PlanAGrossMargin)
        //            return;

        //        _PlanAGrossMargin = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanAGrossMargin");
        //    }

        //}

        //private Decimal _PlanAInvestment;
        //public Decimal PlanAInvestment
        //{
        //    get { return _PlanAInvestment; }
        //    set
        //    {
        //        if (value == _PlanAInvestment)
        //            return;

        //        _PlanAInvestment = value;

        //        OnPropertyChanged("PlanAInvestment");
        //    }

        //}

        //private int _PlanAMonths;
        //public int PlanAMonths
        //{
        //    get { return _PlanAMonths; }
        //    set
        //    {
        //        if (value == _PlanAMonths)
        //            return;

        //        _PlanAMonths = value;

        //        CalcProspect();

        //        OnPropertyChanged("PlanAMonths");
        //    }

        //}

        //private Decimal _PlanAProspectValue;
        //public Decimal PlanAProspectValue
        //  {
        //      get { return _PlanAProspectValue; }

        //      set
        //      {
        //          if (value == _PlanAProspectValue)
        //              return;

        //          _PlanAProspectValue = value;

        //          OnPropertyChanged("PlanAProspectValue");
        //      }
        //  }

        //private Decimal _PlanAProspectsNeeded;
        //public Decimal PlanAProspectsNeeded
        //  {
        //    get { return _PlanAProspectsNeeded; }

        //      set
        //      {
        //          if (value == _PlanAProspectsNeeded)
        //              return;

        //          _PlanAProspectsNeeded = value;

        //        // tms
        //        CalcProspect();
        //        // tms

        //        OnPropertyChanged("PlanAProspectsNeeded");
        //      }
        //  }

        //private Decimal _PlanAProspectSalesNeeded;
        //public Decimal PlanAProspectSalesNeeded
        //  {
        //    get { return _PlanAProspectSalesNeeded; }

        //      set
        //      {
        //          if (value == _PlanAProspectSalesNeeded)
        //              return;

        //          _PlanAProspectSalesNeeded = value;

        //          OnPropertyChanged("PlanAProspectSalesNeeded");
        //      }
        //  }

        //private Decimal _PlanAGrossProfitOnSales;
        //public Decimal PlanAGrossProfitOnSales
        //  {
        //    get { return _PlanAGrossProfitOnSales; }
        //      set
        //      {
        //          if (value == _PlanAGrossProfitOnSales)
        //              return;

        //          _PlanAGrossProfitOnSales = value;

        //          OnPropertyChanged("PlanAGrossProfitOnSales");
        //      }
        //  }

        //private Decimal _PlanAAdditionalGrossSales;
        //public Decimal PlanAAdditionalGrossSales
        //  {
        //      get { return _PlanAAdditionalGrossSales; }

        //      set
        //      {
        //          if (value == _PlanAAdditionalGrossSales)
        //              return;

        //          _PlanAAdditionalGrossSales = value;

        //          OnPropertyChanged("PlanAAdditionalGrossSales");
        //      }
        //  }

        #endregion

        #region RIO

        //private int _pctReturnPlanA;
        //public int pctReturnPlanA
        //{
        //    get { return _pctReturnPlanA; }
        //    set
        //    {
        //        if (value == _pctReturnPlanA)
        //            return;

        //        _pctReturnPlanA = value;
                
        //        CalcPlanA_ROI();

        //        OnPropertyChanged("pctReturnPlanA");
        //    }
        //}

        //private Decimal _AvgReturnLoyalCustomerPlanA;
        //public Decimal AvgReturnLoyalCustomerPlanA
        //{
        //    get { return _AvgReturnLoyalCustomerPlanA; }
        //    set
        //    {
        //        if (value == _AvgReturnLoyalCustomerPlanA)
        //            return;

        //        _AvgReturnLoyalCustomerPlanA = value;

        //        CalcPlanA_ROI();

        //        OnPropertyChanged("AvgReturnLoyalCustomerPlanA");
        //    }
        //}

        //private Decimal _PlanAROIVisits;
        //public Decimal PlanAROIVisits
        //{
        //    get { return _PlanAROIVisits; }
        //    set
        //    {
        //        if (value == _PlanAROIVisits)
        //            return;

        //        _PlanAROIVisits = value;

        //        OnPropertyChanged("PlanAROIVisits");
        //    }
        //}

        //private Decimal _PlanAROIAverageSale;
        //public Decimal PlanAROIAverageSale
        //{
        //    get { return _PlanAROIAverageSale; }
        //    set
        //    {
        //        if (value == _PlanAROIAverageSale)
        //            return;

        //        _PlanAROIAverageSale = value;

        //        CalcPlanA_ROI();

        //        OnPropertyChanged("PlanAROIAverageSale");
        //    }
        //}

        //private Decimal _PlanAROIMargin;
        //public Decimal PlanAROIMargin
        //{
        //    get { return _PlanAROIMargin; }
        //    set
        //    {
        //        if (value == _PlanAROIMargin)
        //            return;

        //        _PlanAROIMargin = value;

        //        CalcPlanA_ROI();

        //        OnPropertyChanged("PlanAROIMargin");
        //    }
        //}

        //private Decimal _PlanAROIAdditionalGross;
        //public Decimal PlanAROIAdditionalGross
        //{
        //    get { return _PlanAROIAdditionalGross; }
        //    set
        //    {
        //        if (value == _PlanAROIAdditionalGross)
        //            return;

        //        _PlanAROIAdditionalGross = value;

        //        OnPropertyChanged("PlanAROIAdditionalGross");
        //    }
        //}

        //private Decimal _PlanAROIProposedMonths;
        //public Decimal PlanAROIProposedMonths
        //{
        //    get { return _PlanAROIProposedMonths; }
        //    set
        //    {
        //        if (value == _PlanAROIProposedMonths)
        //            return;

        //        _PlanAROIProposedMonths = value;

        //        OnPropertyChanged("PlanAROIProposedMonths");
        //    }
        //}

        //private Decimal _PlanAROIAddGrossSales;
        //public Decimal PlanAROIAddGrossSales
        //{
        //    get { return _PlanAROIAddGrossSales; }
        //    set
        //    {
        //        if (value == _PlanAROIAddGrossSales)
        //            return;

        //        _PlanAROIAddGrossSales = value;

        //        OnPropertyChanged("PlanAROIAddGrossSales");
        //    }
        //}

        //private Decimal _PlanAROIAddGrossProfit;
        //public Decimal PlanAROIAddGrossProfit
        //{
        //    get { return _PlanAROIAddGrossProfit; }
        //    set
        //    {
        //        if (value == _PlanAROIAddGrossProfit)
        //            return;

        //        _PlanAROIAddGrossProfit = value;

        //        OnPropertyChanged("PlanAROIAddGrossProfit");
        //    }
        //}

        //private Decimal _PlanAROIAdditionalGrossSales;
        //public Decimal PlanAROIAdditionalGrossSales
        //{
        //    get { return _PlanAROIAdditionalGrossSales; }
        //    set
        //    {
        //        if (value == _PlanAROIAdditionalGrossSales)
        //            return;

        //        _PlanAROIAdditionalGrossSales = value;

        //        OnPropertyChanged("PlanAROIAdditionalGrossSales");
        //    }
        //}

        #endregion

        #region Caculations

        public void CalcProspect()
        {

            //decimal valueA = PlanAAverageSale;
            //decimal valueB = PlanAGrossMargin;
            //decimal valueC = PlanAClosingPct;
            //decimal valueD = PlanAProspectValue;
            //decimal valueE = PlanAInvestment;
            //decimal valueF = 0; //Default

            //decimal valueH = 0; //Default
            //decimal valueI = 0; //Default

            //valueD = (valueA * valueB * valueC);
            //PlanAProspectValue = valueD;

            //if (valueD != 0)
            //    valueF = (valueE / valueD);

            //PlanAProspectsNeeded = valueF;

            //ValueG = valueF * valueC;
            //PlanAProspectSalesNeeded = ValueG;

            //valueH = valueA * ValueG;
            //PlanAGrossProfitOnSales = valueH;

            //valueI = PlanAMonths;

            //ValueJ = valueH * valueI;
            //PlanAAdditionalGrossSales = ValueJ;

            //CalcPlanA_ROI();
            
        }

        public void CalcPlanA_ROI()
        {
            if (PlanACostPerThousand > 0)
            {
                PlanAClosingPctNumber = (PlanAMonthlyDigitalInvestment / PlanACostPerThousand) * 1000;
            }

            PlanAMonthlyClicks = PlanAClosingPctNumber * PlanAClickThroughRate;

            if (PlanAMonthlyClicks > 0)
            { 
                PlanACostPerClicks = PlanAMonthlyDigitalInvestment / PlanAMonthlyClicks;
            }

            PlanAMonthlyConversions = PlanAMonthlyClicks * PlanASalesConversionPercentage;

            if (PlanAMonthlyConversions > 0)
            {
                PlanACostPerConversion = PlanAMonthlyDigitalInvestment / PlanAMonthlyConversions;
            }            

            PlanAMonthlyGrossProfit = PlanAMonthlyConversions * PlanAProjectedGrossProfit;

            PlanAMonthlyROID = PlanAMonthlyGrossProfit - PlanAMonthlyDigitalInvestment;

            if (PlanAMonthlyDigitalInvestment > 0)
            {
                PlanAMonthlyROIP = PlanAMonthlyROID / PlanAMonthlyDigitalInvestment;
            }

            //decimal valueK = System.Convert.ToDecimal(StripFormat(pctReturnPlanA.ToString()));
            //decimal valueL = System.Convert.ToDecimal(StripFormat(AvgReturnLoyalCustomerPlanA.ToString()));

            //PlanAROIVisits = (valueK * (valueL / 100));

            //decimal valueM = System.Convert.ToDecimal(PlanAROIVisits.ToString());
            //decimal valueN = System.Convert.ToDecimal(StripFormat(PlanAROIAverageSale.ToString()));
            //decimal valueO = System.Convert.ToDecimal(StripFormat(PlanAROIMargin.ToString())) / 100;

            //decimal valueP = ValueG * valueM * valueN * valueO;
            //PlanAROIAdditionalGross = valueP;

            ////EDS PlanAMonths
            //decimal valueQ = PlanAMonths;
            //PlanAROIProposedMonths = valueQ;

            //decimal valueR = valueP * valueQ;
            //PlanAROIAddGrossProfit = valueR;

            //decimal valueS = 0;

            //if(valueO > 0 )
            //    valueS = valueR / valueO;

            //PlanAROIAddGrossSales = valueS;

            //PlanAROIAdditionalGrossSales = ValueJ + valueS;

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
