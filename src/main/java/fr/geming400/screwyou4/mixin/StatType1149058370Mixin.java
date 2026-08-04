package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.StatType.class)
public class StatType1149058370Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;)Lnet/minecraft/stats/Stat;", cancellable = true)
    private void get__648124644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648124644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;Lnet/minecraft/stats/StatFormatter;)Lnet/minecraft/stats/Stat;", cancellable = true)
    private void get__1927233681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927233681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1002557662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002557662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains__1760397163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760397163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1027850795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027850795L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegistry()Lnet/minecraft/core/Registry;", cancellable = true)
    private void getRegistry_635202893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(635202893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec__1884908802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1884908802L))
            info.setReturnValue(null);
    }


}
