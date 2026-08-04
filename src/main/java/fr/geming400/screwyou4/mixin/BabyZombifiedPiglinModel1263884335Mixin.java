package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.piglin.BabyZombifiedPiglinModel.class)
public class BabyZombifiedPiglinModel1263884335Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer_549752171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549752171L))
            info.setReturnValue(null);
    }


}
