package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Crypt.class)
public class Crypt_1338678080Mixin {
        @Inject(at = @At("HEAD"), method = "generateKeyPair()Ljava/security/KeyPair;", cancellable = true)
    private static void generateKeyPair__566960380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566960380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byteToPublicKey([B)Ljava/security/PublicKey;", cancellable = true)
    private static void byteToPublicKey_438117902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(438117902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rsaPublicKeyToString(Ljava/security/PublicKey;)Ljava/lang/String;", cancellable = true)
    private static void rsaPublicKeyToString__2124713987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124713987L))
            info.setReturnValue("^vTM\uFC475Is*xCj^+VnW3\uC8F4f>\u741DK8:^%d\uFAACt{Z7!l$Ud/,_=(");
    }

    @Inject(at = @At("HEAD"), method = "pemRsaPrivateKeyToString(Ljava/security/PrivateKey;)Ljava/lang/String;", cancellable = true)
    private static void pemRsaPrivateKeyToString__2006755857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006755857L))
            info.setReturnValue("k\u8CBAeU=-L7|I{A&|8\u7F35$+)e\u67C4jsaUK\uFB74|8Bp3K\u470E\u1486peSl\u500Ax{ q1\u67B0.QHrMPm$*K\u319B5\uBEF5}q{\uD616A\u549AC{f.B1Q^Fnv0;=x\u96D1\uB95D^+\u92F5\u4704oJVL\u457Fy");
    }

    @Inject(at = @At("HEAD"), method = "digestData(Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B", cancellable = true)
    private static void digestData__433733905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433733905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCipher(ILjava/security/Key;)Ljavax/crypto/Cipher;", cancellable = true)
    private static void getCipher__625554084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625554084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringToRsaPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;", cancellable = true)
    private static void stringToRsaPublicKey_1014383441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014383441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringToPemRsaPrivateKey(Ljava/lang/String;)Ljava/security/PrivateKey;", cancellable = true)
    private static void stringToPemRsaPrivateKey__194490979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-194490979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateSecretKey()Ljavax/crypto/SecretKey;", cancellable = true)
    private static void generateSecretKey_95887083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(95887083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decryptUsingKey(Ljava/security/Key;[B)[B", cancellable = true)
    private static void decryptUsingKey__1421831556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421831556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decryptByteToSecretKey(Ljava/security/PrivateKey;[B)Ljavax/crypto/SecretKey;", cancellable = true)
    private static void decryptByteToSecretKey__250624909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250624909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encryptUsingKey(Ljava/security/Key;[B)[B", cancellable = true)
    private static void encryptUsingKey__1421831556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421831556L))
            info.setReturnValue(null);
    }


}
