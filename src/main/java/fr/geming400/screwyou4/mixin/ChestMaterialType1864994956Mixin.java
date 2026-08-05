package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.ChestRenderState.ChestMaterialType.class)
public class ChestMaterialType1864994956Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState$ChestMaterialType;", cancellable = true)
    private static void values__1565453670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565453670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState$ChestMaterialType;", cancellable = true)
    private static void valueOf_611477655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611477655L))
            info.setReturnValue(net.minecraft.client.renderer.blockentity.state.ChestRenderState.ChestMaterialType.COPPER_WEATHERED);
    }


}
