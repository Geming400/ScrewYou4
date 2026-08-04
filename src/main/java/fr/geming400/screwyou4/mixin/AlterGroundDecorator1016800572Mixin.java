package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator.class)
public class AlterGroundDecorator1016800572Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)V", cancellable = true)
    private void place_443177943(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(443177943L))
            info.cancel();
    }


}
