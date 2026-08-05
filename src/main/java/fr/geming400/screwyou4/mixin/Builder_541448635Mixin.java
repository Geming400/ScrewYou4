package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Data.Builder.class)
public class Builder_541448635Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void build__2073073274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073073274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addReference(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data$Builder;", cancellable = true)
    private void addReference__2068750041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2068750041L))
            info.setReturnValue(new net.minecraft.client.resources.model.sprite.TextureSlots.Data.Builder());
    }

    @Inject(at = @At("HEAD"), method = "addTexture(Ljava/lang/String;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data$Builder;", cancellable = true)
    private void addTexture_168696459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168696459L))
            info.setReturnValue(null);
    }


}
