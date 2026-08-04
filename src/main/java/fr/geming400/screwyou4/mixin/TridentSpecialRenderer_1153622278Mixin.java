package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.TridentSpecialRenderer.class)
public class TridentSpecialRenderer_1153622278Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIZI)V", cancellable = true)
    private void submit_1592567431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1592567431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1834638690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834638690L))
            info.cancel();
    }


}
