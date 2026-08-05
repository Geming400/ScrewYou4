package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.NotPredicate.class)
public class NotPredicate62527636Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1579952313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579952313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_22200899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22200899L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_1264228434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264228434L))
            info.setReturnValue(true);
    }


}
