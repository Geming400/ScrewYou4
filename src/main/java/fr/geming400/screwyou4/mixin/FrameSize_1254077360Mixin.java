package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.FrameSize.class)
public class FrameSize_1254077360Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_345451091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345451091L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2024500884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2024500884L))
            info.setReturnValue("\u14BDh7)m;j8(;@\u4A12b\uA64113x\uB20996?Hk{R6#En5M+L\uD383A&\uC2B3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1811429450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1811429450L))
            info.setReturnValue(-1925800303);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__386070641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386070641L))
            info.setReturnValue(-1722321398);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_168728782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168728782L))
            info.setReturnValue(1862164894);
    }


}
