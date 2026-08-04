package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.AlwaysTrueTest.class)
public class AlwaysTrueTest_1096472511Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test__1637002810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637002810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "testAgainstWorldState(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void testAgainstWorldState__358638419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358638419L))
            info.setReturnValue(null);
    }


}
