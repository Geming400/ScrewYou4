package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState.class)
public class BlockEntityRenderState32905127Mixin {
        @Inject(at = @At("HEAD"), method = "extractBase(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private static void extractBase__1125513915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1125513915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillCrashReportCategory_1730352674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1730352674L))
            info.cancel();
    }


}
