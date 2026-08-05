package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DonkeyRenderer.class)
public class DonkeyRenderer1643350931Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1963321450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963321450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__679101530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-679101530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1081129124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1081129124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__27122556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-27122556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractHorse;Lnet/minecraft/client/renderer/entity/state/EquineRenderState;F)V", cancellable = true)
    private void extractRenderState__252585271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-252585271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/AbstractChestedHorse;Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;F)V", cancellable = true)
    private void extractRenderState__1920338196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1920338196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/DonkeyRenderState;", cancellable = true)
    private void createRenderState_627942287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627942287L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.DonkeyRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1896521910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896521910L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
