package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.stats.StatType.class)
public class StatType1149058370Mixin {
        @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;)Lnet/minecraft/stats/Stat;", cancellable = true)
    private void get_681554546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(681554546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;Lnet/minecraft/stats/StatFormatter;)Lnet/minecraft/stats/Stat;", cancellable = true)
    private void get__1056930727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056930727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator__1511830128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511830128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contains(Ljava/lang/Object;)Z", cancellable = true)
    private void contains_1381011350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1381011350L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1965496756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1965496756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRegistry()Lnet/minecraft/core/Registry;", cancellable = true)
    private void getRegistry__979516934(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-979516934L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec()Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private void streamCodec_10312264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10312264L))
            info.setReturnValue(null);
    }


}
