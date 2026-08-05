package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelDiscovery.class)
public class ModelDiscovery1533490711Mixin {
        @Inject(at = @At("HEAD"), method = "resolve()Ljava/util/Map;", cancellable = true)
    private void resolve_800756627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800756627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addSpecialModel(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/UnbakedModel;)V", cancellable = true)
    private void addSpecialModel_39811987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(39811987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "missingModel()Lnet/minecraft/client/resources/model/ResolvedModel;", cancellable = true)
    private void missingModel__235410665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-235410665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRoot(Lnet/minecraft/client/resources/model/ResolvableModel;)V", cancellable = true)
    private void addRoot__466960928(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-466960928L))
            info.cancel();
    }


}
