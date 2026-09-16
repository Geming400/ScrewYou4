package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Crypt.class)
public class Crypt_1338678080Mixin {
        @Inject(at = @At("HEAD"), method = "generateKeyPair()Ljava/security/KeyPair;", cancellable = true)
    private static void generateKeyPair__14236192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14236192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringToPemRsaPrivateKey(Ljava/lang/String;)Ljava/security/PrivateKey;", cancellable = true)
    private static void stringToPemRsaPrivateKey__1778139603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778139603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stringToRsaPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;", cancellable = true)
    private static void stringToRsaPublicKey_923435439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(923435439L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateSecretKey()Ljavax/crypto/SecretKey;", cancellable = true)
    private static void generateSecretKey_768314245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768314245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decryptUsingKey(Ljava/security/Key;[B)[B", cancellable = true)
    private static void decryptUsingKey__65047148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65047148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "encryptUsingKey(Ljava/security/Key;[B)[B", cancellable = true)
    private static void encryptUsingKey__182047300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-182047300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decryptByteToSecretKey(Ljava/security/PrivateKey;[B)Ljavax/crypto/SecretKey;", cancellable = true)
    private static void decryptByteToSecretKey__1286068910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286068910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byteToPublicKey([B)Ljava/security/PublicKey;", cancellable = true)
    private static void byteToPublicKey_1621712603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621712603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "digestData(Ljava/lang/String;Ljava/security/PublicKey;Ljavax/crypto/SecretKey;)[B", cancellable = true)
    private static void digestData__1737076959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737076959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCipher(ILjava/security/Key;)Ljavax/crypto/Cipher;", cancellable = true)
    private static void getCipher__586812933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586812933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pemRsaPrivateKeyToString(Ljava/security/PrivateKey;)Ljava/lang/String;", cancellable = true)
    private static void pemRsaPrivateKeyToString__173563265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173563265L))
            info.setReturnValue("!?I'tty1V2h3un*\u8845u\u8F82\"v@Y#V\u3448fP3#^");
    }

    @Inject(at = @At("HEAD"), method = "rsaPublicKeyToString(Ljava/security/PublicKey;)Ljava/lang/String;", cancellable = true)
    private static void rsaPublicKeyToString_238447195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238447195L))
            info.setReturnValue("<A+q>]+\u3C936c>.\"]s`u\uB6A22f!");
    }


}
