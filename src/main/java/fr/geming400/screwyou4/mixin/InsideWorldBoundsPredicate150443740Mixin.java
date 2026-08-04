package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.InsideWorldBoundsPredicate.class)
public class InsideWorldBoundsPredicate150443740Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1492036209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492036209L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_110117003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110117003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_1352144538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352144538L))
            info.setReturnValue(null);
    }


}
