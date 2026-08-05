package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.StandingAndWallBlockItem.class)
public class StandingAndWallBlockItem_1105923753Mixin {
        @Inject(at = @At("HEAD"), method = "registerBlocks(Ljava/util/Map;Lnet/minecraft/world/item/Item;)V", cancellable = true)
    private void registerBlocks_1157530992(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157530992L))
            info.cancel();
    }


}
