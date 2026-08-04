package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.HuskRenderer.class)
public class HuskRenderer_913364356Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__745463518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-745463518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1378966308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378966308L))
            info.setReturnValue(null);
    }


}
