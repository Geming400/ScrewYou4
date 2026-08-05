package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.TextureSlots.Data.Builder.class)
public class Builder_541448635Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data;", cancellable = true)
    private void build__1820950860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820950860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTexture(Ljava/lang/String;Lnet/minecraft/client/resources/model/sprite/Material;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data$Builder;", cancellable = true)
    private void addTexture__467782139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467782139L))
            info.setReturnValue(new net.minecraft.client.resources.model.sprite.TextureSlots$Data$Builder());
    }

    @Inject(at = @At("HEAD"), method = "addReference(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/resources/model/sprite/TextureSlots$Data$Builder;", cancellable = true)
    private void addReference__1043071471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043071471L))
            info.setReturnValue(new net.minecraft.client.resources.model.sprite.TextureSlots$Data$Builder());
    }


}
