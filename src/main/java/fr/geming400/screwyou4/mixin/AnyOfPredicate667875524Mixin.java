package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.AnyOfPredicate.class)
public class AnyOfPredicate667875524Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type__974604425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974604425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_627548787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627548787L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test_1869576322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869576322L))
            info.setReturnValue(false);
    }


}
