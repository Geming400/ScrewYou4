package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.leash.LeashKnotModel.class)
public class LeashKnotModel1819472074Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__84182535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84182535L))
            info.setReturnValue(null);
    }


}
