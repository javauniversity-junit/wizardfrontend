using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PlanBViewModel : INotifyPropertyChanged
    {

        decimal ValueG;
        decimal ValueJ;


        private PlanAViewModel _PlanA;
        public PlanAViewModel PlanA
        {
            get { return _PlanA; }
            set
            {
                if (value == _PlanA)
                    return;

                _PlanA = value;

                OnPropertyChanged("PlanA");
            }
        }

        #region Propsed

        private Decimal _PlanBReach;
        public Decimal PlanBReach
        {
            get { return _PlanBReach; }
            set
            {
                if (value == _PlanBReach)
                    return;

                _PlanBReach = value;

                OnPropertyChanged("PlanBReach");
            }
        }

        private String _PlanBCity;
        public String PlanBCity
        {
            get { return _PlanBCity; }
            set
            {
                if (value == _PlanBCity)
                    return;

                _PlanBCity = value;

                OnPropertyChanged("PlanBCity");
            }
        }

        private Decimal _PlanBCommercials;
        public Decimal PlanBCommercials
        {
            get { return _PlanBCommercials; }
            set
            {
                if (value == _PlanBCommercials)
                    return;

                _PlanBCommercials = value;

                OnPropertyChanged("PlanBCommercials");
            }
        }

        private Decimal _PlanBFrequency;
        public Decimal PlanBFrequency
        {
            get { return _PlanBFrequency; }
            set
            {
                if (value == _PlanBFrequency)
                    return;

                _PlanBFrequency = value;

                OnPropertyChanged("PlanBFrequency");
            }
        }

        private Decimal _PlanBMonthly;
        public Decimal PlanBMonthly
        {
            get { return _PlanBMonthly; }
            set
            {
                if (value == _PlanBMonthly)
                    return;

                _PlanBMonthly = value;
                PlanBInvestment = value;

                _PlanBDaily = _PlanBMonthly / 30;

                CalcProspectB();

                OnPropertyChanged("PlanBDaily");
                OnPropertyChanged("PlanBMonthly");
            }
        }

        private Decimal _PlanBDaily;
        public Decimal PlanBDaily
        {
            get { return _PlanBDaily; }
            set
            {
                if (value == _PlanBDaily)
                    return;

                _PlanBDaily = value;

                OnPropertyChanged("PlanBMonthly");
                OnPropertyChanged("PlanBDaily");
            }
        }

        private Decimal _PlanBDigitalImpressionsMonthly;
        public Decimal PlanBDigitalImpressionsMonthly
        {
            get { return _PlanBDigitalImpressionsMonthly; }
            set
            {
                if (value == _PlanBDigitalImpressionsMonthly)
                    return;

                _PlanBDigitalImpressionsMonthly = value;

                OnPropertyChanged("PlanBDigitalImpressionsMonthly");
                //OnPropertyChanged("PlanADaily");
            }
        }

        #endregion

        #region BEP

        private Decimal _PlanBAverageSale;
        public Decimal PlanBAverageSale
        {
            get { return _PlanBAverageSale; }
            set
            {
                if (value == _PlanBAverageSale)
                    return;

                _PlanBAverageSale = value;

                CalcProspectB();

                OnPropertyChanged("PlanBAverageSale");
            }

        }

        private Decimal _PlanBClosingPct;
        public Decimal PlanBClosingPct
        {
            get { return _PlanBClosingPct; }
            set
            {
                if (value == _PlanBClosingPct)
                    return;

                _PlanBClosingPct = value;

                CalcProspectB();

                OnPropertyChanged("PlanBClosingPct");
            }

        }

        private Decimal _PlanBGrossMargin;
        public Decimal PlanBGrossMargin
        {
            get { return _PlanBGrossMargin; }
            set
            {
                if (value == _PlanBGrossMargin)
                    return;

                _PlanBGrossMargin = value;

                CalcProspectB();

                OnPropertyChanged("PlanBGrossMargin");
            }

        }

        private Decimal _PlanBInvestment;
        public Decimal PlanBInvestment
        {
            get { return _PlanBInvestment; }
            set
            {
                if (value == _PlanBInvestment)
                    return;

                _PlanBInvestment = value;

                OnPropertyChanged("PlanBInvestment");
            }

        }

        private int _PlanBMonths;
        public int PlanBMonths
        {
            get { return _PlanBMonths; }
            set
            {
                if (value == _PlanBMonths)
                    return;

                _PlanBMonths = value;

                CalcProspectB();

                OnPropertyChanged("PlanBMonths");
            }

        }

        private Decimal _PlanBProspectValue;
        public Decimal PlanBProspectValue
        {
            get { return _PlanBProspectValue; }

            set
            {
                if (value == _PlanBProspectValue)
                    return;

                _PlanBProspectValue = value;

                OnPropertyChanged("PlanBProspectValue");
            }
        }

        private Decimal _PlanBProspectsNeeded;
        public Decimal PlanBProspectsNeeded
        {
            get { return _PlanBProspectsNeeded; }

            set
            {
                if (value == _PlanBProspectsNeeded)
                    return;

                _PlanBProspectsNeeded = value;

                // tms
                CalcProspectB();
                // tms

                OnPropertyChanged("PlanBProspectsNeeded");
            }
        }

        private Decimal _PlanBProspectSalesNeeded;
        public Decimal PlanBProspectSalesNeeded
        {
            get { return _PlanBProspectSalesNeeded; }
            set
            {
                if (value == _PlanBProspectSalesNeeded)
                    return;

                _PlanBProspectSalesNeeded = value;

                OnPropertyChanged("PlanBProspectSalesNeeded");
            }
        }

        private Decimal _PlanBGrossProfitOnSales;
        public Decimal PlanBGrossProfitOnSales
        {
            get { return _PlanBGrossProfitOnSales; }
            set
            {
                if (value == _PlanBGrossProfitOnSales)
                    return;

                _PlanBGrossProfitOnSales = value;

                OnPropertyChanged("PlanBGrossProfitOnSales");
            }
        }

        private Decimal _PlanBAdditionalGrossSales;
        public Decimal PlanBAdditionalGrossSales
        {
            get { return _PlanBAdditionalGrossSales; }

            set
            {
                if (value == _PlanBAdditionalGrossSales)
                    return;

                _PlanBAdditionalGrossSales = value;

                OnPropertyChanged("PlanBAdditionalGrossSales");
            }
        }

        #endregion

        #region RIO

        private int _pctReturnPlanB;
        public int pctReturnPlanB
        {
            get { return _pctReturnPlanB; }
            set
            {
                if (value == _pctReturnPlanB)
                    return;

                _pctReturnPlanB = value;

                CalcPlanB_ROI();

                OnPropertyChanged("pctReturnPlanB");
            }
        }

        private Decimal _AvgReturnLoyalCustomerPlanB;
        public Decimal AvgReturnLoyalCustomerPlanB
        {
            get { return _AvgReturnLoyalCustomerPlanB; }
            set
            {
                if (value == _AvgReturnLoyalCustomerPlanB)
                    return;

                _AvgReturnLoyalCustomerPlanB = value;

                CalcPlanB_ROI();

                OnPropertyChanged("AvgReturnLoyalCustomerPlanB");
            }
        }

        private Decimal _PlanBROIVisits;
        public Decimal PlanBROIVisits
        {
            get { return _PlanBROIVisits; }
            set
            {
                if (value == _PlanBROIVisits)
                    return;

                _PlanBROIVisits = value;

                OnPropertyChanged("PlanBROIVisits");
            }
        }

        private Decimal _PlanBROIAverageSale;
        public Decimal PlanBROIAverageSale
        {
            get { return _PlanBROIAverageSale; }
            set
            {
                if (value == _PlanBROIAverageSale)
                    return;

                _PlanBROIAverageSale = value;

                CalcPlanB_ROI();

                OnPropertyChanged("PlanBROIAverageSale");
            }
        }

        private Decimal _PlanBROIMargin;
        public Decimal PlanBROIMargin
        {
            get { return _PlanBROIMargin; }
            set
            {
                if (value == _PlanBROIMargin)
                    return;

                _PlanBROIMargin = value;

                CalcPlanB_ROI();

                OnPropertyChanged("PlanBROIMargin");
            }
        }

        private Decimal _PlanBROIAdditionalGross;
        public Decimal PlanBROIAdditionalGross
        {
            get { return _PlanBROIAdditionalGross; }
            set
            {
                if (value == _PlanBROIAdditionalGross)
                    return;

                _PlanBROIAdditionalGross = value;

                OnPropertyChanged("PlanBROIAdditionalGross");
            }
        }

        private Decimal _PlanBROIProposedMonths;
        public Decimal PlanBROIProposedMonths
        {
            get { return _PlanBROIProposedMonths; }
            set
            {
                if (value == _PlanBROIProposedMonths)
                    return;

                _PlanBROIProposedMonths = value;

                OnPropertyChanged("PlanBROIProposedMonths");
            }
        }

        private Decimal _PlanBROIAddGrossSales;
        public Decimal PlanBROIAddGrossSales
        {
            get { return _PlanBROIAddGrossSales; }
            set
            {
                if (value == _PlanBROIAddGrossSales)
                    return;

                _PlanBROIAddGrossSales = value;

                OnPropertyChanged("PlanBROIAddGrossSales");
            }
        }

        private Decimal _PlanBROIAddGrossProfit;
        public Decimal PlanBROIAddGrossProfit
        {
            get { return _PlanBROIAddGrossProfit; }
            set
            {
                if (value == _PlanBROIAddGrossProfit)
                    return;

                _PlanBROIAddGrossProfit = value;

                OnPropertyChanged("PlanBROIAddGrossProfit");
            }
        }

        private Decimal _PlanBROIAdditionalGrossSales;
        public Decimal PlanBROIAdditionalGrossSales
        {
            get { return _PlanBROIAdditionalGrossSales; }
            set
            {
                if (value == _PlanBROIAdditionalGrossSales)
                    return;

                _PlanBROIAdditionalGrossSales = value;

                OnPropertyChanged("PlanBROIAdditionalGrossSales");
            }
        }

        #endregion

        #region Calcuations

        public void CalcProspectB()
        {

            if(PlanA != null)
            {
                PlanBAverageSale = PlanA.PlanAAverageSale;
                PlanBClosingPct = PlanA.PlanAClosingPct;
                PlanBGrossMargin= PlanA.PlanAGrossMargin;

                if (PlanBMonths == 0)
                    PlanBMonths = PlanA.PlanAMonths;
            }

            decimal valueA = PlanBAverageSale;
            decimal valueB = PlanBGrossMargin ;
            decimal valueC = PlanBClosingPct ;
            decimal valueD = PlanBProspectValue;
            decimal valueE = PlanBInvestment;
            decimal valueF = 0; //Default

            decimal valueH = 0; //Default
            decimal valueI = 0; //Default

            valueD = (valueA * valueB * valueC);
            PlanBProspectValue = valueD;

            if (valueD != 0)
                valueF = (valueE / valueD);

            PlanBProspectsNeeded = valueF;

            ValueG = valueF * valueC;
            PlanBProspectSalesNeeded = ValueG;

            valueH = valueA * ValueG;
            PlanBGrossProfitOnSales = valueH;

            valueI = PlanBMonths;

            ValueJ = valueH * valueI;
            PlanBAdditionalGrossSales = ValueJ;

            CalcPlanB_ROI();
        
        }

        public void CalcPlanB_ROI()
        {
            if (PlanA != null)
            {
                pctReturnPlanB = PlanA.pctReturnPlanA;
                PlanBROIMargin = PlanA.PlanAROIMargin;
            }

            decimal valueK = System.Convert.ToDecimal(pctReturnPlanB.ToString());
            decimal valueL = System.Convert.ToDecimal(AvgReturnLoyalCustomerPlanB.ToString());

            PlanBROIVisits = (valueK * (valueL / 100));

            decimal valueM = System.Convert.ToDecimal(PlanBROIVisits.ToString());
            decimal valueN = System.Convert.ToDecimal(PlanBROIAverageSale.ToString());
            decimal valueO = System.Convert.ToDecimal(PlanBROIMargin.ToString()) / 100;

            decimal valueP = ValueG * valueM * valueN * valueO;
            PlanBROIAdditionalGross =  valueP;

            decimal valueQ = PlanBMonths;
            PlanBROIProposedMonths = valueQ;

            decimal valueR = valueP * valueQ;
            PlanBROIAddGrossProfit = valueR;

            decimal valueS = 0;

            if(valueO > 0 )
                valueS = valueR / valueO;

            PlanBROIAddGrossSales =  valueS;

            PlanBROIAdditionalGrossSales = ValueJ + valueS;
            
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
