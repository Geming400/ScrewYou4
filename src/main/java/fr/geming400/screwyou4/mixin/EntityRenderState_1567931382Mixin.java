package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.EntityRenderState.class)
public class EntityRenderState_1567931382Mixin {
        @Inject(at = @At("HEAD"), method = "fillCrashReportCategory(Lnet/minecraft/CrashReportCategory;)V", cancellable = true)
    private void fillCrashReportCategory__409689830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-409689830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "appearsGlowing()Z", cancellable = true)
    private void appearsGlowing_1606209964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606209964L))
            info.setReturnValue(null);
    }


}
