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
using System.Collections.ObjectModel;
using SCRWizard2015Controller;
using SCRWizard2015Controller.ViewModels;

namespace SCRWizard2015
{
    /// <summary>
    /// Interaction logic for _1_IntroPage.xaml
    /// </summary>
    public partial class PlanBMediaPage : WizardPage
    {
        private MediaInvestmentList m_MediaInvestmentList;
        private MediaInvestmentList m_PlanAMediaInvestmentList;

        private bool isInit;

        public PlanBMediaPage()
        {

            isInit = true;
            InitializeComponent();
            isInit = false;

            //Set Empty to start
            m_MediaInvestmentList = new MediaInvestmentList();
            lvMediaInvestment.ItemsSource = m_MediaInvestmentList;

        }

        private void WizardPage_Enter(object sender, RoutedEventArgs e)
        {            
            if (MediaInvestmentList.Count == 1) //Only A total line
            {
                MediaInvestmentList.RemoveAt(0);//???

                ImportPlanA();
            }
        }

        public MediaInvestmentList PlanAMediaInvestmentList
        {
            get { return m_PlanAMediaInvestmentList; }
            set
            {
                m_PlanAMediaInvestmentList = value;
            }
        }
        public MediaInvestmentList MediaInvestmentList
        {
            get { return m_MediaInvestmentList; }
            set
            {
                m_MediaInvestmentList = value;
                lvMediaInvestment.ItemsSource = m_MediaInvestmentList;
            }
        }

        public string JanSpiking
        {
            get { return this.JanSpikeEnum.Text; }
            set { this.JanSpikeEnum.Text = value; }
        }
        public string FebSpiking
        {
            get { return this.FebSpikeEnum.Text; }
            set { this.FebSpikeEnum.Text = value; }
        }
        public string MarSpiking
        {
            get { return this.MarSpikeEnum.Text; }
            set { this.MarSpikeEnum.Text = value; }
        }
        public string AprSpiking
        {
            get { return this.AprSpikeEnum.Text; }
            set { this.AprSpikeEnum.Text = value; }
        }
        public string MaySpiking
        {
            get { return this.MaySpikeEnum.Text; }
            set { this.MaySpikeEnum.Text = value; }
        }
        public string JunSpiking
        {
            get { return this.JunSpikeEnum.Text; }
            set { this.JunSpikeEnum.Text = value; }
        }
        public string JulSpiking
        {
            get { return this.JulSpikeEnum.Text; }
            set { this.JulSpikeEnum.Text = value; }
        }
        public string AugSpiking
        {
            get { return this.AugSpikeEnum.Text; }
            set { this.AugSpikeEnum.Text = value; }
        }
        public string SeptSpiking
        {
            get { return this.SeptSpikeEnum.Text; }
            set { this.SeptSpikeEnum.Text = value; }
        }
        public string OctSpiking
        {
            get { return this.OctSpikeEnum.Text; }
            set { this.OctSpikeEnum.Text = value; }
        }
        public string NovSpiking
        {
            get { return this.NovSpikeEnum.Text; }
            set { this.NovSpikeEnum.Text = value; }
        }
        public string DecSpiking
        {
            get { return this.DecSpikeEnum.Text; }
            set { this.DecSpikeEnum.Text = value; }
        }


        private void lvMediaInvestment_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (lvMediaInvestment.SelectedItem != null)
            {
                ResetDisplay((MediaInvestment)lvMediaInvestment.SelectedItem);
                btnSave.IsEnabled = true;
                btnDelete.IsEnabled = true;
            }
            else
            {
                btnSave.IsEnabled = false;
                btnDelete.IsEnabled = false;
            }
        }

        private void btnSave_Click(object sender, RoutedEventArgs e)
        {

            if (txtStation.Text != string.Empty)
            {
                //Grab the Current Item fill from displ
                MediaInvestment tmpMediaInvestment = BuildMediaInvestment((MediaInvestment)lvMediaInvestment.SelectedItem);

                m_MediaInvestmentList[m_MediaInvestmentList.IndexOf(tmpMediaInvestment)] = tmpMediaInvestment;

                //Remove and Add new total
                this.RemoveTotal();
                this.AddTotal();

                lvMediaInvestment.Items.Refresh();
                lvMediaInvestment.SelectedItem = tmpMediaInvestment;
            }
            else
            {
                Xceed.Wpf.Toolkit.MessageBox.Show("Station name can not be blank.", "Station Name Error");

            }
        }

