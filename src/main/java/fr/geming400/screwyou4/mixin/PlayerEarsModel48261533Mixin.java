package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.player.PlayerEarsModel.class)
public class PlayerEarsModel48261533Mixin {
        @Inject(at = @At("HEAD"), method = "createEarsLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEarsLayer__1500990799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500990799L))
            info.setReturnValue(null);
    }


}
