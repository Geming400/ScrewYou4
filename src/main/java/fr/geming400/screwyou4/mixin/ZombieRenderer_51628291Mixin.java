package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombieRenderer.class)
public class ZombieRenderer_51628291Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState_1658966313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1658966313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__537008154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537008154L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