        private void btnAddNew_Click(object sender, RoutedEventArgs e)
        {
            //TODO Does Name exist?

            if (txtStation.Text != string.Empty)
            {
                MediaInvestment tmpMediaInvestment = BuildMediaInvestment(null);

                m_MediaInvestmentList.Add(tmpMediaInvestment);

                //Remove and Add new total
                this.RemoveTotal();
                this.AddTotal();

                ResetDisplay();

                this.lvMediaInvestment.SelectedItem = this.lvMediaInvestment.Items[this.lvMediaInvestment.Items.Count-2];

            }
            else
            {
                Xceed.Wpf.Toolkit.MessageBox.Show("Station name can not be blank.", "Station Name Error");
            }
        }
        private void btnAddNewEmpty_Click(object sender, RoutedEventArgs e)
        {
            MediaInvestment tmpMediaInvestment = BuildMediaInvestmentEmpty();

            m_MediaInvestmentList.Add(tmpMediaInvestment);

            //Remove and Add new total
            this.RemoveTotal();
            this.AddTotal();

            ResetDisplay();

            this.lvMediaInvestment.SelectedItem = this.lvMediaInvestment.Items[this.lvMediaInvestment.Items.Count-2];

        }
        public void AddTotal()
        {
            m_MediaInvestmentList.Add(TotalMediaInvestment());
        }
        public void RemoveTotal()
        {
            bool _remove = false;
            MediaInvestment _total = null;

            foreach (MediaInvestment cMediaInvestment in m_MediaInvestmentList)
            {
                if (cMediaInvestment.Station == "Total")
                {
                    _remove = true;
                    _total = cMediaInvestment;
                }
            }

            if (_remove)
                m_MediaInvestmentList.Remove(_total);

        }

        private MediaInvestment TotalMediaInvestment()
        {
            MediaInvestment _total = new MediaInvestment();

            foreach (MediaInvestment cMediaInvestment in m_MediaInvestmentList)
            {
                _total.Station = "Total";
                _total.Jan += cMediaInvestment.Jan;
                _total.Feb += cMediaInvestment.Feb;
                _total.Mar += cMediaInvestment.Mar;
                _total.Apr += cMediaInvestment.Apr;
                _total.May += cMediaInvestment.May;
                _total.June += cMediaInvestment.June;
                _total.July += cMediaInvestment.July;
                _total.Aug += cMediaInvestment.Aug;
                _total.Sept += cMediaInvestment.Sept;
                _total.Oct += cMediaInvestment.Oct;
                _total.Nov += cMediaInvestment.Nov;
                _total.Dec += cMediaInvestment.Dec;
                _total.Total += cMediaInvestment.Total;
            }

            return _total;
        }
        private MediaInvestment BuildMediaInvestment(MediaInvestment tmpMediaInvestment)
        {
            PlanBMediaViewModel _PlanBMedia = (PlanBMediaViewModel)this.DataContext;

            if (tmpMediaInvestment == null)
                tmpMediaInvestment = new MediaInvestment();

            tmpMediaInvestment.Station = this.txtStation.Text;
            tmpMediaInvestment.Jan = System.Convert.ToInt32(_PlanBMedia.txtJan);
            tmpMediaInvestment.Feb = System.Convert.ToInt32(_PlanBMedia.txtFeb);
            tmpMediaInvestment.Mar = System.Convert.ToInt32(_PlanBMedia.txtMar);
            tmpMediaInvestment.Apr = System.Convert.ToInt32(_PlanBMedia.txtApr);
            tmpMediaInvestment.May = System.Convert.ToInt32(_PlanBMedia.txtMay);
            tmpMediaInvestment.June = System.Convert.ToInt32(_PlanBMedia.txtJune);
            tmpMediaInvestment.July = System.Convert.ToInt32(_PlanBMedia.txtJuly);
            tmpMediaInvestment.Aug = System.Convert.ToInt32(_PlanBMedia.txtAug);
            tmpMediaInvestment.Sept = System.Convert.ToInt32(_PlanBMedia.txtSept);
            tmpMediaInvestment.Oct = System.Convert.ToInt32(_PlanBMedia.txtOct);
            tmpMediaInvestment.Nov = System.Convert.ToInt32(_PlanBMedia.txtNov);
            tmpMediaInvestment.Dec = System.Convert.ToInt32(_PlanBMedia.txtDec);

            return tmpMediaInvestment;
        }
        private MediaInvestment CopyMediaInvestment(MediaInvestment sourceMediaInvestment)
        {
            MediaInvestment targetMediaInvestment = new MediaInvestment();

            targetMediaInvestment.Station = sourceMediaInvestment.Station;
            targetMediaInvestment.Jan = sourceMediaInvestment.Jan;
            targetMediaInvestment.Feb = sourceMediaInvestment.Feb;
            targetMediaInvestment.Mar = sourceMediaInvestment.Mar;
            targetMediaInvestment.Apr = sourceMediaInvestment.Apr;
            targetMediaInvestment.May = sourceMediaInvestment.May;
            targetMediaInvestment.June = sourceMediaInvestment.June;
            targetMediaInvestment.July = sourceMediaInvestment.July;
            targetMediaInvestment.Aug = sourceMediaInvestment.Aug;
            targetMediaInvestment.Sept = sourceMediaInvestment.Sept;
            targetMediaInvestment.Oct = sourceMediaInvestment.Oct;
            targetMediaInvestment.Nov = sourceMediaInvestment.Nov;
            targetMediaInvestment.Dec = sourceMediaInvestment.Dec;

            return targetMediaInvestment;
        }

