package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.StriderRenderer.class)
public class StriderRenderer1249490382Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/StriderRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__819415724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819415724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1072962079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072962079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_687268575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(687268575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Strider;Lnet/minecraft/client/renderer/entity/state/StriderRenderState;F)V", cancellable = true)
    private void extractRenderState__580441028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-580441028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__420983105(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-420983105L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/StriderRenderState;", cancellable = true)
    private void createRenderState__1169390717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169390717L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.StriderRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1502661361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502661361L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
