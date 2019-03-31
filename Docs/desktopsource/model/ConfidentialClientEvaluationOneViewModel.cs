using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ComponentModel;

namespace SCRWizard2015Controller.ViewModels
{
    public class ConfidentialClientEvaluationOneViewModel : INotifyPropertyChanged
    {
        //A.

        #region Values

        private Double _LastYearValue1;
        public Double LastYearValue1
            {
               get
               {   
                return _LastYearValue1;
               }
               set
                {
                    if (value == _LastYearValue1)
                        return;

                    _LastYearValue1 = value;

                    OnPropertyChanged("LastYearValue1");
               }

            }

        private Double _LastYearValue2;
        public Double LastYearValue2
            {
                get { return _LastYearValue2; }
                set
                {
                    if (value == _LastYearValue2)
                        return;

                    _LastYearValue2 = value;

                    OnPropertyChanged("LastYearValue2");
                }

            }

        private Double _LastYearValue3;
        public Double LastYearValue3
            {
                get { return _LastYearValue3; }
                set
                {
                    if (value == _LastYearValue3)
                        return;

                    _LastYearValue3 = value;

                    OnPropertyChanged("LastYearValue3");
                }

            }

        private Double _LastYearValue4;
        public Double LastYearValue4
            {
                get { return _LastYearValue4; }
                set
                {
                    if (value == _LastYearValue4)
                        return;

                    _LastYearValue4 = value;

                    OnPropertyChanged("LastYearValue4");
                }

            }

        private Double _LastYearValue5;
        public Double LastYearValue5
            {
                get { return _LastYearValue5; }
                set
                {
                    if (value == _LastYearValue5)
                        return;

                    _LastYearValue5 = value;

                    OnPropertyChanged("LastYearValue5");
                }

            }

        private Double _LastYearValue6;
        public Double LastYearValue6
            {
                get { return _LastYearValue6; }
                set
                {
                    if (value == _LastYearValue6)
                        return;

                    _LastYearValue6 = value;

                    OnPropertyChanged("LastYearValue6");
                }

            }

        private Double _LastYearValue7;
        public Double LastYearValue7
            {
                get { return _LastYearValue7; }
                set
                {
                    if (value == _LastYearValue7)
                        return;

                    _LastYearValue7 = value;

                    OnPropertyChanged("LastYearValue7");
                }

            }

        private Double _LastYearValue8;
        public Double LastYearValue8
            {
                get { return _LastYearValue8; }
                set
                {
                    if (value == _LastYearValue8)
                        return;

                    _LastYearValue8 = value;

                    OnPropertyChanged("LastYearValue8");
                }

            }
  
        private Double _LastYearValue9;
        public Double LastYearValue9
            {
                get { return _LastYearValue9; }
                set
                {
                    if (value == _LastYearValue9)
                        return;

                    _LastYearValue9 = value;

                    OnPropertyChanged("LastYearValue9");
                }

            }

        #endregion

        #region labels

        private String _LastYearLabel1;
        public String LastYearLabel1
            {
                get { return _LastYearLabel1; }
                set
                {
                    if (value == _LastYearLabel1)
                        return;

                    _LastYearLabel1 = value;

                    OnPropertyChanged("LastYearLabel1");
            }

        }

        private String _LastYearLabel2;
        public String LastYearLabel2
            {
                get { return _LastYearLabel2; }
                set
                {
                    if (value == _LastYearLabel2)
                        return;

                    _LastYearLabel2 = value;

                    OnPropertyChanged("LastYearLabel2");
                }

            }

        private String _LastYearLabel3;
        public String LastYearLabel3
            {
                get { return _LastYearLabel3; }
                set
                {
                    if (value == _LastYearLabel3)
                        return;

                    _LastYearLabel3 = value;

                    OnPropertyChanged("LastYearLabel3");
                }

            }

        private String _LastYearLabel4;
        public String LastYearLabel4
            {
                get { return _LastYearLabel4; }
                set
                {
                    if (value == _LastYearLabel4)
                        return;

                    _LastYearLabel4 = value;

                    OnPropertyChanged("LastYearLabel4");
                }

            }

