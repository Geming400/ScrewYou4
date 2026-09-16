package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimPattern.class)
public class TrimPattern_309795824Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__598830445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598830445L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1080219348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080219348L))
            info.setReturnValue("\u50AC_*C\uB74Cq\uA1203t;2\u58D4%a\uB350l`.\uB341$Toy\uADCC-\u207B7IK}kR3,9E}Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_867147914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867147914L))
            info.setReturnValue(-400204160);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__4135554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-4135554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1637478303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637478303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyWithStyle(Lnet/minecraft/core/Holder;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void copyWithStyle_1741415229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1741415229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decal()Z", cancellable = true)
    private void decal__267690471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267690471L))
            info.setReturnValue(true);
    }


}
