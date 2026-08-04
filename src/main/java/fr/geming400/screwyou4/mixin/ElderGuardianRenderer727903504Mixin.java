package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ElderGuardianRenderer.class)
public class ElderGuardianRenderer727903504Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__684988956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684988956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1564427159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564427159L))
            info.setReturnValue(null);
    }


}
