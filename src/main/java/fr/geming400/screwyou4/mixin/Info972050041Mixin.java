package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagKeyArgument.Info.class)
public class Info972050041Mixin {
        @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void unpack_1885856642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885856642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;", cancellable = true)
    private void unpack__44718710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44718710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_1691350572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1691350572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToNetwork(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void serializeToNetwork_14679776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(14679776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private void deserializeFromNetwork_512668612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(512668612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deserializeFromNetwork(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;", cancellable = true)
    private void deserializeFromNetwork__1077062466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077062466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/arguments/ResourceOrTagKeyArgument$Info$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_1638805668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638805668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "serializeToJson(Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;Lcom/google/gson/JsonObject;)V", cancellable = true)
    private void serializeToJson_524494832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(524494832L))
            info.cancel();
    }


}
