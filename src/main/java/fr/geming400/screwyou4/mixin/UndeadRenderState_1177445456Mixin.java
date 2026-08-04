package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.UndeadRenderState.class)
public class UndeadRenderState_1177445456Mixin {
        @Inject(at = @At("HEAD"), method = "getUseItemStackForArm(Lnet/minecraft/world/entity/HumanoidArm;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getUseItemStackForArm_127561704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127561704L))
            info.setReturnValue(null);
    }


}
