package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.object.equipment.ShieldModel.class)
public class ShieldModel_270405134Mixin {
        @Inject(at = @At("HEAD"), method = "handle()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void handle_821835978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821835978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createLayer__1389722050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1389722050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "plate()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void plate_554617372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(554617372L))
            info.setReturnValue(null);
    }


}
