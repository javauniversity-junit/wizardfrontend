using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class ConfidentialClientEvaluationContViewModel : INotifyPropertyChanged
    {

        //Property Template
        //private String _prop;
        //public String prop
        //  {
        //    get { return _prop; }
        //    set
        //    {
        //      if (value == _prop)
        //        return;

        //      _prop = value;

        //      OnPropertyChanged("prop");
        //    }
        //  }
        
        #region Section C

        private Decimal _TAINext12Months;
        public Decimal TAINext12Months
          {
            get { return _TAINext12Months; }
            set
            {
              if (value == _TAINext12Months)
                return;

              _TAINext12Months = value;

              CalcPctGrossSalesNext12();

              OnPropertyChanged("TAINext12Months");
            }
          }

        private Decimal _PctGrossSales;
        public Decimal PctGrossSales
          {
            get { return _PctGrossSales; }
            set
            {
              if (value == _PctGrossSales)
                return;

              _PctGrossSales = value;

              OnPropertyChanged("PctGrossSales");
            }
          }

        private Decimal _EstimatedGrossSalesNext12Months;
        public Decimal EstimatedGrossSalesNext12Months
          {
            get { return _EstimatedGrossSalesNext12Months; }
            set
            {
              if (value == _EstimatedGrossSalesNext12Months)
                return;

              _EstimatedGrossSalesNext12Months = value;
              
                CalcPctGrossSalesNext12();

              OnPropertyChanged("EstimatedGrossSalesNext12Months");
            }
          }

        #endregion   
            
        #region Section E

        private Decimal _SalesGoals;
        public Decimal SalesGoals
          {
            get { return _SalesGoals; }
            set
            {
              if (value == _SalesGoals)
                return;

              _SalesGoals = value;

              Calc_StretchGoalTAI();

              OnPropertyChanged("SalesGoals");
            }
          }

        private Decimal _IndustryAverage;
        public Decimal IndustryAverage
          {
            get { return _IndustryAverage; }
            set
            {
              if (value == _IndustryAverage)
                return;

              _IndustryAverage = value;

              // tms Calc_StretchGoalTAI();

              OnPropertyChanged("IndustryAverage");
            }
          }

        private Decimal _TAIShouldBe;
        public Decimal TAIShouldBe
        {
            get { return _TAIShouldBe; }
            set
            {
                if (value == _TAIShouldBe)
                    return;

                _TAIShouldBe = value;

                OnPropertyChanged("TAIShouldBe");

                //tms
                Calc_StretchGoalTAI();
                OnPropertyChanged("TAIShouldBe");
                // tms
            }
        }

        private void Calc_StretchGoalTAI()
        {
            //decimal value1 = SalesGoals;
            //decimal value2 =IndustryAverage;

            //if (value2 != 0)
            //TAIShouldBe = (value1 * value2);

            decimal value1 = SalesGoals;
            decimal value2 = TAIShouldBe;

            if (value1 != 0)
                IndustryAverage = (value2 / value1) ;

        }

        #endregion

        #region Values

        private Double _ProposedValue1;
        public Double ProposedValue1
          {
            get { return _ProposedValue1; }
            set
            {
              if (value == _ProposedValue1)
                return;

              _ProposedValue1 = value;

              OnPropertyChanged("ProposedValue1");
            }
          }
        
        private Double _ProposedValue2;
        public Double ProposedValue2
          {
            get { return _ProposedValue2; }
            set
            {
              if (value == _ProposedValue2)
                return;

              _ProposedValue2 = value;

              OnPropertyChanged("ProposedValue2");
            }
          }
        
        private Double _ProposedValue3;
        public Double ProposedValue3
          {
            get { return _ProposedValue3; }
            set
            {
              if (value == _ProposedValue3)
                return;

              _ProposedValue3 = value;

              OnPropertyChanged("ProposedValue3");
            }
          }
        
        private Double _ProposedValue4;
        public Double ProposedValue4
          {
            get { return _ProposedValue4; }
            set
            {
              if (value == _ProposedValue4)
                return;

              _ProposedValue4 = value;

              OnPropertyChanged("ProposedValue4");
            }
          }

        private Double _ProposedValue5;
        public Double ProposedValue5
          {
            get { return _ProposedValue5; }
            set
            {
              if (value == _ProposedValue5)
                return;

              _ProposedValue5 = value;

              OnPropertyChanged("ProposedValue5");
            }
          }

        private Double _ProposedValue6;
        public Double ProposedValue6
          {
            get { return _ProposedValue6; }
            set
            {
              if (value == _ProposedValue6)
                return;

              _ProposedValue6 = value;

              OnPropertyChanged("ProposedValue6");
            }
          }

        private Double _ProposedValue7;
        public Double ProposedValue7
          {
            get { return _ProposedValue7; }
            set
            {
              if (value == _ProposedValue7)
                return;

              _ProposedValue7 = value;

              OnPropertyChanged("ProposedValue7");
            }
          }

        private Double _ProposedValue8;
        public Double ProposedValue8
          {
            get { return _ProposedValue8; }
            set
            {
              if (value == _ProposedValue8)
                return;

              _ProposedValue8 = value;

              OnPropertyChanged("ProposedValue8");
            }
          }

        private Double _ProposedValue9;
        public Double ProposedValue9
          {
            get { return _ProposedValue9; }
            set
            {
              if (value == _ProposedValue9)
                return;

              _ProposedValue9 = value;

              OnPropertyChanged("ProposedValue9");
            }
          }

        private Double _ProposedValueTotal;
        public Double ProposedValueTotal
          {
            get { return _ProposedValueTotal; }
            set
            {
              if (value == _ProposedValueTotal)
                return;

              _ProposedValueTotal = value;

              OnPropertyChanged("ProposedValueTotal");
            }
          }

        private Double _TotalMediaInvestment;
        public Double TotalMediaInvestment
        {
            get { return _TotalMediaInvestment; }
            set
            {
                if (value == _TotalMediaInvestment)
                    return;

                _TotalMediaInvestment = value;

                OnPropertyChanged("TotalMediaInvestment");
            }

        }

        private void CalcMediaInvestment()
        {
            TotalMediaInvestment =
            this.ProposedValue1 +
            this.ProposedValue2 +
            this.ProposedValue7 +
            this.ProposedValue4 +
            this.ProposedValue5 +
            this.ProposedValue6 +
            this.ProposedValue3 +
            this.ProposedValue8 +
            this.ProposedValue9;
        }
        #endregion

        #region Lables

        private String _ProposedLabel1;
        public String ProposedLabel1
          {
            get { return _ProposedLabel1; }
            set
            {
              if (value == _ProposedLabel1)
                return;

              _ProposedLabel1 = value;

              OnPropertyChanged("ProposedLabel1");
            }
          }

        private String _ProposedLabel2;
        public String ProposedLabel2
          {
            get { return _ProposedLabel2; }
            set
            {
              if (value == _ProposedLabel2)
                return;

              _ProposedLabel2 = value;

              OnPropertyChanged("ProposedLabel2");
            }
          }
     
        private String _ProposedLabel3;
        public String ProposedLabel3
          {
            get { return _ProposedLabel3; }
            set
            {
              if (value == _ProposedLabel3)
                return;

              _ProposedLabel3 = value;

              OnPropertyChanged("ProposedLabel3");
            }
          }

        private String _ProposedLabel4;
        public String ProposedLabel4
          {
            get { return _ProposedLabel4; }
            set
            {
              if (value == _ProposedLabel4)
                return;

              _ProposedLabel4 = value;

              OnPropertyChanged("ProposedLabel4");
            }
          }

        private String _ProposedLabel5;
        public String ProposedLabel5
          {
            get { return _ProposedLabel5; }
            set
            {
              if (value == _ProposedLabel5)
                return;

              _ProposedLabel5 = value;

              OnPropertyChanged("ProposedLabel5");
            }
          }

        private String _ProposedLabel6;
        public String ProposedLabel6
          {
            get { return _ProposedLabel6; }
            set
            {
              if (value == _ProposedLabel6)
                return;

              _ProposedLabel6 = value;

              OnPropertyChanged("ProposedLabel6");
            }
          }
        
        private String _ProposedLabel7;
        public String ProposedLabel7
          {
            get { return _ProposedLabel7; }
            set
            {
              if (value == _ProposedLabel7)
                return;

              _ProposedLabel7 = value;

              OnPropertyChanged("ProposedLabel7");
            }
          }

        private String _ProposedLabel8;
        public String ProposedLabel8
          {
            get { return _ProposedLabel8; }
            set
            {
              if (value == _ProposedLabel8)
                return;

              _ProposedLabel8 = value;

              OnPropertyChanged("ProposedLabel8");
            }
          }

        private String _ProposedLabel9;
        public String ProposedLabel9
          {
              get { return _ProposedLabel9; }
            set
            {
                if (value == _ProposedLabel9)
                return;

                _ProposedLabel9 = value;

              OnPropertyChanged("ProposedLabel9");
            }
          }


        private String _ProposedLabel1TMP;
        public String ProposedLabel1TMP
        {
            get { return _ProposedLabel1TMP; }
            set
            {
                if (value == _ProposedLabel1TMP)
                    return;

                _ProposedLabel1TMP = value;

                OnPropertyChanged("ProposedLabel1TMP");
            }
        }

        private String _ProposedLabel2TMP;
        public String ProposedLabel2TMP
        {
            get { return _ProposedLabel2TMP; }
            set
            {
                if (value == _ProposedLabel2TMP)
                    return;

                _ProposedLabel2TMP = value;

                OnPropertyChanged("ProposedLabel2TMP");
            }
        }

        private String _ProposedLabel3TMP;
        public String ProposedLabel3TMP
        {
            get { return _ProposedLabel3TMP; }
            set
            {
                if (value == _ProposedLabel3TMP)
                    return;

                _ProposedLabel3TMP = value;

                OnPropertyChanged("ProposedLabel3TMP");
            }
        }

        private String _ProposedLabel4TMP;
        public String ProposedLabel4TMP
        {
            get { return _ProposedLabel4TMP; }
            set
            {
                if (value == _ProposedLabel4TMP)
                    return;

                _ProposedLabel4TMP = value;

                OnPropertyChanged("ProposedLabel4TMP");
            }
        }

        private String _ProposedLabel5TMP;
        public String ProposedLabel5TMP
        {
            get { return _ProposedLabel5TMP; }
            set
            {
                if (value == _ProposedLabel5TMP)
                    return;

                _ProposedLabel5TMP = value;

                OnPropertyChanged("ProposedLabel5TMP");
            }
        }

        private String _ProposedLabel6TMP;
        public String ProposedLabel6TMP
        {
            get { return _ProposedLabel6TMP; }
            set
            {
                if (value == _ProposedLabel6TMP)
                    return;

                _ProposedLabel6TMP = value;

                OnPropertyChanged("ProposedLabel6TMP");
            }
        }

        private String _ProposedLabel7TMP;
        public String ProposedLabel7TMP
        {
            get { return _ProposedLabel7TMP; }
            set
            {
                if (value == _ProposedLabel7TMP)
                    return;

                _ProposedLabel7TMP = value;

                OnPropertyChanged("ProposedLabel7TMP");
            }
        }

        private String _ProposedLabel8TMP;
        public String ProposedLabel8TMP
        {
            get { return _ProposedLabel8TMP; }
            set
            {
                if (value == _ProposedLabel8TMP)
                    return;

                _ProposedLabel8TMP = value;

                OnPropertyChanged("ProposedLabel8TMP");
            }
        }

        private String _ProposedLabel9TMP;
        public String ProposedLabel9TMP
        {
            get { return _ProposedLabel9TMP; }
            set
            {
                if (value == _ProposedLabel9TMP)
                    return;

                _ProposedLabel9TMP = value;

                OnPropertyChanged("ProposedLabel9TMP");
            }
        }


        private Double _ProposedValue1TMP;
        public Double ProposedValue1TMP
        {
            get { return _ProposedValue1TMP; }
            set
            {
                if (value == _ProposedValue1TMP)
                    return;

                _ProposedValue1TMP = value;

                OnPropertyChanged("ProposedValue1TMP");
            }
        }

        private Double _ProposedValue2TMP;
        public Double ProposedValue2TMP
        {
            get { return _ProposedValue2TMP; }
            set
            {
                if (value == _ProposedValue2TMP)
                    return;

                _ProposedValue2TMP = value;

                OnPropertyChanged("ProposedValue2TMP");
            }
        }

        private Double _ProposedValue3TMP;
        public Double ProposedValue3TMP
        {
            get { return _ProposedValue3TMP; }
            set
            {
                if (value == _ProposedValue3TMP)
                    return;

                _ProposedValue3TMP = value;

                OnPropertyChanged("ProposedValue3TMP");
            }
        }

        private Double _ProposedValue4TMP;
        public Double ProposedValue4TMP
        {
            get { return _ProposedValue4TMP; }
            set
            {
                if (value == _ProposedValue4TMP)
                    return;

                _ProposedValue4TMP = value;

                OnPropertyChanged("ProposedValue4TMP");
            }
        }

        private Double _ProposedValue5TMP;
        public Double ProposedValue5TMP
        {
            get { return _ProposedValue5TMP; }
            set
            {
                if (value == _ProposedValue5TMP)
                    return;

                _ProposedValue5TMP = value;

                OnPropertyChanged("ProposedValue5TMP");
            }
        }

        private Double _ProposedValue6TMP;
        public Double ProposedValue6TMP
        {
            get { return _ProposedValue6TMP; }
            set
            {
                if (value == _ProposedValue6TMP)
                    return;

                _ProposedValue6TMP = value;

                OnPropertyChanged("ProposedValue6TMP");
            }
        }

        private Double _ProposedValue7TMP;
        public Double ProposedValue7TMP
        {
            get { return _ProposedValue7TMP; }
            set
            {
                if (value == _ProposedValue7TMP)
                    return;

                _ProposedValue7TMP = value;

                OnPropertyChanged("ProposedValue7TMP");
            }
        }

        private Double _ProposedValue8TMP;
        public Double ProposedValue8TMP
        {
            get { return _ProposedValue8TMP; }
            set
            {
                if (value == _ProposedValue8TMP)
                    return;

                _ProposedValue8TMP = value;

                OnPropertyChanged("ProposedValue8TMP");
            }
        }

        private Double _ProposedValue9TMP;
        public Double ProposedValue9TMP
        {
            get { return _ProposedValue9TMP; }
            set
            {
                if (value == _ProposedValue9TMP)
                    return;

                _ProposedValue9TMP = value;

                OnPropertyChanged("ProposedValue9TMP");
            }
        }



        #endregion

        #region Calculations

        private void CalcPctGrossSalesNext12()
        {

            decimal tmpTAIFromNext12Months = this.TAINext12Months;
            decimal tmpEstimatedSalesNext12Months = 0;

            //if(this.EstimatedGrossSalesNext12Months != null)
                tmpEstimatedSalesNext12Months = this.EstimatedGrossSalesNext12Months;

            if (tmpEstimatedSalesNext12Months > 0)
                this.PctGrossSales = (tmpTAIFromNext12Months / tmpEstimatedSalesNext12Months);// *100;
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

            if (!IsDecimal(CurrenctFormat.Replace("$", ""))) CurrenctFormat = "0";

            return System.Convert.ToInt32(CurrenctFormat = CurrenctFormat.Replace("$", ""));
        }
        public static bool IsDecimal(string theValue)
        {
            if (theValue == "")
                theValue = "0";
            try
            {
                theValue = theValue.Replace("$", "");
                Convert.ToDouble(theValue);
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
            CalcMediaInvestment();

            if (PropertyChanged != null)
            {
                PropertyChanged(this, new PropertyChangedEventArgs(propertyName));
            }
        }

        #endregion
    }
}
