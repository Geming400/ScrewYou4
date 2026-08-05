package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.cow.ColdCowModel.class)
public class ColdCowModel_1832243406Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__71411204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-71411204L))
            info.setReturnValue(null);
    }


}
