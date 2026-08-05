package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimPattern.class)
public class TrimPattern_309795824Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1695308082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695308082L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__825664152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-825664152L))
            info.setReturnValue("B⢞!k␀Y@e&7`Bm.5㞧ih=^gxu!$L82$kS0JiqHf");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_348058565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348058565L))
            info.setReturnValue(1611063228);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__1867113342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867113342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__2133270730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133270730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decal()Z", cancellable = true)
    private void decal_348074406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348074406L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "copyWithStyle(Lnet/minecraft/core/Holder;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void copyWithStyle_571658771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(571658771L))
            info.setReturnValue(null);
    }


}
