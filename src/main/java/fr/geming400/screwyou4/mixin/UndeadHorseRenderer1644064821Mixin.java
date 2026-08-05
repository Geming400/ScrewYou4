package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.UndeadHorseRenderer.class)
public class UndeadHorseRenderer1644064821Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__678387640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678387640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EquineRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_37826717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(37826717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EquineRenderState;", cancellable = true)
    private void createRenderState_1343558828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343558828L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EquineRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1897235800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897235800L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
