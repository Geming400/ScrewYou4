package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.model.animal.cow.CowModel.class)
public class CowModel390678702Mixin {
        @Inject(at = @At("HEAD"), method = "getHead()Lnet/minecraft/client/model/geom/ModelPart;", cancellable = true)
    private void getHead_787071357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787071357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBodyLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBodyLayer__1512975907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512975907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBaseCowModel()Lnet/minecraft/client/model/geom/builders/MeshDefinition;", cancellable = true)
    private static void createBaseCowModel__1971862843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971862843L))
            info.setReturnValue(null);
    }


}
