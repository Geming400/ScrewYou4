package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.BlockPositionSource.class)
public class BlockPositionSource_901747917Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2007707121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2007707121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__233712059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233712059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_940010658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940010658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/gameevent/PositionSourceType;", cancellable = true)
    private void getType_849300569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849300569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__991638963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991638963L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition(Lnet/minecraft/world/level/Level;)Ljava/util/Optional;", cancellable = true)
    private void getPosition__976305109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976305109L))
            info.setReturnValue(null);
    }


}
