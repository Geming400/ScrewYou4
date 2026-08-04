package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Resolver.class)
public class Resolver2090805386Mixin {
        @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/sprite/TextureSlots;", cancellable = true)
    private void resolve_854327826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854327826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFirst(Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Resolver;", cancellable = true)
    private void addFirst_960162741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960162741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addLast(Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Resolver;", cancellable = true)
    private void addLast_960162741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(960162741L))
            info.setReturnValue(null);
    }


}
