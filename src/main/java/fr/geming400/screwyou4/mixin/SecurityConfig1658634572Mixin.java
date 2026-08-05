package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.jsonrpc.security.SecurityConfig.class)
public class SecurityConfig1658634572Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1250820465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250820465L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_523174597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523174597L))
            info.setReturnValue("\uAEC50zAo)<+23DG.R*D\u4139!8)@\u6AF11SC\u63F1-{&l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1696897314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1696897314L))
            info.setReturnValue(-972816537);
    }

    @Inject(at = @At("HEAD"), method = "isValid(Ljava/lang/String;)Z", cancellable = true)
    private static void isValid__1483967483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1483967483L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "secretKey()Ljava/lang/String;", cancellable = true)
    private void secretKey_523174101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523174101L))
            info.setReturnValue("\u0EBBtKi\uBA50TlA/UYxUI<9}\u2612k\"%\uC843O)-+2!Tdv\u79E0b;\u6F03<'DUi");
    }

    @Inject(at = @At("HEAD"), method = "generateSecretKey()Ljava/lang/String;", cancellable = true)
    private static void generateSecretKey_523174349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523174349L))
            info.setReturnValue("-Q\u9D14Hs/5-\u0F9FtRZ!");
    }


}
