package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gamerules.GameRuleCategory.class)
public class GameRuleCategory1999007632Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1090381364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1090381364L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1525536139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525536139L))
            info.setReturnValue("{\u75F64o'\u44B0md7/d\u73EFtQob\uC75CC-uCAOsUz0q+Iy dLYk\u4735+WNXF;1U\uBCFCVXKca*\u3C1BO&>iYh\"");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1738607573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1738607573L))
            info.setReturnValue(47281376);
    }

    @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/level/gamerules/GameRuleCategory;", cancellable = true)
    private static void register__1969709473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1969709473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__593770254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-593770254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "label()Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void label__1797927769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797927769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDescriptionId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getDescriptionId_1463818328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1463818328L))
            info.setReturnValue(null);
    }


}
