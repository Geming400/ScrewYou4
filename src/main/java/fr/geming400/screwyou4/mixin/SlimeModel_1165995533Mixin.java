package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.monster.slime.SlimeModel.class)
public class SlimeModel_1165995533Mixin {
        @Inject(at = @At("HEAD"), method = "createInnerBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createInnerBodyLayer_451863368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451863368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createOuterBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createOuterBodyLayer_451863368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451863368L))
            info.setReturnValue(null);
    }


}
