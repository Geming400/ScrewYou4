package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.Material.class)
public class Material_1442073443Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_533447174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533447174L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2082470329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2082470329L))
            info.setReturnValue("RU^ndRrP\u78DC4v{ppL\u5BF5eHPYcS4<|6\u8D04l]\u02C3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1999425533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999425533L))
            info.setReturnValue(425668877);
    }

    @Inject(at = @At("HEAD"), method = "forceTranslucent()Z", cancellable = true)
    private void forceTranslucent_278375019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278375019L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void sprite_1703553134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1703553134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withForceTranslucent(Z)Lnet/minecraft/client/resources/model/sprite/Material;", cancellable = true)
    private void withForceTranslucent__1572256575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572256575L))
            info.setReturnValue(null);
    }


}
