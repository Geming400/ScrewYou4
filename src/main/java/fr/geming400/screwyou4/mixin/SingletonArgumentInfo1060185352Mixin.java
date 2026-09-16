package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.SingletonArgumentInfo.class)
public class SingletonArgumentInfo1060185352Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack__1709673313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709673313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;", cancellable = true)
    private void unpack_183975330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(183975330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextFree(Ljava/util/function/Supplier;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo;", cancellable = true)
    private static void contextFree_576662731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576662731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork__221664178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221664178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_2115009363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115009363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contextAware(Ljava/util/function/Function;)Lnet/minecraft/commands/synchronization/SingletonArgumentInfo;", cancellable = true)
    private static void contextAware_1866871843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866871843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1024754786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1024754786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork__2109134233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2109134233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/SingletonArgumentInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__267179561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-267179561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson__487015780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-487015780L))
            info.cancel();
    }


}
