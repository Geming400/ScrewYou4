package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.HangingEntityItem.class)
public class HangingEntityItem_865724072Mixin {
        @Inject(at = @At("HEAD"), method = "appendHoverText(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/Item$TooltipContext;Lnet/minecraft/world/item/component/TooltipDisplay;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;)V", cancellable = true)
    private void appendHoverText_71929046(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71929046L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__1043119184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043119184L))
            info.setReturnValue(null);
    }


}
