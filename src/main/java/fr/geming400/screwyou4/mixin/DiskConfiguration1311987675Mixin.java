package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration.class)
public class DiskConfiguration1311987675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1597467362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597467362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "target()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void target_1344756264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344756264L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_176527700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(176527700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1350250417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350250417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void stateProvider__620718826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-620718826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius__1157699228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157699228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "halfHeight()I", cancellable = true)
    private void halfHeight_1350249921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1350249921L))
            info.setReturnValue(null);
    }


}
