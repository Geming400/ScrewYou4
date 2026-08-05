package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ToggleTooltips.class)
public class ToggleTooltips1659959922Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1568562120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568562120L))
            info.setReturnValue(null);
    }


}
