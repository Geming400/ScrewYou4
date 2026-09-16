package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.BlockSource.class)
public class BlockSource215182570Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__693443698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693443698L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_985606095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(985606095L))
            info.setReturnValue("_\u274D0^`SbX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_772534661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(772534661L))
            info.setReturnValue(1743577547);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__116327767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116327767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__2065593705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065593705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level_1575396542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575396542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_205053550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205053550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntity()Lnet/minecraft/world/level/block/entity/DispenserBlockEntity;", cancellable = true)
    private void blockEntity_897032981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(897032981L))
            info.setReturnValue(null);
    }


}
