package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ArmadilloRenderer.class)
public class ArmadilloRenderer326897722Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_565051790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(565051790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1965432941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965432941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_554016741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(554016741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1346761925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1346761925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/armadillo/Armadillo;Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;F)V", cancellable = true)
    private void extractRenderState__265888732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-265888732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__261738722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261738722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ArmadilloRenderState;", cancellable = true)
    private void createRenderState_1623330106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623330106L))
            info.setReturnValue(null);
    }


}
