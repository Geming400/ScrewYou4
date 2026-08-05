package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.CreakingHeartDecorator.class)
public class CreakingHeartDecorator_2063360875Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)V", cancellable = true)
    private void place__1787221044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1787221044L))
            info.cancel();
    }


}
