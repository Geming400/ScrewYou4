package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Resolver.class)
public class Resolver2090805386Mixin {
        @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/client/resources/model/ModelDebugName;)Lnet/minecraft/client/resources/model/sprite/TextureSlots;", cancellable = true)
    private void resolve_1279103142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1279103142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFirst(Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Resolver;", cancellable = true)
    private void addFirst_1366244100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366244100L))
            info.setReturnValue(new net.minecraft.client.resources.model.sprite.TextureSlots.Resolver());
    }

    @Inject(at = @At("HEAD"), method = "addLast(Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Resolver;", cancellable = true)
    private void addLast_1306527052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306527052L))
            info.setReturnValue(null);
    }


}
