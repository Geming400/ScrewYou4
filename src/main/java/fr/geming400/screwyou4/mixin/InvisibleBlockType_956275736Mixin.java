package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.BlockEntityWithBoundingBoxRenderState.InvisibleBlockType.class)
public class InvisibleBlockType_956275736Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState$InvisibleBlockType;", cancellable = true)
    private static void values__291474743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-291474743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState$InvisibleBlockType;", cancellable = true)
    private static void valueOf_76053766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76053766L))
            info.setReturnValue(null);
    }


}
