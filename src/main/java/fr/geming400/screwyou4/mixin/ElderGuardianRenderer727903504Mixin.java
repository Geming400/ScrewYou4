package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ElderGuardianRenderer.class)
public class ElderGuardianRenderer727903504Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/GuardianRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__590236770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590236770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1594548957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594548957L))
            info.setReturnValue(null);
    }


}
