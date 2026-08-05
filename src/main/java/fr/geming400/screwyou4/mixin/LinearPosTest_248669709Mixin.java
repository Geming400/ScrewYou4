package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.LinearPosTest.class)
public class LinearPosTest_248669709Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test_1352741693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1352741693L))
            info.setReturnValue(true);
    }


}
