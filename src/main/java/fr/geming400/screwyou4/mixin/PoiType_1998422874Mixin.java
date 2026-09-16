package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiType.class)
public class PoiType_1998422874Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1089796605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089796605L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1526120898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526120898L))
            info.setReturnValue("<KTsUCjg4.KU-=H(-?/E&GY:0\uA08Ey?xk&NGPcVz4 \uFED4/Q7\uCC15UWW1;2Nu\u4C45");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1739192332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739192332L))
            info.setReturnValue(-1519580807);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void is_1670610901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670610901L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "matchingStates()Ljava/util/Set;", cancellable = true)
    private void matchingStates_113311420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113311420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxTickets()I", cancellable = true)
    private void maxTickets__540697028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-540697028L))
            info.setReturnValue(487409561);
    }

    @Inject(at = @At("HEAD"), method = "validRange()I", cancellable = true)
    private void validRange_1866202942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866202942L))
            info.setReturnValue(964536838);
    }


}
