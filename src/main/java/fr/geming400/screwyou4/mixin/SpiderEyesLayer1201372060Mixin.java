package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.SpiderEyesLayer.class)
public class SpiderEyesLayer1201372060Mixin {
        @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_440016669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440016669L))
            info.setReturnValue(null);
    }


}
