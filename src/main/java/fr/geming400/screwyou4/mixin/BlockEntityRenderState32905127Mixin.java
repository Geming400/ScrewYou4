package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState.class)
public class BlockEntityRenderState32905127Mixin {
        @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillCrashReportCategory__1944716084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1944716084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBase(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private static void extractBase_744986067(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(744986067L))
            info.cancel();
    }


}
