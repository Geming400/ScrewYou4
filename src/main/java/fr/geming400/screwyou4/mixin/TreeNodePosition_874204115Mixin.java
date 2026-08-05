package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.TreeNodePosition.class)
public class TreeNodePosition_874204115Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/advancements/AdvancementNode;)V", cancellable = true)
    private static void run__843147449(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-843147449L))
            info.cancel();
    }


}
