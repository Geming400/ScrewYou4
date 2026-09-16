package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PillagerRenderer.class)
public class PillagerRenderer136936739Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_390107718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(390107718L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;", cancellable = true)
    private void createRenderState__1201389733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201389733L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.IllagerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__614519290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614519290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2109451574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109451574L))
            info.setReturnValue(null);
    }


}
