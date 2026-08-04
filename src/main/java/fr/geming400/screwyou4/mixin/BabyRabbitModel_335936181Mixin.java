package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.rabbit.BabyRabbitModel.class)
public class BabyRabbitModel_335936181Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__378195984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378195984L))
            info.setReturnValue(null);
    }


}
