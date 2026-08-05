package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiRecord.Packed.class)
public class Packed_1768286551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_859660282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(859660282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1756257221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1756257221L))
            info.setReturnValue("^f\uD7BFvM[@^]B\uFCBDomr%E`\u7981Cc6r?Tk(Eez%n}d>i\u76D4- v\uCDDA\u3689\uBEE60cqT<w,ijk*\u6AEB\"@1z@+MATK\uFECD-_=_\u8533#n\u1927dF|Ir.e]W\uC088}gb\uBBC8nC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1969328655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1969328655L))
            info.setReturnValue(-187956477);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__512489725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512489725L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Runnable;)Lnet/minecraft/world/entity/ai/village/poi/PoiRecord;", cancellable = true)
    private void unpack_401664511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401664511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "poiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void poiType__98743250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98743250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "freeTickets()I", cancellable = true)
    private void freeTickets_1194535233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1194535233L))
            info.setReturnValue(756671996);
    }


}
