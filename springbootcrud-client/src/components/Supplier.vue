<template>
  <el-dialog type="warning" title="Διαχείριση Προμηθευτή" :visible="visible" :modal="true"
             :close-on-click-modal="false"
             :close-on-press-escape="false" :modal-append-to-body="false" :show-close="false" width="75%"
             @close="clearValidation">

    <el-card>
    <el-form ref="supplierForm" :model="supplier" :rules="rules" label-position="top">

      <el-row :gutter="20">
        <!-- LEFT COLUMN -->
        <el-col :span="8">

          <el-form-item label="Εισάγετε το όνομα της Εταιρείας"
                        prop="companyName">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.companyName"
                      placeholder="Όνομα Εταιρείας"
                      autoComplete="companyName">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε Αριθμό Φορολογικού Μητρώου (ΑΦΜ)"
                        prop="vatNumber">
            <el-input prefix-icon="fa fa-phone"
                      v-model="supplier.vatNumber"
                      placeholder="Αριθμός Φορολογικού Μητρώου"
                      autoComplete="vatNumber">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε Δημόσια Οικονομική Υπηρεσία (Δ.Ο.Υ.)"
                        prop="irsOffice">
            <el-input prefix-icon="fa fa-envelope"
                      v-model="supplier.irsOffice"
                      placeholder="Δημόσια Οικονομική Υπηρεσία"
                      autoComplete="irsOffice">
            </el-input>
          </el-form-item>

        </el-col>
        <!-- MIDDLE COLUMN-->
      <el-col :span="8">
            <el-form-item label="Εισάγετε Όνομα"
                        prop="firstName">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.firstName"
                      placeholder="Όνομα"
                      autoComplete="firstName">
            </el-input>
            </el-form-item>

          <el-form-item label="Εισάγετε Επίθετο"
                        prop="lastName">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.lastName"
                      placeholder="Επίθετο"
                      autoComplete="lastName">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε Διεύθυνση"
                        prop="address">
            <el-input prefix-icon="fa fa-envelope"
                      v-model="supplier.address"
                      placeholder="Διεύθυνση"
                      autoComplete="address">
            </el-input>
          </el-form-item>
      </el-col>

        <!-- RIGHT COLUMN -->
        <el-col :span="8">

          <el-form-item label="Εισάγετε Ταχυδρομικό Κώδικα"
                        prop="zipCpde">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.zipCode"
                      placeholder="Ταχυδρομικός κώδικα"
                      autoComplete="zipCpde">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε Πόλη"
                        prop="city">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.city"
                      placeholder="Πόλη"
                      autoComplete="city">
            </el-input>
          </el-form-item>

          <el-form-item label="Εισάγετε Χώρα"
                        prop="country">
            <el-input prefix-icon="fa fa-user"
                      v-model="supplier.country"
                      placeholder="Χώρα"
                      autoComplete="country">
            </el-input>
          </el-form-item>

        </el-col>
      </el-row>

    </el-form>

      <el-row>
        <el-col style="text-align: right">
          <el-button type="success"
                     icon="fa fa-save"
                     @click="save"> Αποθήκευση </el-button>

          <el-button type="danger"
                     icon="fa fa-remove"
                     @click="confirmDelete"
                     :disabled="!isDeletable"> Διαγραφή </el-button>
        </el-col>
      </el-row>
    </el-card>

    <div slot="footer" class="dialog-footer card-footer">
      <el-button type="warning"
                 icon="el-icon-back"
                 @click="cancel"> Επιστροφή </el-button>
    </div>

  </el-dialog>
</template>
<script src="./SupplierVM.js"></script>
