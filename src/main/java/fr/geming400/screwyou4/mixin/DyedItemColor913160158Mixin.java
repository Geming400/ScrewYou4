package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DyedItemColor.class)
public class DyedItemColor913160158Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_4533890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4533890L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1683583683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1683583683L))
            info.setReturnValue("FFo{zKiY\u4D004w\uAD9ApbM)\uB4CB5,W*=@`(a=\uA9BFf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1470512249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1470512249L))
            info.setReturnValue(-712189224);
    }

    @Inject(at = @At("HEAD"), method = "getOrDefault(Lnet/minecraft/world/item/ItemStack;I)I", cancellable = true)
    private static void getOrDefault__1120785448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120785448L))
            info.setReturnValue(1560153894);
    }

    @Inject(at = @At("HEAD"), method = "rgb()I", cancellable = true)
    private void rgb_1792560407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1792560407L))
            info.setReturnValue(1716433040);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1462059889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1462059889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyDyes(Lnet/minecraft/world/item/ItemStack;Ljava/util/List;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void applyDyes_813080437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813080437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyDyes(Lnet/minecraft/world/item/component/DyedItemColor;Ljava/util/List;)Lnet/minecraft/world/item/component/DyedItemColor;", cancellable = true)
    private static void applyDyes_1821177557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821177557L))
            info.setReturnValue(null);
    }


}
