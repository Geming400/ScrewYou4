package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.HasSturdyFacePredicate.class)
public class HasSturdyFacePredicate_469326019Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1173153931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173153931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_1671026816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671026816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_428999281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(428999281L))
            info.setReturnValue(null);
    }


}
