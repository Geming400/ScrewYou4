package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.llama.LlamaSpitModel.class)
public class LlamaSpitModel1018239944Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_304107780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304107780L))
            info.setReturnValue(null);
    }


}
