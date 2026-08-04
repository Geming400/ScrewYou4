package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.HumanoidRenderState.class)
public class HumanoidRenderState773286960Mixin {
        @Inject(at = @At("HEAD"), method = "ticksUsingItem(Lnet/minecraft/world/entity/HumanoidArm;)F", cancellable = true)
    private void ticksUsingItem__327053442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327053442L))
            info.setReturnValue(null);
    }


}
