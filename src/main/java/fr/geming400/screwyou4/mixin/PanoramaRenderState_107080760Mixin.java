package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.PanoramaRenderState.class)
public class PanoramaRenderState_107080760Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1492593018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492593018L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1028379216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028379216L))
            info.setReturnValue("xp2nQ>Gl\u8E11'}oAv\u5AB42]VQh&Nr\uC93CCmqa\u36EAhc8Vb9%S,'8ESw]N1T\u1A31?23 9dBGLOl8-;Sc\uCE158Z]U82Nap\u8308u^t\"k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_145343501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145343501L))
            info.setReturnValue(-1710243911);
    }

    @Inject(at = @At("HEAD"), method = "spin()F", cancellable = true)
    private void spin_145340122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(145340122L))
            info.setReturnValue(8.32993E8F);
    }


}
