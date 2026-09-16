package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.Material.Baked.class)
public class Baked2142980620Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1234354352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234354352L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1381563151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381563151L))
            info.setReturnValue("|]\u3C62\u2058|Bk\u6E44dxpAI\u644AvQ!Mf5E\uC542DPL1>*eEgx!ed8/cCYe|\uC841Yp?ky{\u495D\u9D26o0DM5\uADBA3\u3A4F)D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1594634585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594634585L))
            info.setReturnValue(765230853);
    }

    @Inject(at = @At("HEAD"), method = "sprite()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void sprite__77251686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77251686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forceTranslucent()Z", cancellable = true)
    private void forceTranslucent_979282197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979282197L))
            info.setReturnValue(false);
    }


}
