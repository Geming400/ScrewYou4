package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiRecord.class)
public class PoiRecord105690413Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__802936351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802936351L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_663042008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(663042008L))
            info.setReturnValue(1623526770);
    }

    @Inject(at = @At("HEAD"), method = "pack()Lnet/minecraft/world/entity/ai/village/poi/PoiRecord$Packed;", cancellable = true)
    private void pack_2118267743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118267743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos_595256144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595256144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSpace()Z", cancellable = true)
    private void hasSpace_1246757848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246757848L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFreeTickets()I", cancellable = true)
    private void getFreeTickets__1947050866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947050866L))
            info.setReturnValue(-518554271);
    }

    @Inject(at = @At("HEAD"), method = "getPoiType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void getPoiType_1952572155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952572155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOccupied()Z", cancellable = true)
    private void isOccupied_723431932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723431932L))
            info.setReturnValue(true);
    }


}
