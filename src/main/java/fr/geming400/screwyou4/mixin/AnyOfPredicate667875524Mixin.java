package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.AnyOfPredicate.class)
public class AnyOfPredicate667875524Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_1133187069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133187069L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1942366753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942366753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__625044304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625044304L))
            info.setReturnValue(false);
    }


}
