package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.RavagerRenderer.class)
public class RavagerRenderer1610928079Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1772934540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772934540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__711524382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711524382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1048706272(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1048706272L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__59545408(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-59545408L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Ravager;Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;F)V", cancellable = true)
    private void extractRenderState__2118677893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2118677893L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1864099058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1864099058L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/RavagerRenderState;", cancellable = true)
    private void createRenderState__1772892411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772892411L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.RavagerRenderState());
    }


}
