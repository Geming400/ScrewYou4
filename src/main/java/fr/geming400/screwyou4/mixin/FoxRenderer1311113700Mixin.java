package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FoxRenderer.class)
public class FoxRenderer1311113700Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1564284679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1564284679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FoxRenderState;", cancellable = true)
    private void createRenderState__1912192977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1912192977L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1011338761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011338761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FoxRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_679968148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679968148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__359359787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-359359787L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/fox/Fox;Lnet/minecraft/client/renderer/entity/state/FoxRenderState;F)V", cancellable = true)
    private void extractRenderState__1845670870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845670870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_748891893(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(748891893L))
            info.cancel();
    }


}