        private MediaInvestment BuildMediaInvestmentEmpty()
        {

            MediaInvestment tmpMediaInvestment = new MediaInvestment();
            
                tmpMediaInvestment.Station = "New";
                tmpMediaInvestment.Jan = 0;
                tmpMediaInvestment.Feb = 0;
                tmpMediaInvestment.Mar = 0;
                tmpMediaInvestment.Apr = 0;
                tmpMediaInvestment.May = 0;
                tmpMediaInvestment.June = 0;
                tmpMediaInvestment.July = 0;
                tmpMediaInvestment.Aug = 0;
                tmpMediaInvestment.Sept = 0;
                tmpMediaInvestment.Oct = 0;
                tmpMediaInvestment.Nov = 0;
                tmpMediaInvestment.Dec = 0;

            return tmpMediaInvestment;
        }
        #region Display Helpers

        private void ResetDisplay(MediaInvestment selectedMediaInvestment)
        {

                txtStation.Text = selectedMediaInvestment.Station;
                txtJan.Text = selectedMediaInvestment.Jan.ToString();
                txtFeb.Text = selectedMediaInvestment.Feb.ToString();
                txtMar.Text = selectedMediaInvestment.Mar.ToString();
                txtApr.Text = selectedMediaInvestment.Apr.ToString();
                txtMay.Text = selectedMediaInvestment.May.ToString();
                txtJune.Text = selectedMediaInvestment.June.ToString();
                txtJuly.Text = selectedMediaInvestment.July.ToString();
                txtAug.Text = selectedMediaInvestment.Aug.ToString();
                txtSept.Text = selectedMediaInvestment.Sept.ToString();
                txtOct.Text = selectedMediaInvestment.Oct.ToString();
                txtNov.Text = selectedMediaInvestment.Nov.ToString();
                txtDec.Text = selectedMediaInvestment.Dec.ToString();
                txtTotal.Text = selectedMediaInvestment.Total.ToString();

        }

        private void SetReadOnly(bool Enabled)
        {
                txtStation.IsReadOnly = Enabled;
                txtJan.IsReadOnly = Enabled;
                txtFeb.IsReadOnly = Enabled;
                txtMar.IsReadOnly = Enabled;
                txtApr.IsReadOnly = Enabled;
                txtMay.IsReadOnly = Enabled;
                txtJune.IsReadOnly = Enabled;
                txtJuly.IsReadOnly = Enabled;
                txtAug.IsReadOnly = Enabled;
                txtSept.IsReadOnly = Enabled;
                txtOct.IsReadOnly = Enabled;
                txtNov.IsReadOnly = Enabled;
                txtDec.IsReadOnly = Enabled;
                txtTotal.IsReadOnly = Enabled;
        }

