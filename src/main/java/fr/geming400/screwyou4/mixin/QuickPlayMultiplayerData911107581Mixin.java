package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayMultiplayerData.class)
public class QuickPlayMultiplayerData911107581Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2481313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2481313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1681531106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681531106L))
            info.setReturnValue("Zdx(L:TQ6J\u183BWn:x#\u5C9D\uB27A4rI\u1992#92\u65C0e#y>o\"rXv1wA\u7467l3CD^[tve?'k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1468459672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1468459672L))
            info.setReturnValue(95062959);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1123040419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123040419L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "serverAddress()Ljava/lang/String;", cancellable = true)
    private void serverAddress_368877047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368877047L))
            info.setReturnValue("\u01BDWV|0}qdT");
    }


}
