package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLeavesDecorator.class)
public class AttachedToLeavesDecorator_125228014Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)V", cancellable = true)
    private void place__448394616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-448394616L))
            info.cancel();
    }


}
