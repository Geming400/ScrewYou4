package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.MatchingBiomesPredicate.class)
public class MatchingBiomesPredicate2074130073Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__1755525678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755525678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test__946345994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-946345994L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_781210245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(781210245L))
            info.setReturnValue(true);
    }


}
