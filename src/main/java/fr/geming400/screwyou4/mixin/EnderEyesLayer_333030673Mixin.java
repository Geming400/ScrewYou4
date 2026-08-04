package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.layers.EnderEyesLayer.class)
public class EnderEyesLayer_333030673Mixin {
        @Inject(at = @At("HEAD"), method = "renderType()Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_1417610369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1417610369L))
            info.setReturnValue(null);
    }


}
