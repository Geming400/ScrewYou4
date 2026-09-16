package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.boat.BoatModel.class)
public class BoatModel_1383804805Mixin {
        @Inject(at = @At("HEAD"), method = "createWaterPatch()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWaterPatch_1312518029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1312518029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoatModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBoatModel__1825433555(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825433555L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createChestBoatModel()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createChestBoatModel__210561628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-210561628L))
            info.setReturnValue(null);
    }


}
