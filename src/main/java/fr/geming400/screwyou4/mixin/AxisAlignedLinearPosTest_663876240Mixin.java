package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.AxisAlignedLinearPosTest.class)
public class AxisAlignedLinearPosTest_663876240Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test_898714386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898714386L))
            info.setReturnValue(true);
    }


}
