package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.network.Filterable.class)
public class Filterable_750403418Mixin {
        @Inject(at = @At("HEAD"), method = "get(Z)Ljava/lang/Object;", cancellable = true)
    private void get_2036967978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036967978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2135915676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135915676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__385056558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-385056558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_788666159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788666159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "map(Ljava/util/function/Function;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private void map_2052694458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2052694458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/server/network/FilteredText;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private static void from__1753601212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1753601212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Ljava/util/function/Function;)Ljava/util/Optional;", cancellable = true)
    private void resolve__238264065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238264065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "raw()Ljava/lang/Object;", cancellable = true)
    private void raw__1685371660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1685371660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "filtered()Ljava/util/Optional;", cancellable = true)
    private void filtered_995864839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995864839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1234081392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234081392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "passThrough(Ljava/lang/Object;)Lnet/minecraft/server/network/Filterable;", cancellable = true)
    private static void passThrough_633897286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633897286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "streamCodec(Lnet/minecraft/network/codec/StreamCodec;)Lnet/minecraft/network/codec/StreamCodec;", cancellable = true)
    private static void streamCodec__1520324388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1520324388L))
            info.setReturnValue(null);
    }


}