        private void ResetDisplay()
        {
            txtStation.Text = string.Empty;
            txtJan.Text = "0";
            txtFeb.Text = "0";
            txtMar.Text = "0";
            txtApr.Text = "0";
            txtMay.Text = "0";
            txtJune.Text = "0";
            txtJuly.Text = "0";
            txtAug.Text = "0";
            txtSept.Text = "0";
            txtOct.Text = "0";
            txtNov.Text = "0";
            txtDec.Text = "0";
        }

        #endregion

        #region Numeric Textbox Style

        private bool AreAllValidNumericChars(string str)
        {
            foreach (char c in str)
            {
                if (!Char.IsNumber(c)) return false;
            }

            return true;
        }

        private void TextBox_PreviewTextInput(object sender, TextCompositionEventArgs e)
        {
            e.Handled = !AreAllValidNumericChars(e.Text);
            base.OnPreviewTextInput(e);
        }

        private void TextBox_GotFocus(object sender, RoutedEventArgs e)
        {
            ((TextBox)sender).SelectAll();
        }

        private void TextBox_PreviewKeyDown(object sender, KeyEventArgs e)
        {
            e.Handled = (e.Key == Key.Space);
            base.OnPreviewKeyDown(e);

        }

        private void TextBox_PreviewKeyUp(object sender, KeyEventArgs e)
        {
            if (((TextBox)sender).Text == string.Empty)
            {
                ((TextBox)sender).Text = "0";
                ((TextBox)sender).SelectAll();
            }

        }

        #endregion

        private void btnDelete_Click(object sender, RoutedEventArgs e)
        {
            m_MediaInvestmentList.Remove((MediaInvestment)this.lvMediaInvestment.SelectedItem);

            this.RemoveTotal();
            this.AddTotal();

            ResetDisplay();
        }

        private void NumericTextChanged(object sender, TextChangedEventArgs e)
        {
            if (!isInit)
            {
                MediaInvestment tmpMediaInvestment = BuildMediaInvestment(null);
                ResetDisplay(tmpMediaInvestment);
            }
        }

        private void fillMonths_Click(object sender, RoutedEventArgs e)
        {
            PlanBMediaViewModel _PlanBMedia = (PlanBMediaViewModel)this.DataContext;

            _PlanBMedia.txtFeb = _PlanBMedia.txtJan;
            _PlanBMedia.txtMar = _PlanBMedia.txtJan;
            _PlanBMedia.txtApr = _PlanBMedia.txtJan;
            _PlanBMedia.txtMay = _PlanBMedia.txtJan;
            _PlanBMedia.txtJune = _PlanBMedia.txtJan;
            _PlanBMedia.txtJuly = _PlanBMedia.txtJan;
            _PlanBMedia.txtAug = _PlanBMedia.txtJan;
            _PlanBMedia.txtSept = _PlanBMedia.txtJan;
            _PlanBMedia.txtOct = _PlanBMedia.txtJan;
            _PlanBMedia.txtNov = _PlanBMedia.txtJan;
            _PlanBMedia.txtDec = _PlanBMedia.txtJan;
        }
        #region Helpers
        private void uiScaleSlider_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            this.ZoomBx.Scale = this.uiScaleSlider.Value;
        }
        #endregion

        private void ImportPlanA_Click(object sender, RoutedEventArgs e)
        {
            ImportPlanA();
        }

        private void ImportPlanA()
        {

            foreach (MediaInvestment sourceMediaInvestment in PlanAMediaInvestmentList)
            {
                if (sourceMediaInvestment.Station != "Total")
                {
                    MediaInvestment tmpMediaInvestment = CopyMediaInvestment(sourceMediaInvestment);
                    MediaInvestmentList.Add(tmpMediaInvestment);

                    //Remove and Add new total
                    this.RemoveTotal();
                    this.AddTotal();

                    lvMediaInvestment.Items.Refresh();
                    lvMediaInvestment.SelectedItem = tmpMediaInvestment;
                }
            }

        }
    }


}