package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DyedItemColor.class)
public class DyedItemColor913160158Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1996294879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996294879L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__222299817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222299817L))
            info.setReturnValue("?J|NMAF6bAN_6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_951422900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951422900L))
            info.setReturnValue(2132828247);
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void getOrDefault__1123556944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123556944L))
            info.setReturnValue(1113837310);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_951422404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951422404L))
            info.setReturnValue(-1983615560);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1629558232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1629558232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyDyes(Lnet/minecraft/world/item/ItemStack;Ljava/util/List;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void applyDyes__535141788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535141788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyDyes(Lnet/minecraft/world/item/component/DyedItemColor;Ljava/util/List;)Lnet/minecraft/world/item/component/DyedItemColor;", cancellable = true)
    private static void applyDyes_913313092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913313092L))
            info.setReturnValue(null);
    }


}
