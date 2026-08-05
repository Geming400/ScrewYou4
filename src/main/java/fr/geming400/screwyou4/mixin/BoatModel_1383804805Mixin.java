package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.boat.BoatModel.class)
public class BoatModel_1383804805Mixin {
        @Inject(at = @At("HEAD"), method = "createWaterPatch()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWaterPatch_669672640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669672640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoatModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBoatModel_669672640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669672640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChestBoatModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createChestBoatModel_669672640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(669672640L))
            info.setReturnValue(null);
    }


}