        private String _LastYearLabel5;
        public String LastYearLabel5
            {
                get { return _LastYearLabel5; }
                set
                {
                    if (value == _LastYearLabel5)
                        return;

                    _LastYearLabel5 = value;

                    OnPropertyChanged("LastYearLabel5");
                }

            }
        
        private String _LastYearLabel6;
        public String LastYearLabel6
            {
                get { return _LastYearLabel6; }
                set
                {
                    if (value == _LastYearLabel6)
                        return;

                    _LastYearLabel6 = value;

                    OnPropertyChanged("LastYearLabel6");
                }

            }

        private String _LastYearLabel7;
        public String LastYearLabel7
            {
                get { return _LastYearLabel7; }
                set
                {
                    if (value == _LastYearLabel7)
                        return;

                    _LastYearLabel7 = value;

                    OnPropertyChanged("LastYearLabel7");
                }

            }

        private String _LastYearLabel8;
        public String LastYearLabel8
            {
                get { return _LastYearLabel8; }
                set
                {
                    if (value == _LastYearLabel8)
                        return;

                    _LastYearLabel8 = value;

                    OnPropertyChanged("LastYearLabel8");
                }

            }

        private String _LastYearLabel9;
        public String LastYearLabel9
            {
                get { return _LastYearLabel9; }
                set
                {
                    if (value == _LastYearLabel9)
                        return;

                    _LastYearLabel9 = value;

                    OnPropertyChanged("LastYearLabel9");
                }

            }

        #endregion

        //A.
        private Double _TotalMediaInvestment;
        public Double TotalMediaInvestment
          {
              get { return _TotalMediaInvestment; }
            set
            {
                if (value == _TotalMediaInvestment)
                return;

                _TotalMediaInvestment = value;

                CalcGrossSalesLastYear();

              OnPropertyChanged("TIALastYear");
              OnPropertyChanged("TotalMediaInvestment");
            }

          }
        public Double TIALastYear
        {
            get { return _TotalMediaInvestment; }
            set
            {
                if (value == _TotalMediaInvestment)
                    return;

                _TotalMediaInvestment = value;

                CalcGrossSalesLastYear();

                OnPropertyChanged("TIALastYear");
                OnPropertyChanged("TotalMediaInvestment");
            }

        }

        //B
        private Decimal _GrossSalesLastyear;
        public Decimal GrossSalesLastyear
            {
                get { return _GrossSalesLastyear; }
                set
                {
                    if (value == _GrossSalesLastyear)
                        return;

                    _GrossSalesLastyear = value;

                    CalcGrossSalesLastYear();

                    OnPropertyChanged("GrossSalesLastyear");
                }

            }

        private Decimal _pctTAIGrossSalesLastYear;
        public Decimal pctTAIGrossSalesLastYear
            {
                get { return _pctTAIGrossSalesLastYear; }
                set
                {
                    if (value == _pctTAIGrossSalesLastYear)
                        return;

                    _pctTAIGrossSalesLastYear = value;

                    OnPropertyChanged("pctTAIGrossSalesLastYear");
                }

            }

        #region Calculations

        private void CalcMediaInvestment()
        {
            TotalMediaInvestment =
            this.LastYearValue1 +
            this.LastYearValue2 +
            this.LastYearValue7 +
            this.LastYearValue4 +
            this.LastYearValue5 +
            this.LastYearValue6 +
            this.LastYearValue3 +
            this.LastYearValue8 +
            this.LastYearValue9;
        }

        private void CalcGrossSalesLastYear()
        {

            //TIA last year / gross sales
            decimal grossSalesLastYear = System.Convert.ToDecimal(this.GrossSalesLastyear);
            decimal tmpTAILastYear = System.Convert.ToDecimal(this.TotalMediaInvestment);

            if (grossSalesLastYear > 0)
                pctTAIGrossSalesLastYear = (tmpTAILastYear / grossSalesLastYear);// *100;

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
