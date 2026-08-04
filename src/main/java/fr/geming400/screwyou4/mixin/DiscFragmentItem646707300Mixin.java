package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.DiscFragmentItem.class)
public class DiscFragmentItem646707300Mixin {
        @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void getDisplayName__1761296913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761296913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText__147087725(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-147087725L))
            info.cancel();
    }


}
