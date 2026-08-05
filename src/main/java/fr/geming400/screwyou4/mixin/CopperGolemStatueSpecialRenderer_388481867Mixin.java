package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.CopperGolemStatueSpecialRenderer.class)
public class CopperGolemStatueSpecialRenderer_388481867Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit__1855165516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1855165516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_48713018(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(48713018L))
            info.cancel();
    }


}
