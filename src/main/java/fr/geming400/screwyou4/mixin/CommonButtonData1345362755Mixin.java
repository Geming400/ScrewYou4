package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.dialog.CommonButtonData.class)
public class CommonButtonData1345362755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1564092282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564092282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_209902780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(209902780L))
            info.setReturnValue("[}*)j\u7943$Eb#[|mLS\u8946vLKwgrGkS<C\u1D10R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1383625497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383625497L))
            info.setReturnValue(1783434577);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1383625001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383625001L))
            info.setReturnValue(1961958067);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void label__831546410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831546410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tooltip()Ljava/util/Optional;", cancellable = true)
    private void tooltip_1590824177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590824177L))
            info.setReturnValue(null);
    }


}
