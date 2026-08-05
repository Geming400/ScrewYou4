package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ModelDiscovery.class)
public class ModelDiscovery1533490711Mixin {
        @Inject(at = @At("HEAD"), method = "resolve()Ljava/util/Map;", cancellable = true)
    private void resolve__471132929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-471132929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addRoot(Lnet/minecraft/client/resources/model/ResolvableModel;)V", cancellable = true)
    private void addRoot_229917923(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(229917923L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSpecialModel(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/resources/model/UnbakedModel;)V", cancellable = true)
    private void addSpecialModel__2053501470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2053501470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "missingModel()Lnet/minecraft/client/resources/model/ResolvedModel;", cancellable = true)
    private void missingModel__976357708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976357708L))
            info.setReturnValue(null);
    }


}
