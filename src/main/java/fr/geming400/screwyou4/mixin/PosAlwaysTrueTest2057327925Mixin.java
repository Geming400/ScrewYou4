package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.PosAlwaysTrueTest.class)
public class PosAlwaysTrueTest2057327925Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test__1133567386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1133567386L))
            info.setReturnValue(true);
    }


}
