package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.HasSturdyFacePredicate.class)
public class HasSturdyFacePredicate_469326019Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_934637563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934637563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__823593810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823593810L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1743817247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743817247L))
            info.setReturnValue(true);
    }


}
