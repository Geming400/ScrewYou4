package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator.class)
public class LeaveVineDecorator1462538872Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)V", cancellable = true)
    private void place_888916243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(888916243L))
            info.cancel();
    }


}
