using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class PlanALifetimeValueViewModel : INotifyPropertyChanged
    {

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

        #region Lifetime Value Analysis

        private Decimal _AverageSale;
        public Decimal AverageSale
          {
              get { return _AverageSale; }
            set
            {
                if (value == _AverageSale)
                return;

                _AverageSale = value;

                CalcLifetimeValue();

                OnPropertyChanged("AverageSale");
            }
          }

        private Decimal _GrossProfitMargin;
        public Decimal GrossProfitMargin
        {
            get { return _GrossProfitMargin; }
            set
            {
                if (value == _GrossProfitMargin)
                    return;

                _GrossProfitMargin = value;
                CalcLifetimeValue();
                OnPropertyChanged("GrossProfitMargin");
            }
        }

        private Decimal _GrossProfitPerSale;
        public Decimal GrossProfitPerSale
        {
            get { return _GrossProfitPerSale; }
            set
            {
                if (value == _GrossProfitPerSale)
                    return;

                _GrossProfitPerSale = value;
                CalcLifetimeValue();
                OnPropertyChanged("GrossProfitPerSale");
            }
        }

        private Decimal _AverageRepeatSales;
        public Decimal AverageRepeatSales
        {
            get { return _AverageRepeatSales; }
            set
            {
                if (value == _AverageRepeatSales)
                    return;

                _AverageRepeatSales = value;
                CalcLifetimeValue();
                OnPropertyChanged("AverageRepeatSales");
            }
        }

        private Decimal _AverageCustomerValue;
        public Decimal AverageCustomerValue
        {
            get { return _AverageCustomerValue; }
            set
            {
                if (value == _AverageCustomerValue)
                    return;

                _AverageCustomerValue = value;
                CalcLifetimeValue();
                OnPropertyChanged("AverageCustomerValue");
            }
        }

        private Decimal _YearsOfPatronage;
        public Decimal YearsOfPatronage
        {
            get { return _YearsOfPatronage; }
            set
            {
                if (value == _YearsOfPatronage)
                    return;
               
                _YearsOfPatronage = value;
                CalcLifetimeValue();
                OnPropertyChanged("YearsOfPatronage");
            }
        }

        private Decimal _LifetimeValuePerCustomer;
        public Decimal LifetimeValuePerCustomer
        {
            get { return _LifetimeValuePerCustomer; }
            set
            {
                if (value == _LifetimeValuePerCustomer)
                    return;

                _LifetimeValuePerCustomer = value;
                CalcLifetimeValue();
                OnPropertyChanged("LifetimeValuePerCustomer");
            }
        }

        private Decimal _MonthlyInvestmentAverage;
        public Decimal MonthlyInvestmentAverage
        {
            get { return _MonthlyInvestmentAverage; }
            set
            {
                if (value == _MonthlyInvestmentAverage)
                    return;
                
                _MonthlyInvestmentAverage = value;
                CalcLifetimeValue();
                OnPropertyChanged("MonthlyInvestmentAverage");
            }
        }

        private Decimal _ProspectsNeededToBreakEven;
        public Decimal ProspectsNeededToBreakEven
        {
            get { return _ProspectsNeededToBreakEven; }
            set
            {
                if (value == _ProspectsNeededToBreakEven)
                    return;

                _ProspectsNeededToBreakEven = value;
                CalcLifetimeValue();
                OnPropertyChanged("ProspectsNeededToBreakEven");
            }
        }

        private Decimal _EstimatedMonthlyCustomerReach;
        public Decimal EstimatedMonthlyCustomerReach
        {
            get { return _EstimatedMonthlyCustomerReach; }
            set
            {
                if (value == _EstimatedMonthlyCustomerReach)
                    return;

                _EstimatedMonthlyCustomerReach = value;
                CalcLifetimeValue();
                OnPropertyChanged("EstimatedMonthlyCustomerReach");
            }
        }

        private Decimal __PercentMonthlyCustomertoBreakEven;
        public Decimal PercentMonthlyCustomertoBreakEven
        {
            get { return __PercentMonthlyCustomertoBreakEven; }
            set
            {
                if (value == __PercentMonthlyCustomertoBreakEven)
                    return;

                __PercentMonthlyCustomertoBreakEven = value;
                CalcLifetimeValue();
                OnPropertyChanged("PercentMonthlyCustomertoBreakEven");
            }
        }

        
        #endregion

        #region Caculations

        public void CalcLifetimeValue()
        {
            if (PlanA != null)
                    this.MonthlyInvestmentAverage = this.PlanA.PlanAMonthly;
            //                if (this.MonthlyInvestmentAverage == 0)

            if (PlanA != null)
                this.EstimatedMonthlyCustomerReach = this.PlanA.PlanAReach;
                //if (this.EstimatedMonthlyCustomerReach == 0)
            

            decimal valueA = this.AverageSale;
            decimal valueB = this.GrossProfitMargin;
            //Calc GrossProfitPerSale
            decimal valueC = this.GrossProfitPerSale;
            decimal valueD = this.AverageRepeatSales;
            //Calc AverageCustomerValue
            decimal valueE = this.AverageCustomerValue;
            decimal valueF = this.YearsOfPatronage;
            //Calc LifetimeValuePerCustomer
            decimal valueG = this.LifetimeValuePerCustomer;
            decimal valueH = this.MonthlyInvestmentAverage;
            //Calc ProspectsNeededToBreakEven
            decimal valueI = this.ProspectsNeededToBreakEven;
            decimal valueJ = this.EstimatedMonthlyCustomerReach;
            //Calc _PercentMonthlyCustomertoBreakEven
            decimal valueK = this.PercentMonthlyCustomertoBreakEven;

            valueC = valueA * valueB;
            this.GrossProfitPerSale = valueC;

            valueE = valueC * valueD;
            this.AverageCustomerValue = valueE;

            valueG = valueE * valueF;
            this.LifetimeValuePerCustomer = valueG;

            if (valueG > 0)
            {
                valueI = valueH / valueG;
                this.ProspectsNeededToBreakEven = valueI;
            }

            if (valueJ > 0)
            {
                valueK = valueI / valueJ;
                this.PercentMonthlyCustomertoBreakEven = valueK;
            }

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
