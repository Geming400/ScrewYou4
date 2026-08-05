package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ZombifiedPiglinRenderer.class)
public class ZombifiedPiglinRenderer_1531088583Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1758207601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758207601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Mob;Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;F)V", cancellable = true)
    private void extractRenderState_229648870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(229648870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/zombie/ZombifiedPiglin;Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;F)V", cancellable = true)
    private void extractRenderState_1865379945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1865379945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1744014511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1744014511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_942452138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942452138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;", cancellable = true)
    private void createRenderState__497169723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497169723L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombifiedPiglinRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_800000827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(800000827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__761242081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-761242081L))
            info.setReturnValue(null);
    }


}
