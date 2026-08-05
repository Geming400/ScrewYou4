package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.dispenser.BlockSource.class)
public class BlockSource215182570Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1600694829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1600694829L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__920277405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-920277405L))
            info.setReturnValue("p=]\uCFA2{@x9j\uB23FM\u5C0DY1O\uB601\uABF2I;'I_&S7&6\uA652n[\u464B0r\u06B9)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_253445312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253445312L))
            info.setReturnValue(-784730889);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void state__2080576296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2080576296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1678204309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678204309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/server/level/ServerLevel;", cancellable = true)
    private void level_882720570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(882720570L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_1312912099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312912099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockEntity()Lnet/minecraft/world/level/block/entity/DispenserBlockEntity;", cancellable = true)
    private void blockEntity_1139310565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139310565L))
            info.setReturnValue(null);
    }


}
