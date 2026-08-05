package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.UndeadHorseRenderer.class)
public class UndeadHorseRenderer1644064821Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1055428377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055428377L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EquineRenderState;", cancellable = true)
    private void createRenderState_501751405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501751405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1343275933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343275933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__648265842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648265842L))
            info.setReturnValue(null);
    }


}
