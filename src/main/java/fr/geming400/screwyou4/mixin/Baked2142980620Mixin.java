package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.Material.Baked.class)
public class Baked2142980620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__766474417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766474417L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1007520645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007520645L))
            info.setReturnValue("]3\u7685\u74E7Pik?f-y).V@:P\u5016<+?b|iqfVpNWj\u7293=k@2RR+k?\u1054T}j.=-\uD786v@.[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2113723934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113723934L))
            info.setReturnValue(-1978296930);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite_151974805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151974805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceTranslucent()Z", cancellable = true)
    private void forceTranslucent__2113708093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113708093L))
            info.setReturnValue(false);
    }


}
