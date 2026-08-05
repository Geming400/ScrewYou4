package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugPoiInfo.class)
public class DebugPoiInfo837746001Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__70880267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70880267L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1608169526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608169526L))
            info.setReturnValue("oL=sQ\uFB3Cp{O!W\u51DAdY)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1395098092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395098092L))
            info.setReturnValue(682118252);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1443030274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443030274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "poiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void poiType__1029283799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1029283799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeTicketCount()I", cancellable = true)
    private void freeTicketCount_300793408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300793408L))
            info.setReturnValue(-81425106);
    }


}
