# 1. Menampilkan informasi tentang penggunaan disk
df -h

# 2. Menghitung ukuran direktori
du -sh

# 3. Menampilkan Pesan Sederhana
echo "Hallo Semua, Nama Saya Rizal Sahala"

# 4. Menggunakan perulangan for
echo "Menghitung hingga 5:"
for ((i=1; i<=5; i++)); do
  echo "$i"
done

# 5. Menggunakan kondisional if
umur=20
if [ $umur -ge 18 ]; then
  echo "Anda sudah dewasa."
else
  echo "Anda masih di bawah umur."
fi
