package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest.class)
public class AlwaysTrueTest_1096472511Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test_593883224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593883224L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "testAgainstWorldState(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void testAgainstWorldState_628509051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628509051L))
            info.setReturnValue(true);
    }


}
