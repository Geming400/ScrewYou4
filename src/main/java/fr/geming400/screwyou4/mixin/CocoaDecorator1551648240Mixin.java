package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator.class)
public class CocoaDecorator1551648240Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)V", cancellable = true)
    private void place_1996033618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1996033618L))
            info.cancel();
    }


}
