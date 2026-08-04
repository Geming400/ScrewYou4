package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.piglin.AdultZombifiedPiglinModel.class)
public class AdultZombifiedPiglinModel_262358735Mixin {
        @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__451773430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451773430L))
            info.setReturnValue(null);
    }


}
