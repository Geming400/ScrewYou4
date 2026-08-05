package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiRecord.Packed.class)
public class Packed_1768286551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1141168487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141168487L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_632826575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632826575L))
            info.setReturnValue("_6mfs7'IUA텪QoX;n} BHGPUlpD=X춨N盯'F0&4_/l8L4@<Xs1༶: 1TPgG1:6YE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1806549292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806549292L))
            info.setReturnValue(-1885224898);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__125100329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125100329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeTickets()I", cancellable = true)
    private void freeTickets_1806548796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806548796L))
            info.setReturnValue(-1249250291);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Runnable;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void unpack__177277711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-177277711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "poiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void poiType__977804974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977804974L))
            info.setReturnValue(null);
    }


}
