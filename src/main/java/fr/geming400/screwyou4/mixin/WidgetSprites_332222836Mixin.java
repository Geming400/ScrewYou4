package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.WidgetSprites.class)
public class WidgetSprites_332222836Mixin {
        @Inject(at = @At("HEAD"), method = "get(ZZ)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void get_505908090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(505908090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1717735094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717735094L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__803237140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803237140L))
            info.setReturnValue("0\uB21By\u7C43q8KQ\u5336c6\u43713N`8!K|+NQuLxSPq1<\u232E\u305Bq`\u4EA7{LP^H6EU\uC2D9}$8a. %o.T-nI(+\u4B23%'\uBD8EB4fY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_370485577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370485577L))
            info.setReturnValue(1571009951);
    }

    @Inject(at = @At("HEAD"), method = "enabled()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void enabled__2110843718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110843718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disabled()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabled__2110843718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110843718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enabledFocused()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void enabledFocused__2110843718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110843718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "disabledFocused()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void disabledFocused__2110843718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110843718L))
            info.setReturnValue(null);
    }


}
