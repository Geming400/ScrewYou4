package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.bell.BellModel.State.class)
public class State_1128358947Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_219732678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219732678L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1898782471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898782471L))
            info.setReturnValue("tMmpu4Qd7\u47BE'OnV9`Hnu9t63th26\uA487EcG_Iw{\uAA55e;r%Fo9\u6FA9\u3E4D\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1685711037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685711037L))
            info.setReturnValue(-1171501650);
    }

    @Inject(at = @At("HEAD"), method = "ticks()F", cancellable = true)
    private void ticks__747739633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747739633L))
            info.setReturnValue(6.3433E7F);
    }

    @Inject(at = @At("HEAD"), method = "shakeDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void shakeDirection__43352698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-43352698L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }


}
