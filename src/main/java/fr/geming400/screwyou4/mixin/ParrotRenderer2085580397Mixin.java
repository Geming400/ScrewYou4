package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ParrotRenderer.class)
public class ParrotRenderer2085580397Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1383044310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1383044310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__236872064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236872064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1523358590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1523358590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_415106910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415106910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/parrot/Parrot;Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;F)V", cancellable = true)
    private void extractRenderState_324839588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(324839588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariantTexture(Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getVariantTexture_1580261345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580261345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;", cancellable = true)
    private void createRenderState_828664899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828664899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__1956215920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956215920L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
