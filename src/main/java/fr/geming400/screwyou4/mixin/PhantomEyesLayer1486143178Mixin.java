package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.PhantomEyesLayer.class)
public class PhantomEyesLayer1486143178Mixin {
        @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType__1724244421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724244421L))
            info.setReturnValue(null);
    }


}
