package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Tool.Rule.class)
public class Rule_1973192174Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1064565905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064565905L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1551351598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551351598L))
            info.setReturnValue("k0\uCA56\u7628WT<z2am7\uF984APHS\u2295bS-Dt#|dT5\u00B2r\u738DDrj!V-p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1764423032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764423032L))
            info.setReturnValue(2116297615);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void blocks__1836255353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1836255353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "speed()Ljava/util/Optional;", cancellable = true)
    private void speed_1764512482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764512482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minesAndDrops(Lnet/minecraft/core/HolderSet;F)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void minesAndDrops__1844047462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1844047462L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deniesDrops(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void deniesDrops_962694573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962694573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "correctForDrops()Ljava/util/Optional;", cancellable = true)
    private void correctForDrops_270558016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(270558016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrideSpeed(Lnet/minecraft/core/HolderSet;F)Lnet/minecraft/world/item/component/Tool$Rule;", cancellable = true)
    private static void overrideSpeed__1589709332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589709332L))
            info.setReturnValue(null);
    }


}
