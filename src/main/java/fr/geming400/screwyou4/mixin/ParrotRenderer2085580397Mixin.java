package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ParrotRenderer.class)
public class ParrotRenderer2085580397Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;", cancellable = true)
    private void createRenderState__13142524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13142524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1496943953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496943953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1189522696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1189522696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1982267880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1982267880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/parrot/Parrot;Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;F)V", cancellable = true)
    private void extractRenderState_169047486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169047486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getVariantTexture(Lnet/minecraft/world/entity/animal/parrot/Parrot$Variant;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getVariantTexture__1451192275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451192275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__206750266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206750266L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ParrotRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1941660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1941660L))
            info.setReturnValue(null);
    }


}
