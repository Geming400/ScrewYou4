package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.StitcherException.class)
public class StitcherException_674480253Mixin {
        @Inject(at = @At("HEAD"), method = "getAllSprites()Ljava/util/Collection;", cancellable = true)
    private void getAllSprites_212151439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(212151439L))
            info.setReturnValue(null);
    }


}
