package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.AllOfPredicate.class)
public class AllOfPredicate_69933265Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1572546685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572546685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_29606527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(29606527L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_1271634062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1271634062L))
            info.setReturnValue(false);
    }


}
