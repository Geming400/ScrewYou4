package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugPoiInfo.class)
public class DebugPoiInfo837746001Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2071709036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2071709036L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__297713974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-297713974L))
            info.setReturnValue("[@>-`'>NwXTt( ;b/(慸(K낕{㟓A=l䔯`:g('nEM⁒");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_876008743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876008743L))
            info.setReturnValue(691082132);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1055640878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055640878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "poiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void poiType__1908345523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1908345523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeTicketCount()I", cancellable = true)
    private void freeTicketCount_876008247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876008247L))
            info.setReturnValue(894229551);
    }


}
