package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.RandomBlockMatchTest.class)
public class RandomBlockMatchTest472845279Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test__29744007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-29744007L))
            info.setReturnValue(false);
    }


}
