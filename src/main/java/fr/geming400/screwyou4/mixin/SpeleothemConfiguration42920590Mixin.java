package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpeleothemConfiguration.class)
public class SpeleothemConfiguration42920590Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1428432849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428432849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1092539385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092539385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_81183332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81183332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfTallerGeneration()F", cancellable = true)
    private void chanceOfTallerGeneration_81179953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81179953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfDirectionalSpread()F", cancellable = true)
    private void chanceOfDirectionalSpread_81179953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81179953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpreadRadius2()F", cancellable = true)
    private void chanceOfSpreadRadius2_81179953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81179953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpreadRadius3()F", cancellable = true)
    private void chanceOfSpreadRadius3_81179953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81179953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pointedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void pointedBlock_2042129020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042129020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void baseBlock_2042129020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2042129020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceableBlocks_1662873634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1662873634L))
            info.setReturnValue(null);
    }


}
