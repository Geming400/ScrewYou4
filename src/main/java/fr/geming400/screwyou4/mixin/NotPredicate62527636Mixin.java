package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.blockpredicates.NotPredicate.class)
public class NotPredicate62527636Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicateType;", cancellable = true)
    private void type_527839181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527839181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;Ljava/lang/Object;)Z", cancellable = true)
    private void test_1337018865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337018865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void test__1230392192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230392192L))
            info.setReturnValue(true);
    }


}
