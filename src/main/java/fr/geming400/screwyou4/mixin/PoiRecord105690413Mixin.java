package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiRecord.class)
public class PoiRecord105690413Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1491202176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491202176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_143952659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143952659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/village/poi/PoiRecord$Packed;", cancellable = true)
    private void pack_980097350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980097350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1787696466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787696466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFreeTickets()I", cancellable = true)
    private void getFreeTickets_143952659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143952659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPoiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getPoiType_1654566185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654566185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOccupied()Z", cancellable = true)
    private void isOccupied_143968996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143968996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSpace()Z", cancellable = true)
    private void hasSpace_143968996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143968996L))
            info.setReturnValue(null);
    }


}
