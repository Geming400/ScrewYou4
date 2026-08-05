package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.BlockStateMatchTest.class)
public class BlockStateMatchTest371313573Mixin {
        @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void test__131275713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-131275713L))
            info.setReturnValue(false);
    }


}
