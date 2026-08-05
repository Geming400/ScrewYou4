package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.nautilus.NautilusArmorModel.class)
public class NautilusArmorModel92276077Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1811378532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811378532L))
            info.setReturnValue(null);
    }


}
